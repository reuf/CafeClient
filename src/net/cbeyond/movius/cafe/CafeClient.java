package net.cbeyond.movius.cafe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class CafeClient {

	public static final String SERVER = "10.21.151.6";
	public static final String PORT = "8020";
	public static final String URL_BASE = "/adk/services/mcpwebapi/";
	public static final String USER = "service";
	public static final String PASSWORD = "personnel";
	public static final String ORGANIZATIONS = "organizations";
	public static final String FEATURE_OPTIONS = "feature_options";
	public static final String COS = "cos";
	public static final String USERS = "users";
	public static final String LIST = "list";
	public static final String ADD = "add";
	public static final String READ = "read";
	public static final String DELETE = "delete";
	
	public CafeClient() {
//		addOrganization("1001", "Brian Test");
//		addUser("1001", "Brian", "Michael", "4042892327");
		System.out.println(getUser("4042892327"));
		List<Organization> orgs = getAllOrgs();
		for (Organization org : orgs) {
			System.out.println(org);
		}
		List<FeatureOption> fos = getAllFeatureOptions();
		for (FeatureOption fo : fos) {
			System.out.println(fo);
		}
		List<ClassOfService> coss = getAllClassOfServices();
		for (ClassOfService cos : coss) {
			System.out.println(cos);
		}
		List<User> users = getAllUsers();
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	private void addOrganization(Organization organization) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("system_id", "1");
		map.put("audio_codec", "ulaw");
		map.put("orgid", organization.getOrgId());
		map.put("description", organization.getDescription());
		String response = makeCafeCall(buildURL(ORGANIZATIONS, ADD, map));
		System.out.println("addOrganization response="+response);
	}
	
	private void addFeatureOption(FeatureOption featureOption) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("foid", featureOption.getFoId());
		map.put("organization_id", featureOption.getOrganizationId());
		Map<String, Boolean> options = featureOption.asMap(true);
		for (String key : options.keySet()) {
			map.put(key, options.get(key).toString());
		}
		String response = makeCafeCall(buildURL(FEATURE_OPTIONS, ADD, map));
		System.out.println("addFeatureOption response="+response);
	}
	
	private void addUser(User user) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("foid", featureOption.getFoId());
		map.put("organization_id", featureOption.getOrganizationId());
		String response = makeCafeCall(buildURL(USER, ADD, map));
		System.out.println("addUser response="+response);
	}
	
	private FeatureOption getFeatureOption(String featureOptionId, String orgId) {
		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("foid", featureOptionId);
			map.put("organization_id", orgId);
			String response = makeCafeCall(buildURL(FEATURE_OPTIONS, READ, map));
			System.out.println("addFeatureOptions response="+response);
			XPath xpath = XPathFactory.newInstance().newXPath();
	        NodeList nodeList = (NodeList)xpath.evaluate("//feature_option", new InputSource(new StringReader(response)), XPathConstants.NODESET);
	        Node node = nodeList.item(0);
	        return new FeatureOption(node.getChildNodes());
		} catch (XPathExpressionException e) {
			System.out.println("ERROR: " + e);
		}
		return null;
	}
	
	private List<Organization> getAllOrgs() {
		List<Organization> orgs = new ArrayList<Organization>();
		try {
			String response = makeCafeCall(buildURL(ORGANIZATIONS, LIST, new HashMap<String, String>()));
			XPath xpath = XPathFactory.newInstance().newXPath();
            NodeList nodeList = (NodeList)xpath.evaluate("//organizations/organization", new InputSource(new StringReader(response)), XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
            	Node node = nodeList.item(i);
    			orgs.add(new Organization(node.getChildNodes()));
            }
		} catch (XPathExpressionException e) {
			System.out.println("ERROR: " + e);
		}
		return orgs;
	}
	
	private List<FeatureOption> getAllFeatureOptions() {
		List<FeatureOption> fos = new ArrayList<FeatureOption>();
		try {
			String response = makeCafeCall(buildURL(FEATURE_OPTIONS, LIST, new HashMap<String, String>()));
			XPath xpath = XPathFactory.newInstance().newXPath();
            NodeList nodeList = (NodeList)xpath.evaluate("//feature_options/feature_option", new InputSource(new StringReader(response)), XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
            	Node node = nodeList.item(i);
    			fos.add(new FeatureOption(node.getChildNodes()));
            }
		} catch (XPathExpressionException e) {
			System.out.println("ERROR: " + e);
		}
		return fos;
	}
	
	private List<ClassOfService> getAllClassOfServices() {
		List<ClassOfService> coss = new ArrayList<ClassOfService>();
		try {
			String response = makeCafeCall(buildURL(COS, LIST, new HashMap<String, String>()));
			XPath xpath = XPathFactory.newInstance().newXPath();
            NodeList nodeList = (NodeList)xpath.evaluate("//classofservices/cos", new InputSource(new StringReader(response)), XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
            	Node node = nodeList.item(i);
    			coss.add(new ClassOfService(node.getChildNodes()));
            }
		} catch (XPathExpressionException e) {
			System.out.println("ERROR: " + e);
		}
		return coss;
	}
	
	private List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("start", "0");
			String response = makeCafeCall(buildURL(USERS, LIST, map));
			XPath xpath = XPathFactory.newInstance().newXPath();
            NodeList nodeList = (NodeList)xpath.evaluate("//users/user", new InputSource(new StringReader(response)), XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
            	Node node = nodeList.item(i);
    			users.add(new User(node.getChildNodes()));
            }
		} catch (XPathExpressionException e) {
			System.out.println("ERROR: " + e);
		}
		return users;
	}
	
	private User addUser(String orgId, String firstName, String lastName, String tn) {
		User user = new User();
		Map<String, String> map = new HashMap<String, String>();
		map.put("orgid", orgId);
		map.put("cosid", "0");
		map.put("foid", "0");
		map.put("first_name", firstName);
		map.put("last_name", lastName);
		map.put("tui_pwd", "112233");
		map.put("login_password", "11223344");
		map.put("add_skey[0][application_name]", "voicemail");
		map.put("add_skey[0][skey]", tn);
		map.put("login", tn);
		map.put("primary_number", tn);
		String response = makeCafeCall(buildURL(USERS, ADD, map));
		System.out.println("addUser response="+response);
		return user;
	}
	
	private User getUser(String userId) {
		User user = null;
		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("acct", userId);
			String response = makeCafeCall(buildURL(USERS, READ, map));
			XPath xpath = XPathFactory.newInstance().newXPath();
            NodeList nodeList = (NodeList)xpath.evaluate("//user", new InputSource(new StringReader(response)), XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
            	Node node = nodeList.item(i);
    			user = new User(node.getChildNodes());
            }
		} catch (XPathExpressionException e) {
			System.out.println("ERROR: " + e);
		}
		return user;
	}
	
	private String buildURL(String vmClass, String action, Map<String, String> map) {
		map.put("userid", USER);
		map.put("password", PASSWORD);
		StringBuffer sb = new StringBuffer();
		sb.append("http://"+SERVER+":"+PORT+URL_BASE+vmClass+"/"+action+"?");
		boolean first = true;
		for (String key : map.keySet()) {
			if (!first) {
				sb.append("&");
			}
			sb.append(key + "=" + map.get(key));
			first = false;
		}
		//System.out.println("buildURL returning: " + sb.toString());
		return sb.toString();
	}
	
	private String makeCafeCall(String urlString) {
		//System.out.println("makeCafeCall called with urlString="+urlString);
		String response = "";
		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			if (conn.getResponseCode() != 200) {
				System.out.println("Failed : HTTP error code : " + conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			while ((output = br.readLine()) != null) {
				response += output;
			}
			//System.out.println("Response="+response);
			conn.disconnect();
		} catch (MalformedURLException e) {
			System.out.println("ERROR: " + e);
		} catch (IOException e) {
			System.out.println("ERROR: " + e);
		}
		//System.out.println("makeCafeCall returning: " + response);
		return response;
	}
	
	public static void main(String[] args) {
		new CafeClient();
	}
}
