package net.cbeyond.movius.cafe;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FeatureOption {

	public static final String BYPASS_PWD = "bypass_pwd";
	public static final String REVIEW_TRASH = "review_trash";
	public static final String RESAVE_MESSAGE = "resave_message";
	public static final String TOGGLE_PLAY_MSG_TIMESTAMP = "toggle_play_msg_timestamp";
	public static final String ADMIN_NOTIFICATION_CHANNEL = "admin_notification_channel";
	public static final String SC_PB_BLOCK_SENDER = "sc_pb_block_sender";
	public static final String SC_PB_PRINT_FAX = "sc_pb_print_fax";
	public static final String SC_PB_COPY_MSG_TO_ANOTHER_MB = "sc_pb_copy_msg_to_another_mb";
	public static final String SC_PB_DELETE_MESSAGE = "sc_pb_delete_message";
	public static final String SC_PB_REPLY_MESSAGE = "sc_pb_reply_message";
	public static final String SC_PB_RETURN_CALL = "sc_pb_return_call";
	public static final String PLAY_MESSAGES = "play_messages";
	public static final String CALLER_REPLAY_MESSAGE = "caller_replay_message";
	public static final String SUBSCRIBER_PAUSE_MESSAGE = "subscriber_pause_message";
	public static final String SUBSCRIBER_PLAY_OPTIONS = "subscriber_play_options";
	public static final String COPY_MSG_TO_ANOTHER_MB = "copy_msg_to_another_mb";
	public static final String DELETE_MESSAGE = "delete_message";
	public static final String REPLY_MESSAGE = "reply_message";
	public static final String DELETE_DEPOSIT_MESSAGE = "delete_deposit_message";
	public static final String BLOCK_SENDER = "block_sender";
	public static final String RECORD_MESSAGES = "record_messages";
	public static final String SUBSCRIBER_DELIVERY_OPTIONS = "subscriber_delivery_options";
	public static final String SUBSCRIBER_URGENT_MESSAGE = "subscriber_urgent_message";
	public static final String SUBSCRIBER_PRIVATE_MESSAGE = "subscriber_private_message";
	public static final String RETURN_RECEIPT = "return-receipt";
	public static final String ADDRESS_BY_MAILBOX = "address_by_mailbox";
	public static final String ADDRESS_BY_GROUPLIST = "address_by_grouplist";
	public static final String ADDRESS_BY_NAME = "address_by_name";
	public static final String ADDRESS_BY_TELEPHONE = "address_by_telephone";
	public static final String GREETINGS_MENU = "greetings_menu";
	public static final String GREETING_OPTIONS = "greeting_options";
	public static final String GREETING_EXTENDED_ABSENCE = "greeting_extended_absence";
	public static final String PERSONAL_OPTIONS = "personal_options";
	public static final String FAX_OPTIONS = "fax_options";
	public static final String PRIMARY_FAX = "primary_fax";
	public static final String SECONDARY_FAX = "secondary_fax";
	public static final String AUTO_FAX_DELIVERY = "auto_fax_delivery";
	public static final String MWI_OPTIONS = "mwi_options";
	public static final String PERSONAL_PREFERENCES = "personal_preferences";
	public static final String PLAYBACK_PREFERENCES = "playback_preferences";
	public static final String PLAY_MSG_TIME_DATE = "play_msg_time_date";
	public static final String NAME_OPTIONS = "name_options";
	public static final String OPERATOR_TRANSFER = "operator_transfer";
	public static final String CALLERID_RESTRICTION = "callerid_restriction";
	public static final String UNDELETE_MESSAGES = "undelete_messages";
	public static final String MAKE_A_CALL = "make_a_call";
	public static final String CALLBACK_NUMBER = "callback_number";
	public static final String CALLER_RECORD_MESSAGE = "caller_record_message";
	public static final String CALLER_SEND_MESSAGE = "caller_send_message";
	public static final String DEPOSIT_CONTINUE_MESSAGE = "deposit_continue_message";
	public static final String SUBSCRIBER_OPERATOR_TRANSFER = "subscriber_operator_transfer";
	public static final String LOGIN_PWD = "login_pwd";
	public static final String REID = "reid";
	public static final String IMMEDIATE_RECORD = "immediate_record";
	public static final String CALLER_ADDITIONAL_HELP = "caller_additional_help";
	public static final String CALLER_DELIVERY_OPTIONS = "caller_delivery_options";
	public static final String CALLER_URGENT_MESSAGE = "caller_urgent_message";
	public static final String CALLER_PRIVATE_MESSAGE = "caller_private_message";
	public static final String CALLER_PREVIOUS_MENU = "caller_previous_menu";
	public static final String END_CALL = "end_call";
	public static final String RETURN_TO_MAIN_MENU = "return_to_main_menu";
	public static final String ADDITIONAL_HELP = "additional_help";
	public static final String ADDRESSING_MODE_2 = "addressing_mode_2";
	public static final String ADMIN_ALLOW_ANI = "admin_allow_ani";
	public static final String AUTO_PLAY = "auto_play";
	public static final String AUTOMATIC_CALLBACK = "automatic_callback";
	public static final String AVAILABILITY = "availability";
	public static final String BUSY_GREETING = "busy_greeting";
	public static final String CALLER_OPTIONS_PROMPT = "caller_options_prompt";
	public static final String CALLER_RECORD_PROMPT = "caller_record_prompt";
	public static final String COMMON_ACCESS_HASH_LOGIN = "common_access_hash_login";
	public static final String COMMON_ACCESS_LOGIN_PROMPT = "common_access_login_prompt";
	public static final String CUSTOM_GREETINGS = "custom_greetings";
	public static final String DELIVERY_NOTIFICATION = "delivery_notification";
	public static final String DEPOSIT_CONTINUE_RECORDING = "deposit_continue_recording";
	public static final String FAMILY_SUMMARY = "family_summary";
	public static final String GREETING_FORWARDING_NUMBER = "greeting_forwarding_number";
	public static final String GREETING_MODE_2 = "greeting_mode_2";

	public static final String DESCRIPTION = "description";
	public static final String FOID = "foid";
	public static final String ID = "id";
	public static final String ORGANIZATION_ID = "organization_id";

	boolean bypassPwd = false;
	boolean reviewTrash = false;
	boolean resaveMessage = false;
	boolean togglePlayMsgTimestamp = false;
	boolean adminNotificationChannel = false;
	boolean scPbBlockSender = false;
	boolean scPbPrintFax = false;
	boolean scPbCopyMsgToAnotherMb = false;
	boolean scPbDeleteMessage = false;
	boolean scPbReplyMessage = false;
	boolean scPbReturnCall = false;
	boolean playMessages = false;
	boolean callerReplayMessage = false;
	boolean subscriberPauseMessage = false;
	boolean subscriberPlayOptions = false;
	boolean copyMsgToAnotherMb = false;
	boolean deleteMessage = false;
	boolean replyMessage = false;
	boolean deleteDepositMessage = false;
	public static final String BLOCK_SENDER = "block_sender";
	public static final String RECORD_MESSAGES = "record_messages";
	public static final String SUBSCRIBER_DELIVERY_OPTIONS = "subscriber_delivery_options";
	public static final String SUBSCRIBER_URGENT_MESSAGE = "subscriber_urgent_message";
	public static final String SUBSCRIBER_PRIVATE_MESSAGE = "subscriber_private_message";
	public static final String RETURN_RECEIPT = "return-receipt";
	public static final String ADDRESS_BY_MAILBOX = "address_by_mailbox";
	public static final String ADDRESS_BY_GROUPLIST = "address_by_grouplist";
	public static final String ADDRESS_BY_NAME = "address_by_name";
	public static final String ADDRESS_BY_TELEPHONE = "address_by_telephone";
	public static final String GREETINGS_MENU = "greetings_menu";
	public static final String GREETING_OPTIONS = "greeting_options";
	public static final String GREETING_EXTENDED_ABSENCE = "greeting_extended_absence";
	public static final String PERSONAL_OPTIONS = "personal_options";
	public static final String FAX_OPTIONS = "fax_options";
	public static final String PRIMARY_FAX = "primary_fax";
	public static final String SECONDARY_FAX = "secondary_fax";
	public static final String AUTO_FAX_DELIVERY = "auto_fax_delivery";
	public static final String MWI_OPTIONS = "mwi_options";
	public static final String PERSONAL_PREFERENCES = "personal_preferences";
	public static final String PLAYBACK_PREFERENCES = "playback_preferences";
	public static final String PLAY_MSG_TIME_DATE = "play_msg_time_date";
	public static final String NAME_OPTIONS = "name_options";
	public static final String OPERATOR_TRANSFER = "operator_transfer";
	public static final String CALLERID_RESTRICTION = "callerid_restriction";
	public static final String UNDELETE_MESSAGES = "undelete_messages";
	public static final String MAKE_A_CALL = "make_a_call";
	public static final String CALLBACK_NUMBER = "callback_number";
	public static final String CALLER_RECORD_MESSAGE = "caller_record_message";
	public static final String CALLER_SEND_MESSAGE = "caller_send_message";
	public static final String DEPOSIT_CONTINUE_MESSAGE = "deposit_continue_message";
	public static final String SUBSCRIBER_OPERATOR_TRANSFER = "subscriber_operator_transfer";
	public static final String LOGIN_PWD = "login_pwd";
	public static final String REID = "reid";
	public static final String IMMEDIATE_RECORD = "immediate_record";
	public static final String CALLER_ADDITIONAL_HELP = "caller_additional_help";
	public static final String CALLER_DELIVERY_OPTIONS = "caller_delivery_options";
	public static final String CALLER_URGENT_MESSAGE = "caller_urgent_message";
	public static final String CALLER_PRIVATE_MESSAGE = "caller_private_message";
	public static final String CALLER_PREVIOUS_MENU = "caller_previous_menu";
	public static final String END_CALL = "end_call";
	public static final String RETURN_TO_MAIN_MENU = "return_to_main_menu";
	public static final String ADDITIONAL_HELP = "additional_help";
	public static final String ADDRESSING_MODE_2 = "addressing_mode_2";
	public static final String ADMIN_ALLOW_ANI = "admin_allow_ani";
	public static final String AUTO_PLAY = "auto_play";
	public static final String AUTOMATIC_CALLBACK = "automatic_callback";
	public static final String AVAILABILITY = "availability";
	public static final String BUSY_GREETING = "busy_greeting";
	public static final String CALLER_OPTIONS_PROMPT = "caller_options_prompt";
	public static final String CALLER_RECORD_PROMPT = "caller_record_prompt";
	public static final String COMMON_ACCESS_HASH_LOGIN = "common_access_hash_login";
	public static final String COMMON_ACCESS_LOGIN_PROMPT = "common_access_login_prompt";
	public static final String CUSTOM_GREETINGS = "custom_greetings";
	public static final String DELIVERY_NOTIFICATION = "delivery_notification";
	public static final String DEPOSIT_CONTINUE_RECORDING = "deposit_continue_recording";
	public static final String FAMILY_SUMMARY = "family_summary";
	public static final String GREETING_FORWARDING_NUMBER = "greeting_forwarding_number";
	public static final String GREETING_MODE_2 = "greeting_mode_2";

	private String description = null;
	private String foId = null;
	private String id = null;
	private String organizationId = null;
	
	public FeatureOption() {}
	
	public FeatureOption(NodeList nodes) {
    	for (int j = 0; j < nodes.getLength(); j++) {
    		Node childNode = nodes.item(j);
    		if (DESCRIPTION.equalsIgnoreCase(childNode.getNodeName()))
    			setDescription(childNode.getTextContent()); // description
    		if (FOID.equalsIgnoreCase(childNode.getNodeName()))
    			setFoId(childNode.getTextContent()); // foid (integer)
    		if (ID.equalsIgnoreCase(childNode.getNodeName()))
    			setId(childNode.getTextContent()); // id (integer)
    		if (ORGANIZATION_ID.equalsIgnoreCase(childNode.getNodeName()))
    			setOrganizationId(childNode.getTextContent()); // organization_id (integer)
    	}
	}

	/**
	 * Return the feature option flags as a map of booleans.
	 * 
	 * If the filter parameter is set to true, only options marked as true will be returned in the map.
	 * 
	 * @param filter
	 * @return
	 */
	public Map<String, Boolean> asMap(boolean filter) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		if (filter && isBypassPwd()) {
			map.put(BYPASS_PWD, isBypassPwd());
		}
		return map;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFoId() {
		return foId;
	}

	public void setFoId(String foId) {
		this.foId = foId;
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

	@Override
	public String toString() {
		return "FeatureOption [description=" + description + ", foId=" + foId
				+ ", id=" + id + ", organizationId=" + organizationId + "]";
	}
}
