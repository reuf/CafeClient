package net.cbeyond.movius.cafe;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ClassOfService {

	// BOOLEANS
	public static final String ALLOW_OD_DOMESTIC_LD = "allow_od_domestic_ld";
	public static final String ALLOW_OD_INTERNATIONAL = "allow_od_international";
	public static final String ASR_TUI_ALLOW = "asr_tui_allow";
	public static final String CBN_ALLOWED = "cbn_allowed";
	public static final String DISABLE_WEB_BEFORE_NUT = "disable_web_before_nut";
	public static final String FORCE_PLAY_ENTIRE_HEADER = "force_play_entire_header";
	public static final String FORWARD_USE_CALLER_NUMBER = "forward_use_caller_number";
	public static final String HLR_OUTDIAL = "hlr_outdial";
	public static final String MCN_ALLOWED = "mcn_allowed";
	public static final String MCN_LOCAL_DELIVERY = "mcn_local_delivery";
	public static final String NOTIFICATION_ALLOWED = "notification_allowed";
	public static final String NUT_FROM_PRIMARY_ONLY = "nut_from_primary_only";
	public static final String PWD_DIFF_FROM_CURRENT = "pwd_diff_from_current";
	public static final String PWD_DIFF_FROM_SKEYS = "pwd_diff_from_skeys";
	public static final String PWD_MIX_CHARS_UP_LOW = "pwd_mix_chars_up_low";
	public static final String PWD_MIX_CHARS_UP_LOW_NUM = "pwd_mix_chars_up_low_num";
	public static final String PWD_WEB_USE_TUI = "pwd_web_use_tui";
	public static final String REPL_FLAG = "repl_flag";
	public static final String RETURN_CALL_PRIMARY_ONLY = "return_call_primary_only";
	public static final String SLS_SHARE_ACCOUNT = "sls_share_account";
	public static final String SLS_SMS_ENABLED = "sls_sms_enabled";
	public static final String SLS_VOICEMAIL = "sls_voicemail";
	public static final String SMS_CONFIRM_PROV = "sms_confirm_prov";
	public static final String SMS_RESET_PWD = "sms_reset_pwd";
	public static final String V2T_ALLOW = "v2t_allow";
	public static final String VALIDATE_NEW_PASSWORD = "validate_new_password";

	// STRINGS
	public static final String TIME_ZONE = "time_zone";
	public static final String DESCRIPTION = "description";

	// INTEGERS
	public static final String ACCT_SUSPEND_TIME_MIN = "acct_suspend_time_min";
	public static final String COSID = "cosid";
	public static final String DATA_CHAN_REG_INTERVAL = "data_chan_reg_interval";
	public static final String FAX_DELIVERY_RETRIES = "fax_delivery_retries";
	public static final String FAX_MAX_MSGS = "fax_max_msgs";
	public static final String FAX_MAX_PAGES = "fax_max_pages";
	public static final String FAX_PURGE_TIME_MIN = "fax_purge_time_min";
	public static final String FWD_MAX_EMAILS = "fwd_max_emails";
	public static final String ID = "id";
	public static final String MAILBOX_FULL_THRESHOLD = "mailbox_full_threshold";
	public static final String MAX_CONTACT_NUMBER = "max_contact_number";
	public static final String MAX_GREETING_DURATION = "max_greeting_duration";
	public static final String MAX_GREETING_MEDIA_NUMBER = "max_greeting_media_number";
	public static final String MAX_GREETING_NUMBER = "max_greeting_number";
	public static final String MAX_GROUP_MEMBER_NUMBER = "max_group_member_number";
	public static final String MAX_GROUP_NUMBER = "max_group_number";
	public static final String MAX_NOTIFICATION_NUMBER = "max_notification_number";
	public static final String MAX_OUTDIAL_DIGITS = "max_outdial_digits";
	public static final String MAX_OUTDIAL_MIN = "max_outdial_min";
	public static final String MAX_RECIPIENT_NUMBER = "max_recipient_number";
	public static final String MAX_RECORDING_DURATION = "max_recording_duration";
	public static final String MAX_SIP_SUBSCRIBES = "max_sip_subscribes";
	public static final String MAX_SPOKEN_NAME_DURATION = "max_spoken_name_duration";
	public static final String MAX_VOICE_MESSAGES = "max_voice_messages";
	public static final String MCN_CONFIG_ID = "mcn_config_id";
	public static final String MIN_LISTEN_SAVE = "min_listen_save";
	public static final String MIN_OUTDIAL_DIGITS = "min_outdial_digits";
	public static final String MIN_RECORDING_DURATION = "min_recording_duration";
	public static final String NEW_MESSAGE_PURGE_TIME_MIN = "new_message_purge_time_min";
	public static final String NUMBERING_PLAN_ID = "numbering_plan_id";
	public static final String ORGANIZATION_ID = "organization_id";
	public static final String OUTDIAL_ATTEMPT_INTERVAL = "outdial_attempt_interval";
	public static final String OUTDIAL_MAX_ATTEMPTS = "outdial_max_attempts";
	public static final String PWD_CONSEC_REPEAT_CHARS = "pwd_consec_repeat_chars";
	public static final String PWD_MAX_CHARS = "pwd_max_chars";
	public static final String PWD_MAX_CHARS_TUI = "pwd_max_chars_tui";
	public static final String PWD_MAX_FAILED_TRIES = "pwd_max_failed_tries";
	public static final String PWD_MIN_CHARS = "pwd_min_chars";
	public static final String PWD_MIN_CHARS_TUI = "pwd_min_chars_tui";
	public static final String PWD_MIN_LIFE_HR = "pwd_min_life_hr";
	public static final String PWD_RESET_DAYS = "pwd_reset_days";
	public static final String PWD_TUI_MAX_DAYS = "pwd_tui_max_days";
	public static final String PWD_TUI_MIN_LIFE_HR = "pwd_tui_min_life_hr";
	public static final String SAVED_MESSAGE_PURGE_TIME_MIN = "saved_message_purge_time_min";
	public static final String SMS_RETRY_CNT = "sms_retry_cnt";
	public static final String SMS_RETRY_INTERVAL = "sms_retry_interval";
	public static final String SUBLESS_MAX_DURATION = "subless_max_duration";
	public static final String SUBLESS_MIN_DURATION = "subless_min_duration";
	public static final String TRASH_PURGE_TIME_MIN = "trash_purge_time_min";
	public static final String TRASH_PURGE_WARN_MIN = "trash_purge_warn_min";
	public static final String V2T_SERVICE_ID = "v2t_service_id";
	public static final String WEB_SUSPEND_TIME_MIN = "web_suspend_time_min";
	public static final String OWNER_ORGID = "owner_orgid";
	
	private String description = null;
	private String countUsers = null;
	private String npId = null;
	private String mcId = null;
	
	private boolean allowOdDomesticLd = false;
	private boolean allowOdInternational = false;
	private boolean asrTuiAllow = false;
	private boolean cbnAllowed = false;
	private boolean disableWebBeforeNut = false;
	private boolean forcePlayEntireHeader = false;
	private boolean forwardUseCallerNumber = false;
	private boolean hlrOutdial = false;
	private boolean mcnAllowed = false;
	private boolean mcnLocalDelivery = false;
	private boolean notificationAllowed = false;
	private boolean nutFromPrimaryOnly = false;
	private boolean pwdDiffFromCurrent = false;
	private boolean pwdDiffFromSkeys = false;
	private boolean pwdMixCharsUpLow = false;
	private boolean pwdMixCharsUpLowNum = false;
	private boolean pwdWebUseTui = false;
	private boolean replFlag = false;
	private boolean returnCallPrimaryOnly = false;
	private boolean slsShareAccount = false;
	private boolean slsSmsEnabled = false;
	private boolean slsVoicemail = false;
	private boolean smsConfirmProv = false;
	private boolean smsResetPwd = false;
	private boolean v2tAllow = false;
	private boolean validateNewPassword = false;
	
	private int acctSuspendTimeMin = -1;
	private int cosId = -1;
	private int dataChanRegInterval = -1;
	private int faxDeliveryRetries = -1;
	private int faxMaxMsgs = -1;
	private int faxMaxPages = -1;
	private int faxPurgeTime_min = -1;
	private int fwdMaxEmails = -1;
	private int id = -1;
	private int mailboxFullThreshold = -1;
	private int maxContactNumber = -1;
	private int maxGreetingDuration = -1;
	private int maxGreetingMediaNumber = -1;
	private int maxGreetingNumber = -1;
	private int maxGroupMemberNumber = -1;
	private int maxGroupNumber = -1;
	private int maxNotificationNumber = -1;
	private int maxOutdialDigits = -1;
	private int maxOutdialMin = -1;
	private int maxRecipientNumber = -1;
	private int maxRecordingDuration = -1;
	private int maxSipSubscribes = -1;
	private int maxSpokenNameDuration = -1;
	private int maxVoiceMessages = -1;
	private int mcnConfigId = -1;
	private int minListenSave = -1;
	private int minOutdialDigits = -1;
	private int minRecordingDuration = -1;
	private int newMessagePurgeTimeMin = -1;
	private int numberingPlanId = -1;
	private int organizationId = -1;
	private int outdialAttemptInterval = -1;
	private int outdialMaxAttempts = -1;
	private int pwdConsecRepeatChars = -1;
	private int pwdMaxChars = -1;
	private int pwdMaxCharsTui = -1;
	private int pwdMaxFailedTries = -1;
	private int pwdMinChars = -1;
	private int pwdMinCharsTui = -1;
	private int pwdMinLifeHr = -1;
	private int pwdResetDays = -1;
	private int pwdTuiMaxDays = -1;
	private int pwdTuiMinLifeHr = -1;
	private int savedMessagePurgeTimeMin = -1;
	private int smsRetryCnt = -1;
	private int smsRetryInterval = -1;
	private int sublessMaxDuration = -1;
	private int sublessMinDuration = -1;
	private int trashPurgeTimeMin = -1;
	private int trashPurgeWarnMin = -1;
	private int v2tServiceId = -1;
	private int webSuspendTimeMin = -1;
	private int ownerOrgid = -1;

	public ClassOfService() {}

	public ClassOfService(NodeList nodes) {
    	for (int j = 0; j < nodes.getLength(); j++) {
    		Node childNode = nodes.item(j);
    		if ("description".equalsIgnoreCase(childNode.getNodeName())) 
    			setDescription(childNode.getTextContent()); // description
    		if ("cosid".equalsIgnoreCase(childNode.getNodeName())) {
    			try {
        			setCosId(Integer.parseInt(childNode.getTextContent())); // cosid (integer)
    			} catch (NumberFormatException nfe) {
    				System.out.println("ERROR: " + nfe);
    			}
    		}
    		if ("id".equalsIgnoreCase(childNode.getNodeName())) {
    			try {
        			setId(Integer.parseInt(childNode.getTextContent())); // id (integer)
    			} catch (NumberFormatException nfe) {
    				System.out.println("ERROR: " + nfe);
    			}
    		}
    		if ("organization_id".equalsIgnoreCase(childNode.getNodeName())) {
    			try {
        			setOrganizationId(Integer.parseInt(childNode.getTextContent())); // organization_id (integer)
    			} catch (NumberFormatException nfe) {
    				System.out.println("ERROR: " + nfe);
    			}
    		}
    		if ("mcn_config_id".equalsIgnoreCase(childNode.getNodeName())) {
    			try {
        			setMcnConfigId(Integer.parseInt(childNode.getTextContent())); // mcn_config_id (integer)
    			} catch (NumberFormatException nfe) {
    				System.out.println("ERROR: " + nfe);
    			}
    		}
    		if ("numbering_plan_id".equalsIgnoreCase(childNode.getNodeName())) {
    			try {
        			setNumberingPlanId(Integer.parseInt(childNode.getTextContent())); // numbering_plan_id (integer)
    			} catch (NumberFormatException nfe) {
    				System.out.println("ERROR: " + nfe);
    			}
    		}
    		if ("count_users".equalsIgnoreCase(childNode.getNodeName()))
    			setCountUsers(childNode.getTextContent()); // count_users (integer)
    		if ("npid".equalsIgnoreCase(childNode.getNodeName()))
    			setNpId(childNode.getTextContent()); // npid (integer)
    		if ("mpid".equalsIgnoreCase(childNode.getNodeName()))
    			setMcId(childNode.getTextContent()); // mpid (integer)
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
		if (filter && isAllowOdDomesticLd()) {
			map.put(ALLOW_OD_DOMESTIC_LD, isAllowOdDomesticLd());
		}
		return map;
	}
	
	public int getCosId() {
		return cosId;
	}

	public void setCosId(int cosId) {
		this.cosId = cosId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMcnConfigId() {
		return mcnConfigId;
	}

	public void setMcnConfigId(int mcnConfigId) {
		this.mcnConfigId = mcnConfigId;
	}

	public int getNumberingPlanId() {
		return numberingPlanId;
	}

	public void setNumberingPlanId(int numberingPlanId) {
		this.numberingPlanId = numberingPlanId;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
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

	public int getAcctSuspendTimeMin() {
		return acctSuspendTimeMin;
	}

	public void setAcctSuspendTimeMin(int acctSuspendTimeMin) {
		this.acctSuspendTimeMin = acctSuspendTimeMin;
	}

	public int getDataChanRegInterval() {
		return dataChanRegInterval;
	}

	public void setDataChanRegInterval(int dataChanRegInterval) {
		this.dataChanRegInterval = dataChanRegInterval;
	}

	public int getFaxDeliveryRetries() {
		return faxDeliveryRetries;
	}

	public void setFaxDeliveryRetries(int faxDeliveryRetries) {
		this.faxDeliveryRetries = faxDeliveryRetries;
	}

	public int getFaxMaxMsgs() {
		return faxMaxMsgs;
	}

	public void setFaxMaxMsgs(int faxMaxMsgs) {
		this.faxMaxMsgs = faxMaxMsgs;
	}

	public int getFaxMaxPages() {
		return faxMaxPages;
	}

	public void setFaxMaxPages(int faxMaxPages) {
		this.faxMaxPages = faxMaxPages;
	}

	public int getFaxPurgeTime_min() {
		return faxPurgeTime_min;
	}

	public void setFaxPurgeTime_min(int faxPurgeTime_min) {
		this.faxPurgeTime_min = faxPurgeTime_min;
	}

	public int getFwdMaxEmails() {
		return fwdMaxEmails;
	}

	public void setFwdMaxEmails(int fwdMaxEmails) {
		this.fwdMaxEmails = fwdMaxEmails;
	}

	public int getMailboxFullThreshold() {
		return mailboxFullThreshold;
	}

	public void setMailboxFullThreshold(int mailboxFullThreshold) {
		this.mailboxFullThreshold = mailboxFullThreshold;
	}

	public int getMaxContactNumber() {
		return maxContactNumber;
	}

	public void setMaxContactNumber(int maxContactNumber) {
		this.maxContactNumber = maxContactNumber;
	}

	public int getMaxGreetingDuration() {
		return maxGreetingDuration;
	}

	public void setMaxGreetingDuration(int maxGreetingDuration) {
		this.maxGreetingDuration = maxGreetingDuration;
	}

	public int getMaxGreetingMediaNumber() {
		return maxGreetingMediaNumber;
	}

	public void setMaxGreetingMediaNumber(int maxGreetingMediaNumber) {
		this.maxGreetingMediaNumber = maxGreetingMediaNumber;
	}

	public int getMaxGreetingNumber() {
		return maxGreetingNumber;
	}

	public void setMaxGreetingNumber(int maxGreetingNumber) {
		this.maxGreetingNumber = maxGreetingNumber;
	}

	public int getMaxGroupMemberNumber() {
		return maxGroupMemberNumber;
	}

	public void setMaxGroupMemberNumber(int maxGroupMemberNumber) {
		this.maxGroupMemberNumber = maxGroupMemberNumber;
	}

	public int getMaxGroupNumber() {
		return maxGroupNumber;
	}

	public void setMaxGroupNumber(int maxGroupNumber) {
		this.maxGroupNumber = maxGroupNumber;
	}

	public int getMaxNotificationNumber() {
		return maxNotificationNumber;
	}

	public void setMaxNotificationNumber(int maxNotificationNumber) {
		this.maxNotificationNumber = maxNotificationNumber;
	}

	public int getMaxOutdialDigits() {
		return maxOutdialDigits;
	}

	public void setMaxOutdialDigits(int maxOutdialDigits) {
		this.maxOutdialDigits = maxOutdialDigits;
	}

	public int getMaxOutdialMin() {
		return maxOutdialMin;
	}

	public void setMaxOutdialMin(int maxOutdialMin) {
		this.maxOutdialMin = maxOutdialMin;
	}

	public int getMaxRecipientNumber() {
		return maxRecipientNumber;
	}

	public void setMaxRecipientNumber(int maxRecipientNumber) {
		this.maxRecipientNumber = maxRecipientNumber;
	}

	public int getMaxRecordingDuration() {
		return maxRecordingDuration;
	}

	public void setMaxRecordingDuration(int maxRecordingDuration) {
		this.maxRecordingDuration = maxRecordingDuration;
	}

	public int getMaxSipSubscribes() {
		return maxSipSubscribes;
	}

	public void setMaxSipSubscribes(int maxSipSubscribes) {
		this.maxSipSubscribes = maxSipSubscribes;
	}

	public int getMaxSpokenNameDuration() {
		return maxSpokenNameDuration;
	}

	public void setMaxSpokenNameDuration(int maxSpokenNameDuration) {
		this.maxSpokenNameDuration = maxSpokenNameDuration;
	}

	public int getMaxVoiceMessages() {
		return maxVoiceMessages;
	}

	public void setMaxVoiceMessages(int maxVoiceMessages) {
		this.maxVoiceMessages = maxVoiceMessages;
	}

	public int getMinListenSave() {
		return minListenSave;
	}

	public void setMinListenSave(int minListenSave) {
		this.minListenSave = minListenSave;
	}

	public int getMinOutdialDigits() {
		return minOutdialDigits;
	}

	public void setMinOutdialDigits(int minOutdialDigits) {
		this.minOutdialDigits = minOutdialDigits;
	}

	public int getMinRecordingDuration() {
		return minRecordingDuration;
	}

	public void setMinRecordingDuration(int minRecordingDuration) {
		this.minRecordingDuration = minRecordingDuration;
	}

	public int getNewMessagePurgeTimeMin() {
		return newMessagePurgeTimeMin;
	}

	public void setNewMessagePurgeTimeMin(int newMessagePurgeTimeMin) {
		this.newMessagePurgeTimeMin = newMessagePurgeTimeMin;
	}

	public int getOutdialAttemptInterval() {
		return outdialAttemptInterval;
	}

	public void setOutdialAttemptInterval(int outdialAttemptInterval) {
		this.outdialAttemptInterval = outdialAttemptInterval;
	}

	public int getOutdialMaxAttempts() {
		return outdialMaxAttempts;
	}

	public void setOutdialMaxAttempts(int outdialMaxAttempts) {
		this.outdialMaxAttempts = outdialMaxAttempts;
	}

	public int getPwdConsecRepeatChars() {
		return pwdConsecRepeatChars;
	}

	public void setPwdConsecRepeatChars(int pwdConsecRepeatChars) {
		this.pwdConsecRepeatChars = pwdConsecRepeatChars;
	}

	public int getPwdMaxChars() {
		return pwdMaxChars;
	}

	public void setPwdMaxChars(int pwdMaxChars) {
		this.pwdMaxChars = pwdMaxChars;
	}

	public int getPwdMaxCharsTui() {
		return pwdMaxCharsTui;
	}

	public void setPwdMaxCharsTui(int pwdMaxCharsTui) {
		this.pwdMaxCharsTui = pwdMaxCharsTui;
	}

	public int getPwdMaxFailedTries() {
		return pwdMaxFailedTries;
	}

	public void setPwdMaxFailedTries(int pwdMaxFailedTries) {
		this.pwdMaxFailedTries = pwdMaxFailedTries;
	}

	public int getPwdMinChars() {
		return pwdMinChars;
	}

	public void setPwdMinChars(int pwdMinChars) {
		this.pwdMinChars = pwdMinChars;
	}

	public int getPwdMinCharsTui() {
		return pwdMinCharsTui;
	}

	public void setPwdMinCharsTui(int pwdMinCharsTui) {
		this.pwdMinCharsTui = pwdMinCharsTui;
	}

	public int getPwdMinLifeHr() {
		return pwdMinLifeHr;
	}

	public void setPwdMinLifeHr(int pwdMinLifeHr) {
		this.pwdMinLifeHr = pwdMinLifeHr;
	}

	public int getPwdResetDays() {
		return pwdResetDays;
	}

	public void setPwdResetDays(int pwdResetDays) {
		this.pwdResetDays = pwdResetDays;
	}

	public int getPwdTuiMaxDays() {
		return pwdTuiMaxDays;
	}

	public void setPwdTuiMaxDays(int pwdTuiMaxDays) {
		this.pwdTuiMaxDays = pwdTuiMaxDays;
	}

	public int getPwdTuiMinLifeHr() {
		return pwdTuiMinLifeHr;
	}

	public void setPwdTuiMinLifeHr(int pwdTuiMinLifeHr) {
		this.pwdTuiMinLifeHr = pwdTuiMinLifeHr;
	}

	public int getSavedMessagePurgeTimeMin() {
		return savedMessagePurgeTimeMin;
	}

	public void setSavedMessagePurgeTimeMin(int savedMessagePurgeTimeMin) {
		this.savedMessagePurgeTimeMin = savedMessagePurgeTimeMin;
	}

	public int getSmsRetryCnt() {
		return smsRetryCnt;
	}

	public void setSmsRetryCnt(int smsRetryCnt) {
		this.smsRetryCnt = smsRetryCnt;
	}

	public int getSmsRetryInterval() {
		return smsRetryInterval;
	}

	public void setSmsRetryInterval(int smsRetryInterval) {
		this.smsRetryInterval = smsRetryInterval;
	}

	public int getSublessMaxDuration() {
		return sublessMaxDuration;
	}

	public void setSublessMaxDuration(int sublessMaxDuration) {
		this.sublessMaxDuration = sublessMaxDuration;
	}

	public int getSublessMinDuration() {
		return sublessMinDuration;
	}

	public void setSublessMinDuration(int sublessMinDuration) {
		this.sublessMinDuration = sublessMinDuration;
	}

	public int getTrashPurgeTimeMin() {
		return trashPurgeTimeMin;
	}

	public void setTrashPurgeTimeMin(int trashPurgeTimeMin) {
		this.trashPurgeTimeMin = trashPurgeTimeMin;
	}

	public int getTrashPurgeWarnMin() {
		return trashPurgeWarnMin;
	}

	public void setTrashPurgeWarnMin(int trashPurgeWarnMin) {
		this.trashPurgeWarnMin = trashPurgeWarnMin;
	}

	public int getV2tServiceId() {
		return v2tServiceId;
	}

	public void setV2tServiceId(int v2tServiceId) {
		this.v2tServiceId = v2tServiceId;
	}

	public int getWebSuspendTimeMin() {
		return webSuspendTimeMin;
	}

	public void setWebSuspendTimeMin(int webSuspendTimeMin) {
		this.webSuspendTimeMin = webSuspendTimeMin;
	}

	public int getOwnerOrgid() {
		return ownerOrgid;
	}

	public void setOwnerOrgid(int ownerOrgid) {
		this.ownerOrgid = ownerOrgid;
	}

	public boolean isAllowOdDomesticLd() {
		return allowOdDomesticLd;
	}

	public void setAllowOdDomesticLd(boolean allowOdDomesticLd) {
		this.allowOdDomesticLd = allowOdDomesticLd;
	}

	public boolean isAllowOdInternational() {
		return allowOdInternational;
	}

	public void setAllowOdInternational(boolean allowOdInternational) {
		this.allowOdInternational = allowOdInternational;
	}

	public boolean isAsrTuiAllow() {
		return asrTuiAllow;
	}

	public void setAsrTuiAllow(boolean asrTuiAllow) {
		this.asrTuiAllow = asrTuiAllow;
	}

	public boolean isCbnAllowed() {
		return cbnAllowed;
	}

	public void setCbnAllowed(boolean cbnAllowed) {
		this.cbnAllowed = cbnAllowed;
	}

	public boolean isDisableWebBeforeNut() {
		return disableWebBeforeNut;
	}

	public void setDisableWebBeforeNut(boolean disableWebBeforeNut) {
		this.disableWebBeforeNut = disableWebBeforeNut;
	}

	public boolean isForcePlayEntireHeader() {
		return forcePlayEntireHeader;
	}

	public void setForcePlayEntireHeader(boolean forcePlayEntireHeader) {
		this.forcePlayEntireHeader = forcePlayEntireHeader;
	}

	public boolean isForwardUseCallerNumber() {
		return forwardUseCallerNumber;
	}

	public void setForwardUseCallerNumber(boolean forwardUseCallerNumber) {
		this.forwardUseCallerNumber = forwardUseCallerNumber;
	}

	public boolean isHlrOutdial() {
		return hlrOutdial;
	}

	public void setHlrOutdial(boolean hlrOutdial) {
		this.hlrOutdial = hlrOutdial;
	}

	public boolean isMcnAllowed() {
		return mcnAllowed;
	}

	public void setMcnAllowed(boolean mcnAllowed) {
		this.mcnAllowed = mcnAllowed;
	}

	public boolean isMcnLocalDelivery() {
		return mcnLocalDelivery;
	}

	public void setMcnLocalDelivery(boolean mcnLocalDelivery) {
		this.mcnLocalDelivery = mcnLocalDelivery;
	}

	public boolean isNotificationAllowed() {
		return notificationAllowed;
	}

	public void setNotificationAllowed(boolean notificationAllowed) {
		this.notificationAllowed = notificationAllowed;
	}

	public boolean isNutFromPrimaryOnly() {
		return nutFromPrimaryOnly;
	}

	public void setNutFromPrimaryOnly(boolean nutFromPrimaryOnly) {
		this.nutFromPrimaryOnly = nutFromPrimaryOnly;
	}

	public boolean isPwdDiffFromCurrent() {
		return pwdDiffFromCurrent;
	}

	public void setPwdDiffFromCurrent(boolean pwdDiffFromCurrent) {
		this.pwdDiffFromCurrent = pwdDiffFromCurrent;
	}

	public boolean isPwdDiffFromSkeys() {
		return pwdDiffFromSkeys;
	}

	public void setPwdDiffFromSkeys(boolean pwdDiffFromSkeys) {
		this.pwdDiffFromSkeys = pwdDiffFromSkeys;
	}

	public boolean isPwdMixCharsUpLow() {
		return pwdMixCharsUpLow;
	}

	public void setPwdMixCharsUpLow(boolean pwdMixCharsUpLow) {
		this.pwdMixCharsUpLow = pwdMixCharsUpLow;
	}

	public boolean isPwdMixCharsUpLowNum() {
		return pwdMixCharsUpLowNum;
	}

	public void setPwdMixCharsUpLowNum(boolean pwdMixCharsUpLowNum) {
		this.pwdMixCharsUpLowNum = pwdMixCharsUpLowNum;
	}

	public boolean isPwdWebUseTui() {
		return pwdWebUseTui;
	}

	public void setPwdWebUseTui(boolean pwdWebUseTui) {
		this.pwdWebUseTui = pwdWebUseTui;
	}

	public boolean isReplFlag() {
		return replFlag;
	}

	public void setReplFlag(boolean replFlag) {
		this.replFlag = replFlag;
	}

	public boolean isReturnCallPrimaryOnly() {
		return returnCallPrimaryOnly;
	}

	public void setReturnCallPrimaryOnly(boolean returnCallPrimaryOnly) {
		this.returnCallPrimaryOnly = returnCallPrimaryOnly;
	}

	public boolean isSlsShareAccount() {
		return slsShareAccount;
	}

	public void setSlsShareAccount(boolean slsShareAccount) {
		this.slsShareAccount = slsShareAccount;
	}

	public boolean isSlsSmsEnabled() {
		return slsSmsEnabled;
	}

	public void setSlsSmsEnabled(boolean slsSmsEnabled) {
		this.slsSmsEnabled = slsSmsEnabled;
	}

	public boolean isSlsVoicemail() {
		return slsVoicemail;
	}

	public void setSlsVoicemail(boolean slsVoicemail) {
		this.slsVoicemail = slsVoicemail;
	}

	public boolean isSmsConfirmProv() {
		return smsConfirmProv;
	}

	public void setSmsConfirmProv(boolean smsConfirmProv) {
		this.smsConfirmProv = smsConfirmProv;
	}

	public boolean isSmsResetPwd() {
		return smsResetPwd;
	}

	public void setSmsResetPwd(boolean smsResetPwd) {
		this.smsResetPwd = smsResetPwd;
	}

	public boolean isV2tAllow() {
		return v2tAllow;
	}

	public void setV2tAllow(boolean v2tAllow) {
		this.v2tAllow = v2tAllow;
	}

	public boolean isValidateNewPassword() {
		return validateNewPassword;
	}

	public void setValidateNewPassword(boolean validateNewPassword) {
		this.validateNewPassword = validateNewPassword;
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
