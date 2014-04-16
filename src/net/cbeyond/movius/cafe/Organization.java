package net.cbeyond.movius.cafe;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Organization {
	
	public static final String AUDIO_CODEC = "audio_codec";
	public static final String SYSTEM_ID = "system_id";
	public static final String ORGID = "orgid";
	public static final String DESCRIPTION = "description";
	
	private String audioCodec = null;
	private String description = null;
	private String domain = null;
	private String id = null;
	private String systemId = null;
	private String orgId = null;
	private String parentId = null;
	private String countCos = null;
	private String countUsers = null;
	private String countFeatureOptions = null;
	private String countNumberingPlans = null;
	private String countMcnConfigs = null;
	private String countChildren = null;
	private String countAutoAttendants = null;
	
	/**
	 * <organization>
     *   <audio_codec>ulaw</audio_codec>
     *   <description>MCP default organization</description>
     *   <domain>@vm.lab.cbeyond.com</domain>
     *   <id type="integer">1</id>
     *   <orgid type="integer">1000</orgid>
     *   <parent_id type="integer" nil="true"/>
     *   <count_cos>2</count_cos>
     *   <count_users>7</count_users>
     *   <count_feature_options>1</count_feature_options>
     *   <count_numbering_plans>1</count_numbering_plans>
     *   <count_mcn_configs>1</count_mcn_configs>
     *   <count_children>0</count_children>
     *   <count_auto_attendants>0</count_auto_attendants>
     * </organization>
	 */
	public Organization() {}
	
	public Organization(NodeList nodes) {
    	for (int j = 0; j < nodes.getLength(); j++) {
    		Node childNode = nodes.item(j);
        	if ("audio_codec".equalsIgnoreCase(childNode.getNodeName()))
        		setAudioCodec(childNode.getTextContent()); // audio_codec
        	if ("description".equalsIgnoreCase(childNode.getNodeName()))
        		setDescription(childNode.getTextContent()); // description
        	if ("domain".equalsIgnoreCase(childNode.getNodeName()))
        		setDomain(childNode.getTextContent()); // domain
        	if ("id".equalsIgnoreCase(childNode.getNodeName()))
        		setId(childNode.getTextContent()); // id (integer)
        	if ("orgid".equalsIgnoreCase(childNode.getNodeName()))
        		setOrgId(childNode.getTextContent()); // orgid (integer)
        	if ("parent_id".equalsIgnoreCase(childNode.getNodeName()))
        		setParentId(childNode.getTextContent()); // parent_id (integer)
        	if ("count_cos".equalsIgnoreCase(childNode.getNodeName()))
        		setCountCos(childNode.getTextContent()); // count_cos
        	if ("count_users".equalsIgnoreCase(childNode.getNodeName()))
        		setCountUsers(childNode.getTextContent()); // count_users
        	if ("count_feature_options".equalsIgnoreCase(childNode.getNodeName()))
        		setCountFeatureOptions(childNode.getTextContent()); // count_feature_options
        	if ("count_numbering_plans".equalsIgnoreCase(childNode.getNodeName()))
        		setCountNumberingPlans(childNode.getTextContent()); // count_numbering_plans
        	if ("count_mcn_configs".equalsIgnoreCase(childNode.getNodeName()))
        		setCountMcnConfigs(childNode.getTextContent()); // count_mcn_configs
        	if ("count_children".equalsIgnoreCase(childNode.getNodeName()))
        		setCountChildren(childNode.getTextContent()); // count_children
        	if ("count_auto_attendants".equalsIgnoreCase(childNode.getNodeName()))
        		setCountAutoAttendants(childNode.getTextContent()); // count_auto_attendants
    	}
	}

	public String getAudioCodec() {
		return audioCodec;
	}

	public void setAudioCodec(String audioCodec) {
		this.audioCodec = audioCodec;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getCountCos() {
		return countCos;
	}

	public void setCountCos(String countCos) {
		this.countCos = countCos;
	}

	public String getCountUsers() {
		return countUsers;
	}

	public void setCountUsers(String countUsers) {
		this.countUsers = countUsers;
	}

	public String getCountFeatureOptions() {
		return countFeatureOptions;
	}

	public void setCountFeatureOptions(String countFeatureOptions) {
		this.countFeatureOptions = countFeatureOptions;
	}

	public String getCountNumberingPlans() {
		return countNumberingPlans;
	}

	public void setCountNumberingPlans(String countNumberingPlans) {
		this.countNumberingPlans = countNumberingPlans;
	}

	public String getCountMcnConfigs() {
		return countMcnConfigs;
	}

	public void setCountMcnConfigs(String countMcnConfigs) {
		this.countMcnConfigs = countMcnConfigs;
	}

	public String getCountChildren() {
		return countChildren;
	}

	public void setCountChildren(String countChildren) {
		this.countChildren = countChildren;
	}

	public String getCountAutoAttendants() {
		return countAutoAttendants;
	}

	public void setCountAutoAttendants(String countAutoAttendants) {
		this.countAutoAttendants = countAutoAttendants;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	@Override
	public String toString() {
		return "Organization [audioCodec=" + audioCodec + ", description="
				+ description + ", domain=" + domain + ", id=" + id
				+ ", orgId=" + orgId + ", parentId=" + parentId + ", countCos="
				+ countCos + ", countUsers=" + countUsers
				+ ", countFeatureOptions=" + countFeatureOptions
				+ ", countNumberingPlans=" + countNumberingPlans
				+ ", countMcnConfigs=" + countMcnConfigs + ", countChildren="
				+ countChildren + ", countAutoAttendants="
				+ countAutoAttendants + "]";
	}
	
}
