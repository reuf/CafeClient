package net.cbeyond.movius.cafe;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class User {

	private String id = null;
	private String organizationId = null;
	private String cosMappingId = null;
	private String callPlanId = null;
	private String primaryNumber = null;
	private String emailAddress = null;
	private String firstName = null;
	private String lastName = null;
	private String timeZone = null;
	private String locale = null;
	private String suspended = null;
	private String host = null;

	public User() {}
	
	public User(NodeList nodes) {
    	for (int j = 0; j < nodes.getLength(); j++) {
    		Node childNode = nodes.item(j);
    		if ("id".equalsIgnoreCase(childNode.getNodeName()))
    			setId(childNode.getTextContent()); // id
    		if ("organization_id".equalsIgnoreCase(childNode.getNodeName()))
    			setOrganizationId(childNode.getTextContent()); // organization_id
    		if ("cos_mapping_id".equalsIgnoreCase(childNode.getNodeName()))
    			setCosMappingId(childNode.getTextContent()); // cos_mapping_id
    		if ("call_plan_id".equalsIgnoreCase(childNode.getNodeName()))
    			setCallPlanId(childNode.getTextContent()); // call_plan_id
    		if ("primary_number".equalsIgnoreCase(childNode.getNodeName()))
    			setPrimaryNumber(childNode.getTextContent()); // primary_number
    		if ("email_address".equalsIgnoreCase(childNode.getNodeName()))
    			setEmailAddress(childNode.getTextContent()); // email_address
    		if ("first_name".equalsIgnoreCase(childNode.getNodeName()))
    			setFirstName(childNode.getTextContent()); // first_name
    		if ("last_name".equalsIgnoreCase(childNode.getNodeName()))
    			setLastName(childNode.getTextContent()); // last_name
    		if ("time_zone".equalsIgnoreCase(childNode.getNodeName()))
    			setTimeZone(childNode.getTextContent()); // time_zone
    		if ("locale".equalsIgnoreCase(childNode.getNodeName()))
    			setLocale(childNode.getTextContent()); // locale
    		if ("suspended".equalsIgnoreCase(childNode.getNodeName()))
    			setSuspended(childNode.getTextContent()); // suspended
    		if ("host".equalsIgnoreCase(childNode.getNodeName()))
    			setHost(childNode.getTextContent()); // host
    		// <user>  
    		//   <allow_ani type="boolean">true</allow_ani>  
    		//   <asr_tui_enable type="boolean">false</asr_tui_enable>  
    		//   <auto_fax_forwarding nil="true"/>  
    		//   <availability nil="true"/>  
    		//   <broadcast_prompt type="integer" nil="true"/>  
    		//   <bypass_password type="boolean">false</bypass_password>  
    		//   <bypass_password_numbers nil="true"/>  
    		//   <call_forwarding_channel nil="true"/>  
    		//   <call_plan_id type="integer" nil="true"/>  
    		//   <cbn_enabled type="boolean">false</cbn_enabled>  
    		//   <confirm_msg_delete type="boolean">false</confirm_msg_delete>  
    		//   <cos_mapping_id type="integer">15</cos_mapping_id>  
    		//   <crypted_password>******</crypted_password>  
    		//   <current_login_at type="datetime" nil="true"/>  
    		//   <current_login_ip nil="true"/>  
    		//   <custom_greetings type="boolean" nil="true"/>  
    		//   <data_channel nil="true"/>  
    		//   <data_channel_password>******</data_channel_password>  
    		//   <debug type="integer">-1</debug>  
    		//   <delivery_notification_enable type="boolean">false</delivery_notification_enable>  
    		//   <deposit_password nil="true"/>  
    		//   <disaster_recovery type="boolean">false</disaster_recovery>  
    		//   <email_address nil="true"/>  
    		//   <extended_absence type="boolean">false</extended_absence>  
    		//   <external_channel nil="true"/>  
    		//   <failed_login_count type="integer">0</failed_login_count>  
    		//   <family_supervisor type="boolean">false</family_supervisor>  
    		//   <fax_currentline_channel nil="true"/>  
    		//   <first_name>Brian</first_name>  
    		//   <fo_mapping_id type="integer">14</fo_mapping_id>  
    		//   <forwarding_channel nil="true"/>  
    		//   <forwarding_number nil="true"/>  
    		//   <id type="integer">51</id>  
    		//   <lang_group type="integer" nil="true"/>  
    		//   <last_forwarding_num type="boolean">false</last_forwarding_num>  
    		//   <last_login_at type="datetime" nil="true"/>  
    		//   <last_login_ip nil="true"/>  
    		//   <last_msg_deposit type="datetime" nil="true"/>  
    		//   <last_name>Michael</last_name>  
    		//   <last_request_at type="datetime" nil="true"/>  
    		//   <left_with_unheard_message type="boolean">false</left_with_unheard_message>  
    		//   <legacy_rebound_enable type="boolean" nil="true"/>  
    		//   <locale>en_US</locale>  
    		//   <login>bmichael</login>  
    		//   <login_count type="integer">0</login_count>  
    		//   <mailbox_type type="integer" nil="true"/>  
    		//   <mcn_enabled type="boolean">false</mcn_enabled>  
    		//   <mcn_message_string_id type="integer" nil="true"/>  
    		//   <mcn_mode type="integer">1</mcn_mode>  
    		//   <mcn_welcome_sent type="boolean">false</mcn_welcome_sent>  
    		//   <message_order_fifo type="boolean">false</message_order_fifo>  
    		//   <migrated type="boolean" nil="true"/>  
    		//   <mobile_phone nil="true"/>  
    		//   <monitor type="integer">-1</monitor>  
    		//   <new_user type="boolean">true</new_user>  
    		//   <no_delete type="boolean">false</no_delete>  
    		//   <notif_message_string_id type="integer">1</notif_message_string_id>  
    		//   <notification_enabled type="boolean">false</notification_enabled>  
    		//   <operator_channel nil="true"/>  
    		//   <operator_number nil="true"/>  
    		//   <operator_revert_pwd nil="true"/>  
    		//   <organization_id type="integer">14</organization_id>  
    		//   <outdial_pwd nil="true"/>  
    		//   <outdial_used_min type="integer" nil="true"/>  
    		//   <play_ani type="boolean">true</play_ani>  
    		//   <play_called_number type="boolean">false</play_called_number>  
    		//   <play_caller_options_prompt type="boolean">false</play_caller_options_prompt>  
    		//   <play_caller_record_prompt type="boolean">false</play_caller_record_prompt>  
    		//   <play_message_header type="boolean">true</play_message_header>  
    		//   <play_timestamp type="boolean">true</play_timestamp>  
    		//   <primary_fax_channel nil="true"/>  
    		//   <primary_fax_number nil="true"/>  
    		//   <primary_number type="integer">4042892327</primary_number>  
    		//   <primary_number_unique type="boolean" nil="true"/>  
    		//   <purged_messages type="integer">0</purged_messages>  
    		//   <repl_flag type="boolean">false</repl_flag>  
    		//   <return_receipt_enable type="integer">0</return_receipt_enable>  
    		//   <save_empty_msg type="boolean">false</save_empty_msg>  
    		//   <secondary_fax_channel nil="true"/>  
    		//   <secondary_fax_number nil="true"/> 
    		//   <secret_answer nil="true"/> 
    		//   <secret_question nil="true"/>  
    		//   <sls_enable type="boolean">true</sls_enable>  
    		//   <sms_shortcode_map nil="true"/>  
    		//   <spoken_name_media_id type="integer" nil="true"/>  
    		//   <sub_locale nil="true"/>  
    		//   <suspend_tui type="boolean">false</suspend_tui>  
    		//   <suspend_web type="boolean">false</suspend_web>  
    		//   <suspended type="boolean">false</suspended>  
    		//   <time_format type="integer" nil="true"/>  
    		//   <time_zone nil="true"/>  
    		//   <tt_name>6424235027426051</tt_name>  
    		//   <tui_last_login_time type="datetime" nil="true"/>  
    		//   <tui_login_blocked_time type="datetime" nil="true"/>  
    		//   <tui_menu_brief type="boolean">false</tui_menu_brief>  
    		//   <tui_pwd>******</tui_pwd>  
    		//   <tui_pwd_last_update_time type="datetime" nil="true"/>  
    		//   <v2t_allow type="boolean" nil="true"/>  
    		//   <v2t_confirm_sent type="boolean">false</v2t_confirm_sent>  
    		//   <v2t_enable type="boolean">false</v2t_enable>  
    		//   <vvm_active_greeting nil="true"/>  
    		//   <vvm_allow type="boolean" nil="true"/>  
    		//   <vvm_client_codec nil="true"/>  
    		//   <vvm_client_port type="integer" nil="true"/>  
    		//   <vvm_client_prefix nil="true"/>  
    		//   <vvm_client_type nil="true"/>  
    		//   <vvm_enable type="boolean">false</vvm_enable>  
    		//   <vvm_password nil="true"/>  
    		//   <vvm_wizard type="boolean">true</vvm_wizard>  
    		//   <web_login_blocked_time type="datetime" nil="true"/>  
    		//   <web_pwd_last_update_time type="datetime" nil="true"/>  
    		//   <roles type="array"/>  
    		//   <notifications type="array"/>  
    		//   <user_devices type="array"/>  
    		//   <call_plan_name/>  
    		//   <orgid>1001</orgid> 
    		//   <cosid>0</cosid> 
    		//   <foid>0</foid>  
    		//   <mcn_message_string_name/>  
    		//   <user_indices>    
    		//     <user_index>     
    		//       <id>37</id>      
    		//       <skey>4042892327</skey>    
    		//       <spoken_name_media_id/>     
    		//       <locale/>    
    		//       <auto_play/>    
    		//       <call_plan_id/>    
    		//       <call_plan_name/>     
    		//       <call_plan_pilot_number/>     
    		//       <call_plan_business_groupid/>   
    		//       <call_plan_domain/>     
    		//       <application_id>1</application_id>      
    		//       <application_name>voicemail</application_name>    
    		//       <app_flags/>     
    		//       <application_version>1.0.0</application_version>
    		//       <application_description>MCP voice mail application</application_description>   
    		//     </user_index>  
    		//   </user_indices>  
    		//   <children>  </children>
    		// </user>
    	}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getCosMappingId() {
		return cosMappingId;
	}

	public void setCosMappingId(String cosMappingId) {
		this.cosMappingId = cosMappingId;
	}

	public String getCallPlanId() {
		return callPlanId;
	}

	public void setCallPlanId(String callPlanId) {
		this.callPlanId = callPlanId;
	}

	public String getPrimaryNumber() {
		return primaryNumber;
	}

	public void setPrimaryNumber(String primaryNumber) {
		this.primaryNumber = primaryNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getSuspended() {
		return suspended;
	}

	public void setSuspended(String suspended) {
		this.suspended = suspended;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", organizationId=" + organizationId
				+ ", cosMappingId=" + cosMappingId + ", callPlanId="
				+ callPlanId + ", primaryNumber=" + primaryNumber
				+ ", emailAddress=" + emailAddress + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", timeZone=" + timeZone
				+ ", locale=" + locale + ", suspended=" + suspended + ", host="
				+ host + "]";
	}
}
