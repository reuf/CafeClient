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
	public static final String GUI_CHILD_DIGIT = "gui_child_digit";
	public static final String GUI_CHILD_NUMBER = "gui_child_number";
	public static final String GUI_DEPOSIT_PWD = "gui_deposit_pwd";
	public static final String GUI_FORWARD_GREETING = "gui_forward_greeting";
	public static final String GUI_FORWARDING_NUMBER = "gui_forwarding_number";
	public static final String GUI_PLAY_ANI = "gui_play_ani";
	public static final String GUI_PLAY_CALLED_NUMBER = "gui_play_called_number";
	public static final String GUI_PLAY_MSG_HEADER = "gui_play_msg_header";
	public static final String GUI_SAVE_EMPTY_MSG = "gui_save_emtpy_msg";
	public static final String GUI_TIME_ZONE = "gui_time_zone";
	public static final String GUI_V2T_ENABLE = "gui_v2t_enable";
	public static final String GUI_VVM_ENABLE = "gui_vvm_enable";
	public static final String MCN_OPTION = "mcn_option";
	public static final String NAME_DELETE_WARNING = "name_delete_warning";
	public static final String NOTIFICATION_MMS = "notification_mms";
	public static final String NOTIFICATION_OPTION = "notification_option";
	public static final String NOTIFICATION_OUTDIAL = "notification_outdial";
	public static final String NOTIFICATION_WHITE_BLACK_LIST = "notification_white_black_list";
	public static final String NUT_NAME_GREET = "nut_name_greet";
	public static final String NUT_SYSTEM_GREET = "nut_system_greet";
	public static final String ON_CANCEL_REID = "on_cancel_reid";
	public static final String OPERATOR_NUMBER = "operator_number";
	public static final String OPERATOR_REVERT_PWD = "operator_revert_pwd";
	public static final String PREVIOUS_MENU = "previous_menu";
	public static final String RECORD_MESSAGE = "record_message";
	public static final String REPL_FLAG = "repl_flag";
	public static final String SKIP_RESAVE = "skip_resave";
	public static final String SUBSCRIBER_FASTFWD_MESSAGE = "subscriber_fastfwd_message";
	public static final String TIME_GREETINGS = "time_greetings";

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
	boolean blockSender = false;
	boolean recordMessages = false;
	boolean subscriberDeliveryOptions = false;
	boolean subscriberUrgentMessage = false;
	boolean subscriberPrivateMessage = false;
	boolean returnReceipt = false;
	boolean addressByMailbox = false;
	boolean addressByGrouplist = false;
	boolean addressByName = false;
	boolean addressByTelephone = false;
	boolean greetingsMenu = false;
	boolean greetingOptions = false;
	boolean greetingExtendedAbsence = false;
	boolean personalOptions = false;
	boolean faxOptions = false;
	boolean primaryFax = false;
	boolean secondaryFax = false;
	boolean autoFaxDelivery = false;
	boolean mwiOptions = false;
	boolean personalPreferences = false;
	boolean playbackPreferences = false;
	boolean playMsgTimeDate = false;
	boolean nameOptions = false;
	boolean operatorTransfer = false;
	boolean calleridRestriction = false;
	boolean undeleteMessages = false;
	boolean makeACall = false;
	boolean callbackNumber = false;
	boolean callerRecordMessage = false;
	boolean callerSendMessage = false;
	boolean depositContinueMessage = false;
	boolean subscriberOperatorTransfer = false;
	boolean loginPwd = false;
	boolean reid = false;
	boolean immediateRecord = false;
	boolean callerAdditionalHelp = false;
	boolean callerDeliveryOptions = false;
	boolean callerUrgentMessage = false;
	boolean callerPrivateMessage = false;
	boolean callerPreviousMenu = false;
	boolean endCall = false;
	boolean returnToMainMenu = false;
	boolean additionalHelp = false;
	boolean addressingMode2 = false;
	boolean adminAllowAni = false;
	boolean autoPlay = false;
	boolean automaticCallback = false;
	boolean availability = false;
	boolean busyGreeting = false;
	boolean callerOptionsPrompt = false;
	boolean callerRecordPrompt = false;
	boolean commonAccessHashLogin = false;
	boolean commonAccessLoginPrompt = false;
	boolean customGreetings = false;
	boolean deliveryNotification = false;
	boolean depositContinueRecording = false;
	boolean familySummary = false;
	boolean greetingForwardingNumber = false;
	boolean greetingMode2 = false;
	boolean guiChildDigit = false;
	boolean guiChildNumber = false;
	boolean guiDepositPwd = false;
	boolean guiForwardGreeting = false;
	boolean guiForwardingNumber = false;
	boolean guiPlayAni = false;
	boolean guiPlayCalledNumber = false;
	boolean guiPlayMsgHeader = false;
	boolean guiSaveEmtpyMsg = false;
	boolean guiTimeZone = false;
	boolean guiV2tEnable = false;
	boolean guiVvmEnable = false;
	boolean mcnOption = false;
	boolean nameDeleteWarning = false;
	boolean notificationMms = false;
	boolean notificationOption = false;
	boolean notificationOutdial = false;
	boolean notificationWhiteBlackList = false;
	boolean nutNameGreet = false;
	boolean nutSystemGreet = false;
	boolean onCancelReid = false;
	boolean operatorNumber = false;
	boolean operatorRevertPwd = false;
	boolean previousMenu = false;
	boolean recordMessage = false;
	boolean replFlag = false;
	boolean skipResave = false;
	boolean subscriberFastfwdMessage = false;
	boolean timeGreetings = false;

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

	public boolean isBypassPwd() {
		return bypassPwd;
	}

	public void setBypassPwd(boolean bypassPwd) {
		this.bypassPwd = bypassPwd;
	}

	public boolean isReviewTrash() {
		return reviewTrash;
	}

	public void setReviewTrash(boolean reviewTrash) {
		this.reviewTrash = reviewTrash;
	}

	public boolean isResaveMessage() {
		return resaveMessage;
	}

	public void setResaveMessage(boolean resaveMessage) {
		this.resaveMessage = resaveMessage;
	}

	public boolean isTogglePlayMsgTimestamp() {
		return togglePlayMsgTimestamp;
	}

	public void setTogglePlayMsgTimestamp(boolean togglePlayMsgTimestamp) {
		this.togglePlayMsgTimestamp = togglePlayMsgTimestamp;
	}

	public boolean isAdminNotificationChannel() {
		return adminNotificationChannel;
	}

	public void setAdminNotificationChannel(boolean adminNotificationChannel) {
		this.adminNotificationChannel = adminNotificationChannel;
	}

	public boolean isScPbBlockSender() {
		return scPbBlockSender;
	}

	public void setScPbBlockSender(boolean scPbBlockSender) {
		this.scPbBlockSender = scPbBlockSender;
	}

	public boolean isScPbPrintFax() {
		return scPbPrintFax;
	}

	public void setScPbPrintFax(boolean scPbPrintFax) {
		this.scPbPrintFax = scPbPrintFax;
	}

	public boolean isScPbCopyMsgToAnotherMb() {
		return scPbCopyMsgToAnotherMb;
	}

	public void setScPbCopyMsgToAnotherMb(boolean scPbCopyMsgToAnotherMb) {
		this.scPbCopyMsgToAnotherMb = scPbCopyMsgToAnotherMb;
	}

	public boolean isScPbDeleteMessage() {
		return scPbDeleteMessage;
	}

	public void setScPbDeleteMessage(boolean scPbDeleteMessage) {
		this.scPbDeleteMessage = scPbDeleteMessage;
	}

	public boolean isScPbReplyMessage() {
		return scPbReplyMessage;
	}

	public void setScPbReplyMessage(boolean scPbReplyMessage) {
		this.scPbReplyMessage = scPbReplyMessage;
	}

	public boolean isScPbReturnCall() {
		return scPbReturnCall;
	}

	public void setScPbReturnCall(boolean scPbReturnCall) {
		this.scPbReturnCall = scPbReturnCall;
	}

	public boolean isPlayMessages() {
		return playMessages;
	}

	public void setPlayMessages(boolean playMessages) {
		this.playMessages = playMessages;
	}

	public boolean isCallerReplayMessage() {
		return callerReplayMessage;
	}

	public void setCallerReplayMessage(boolean callerReplayMessage) {
		this.callerReplayMessage = callerReplayMessage;
	}

	public boolean isSubscriberPauseMessage() {
		return subscriberPauseMessage;
	}

	public void setSubscriberPauseMessage(boolean subscriberPauseMessage) {
		this.subscriberPauseMessage = subscriberPauseMessage;
	}

	public boolean isSubscriberPlayOptions() {
		return subscriberPlayOptions;
	}

	public void setSubscriberPlayOptions(boolean subscriberPlayOptions) {
		this.subscriberPlayOptions = subscriberPlayOptions;
	}

	public boolean isCopyMsgToAnotherMb() {
		return copyMsgToAnotherMb;
	}

	public void setCopyMsgToAnotherMb(boolean copyMsgToAnotherMb) {
		this.copyMsgToAnotherMb = copyMsgToAnotherMb;
	}

	public boolean isDeleteMessage() {
		return deleteMessage;
	}

	public void setDeleteMessage(boolean deleteMessage) {
		this.deleteMessage = deleteMessage;
	}

	public boolean isReplyMessage() {
		return replyMessage;
	}

	public void setReplyMessage(boolean replyMessage) {
		this.replyMessage = replyMessage;
	}

	public boolean isDeleteDepositMessage() {
		return deleteDepositMessage;
	}

	public void setDeleteDepositMessage(boolean deleteDepositMessage) {
		this.deleteDepositMessage = deleteDepositMessage;
	}

	public boolean isBlockSender() {
		return blockSender;
	}

	public void setBlockSender(boolean blockSender) {
		this.blockSender = blockSender;
	}

	public boolean isRecordMessages() {
		return recordMessages;
	}

	public void setRecordMessages(boolean recordMessages) {
		this.recordMessages = recordMessages;
	}

	public boolean isSubscriberDeliveryOptions() {
		return subscriberDeliveryOptions;
	}

	public void setSubscriberDeliveryOptions(boolean subscriberDeliveryOptions) {
		this.subscriberDeliveryOptions = subscriberDeliveryOptions;
	}

	public boolean isSubscriberUrgentMessage() {
		return subscriberUrgentMessage;
	}

	public void setSubscriberUrgentMessage(boolean subscriberUrgentMessage) {
		this.subscriberUrgentMessage = subscriberUrgentMessage;
	}

	public boolean isSubscriberPrivateMessage() {
		return subscriberPrivateMessage;
	}

	public void setSubscriberPrivateMessage(boolean subscriberPrivateMessage) {
		this.subscriberPrivateMessage = subscriberPrivateMessage;
	}

	public boolean isReturnReceipt() {
		return returnReceipt;
	}

	public void setReturnReceipt(boolean returnReceipt) {
		this.returnReceipt = returnReceipt;
	}

	public boolean isAddressByMailbox() {
		return addressByMailbox;
	}

	public void setAddressByMailbox(boolean addressByMailbox) {
		this.addressByMailbox = addressByMailbox;
	}

	public boolean isAddressByGrouplist() {
		return addressByGrouplist;
	}

	public void setAddressByGrouplist(boolean addressByGrouplist) {
		this.addressByGrouplist = addressByGrouplist;
	}

	public boolean isAddressByName() {
		return addressByName;
	}

	public void setAddressByName(boolean addressByName) {
		this.addressByName = addressByName;
	}

	public boolean isAddressByTelephone() {
		return addressByTelephone;
	}

	public void setAddressByTelephone(boolean addressByTelephone) {
		this.addressByTelephone = addressByTelephone;
	}

	public boolean isGreetingsMenu() {
		return greetingsMenu;
	}

	public void setGreetingsMenu(boolean greetingsMenu) {
		this.greetingsMenu = greetingsMenu;
	}

	public boolean isGreetingOptions() {
		return greetingOptions;
	}

	public void setGreetingOptions(boolean greetingOptions) {
		this.greetingOptions = greetingOptions;
	}

	public boolean isGreetingExtendedAbsence() {
		return greetingExtendedAbsence;
	}

	public void setGreetingExtendedAbsence(boolean greetingExtendedAbsence) {
		this.greetingExtendedAbsence = greetingExtendedAbsence;
	}

	public boolean isPersonalOptions() {
		return personalOptions;
	}

	public void setPersonalOptions(boolean personalOptions) {
		this.personalOptions = personalOptions;
	}

	public boolean isFaxOptions() {
		return faxOptions;
	}

	public void setFaxOptions(boolean faxOptions) {
		this.faxOptions = faxOptions;
	}

	public boolean isPrimaryFax() {
		return primaryFax;
	}

	public void setPrimaryFax(boolean primaryFax) {
		this.primaryFax = primaryFax;
	}

	public boolean isSecondaryFax() {
		return secondaryFax;
	}

	public void setSecondaryFax(boolean secondaryFax) {
		this.secondaryFax = secondaryFax;
	}

	public boolean isAutoFaxDelivery() {
		return autoFaxDelivery;
	}

	public void setAutoFaxDelivery(boolean autoFaxDelivery) {
		this.autoFaxDelivery = autoFaxDelivery;
	}

	public boolean isMwiOptions() {
		return mwiOptions;
	}

	public void setMwiOptions(boolean mwiOptions) {
		this.mwiOptions = mwiOptions;
	}

	public boolean isPersonalPreferences() {
		return personalPreferences;
	}

	public void setPersonalPreferences(boolean personalPreferences) {
		this.personalPreferences = personalPreferences;
	}

	public boolean isPlaybackPreferences() {
		return playbackPreferences;
	}

	public void setPlaybackPreferences(boolean playbackPreferences) {
		this.playbackPreferences = playbackPreferences;
	}

	public boolean isPlayMsgTimeDate() {
		return playMsgTimeDate;
	}

	public void setPlayMsgTimeDate(boolean playMsgTimeDate) {
		this.playMsgTimeDate = playMsgTimeDate;
	}

	public boolean isNameOptions() {
		return nameOptions;
	}

	public void setNameOptions(boolean nameOptions) {
		this.nameOptions = nameOptions;
	}

	public boolean isOperatorTransfer() {
		return operatorTransfer;
	}

	public void setOperatorTransfer(boolean operatorTransfer) {
		this.operatorTransfer = operatorTransfer;
	}

	public boolean isCalleridRestriction() {
		return calleridRestriction;
	}

	public void setCalleridRestriction(boolean calleridRestriction) {
		this.calleridRestriction = calleridRestriction;
	}

	public boolean isUndeleteMessages() {
		return undeleteMessages;
	}

	public void setUndeleteMessages(boolean undeleteMessages) {
		this.undeleteMessages = undeleteMessages;
	}

	public boolean isMakeACall() {
		return makeACall;
	}

	public void setMakeACall(boolean makeACall) {
		this.makeACall = makeACall;
	}

	public boolean isCallbackNumber() {
		return callbackNumber;
	}

	public void setCallbackNumber(boolean callbackNumber) {
		this.callbackNumber = callbackNumber;
	}

	public boolean isCallerRecordMessage() {
		return callerRecordMessage;
	}

	public void setCallerRecordMessage(boolean callerRecordMessage) {
		this.callerRecordMessage = callerRecordMessage;
	}

	public boolean isCallerSendMessage() {
		return callerSendMessage;
	}

	public void setCallerSendMessage(boolean callerSendMessage) {
		this.callerSendMessage = callerSendMessage;
	}

	public boolean isDepositContinueMessage() {
		return depositContinueMessage;
	}

	public void setDepositContinueMessage(boolean depositContinueMessage) {
		this.depositContinueMessage = depositContinueMessage;
	}

	public boolean isSubscriberOperatorTransfer() {
		return subscriberOperatorTransfer;
	}

	public void setSubscriberOperatorTransfer(boolean subscriberOperatorTransfer) {
		this.subscriberOperatorTransfer = subscriberOperatorTransfer;
	}

	public boolean isLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(boolean loginPwd) {
		this.loginPwd = loginPwd;
	}

	public boolean isReid() {
		return reid;
	}

	public void setReid(boolean reid) {
		this.reid = reid;
	}

	public boolean isImmediateRecord() {
		return immediateRecord;
	}

	public void setImmediateRecord(boolean immediateRecord) {
		this.immediateRecord = immediateRecord;
	}

	public boolean isCallerAdditionalHelp() {
		return callerAdditionalHelp;
	}

	public void setCallerAdditionalHelp(boolean callerAdditionalHelp) {
		this.callerAdditionalHelp = callerAdditionalHelp;
	}

	public boolean isCallerDeliveryOptions() {
		return callerDeliveryOptions;
	}

	public void setCallerDeliveryOptions(boolean callerDeliveryOptions) {
		this.callerDeliveryOptions = callerDeliveryOptions;
	}

	public boolean isCallerUrgentMessage() {
		return callerUrgentMessage;
	}

	public void setCallerUrgentMessage(boolean callerUrgentMessage) {
		this.callerUrgentMessage = callerUrgentMessage;
	}

	public boolean isCallerPrivateMessage() {
		return callerPrivateMessage;
	}

	public void setCallerPrivateMessage(boolean callerPrivateMessage) {
		this.callerPrivateMessage = callerPrivateMessage;
	}

	public boolean isCallerPreviousMenu() {
		return callerPreviousMenu;
	}

	public void setCallerPreviousMenu(boolean callerPreviousMenu) {
		this.callerPreviousMenu = callerPreviousMenu;
	}

	public boolean isEndCall() {
		return endCall;
	}

	public void setEndCall(boolean endCall) {
		this.endCall = endCall;
	}

	public boolean isReturnToMainMenu() {
		return returnToMainMenu;
	}

	public void setReturnToMainMenu(boolean returnToMainMenu) {
		this.returnToMainMenu = returnToMainMenu;
	}

	public boolean isAdditionalHelp() {
		return additionalHelp;
	}

	public void setAdditionalHelp(boolean additionalHelp) {
		this.additionalHelp = additionalHelp;
	}

	public boolean isAddressingMode2() {
		return addressingMode2;
	}

	public void setAddressingMode2(boolean addressingMode2) {
		this.addressingMode2 = addressingMode2;
	}

	public boolean isAdminAllowAni() {
		return adminAllowAni;
	}

	public void setAdminAllowAni(boolean adminAllowAni) {
		this.adminAllowAni = adminAllowAni;
	}

	public boolean isAutoPlay() {
		return autoPlay;
	}

	public void setAutoPlay(boolean autoPlay) {
		this.autoPlay = autoPlay;
	}

	public boolean isAutomaticCallback() {
		return automaticCallback;
	}

	public void setAutomaticCallback(boolean automaticCallback) {
		this.automaticCallback = automaticCallback;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public boolean isBusyGreeting() {
		return busyGreeting;
	}

	public void setBusyGreeting(boolean busyGreeting) {
		this.busyGreeting = busyGreeting;
	}

	public boolean isCallerOptionsPrompt() {
		return callerOptionsPrompt;
	}

	public void setCallerOptionsPrompt(boolean callerOptionsPrompt) {
		this.callerOptionsPrompt = callerOptionsPrompt;
	}

	public boolean isCallerRecordPrompt() {
		return callerRecordPrompt;
	}

	public void setCallerRecordPrompt(boolean callerRecordPrompt) {
		this.callerRecordPrompt = callerRecordPrompt;
	}

	public boolean isCommonAccessHashLogin() {
		return commonAccessHashLogin;
	}

	public void setCommonAccessHashLogin(boolean commonAccessHashLogin) {
		this.commonAccessHashLogin = commonAccessHashLogin;
	}

	public boolean isCommonAccessLoginPrompt() {
		return commonAccessLoginPrompt;
	}

	public void setCommonAccessLoginPrompt(boolean commonAccessLoginPrompt) {
		this.commonAccessLoginPrompt = commonAccessLoginPrompt;
	}

	public boolean isCustomGreetings() {
		return customGreetings;
	}

	public void setCustomGreetings(boolean customGreetings) {
		this.customGreetings = customGreetings;
	}

	public boolean isDeliveryNotification() {
		return deliveryNotification;
	}

	public void setDeliveryNotification(boolean deliveryNotification) {
		this.deliveryNotification = deliveryNotification;
	}

	public boolean isDepositContinueRecording() {
		return depositContinueRecording;
	}

	public void setDepositContinueRecording(boolean depositContinueRecording) {
		this.depositContinueRecording = depositContinueRecording;
	}

	public boolean isFamilySummary() {
		return familySummary;
	}

	public void setFamilySummary(boolean familySummary) {
		this.familySummary = familySummary;
	}

	public boolean isGreetingForwardingNumber() {
		return greetingForwardingNumber;
	}

	public void setGreetingForwardingNumber(boolean greetingForwardingNumber) {
		this.greetingForwardingNumber = greetingForwardingNumber;
	}

	public boolean isGreetingMode2() {
		return greetingMode2;
	}

	public void setGreetingMode2(boolean greetingMode2) {
		this.greetingMode2 = greetingMode2;
	}

	public boolean isGuiChildDigit() {
		return guiChildDigit;
	}

	public void setGuiChildDigit(boolean guiChildDigit) {
		this.guiChildDigit = guiChildDigit;
	}

	public boolean isGuiChildNumber() {
		return guiChildNumber;
	}

	public void setGuiChildNumber(boolean guiChildNumber) {
		this.guiChildNumber = guiChildNumber;
	}

	public boolean isGuiDepositPwd() {
		return guiDepositPwd;
	}

	public void setGuiDepositPwd(boolean guiDepositPwd) {
		this.guiDepositPwd = guiDepositPwd;
	}

	public boolean isGuiForwardGreeting() {
		return guiForwardGreeting;
	}

	public void setGuiForwardGreeting(boolean guiForwardGreeting) {
		this.guiForwardGreeting = guiForwardGreeting;
	}

	public boolean isGuiForwardingNumber() {
		return guiForwardingNumber;
	}

	public void setGuiForwardingNumber(boolean guiForwardingNumber) {
		this.guiForwardingNumber = guiForwardingNumber;
	}

	public boolean isGuiPlayAni() {
		return guiPlayAni;
	}

	public void setGuiPlayAni(boolean guiPlayAni) {
		this.guiPlayAni = guiPlayAni;
	}

	public boolean isGuiPlayCalledNumber() {
		return guiPlayCalledNumber;
	}

	public void setGuiPlayCalledNumber(boolean guiPlayCalledNumber) {
		this.guiPlayCalledNumber = guiPlayCalledNumber;
	}

	public boolean isGuiPlayMsgHeader() {
		return guiPlayMsgHeader;
	}

	public void setGuiPlayMsgHeader(boolean guiPlayMsgHeader) {
		this.guiPlayMsgHeader = guiPlayMsgHeader;
	}

	public boolean isGuiSaveEmtpyMsg() {
		return guiSaveEmtpyMsg;
	}

	public void setGuiSaveEmtpyMsg(boolean guiSaveEmtpyMsg) {
		this.guiSaveEmtpyMsg = guiSaveEmtpyMsg;
	}

	public boolean isGuiTimeZone() {
		return guiTimeZone;
	}

	public void setGuiTimeZone(boolean guiTimeZone) {
		this.guiTimeZone = guiTimeZone;
	}

	public boolean isGuiV2tEnable() {
		return guiV2tEnable;
	}

	public void setGuiV2tEnable(boolean guiV2tEnable) {
		this.guiV2tEnable = guiV2tEnable;
	}

	public boolean isGuiVvmEnable() {
		return guiVvmEnable;
	}

	public void setGuiVvmEnable(boolean guiVvmEnable) {
		this.guiVvmEnable = guiVvmEnable;
	}

	public boolean isMcnOption() {
		return mcnOption;
	}

	public void setMcnOption(boolean mcnOption) {
		this.mcnOption = mcnOption;
	}

	public boolean isNameDeleteWarning() {
		return nameDeleteWarning;
	}

	public void setNameDeleteWarning(boolean nameDeleteWarning) {
		this.nameDeleteWarning = nameDeleteWarning;
	}

	public boolean isNotificationMms() {
		return notificationMms;
	}

	public void setNotificationMms(boolean notificationMms) {
		this.notificationMms = notificationMms;
	}

	public boolean isNotificationOption() {
		return notificationOption;
	}

	public void setNotificationOption(boolean notificationOption) {
		this.notificationOption = notificationOption;
	}

	public boolean isNotificationOutdial() {
		return notificationOutdial;
	}

	public void setNotificationOutdial(boolean notificationOutdial) {
		this.notificationOutdial = notificationOutdial;
	}

	public boolean isNotificationWhiteBlackList() {
		return notificationWhiteBlackList;
	}

	public void setNotificationWhiteBlackList(boolean notificationWhiteBlackList) {
		this.notificationWhiteBlackList = notificationWhiteBlackList;
	}

	public boolean isNutNameGreet() {
		return nutNameGreet;
	}

	public void setNutNameGreet(boolean nutNameGreet) {
		this.nutNameGreet = nutNameGreet;
	}

	public boolean isNutSystemGreet() {
		return nutSystemGreet;
	}

	public void setNutSystemGreet(boolean nutSystemGreet) {
		this.nutSystemGreet = nutSystemGreet;
	}

	public boolean isOnCancelReid() {
		return onCancelReid;
	}

	public void setOnCancelReid(boolean onCancelReid) {
		this.onCancelReid = onCancelReid;
	}

	public boolean isOperatorNumber() {
		return operatorNumber;
	}

	public void setOperatorNumber(boolean operatorNumber) {
		this.operatorNumber = operatorNumber;
	}

	public boolean isOperatorRevertPwd() {
		return operatorRevertPwd;
	}

	public void setOperatorRevertPwd(boolean operatorRevertPwd) {
		this.operatorRevertPwd = operatorRevertPwd;
	}

	public boolean isPreviousMenu() {
		return previousMenu;
	}

	public void setPreviousMenu(boolean previousMenu) {
		this.previousMenu = previousMenu;
	}

	public boolean isRecordMessage() {
		return recordMessage;
	}

	public void setRecordMessage(boolean recordMessage) {
		this.recordMessage = recordMessage;
	}

	public boolean isReplFlag() {
		return replFlag;
	}

	public void setReplFlag(boolean replFlag) {
		this.replFlag = replFlag;
	}

	public boolean isSkipResave() {
		return skipResave;
	}

	public void setSkipResave(boolean skipResave) {
		this.skipResave = skipResave;
	}

	public boolean isSubscriberFastfwdMessage() {
		return subscriberFastfwdMessage;
	}

	public void setSubscriberFastfwdMessage(boolean subscriberFastfwdMessage) {
		this.subscriberFastfwdMessage = subscriberFastfwdMessage;
	}

	public boolean isTimeGreetings() {
		return timeGreetings;
	}

	public void setTimeGreetings(boolean timeGreetings) {
		this.timeGreetings = timeGreetings;
	}

	@Override
	public String toString() {
		return "FeatureOption [description=" + description + ", foId=" + foId
				+ ", id=" + id + ", organizationId=" + organizationId + "]";
	}
}
