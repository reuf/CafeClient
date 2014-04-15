package net.cbeyond.movius.cafe;

import javax.xml.xpath.XPathConstants;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ClassOfService {

	private String cosId = null;
	private String description = null;
	private String id = null;
	private String mcnConfigId = null;
	private String numberingPlanId = null;
	private String organizationId = null;
	private String countUsers = null;
	private String npId = null;
	private String mcId = null;
	
	public ClassOfService() {}

	public ClassOfService(NodeList nodes) {
    	for (int j = 0; j < nodes.getLength(); j++) {
    		Node childNode = nodes.item(j);
    		if ("description".equalsIgnoreCase(childNode.getNodeName())) 
    			setDescription(childNode.getTextContent()); // description
    		if ("cosid".equalsIgnoreCase(childNode.getNodeName()))
    			setCosId(childNode.getTextContent()); // cosid (integer)
    		if ("id".equalsIgnoreCase(childNode.getNodeName()))
    			setId(childNode.getTextContent()); // id (integer)
    		if ("organization_id".equalsIgnoreCase(childNode.getNodeName())) 
    			setOrganizationId(childNode.getTextContent()); // organization_id (integer)
    		if ("mcn_config_id".equalsIgnoreCase(childNode.getNodeName()))
    			setMcnConfigId(childNode.getTextContent()); // mcn_config_id (integer)
    		if ("numbering_plan_id".equalsIgnoreCase(childNode.getNodeName()))
    			setNumberingPlanId(childNode.getTextContent()); // numbering_plan_id (integer)
    		if ("count_users".equalsIgnoreCase(childNode.getNodeName()))
    			setCountUsers(childNode.getTextContent()); // count_users (integer)
    		if ("npid".equalsIgnoreCase(childNode.getNodeName()))
    			setNpId(childNode.getTextContent()); // npid (integer)
    		if ("mpid".equalsIgnoreCase(childNode.getNodeName()))
    			setMcId(childNode.getTextContent()); // mpid (integer)
    	}
	}
	
	public String getCosId() {
		return cosId;
	}

	public void setCosId(String cosId) {
		this.cosId = cosId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMcnConfigId() {
		return mcnConfigId;
	}

	public void setMcnConfigId(String mcnConfigId) {
		this.mcnConfigId = mcnConfigId;
	}

	public String getNumberingPlanId() {
		return numberingPlanId;
	}

	public void setNumberingPlanId(String numberingPlanId) {
		this.numberingPlanId = numberingPlanId;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getCountUsers() {
		return countUsers;
	}

	public void setCountUsers(String countUsers) {
		this.countUsers = countUsers;
	}

	public String getNpId() {
		return npId;
	}

	public void setNpId(String npId) {
		this.npId = npId;
	}

	public String getMcId() {
		return mcId;
	}

	public void setMcId(String mcId) {
		this.mcId = mcId;
	}

	@Override
	public String toString() {
		return "ClassOfService [cosId=" + cosId + ", description="
				+ description + ", id=" + id + ", mcnConfigId=" + mcnConfigId
				+ ", numberingPlanId=" + numberingPlanId + ", organizationId="
				+ organizationId + ", countUsers=" + countUsers + ", npId="
				+ npId + ", mcId=" + mcId + "]";
	}
	
}
