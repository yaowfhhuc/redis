package me.test.redis.myredis.pojo;
import java.io.Serializable;
import java.util.Date;

public class MSEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String USER_TAG = "UserTag";

	private String USERS_TAG = null;

	// ------------ 基本信息 ------------
	private int RECORD_ID;

	private String EVENT_ID;

	private String OBJECT_ID;

	private String KEY_VALUE;

	private String DESCR;

	private int COUNTS;

	private Date START_TIME;

	private Date LAST_TIME;

	private int UP_SEVERITY;

	private String PARENT_ID;

	private String SOURCE_ID;

	private int ACK_TAG;

	private String ACK_USER;

	private Date ACK_TIME;

	private int CLEAR_TAG;

	private String CLEAR_USER;

	private Date CLEAR_TIME;

	private int ISOLATE_TAG;

	private Date ISOLATE_TIME;

	private int RESTORE_TAG;

	private Date RESTORE_TIME;

	private int PRETREAT_TAG;

	private Date PRETREAT_TIME;

	private int DISP_TAG;

	private String DISP_USER;

	private Date DISP_TIME;

	private String DISP_PATTERN;

	private String DISP_RULES;

	private String DISP_FAULT_CAUSE;

	private String DISP_UNDO_CAUSE;

	private String DISP_ID;

	private String DISP_STATUS;

	private String DISP_RECEIVER;

	private String DISP_DETAIL;

	private int LIMIT_TAG;

	private String OPER_COMM;

	private int CUSTOMER_TAG;

	private int WORTH;

	private int REPORT_TAG;

	private int PROJECT_STATUS;

	private int INHERIT_TYPE;

	private int RELATION_TAG;

	private int RESTORE_ID;

	private String PARAS1;

	private String PARAS2;

	private String PARAS3;

	private String PARAS4;

	private String PARAS5;

	private String PARAS6;

	private String PARAS7;

	private String PARAS8;

	private String PARAS9;

	private String PARASA;

	private String PARASB;

	private String PARASC;

	private String PARASD;

	private String PARASE;

	private String PARASF;

	private String PARASG;

	private String SOURCE_SYSTEM;

	private int COLLECTION_TYPE;

	private String COLLECTION_INFO;

	private Date OCCUR_TIME;

	private Date DISCOVER_TIME;

	private Date SAVE_TIME;

	private String ORIGIN_DESC;

	// ----------- 告警对象信息 -----------
	private String OBJECT_NAME;

	private String OBJECT_ALIAS;

	private String OBJECT_IP;

	private String OBJECT_STATUS_DETL;

	private String OBJECT_STATUS_ADMIN;

	private int OBJECT_SEVERITY;

	private String OBJECT_CLASS;

	private String OBJECT_DESC;

	private String OBJECT_CUSTOMER;

	private String OBJECT_TYPE;

	private String OBJECT_STATUS_PROJECT;

	private String OBJECT_STATUS_VENDOR;

	private String OBJECT_STATUS_RESOURCE;

	private String OBJECT_VENDOR;

	private String OBJECT_CUSTOMER_ID;

	private String DEVICE_ID;

	private String DEVICE_NAME;

	private String DEVICE_ALIAS;

	private String DEVICE_IP;

	private String DEVICE_SERVICE;

	private String DEVICE_LEVEL;

	private String DEVICE_LOCATION;

	private String DEVICE_TYPE;

	private String DEVICE_VERSION;

	private String DEVICE_DESC;

	private String DEVICE_VENDOR;

	private String DEVICE_NETWORK;

	private String DEVICE_MODEL;

	private String DEVICE_STATUS_PROJECT;

	private String DEVICE_STATUS_RESOURCE;

	private String DEVICE_STATUS_VENDOR;

	private String ANOTHER_ALIAS;

	private String ANOTHER_TYPE;

	private String ANOTHER_TAG;

	private int ANOTHER_SEVERITY;

	private String ANOTHER_STATUS_VENDOR;

	private String ANOTHER_STATUS_RESOURCE;

	private String ANOTHER_STATUS_PROJECT;

	private String DOMAIN;

	private String PROPERTY1;

	private String PROPERTY2;

	private String PROPERTY3;

	private String PROPERTY4;

	private String PROPERTY5;

	private String PROPERTY6;

	private String PROPERTY7;

	private String PROPERTY8;

	private String PROPERTY9;

	private String PROPERTY10;

	// ------------ 事件信息 ------------
	private String TITLE;

	private String VENDOR_EVENT_ID;

	private String VENDOR_EVENT_FACL;

	private String VENDOR_EVENT_SEVE;

	private String VENDOR_VERSION;

	private String VENDOR_SYSTEM_NAME;

	private String NAME;

	private int SEVERITY;

	private String CATEGORY;

	private String COMMENTS;

	private int FACILITY;

	private String FACILITY_LOGIC;

	private String FACILITY_LOGIC_SUB;

	private String REFERENCE_DEVICE;

	private String REFERENCE_SERVICE;

	private String ASSOCIATE_FLAG;

	private int PRETREAT_POLICY;

	private String PRETREAT_OPINION;

	private String DEAL_EXPERIENCE;

	private int IS_REPORT;

	private String FAULT_CAUSE;

	private int EVENT_WORTH;

	private String COMMENTS_ASSISTANT;

	private String ACCEPT_CITY;

	private String ACCEPT_DEPT;

	private String CONFIRM_STYLE;

	private String CELL_TYPE;

	private String USERVIEW_TAG;

	private String SERVICE_TYPE;

	private int HARVEST_TYPE;

	private int USER_APPERCEIVE;

	private String EVENT1;

	private String EVENT2;

	private String EVENT3;

	private String EVENT4;

	private String EVENT5;

	private String EVENT6;
	
	private int IS_PRETREAT;

	public MSEvent() {

	}

	public String getUSERS_TAG() {
		return USERS_TAG;
	}

	public void setUSERS_TAG(String uSERS_TAG) {
		USERS_TAG = uSERS_TAG;
	}
	
	public int getRECORD_ID() {
		return RECORD_ID;
	}

	public void setRECORD_ID(int rECORD_ID) {
		RECORD_ID = rECORD_ID;
	}

	public String getEVENT_ID() {
		return EVENT_ID;
	}

	public void setEVENT_ID(String eVENT_ID) {
		EVENT_ID = eVENT_ID;
	}

	public String getOBJECT_ID() {
		return OBJECT_ID;
	}

	public void setOBJECT_ID(String oBJECT_ID) {
		OBJECT_ID = oBJECT_ID;
	}

	public String getKEY_VALUE() {
		return KEY_VALUE;
	}

	public void setKEY_VALUE(String kEY_VALUE) {
		KEY_VALUE = kEY_VALUE;
	}

	public String getDESCR() {
		return DESCR;
	}

	public void setDESCR(String dESCR) {
		DESCR = dESCR;
	}

	public int getCOUNTS() {
		return COUNTS;
	}

	public void setCOUNTS(int cOUNTS) {
		COUNTS = cOUNTS;
	}

	public Date getSTART_TIME() {
		return START_TIME;
	}

	public void setSTART_TIME(Date sTART_TIME) {
		START_TIME = sTART_TIME;
	}

	public Date getLAST_TIME() {
		return LAST_TIME;
	}

	public void setLAST_TIME(Date lAST_TIME) {
		LAST_TIME = lAST_TIME;
	}

	public int getUP_SEVERITY() {
		return UP_SEVERITY;
	}

	public void setUP_SEVERITY(int uP_SEVERITY) {
		UP_SEVERITY = uP_SEVERITY;
	}

	public String getPARENT_ID() {
		return PARENT_ID;
	}

	public void setPARENT_ID(String pARENT_ID) {
		PARENT_ID = pARENT_ID;
	}

	public String getSOURCE_ID() {
		return SOURCE_ID;
	}

	public void setSOURCE_ID(String sOURCE_ID) {
		SOURCE_ID = sOURCE_ID;
	}

	public int getACK_TAG() {
		return ACK_TAG;
	}

	public void setACK_TAG(int aCK_TAG) {
		ACK_TAG = aCK_TAG;
	}

	public String getACK_USER() {
		return ACK_USER;
	}

	public void setACK_USER(String aCK_USER) {
		ACK_USER = aCK_USER;
	}

	public Date getACK_TIME() {
		return ACK_TIME;
	}

	public void setACK_TIME(Date aCK_TIME) {
		ACK_TIME = aCK_TIME;
	}

	public int getCLEAR_TAG() {
		return CLEAR_TAG;
	}

	public void setCLEAR_TAG(int cLEAR_TAG) {
		CLEAR_TAG = cLEAR_TAG;
	}

	public String getCLEAR_USER() {
		return CLEAR_USER;
	}

	public void setCLEAR_USER(String cLEAR_USER) {
		CLEAR_USER = cLEAR_USER;
	}

	public Date getCLEAR_TIME() {
		return CLEAR_TIME;
	}

	public void setCLEAR_TIME(Date cLEAR_TIME) {
		CLEAR_TIME = cLEAR_TIME;
	}

	public int getISOLATE_TAG() {
		return ISOLATE_TAG;
	}

	public void setISOLATE_TAG(int iSOLATE_TAG) {
		ISOLATE_TAG = iSOLATE_TAG;
	}

	public Date getISOLATE_TIME() {
		return ISOLATE_TIME;
	}

	public void setISOLATE_TIME(Date iSOLATE_TIME) {
		ISOLATE_TIME = iSOLATE_TIME;
	}

	public int getRESTORE_TAG() {
		return RESTORE_TAG;
	}

	public void setRESTORE_TAG(int rESTORE_TAG) {
		RESTORE_TAG = rESTORE_TAG;
	}

	public Date getRESTORE_TIME() {
		return RESTORE_TIME;
	}

	public void setRESTORE_TIME(Date rESTORE_TIME) {
		RESTORE_TIME = rESTORE_TIME;
	}

	public int getPRETREAT_TAG() {
		return PRETREAT_TAG;
	}

	public void setPRETREAT_TAG(int pRETREAT_TAG) {
		PRETREAT_TAG = pRETREAT_TAG;
	}

	public Date getPRETREAT_TIME() {
		return PRETREAT_TIME;
	}

	public void setPRETREAT_TIME(Date pRETREAT_TIME) {
		PRETREAT_TIME = pRETREAT_TIME;
	}

	public int getDISP_TAG() {
		return DISP_TAG;
	}

	public void setDISP_TAG(int dISP_TAG) {
		DISP_TAG = dISP_TAG;
	}

	public String getDISP_USER() {
		return DISP_USER;
	}

	public void setDISP_USER(String dISP_USER) {
		DISP_USER = dISP_USER;
	}

	public Date getDISP_TIME() {
		return DISP_TIME;
	}

	public void setDISP_TIME(Date dISP_TIME) {
		DISP_TIME = dISP_TIME;
	}

	public String getDISP_PATTERN() {
		return DISP_PATTERN;
	}

	public void setDISP_PATTERN(String dISP_PATTERN) {
		DISP_PATTERN = dISP_PATTERN;
	}

	public String getDISP_RULES() {
		return DISP_RULES;
	}

	public void setDISP_RULES(String dISP_RULES) {
		DISP_RULES = dISP_RULES;
	}

	public String getDISP_FAULT_CAUSE() {
		return DISP_FAULT_CAUSE;
	}

	public void setDISP_FAULT_CAUSE(String dISP_FAULT_CAUSE) {
		DISP_FAULT_CAUSE = dISP_FAULT_CAUSE;
	}

	public String getDISP_UNDO_CAUSE() {
		return DISP_UNDO_CAUSE;
	}

	public void setDISP_UNDO_CAUSE(String dISP_UNDO_CAUSE) {
		DISP_UNDO_CAUSE = dISP_UNDO_CAUSE;
	}

	public String getDISP_ID() {
		return DISP_ID;
	}

	public void setDISP_ID(String dISP_ID) {
		DISP_ID = dISP_ID;
	}

	public String getDISP_STATUS() {
		return DISP_STATUS;
	}

	public void setDISP_STATUS(String dISP_STATUS) {
		DISP_STATUS = dISP_STATUS;
	}

	public String getDISP_RECEIVER() {
		return DISP_RECEIVER;
	}

	public void setDISP_RECEIVER(String dISP_RECEIVER) {
		DISP_RECEIVER = dISP_RECEIVER;
	}

	public String getDISP_DETAIL() {
		return DISP_DETAIL;
	}

	public void setDISP_DETAIL(String dISP_DETAIL) {
		DISP_DETAIL = dISP_DETAIL;
	}

	public int getLIMIT_TAG() {
		return LIMIT_TAG;
	}

	public void setLIMIT_TAG(int lIMIT_TAG) {
		LIMIT_TAG = lIMIT_TAG;
	}

	public String getOPER_COMM() {
		return OPER_COMM;
	}

	public void setOPER_COMM(String oPER_COMM) {
		OPER_COMM = oPER_COMM;
	}

	public int getCUSTOMER_TAG() {
		return CUSTOMER_TAG;
	}

	public void setCUSTOMER_TAG(int cUSTOMER_TAG) {
		CUSTOMER_TAG = cUSTOMER_TAG;
	}

	public int getWORTH() {
		return WORTH;
	}

	public void setWORTH(int wORTH) {
		WORTH = wORTH;
	}

	public int getREPORT_TAG() {
		return REPORT_TAG;
	}

	public void setREPORT_TAG(int rEPORT_TAG) {
		REPORT_TAG = rEPORT_TAG;
	}

	public int getPROJECT_STATUS() {
		return PROJECT_STATUS;
	}

	public void setPROJECT_STATUS(int pROJECT_STATUS) {
		PROJECT_STATUS = pROJECT_STATUS;
	}

	public int getINHERIT_TYPE() {
		return INHERIT_TYPE;
	}

	public void setINHERIT_TYPE(int iNHERIT_TYPE) {
		INHERIT_TYPE = iNHERIT_TYPE;
	}

	public int getRELATION_TAG() {
		return RELATION_TAG;
	}

	public void setRELATION_TAG(int rELATION_TAG) {
		RELATION_TAG = rELATION_TAG;
	}

	public int getRESTORE_ID() {
		return RESTORE_ID;
	}

	public void setRESTORE_ID(int rESTORE_ID) {
		RESTORE_ID = rESTORE_ID;
	}

	public String getPARAS1() {
		return PARAS1;
	}

	public void setPARAS1(String pARAS1) {
		PARAS1 = pARAS1;
	}

	public String getPARAS2() {
		return PARAS2;
	}

	public void setPARAS2(String pARAS2) {
		PARAS2 = pARAS2;
	}

	public String getPARAS3() {
		return PARAS3;
	}

	public void setPARAS3(String pARAS3) {
		PARAS3 = pARAS3;
	}

	public String getPARAS4() {
		return PARAS4;
	}

	public void setPARAS4(String pARAS4) {
		PARAS4 = pARAS4;
	}

	public String getPARAS5() {
		return PARAS5;
	}

	public void setPARAS5(String pARAS5) {
		PARAS5 = pARAS5;
	}

	public String getPARAS6() {
		return PARAS6;
	}

	public void setPARAS6(String pARAS6) {
		PARAS6 = pARAS6;
	}

	public String getPARAS7() {
		return PARAS7;
	}

	public void setPARAS7(String pARAS7) {
		PARAS7 = pARAS7;
	}

	public String getPARAS8() {
		return PARAS8;
	}

	public void setPARAS8(String pARAS8) {
		PARAS8 = pARAS8;
	}

	public String getPARAS9() {
		return PARAS9;
	}

	public void setPARAS9(String pARAS9) {
		PARAS9 = pARAS9;
	}

	public String getPARASA() {
		return PARASA;
	}

	public void setPARASA(String pARASA) {
		PARASA = pARASA;
	}

	public String getPARASB() {
		return PARASB;
	}

	public void setPARASB(String pARASB) {
		PARASB = pARASB;
	}

	public String getPARASC() {
		return PARASC;
	}

	public void setPARASC(String pARASC) {
		PARASC = pARASC;
	}

	public String getPARASD() {
		return PARASD;
	}

	public void setPARASD(String pARASD) {
		PARASD = pARASD;
	}

	public String getPARASE() {
		return PARASE;
	}

	public void setPARASE(String pARASE) {
		PARASE = pARASE;
	}

	public String getPARASF() {
		return PARASF;
	}

	public void setPARASF(String pARASF) {
		PARASF = pARASF;
	}

	public String getPARASG() {
		return PARASG;
	}

	public void setPARASG(String pARASG) {
		PARASG = pARASG;
	}

	public String getSOURCE_SYSTEM() {
		return SOURCE_SYSTEM;
	}

	public void setSOURCE_SYSTEM(String sOURCE_SYSTEM) {
		SOURCE_SYSTEM = sOURCE_SYSTEM;
	}

	public int getCOLLECTION_TYPE() {
		return COLLECTION_TYPE;
	}

	public void setCOLLECTION_TYPE(int cOLLECTION_TYPE) {
		COLLECTION_TYPE = cOLLECTION_TYPE;
	}

	public String getCOLLECTION_INFO() {
		return COLLECTION_INFO;
	}

	public void setCOLLECTION_INFO(String cOLLECTION_INFO) {
		COLLECTION_INFO = cOLLECTION_INFO;
	}

	public Date getOCCUR_TIME() {
		return OCCUR_TIME;
	}

	public void setOCCUR_TIME(Date oCCUR_TIME) {
		OCCUR_TIME = oCCUR_TIME;
	}

	public Date getDISCOVER_TIME() {
		return DISCOVER_TIME;
	}

	public void setDISCOVER_TIME(Date dISCOVER_TIME) {
		DISCOVER_TIME = dISCOVER_TIME;
	}

	public Date getSAVE_TIME() {
		return SAVE_TIME;
	}

	public void setSAVE_TIME(Date sAVE_TIME) {
		SAVE_TIME = sAVE_TIME;
	}

	public String getORIGIN_DESC() {
		return ORIGIN_DESC;
	}

	public void setORIGIN_DESC(String oRIGIN_DESC) {
		ORIGIN_DESC = oRIGIN_DESC;
	}

	public String getOBJECT_NAME() {
		return OBJECT_NAME;
	}

	public void setOBJECT_NAME(String oBJECT_NAME) {
		OBJECT_NAME = oBJECT_NAME;
	}

	public String getOBJECT_ALIAS() {
		return OBJECT_ALIAS;
	}

	public void setOBJECT_ALIAS(String oBJECT_ALIAS) {
		OBJECT_ALIAS = oBJECT_ALIAS;
	}

	public String getOBJECT_IP() {
		return OBJECT_IP;
	}

	public void setOBJECT_IP(String oBJECT_IP) {
		OBJECT_IP = oBJECT_IP;
	}

	public String getOBJECT_STATUS_DETL() {
		return OBJECT_STATUS_DETL;
	}

	public void setOBJECT_STATUS_DETL(String oBJECT_STATUS_DETL) {
		OBJECT_STATUS_DETL = oBJECT_STATUS_DETL;
	}

	public String getOBJECT_STATUS_ADMIN() {
		return OBJECT_STATUS_ADMIN;
	}

	public void setOBJECT_STATUS_ADMIN(String oBJECT_STATUS_ADMIN) {
		OBJECT_STATUS_ADMIN = oBJECT_STATUS_ADMIN;
	}

	public int getOBJECT_SEVERITY() {
		return OBJECT_SEVERITY;
	}

	public void setOBJECT_SEVERITY(int oBJECT_SEVERITY) {
		OBJECT_SEVERITY = oBJECT_SEVERITY;
	}

	public String getOBJECT_CLASS() {
		return OBJECT_CLASS;
	}

	public void setOBJECT_CLASS(String oBJECT_CLASS) {
		OBJECT_CLASS = oBJECT_CLASS;
	}

	public String getOBJECT_DESC() {
		return OBJECT_DESC;
	}

	public void setOBJECT_DESC(String oBJECT_DESC) {
		OBJECT_DESC = oBJECT_DESC;
	}

	public String getOBJECT_CUSTOMER() {
		return OBJECT_CUSTOMER;
	}

	public void setOBJECT_CUSTOMER(String oBJECT_CUSTOMER) {
		OBJECT_CUSTOMER = oBJECT_CUSTOMER;
	}

	public String getOBJECT_TYPE() {
		return OBJECT_TYPE;
	}

	public void setOBJECT_TYPE(String oBJECT_TYPE) {
		OBJECT_TYPE = oBJECT_TYPE;
	}

	public String getOBJECT_STATUS_PROJECT() {
		return OBJECT_STATUS_PROJECT;
	}

	public void setOBJECT_STATUS_PROJECT(String oBJECT_STATUS_PROJECT) {
		OBJECT_STATUS_PROJECT = oBJECT_STATUS_PROJECT;
	}

	public String getOBJECT_STATUS_VENDOR() {
		return OBJECT_STATUS_VENDOR;
	}

	public void setOBJECT_STATUS_VENDOR(String oBJECT_STATUS_VENDOR) {
		OBJECT_STATUS_VENDOR = oBJECT_STATUS_VENDOR;
	}

	public String getOBJECT_STATUS_RESOURCE() {
		return OBJECT_STATUS_RESOURCE;
	}

	public void setOBJECT_STATUS_RESOURCE(String oBJECT_STATUS_RESOURCE) {
		OBJECT_STATUS_RESOURCE = oBJECT_STATUS_RESOURCE;
	}

	public String getOBJECT_VENDOR() {
		return OBJECT_VENDOR;
	}

	public void setOBJECT_VENDOR(String oBJECT_VENDOR) {
		OBJECT_VENDOR = oBJECT_VENDOR;
	}

	public String getOBJECT_CUSTOMER_ID() {
		return OBJECT_CUSTOMER_ID;
	}

	public void setOBJECT_CUSTOMER_ID(String oBJECT_CUSTOMER_ID) {
		OBJECT_CUSTOMER_ID = oBJECT_CUSTOMER_ID;
	}

	public String getDEVICE_ID() {
		return DEVICE_ID;
	}

	public void setDEVICE_ID(String dEVICE_ID) {
		DEVICE_ID = dEVICE_ID;
	}

	public String getDEVICE_NAME() {
		return DEVICE_NAME;
	}

	public void setDEVICE_NAME(String dEVICE_NAME) {
		DEVICE_NAME = dEVICE_NAME;
	}

	public String getDEVICE_ALIAS() {
		return DEVICE_ALIAS;
	}

	public void setDEVICE_ALIAS(String dEVICE_ALIAS) {
		DEVICE_ALIAS = dEVICE_ALIAS;
	}

	public String getDEVICE_IP() {
		return DEVICE_IP;
	}

	public void setDEVICE_IP(String dEVICE_IP) {
		DEVICE_IP = dEVICE_IP;
	}

	public String getDEVICE_SERVICE() {
		return DEVICE_SERVICE;
	}

	public void setDEVICE_SERVICE(String dEVICE_SERVICE) {
		DEVICE_SERVICE = dEVICE_SERVICE;
	}

	public String getDEVICE_LEVEL() {
		return DEVICE_LEVEL;
	}

	public void setDEVICE_LEVEL(String dEVICE_LEVEL) {
		DEVICE_LEVEL = dEVICE_LEVEL;
	}

	public String getDEVICE_LOCATION() {
		return DEVICE_LOCATION;
	}

	public void setDEVICE_LOCATION(String dEVICE_LOCATION) {
		DEVICE_LOCATION = dEVICE_LOCATION;
	}

	public String getDEVICE_TYPE() {
		return DEVICE_TYPE;
	}

	public void setDEVICE_TYPE(String dEVICE_TYPE) {
		DEVICE_TYPE = dEVICE_TYPE;
	}

	public String getDEVICE_VERSION() {
		return DEVICE_VERSION;
	}

	public void setDEVICE_VERSION(String dEVICE_VERSION) {
		DEVICE_VERSION = dEVICE_VERSION;
	}

	public String getDEVICE_DESC() {
		return DEVICE_DESC;
	}

	public void setDEVICE_DESC(String dEVICE_DESC) {
		DEVICE_DESC = dEVICE_DESC;
	}

	public String getDEVICE_VENDOR() {
		return DEVICE_VENDOR;
	}

	public void setDEVICE_VENDOR(String dEVICE_VENDOR) {
		DEVICE_VENDOR = dEVICE_VENDOR;
	}

	public String getDEVICE_NETWORK() {
		return DEVICE_NETWORK;
	}

	public void setDEVICE_NETWORK(String dEVICE_NETWORK) {
		DEVICE_NETWORK = dEVICE_NETWORK;
	}

	public String getDEVICE_MODEL() {
		return DEVICE_MODEL;
	}

	public void setDEVICE_MODEL(String dEVICE_MODEL) {
		DEVICE_MODEL = dEVICE_MODEL;
	}

	public String getDEVICE_STATUS_PROJECT() {
		return DEVICE_STATUS_PROJECT;
	}

	public void setDEVICE_STATUS_PROJECT(String dEVICE_STATUS_PROJECT) {
		DEVICE_STATUS_PROJECT = dEVICE_STATUS_PROJECT;
	}

	public String getDEVICE_STATUS_RESOURCE() {
		return DEVICE_STATUS_RESOURCE;
	}

	public void setDEVICE_STATUS_RESOURCE(String dEVICE_STATUS_RESOURCE) {
		DEVICE_STATUS_RESOURCE = dEVICE_STATUS_RESOURCE;
	}

	public String getDEVICE_STATUS_VENDOR() {
		return DEVICE_STATUS_VENDOR;
	}

	public void setDEVICE_STATUS_VENDOR(String dEVICE_STATUS_VENDOR) {
		DEVICE_STATUS_VENDOR = dEVICE_STATUS_VENDOR;
	}

	public String getANOTHER_ALIAS() {
		return ANOTHER_ALIAS;
	}

	public void setANOTHER_ALIAS(String aNOTHER_ALIAS) {
		ANOTHER_ALIAS = aNOTHER_ALIAS;
	}

	public String getANOTHER_TYPE() {
		return ANOTHER_TYPE;
	}

	public void setANOTHER_TYPE(String aNOTHER_TYPE) {
		ANOTHER_TYPE = aNOTHER_TYPE;
	}

	public String getANOTHER_TAG() {
		return ANOTHER_TAG;
	}

	public void setANOTHER_TAG(String aNOTHER_TAG) {
		ANOTHER_TAG = aNOTHER_TAG;
	}

	public int getANOTHER_SEVERITY() {
		return ANOTHER_SEVERITY;
	}

	public void setANOTHER_SEVERITY(int aNOTHER_SEVERITY) {
		ANOTHER_SEVERITY = aNOTHER_SEVERITY;
	}

	public String getANOTHER_STATUS_VENDOR() {
		return ANOTHER_STATUS_VENDOR;
	}

	public void setANOTHER_STATUS_VENDOR(String aNOTHER_STATUS_VENDOR) {
		ANOTHER_STATUS_VENDOR = aNOTHER_STATUS_VENDOR;
	}

	public String getANOTHER_STATUS_RESOURCE() {
		return ANOTHER_STATUS_RESOURCE;
	}

	public void setANOTHER_STATUS_RESOURCE(String aNOTHER_STATUS_RESOURCE) {
		ANOTHER_STATUS_RESOURCE = aNOTHER_STATUS_RESOURCE;
	}

	public String getANOTHER_STATUS_PROJECT() {
		return ANOTHER_STATUS_PROJECT;
	}

	public void setANOTHER_STATUS_PROJECT(String aNOTHER_STATUS_PROJECT) {
		ANOTHER_STATUS_PROJECT = aNOTHER_STATUS_PROJECT;
	}

	public String getDOMAIN() {
		return DOMAIN;
	}

	public void setDOMAIN(String dOMAIN) {
		DOMAIN = dOMAIN;
	}

	public String getPROPERTY1() {
		return PROPERTY1;
	}

	public void setPROPERTY1(String pROPERTY1) {
		PROPERTY1 = pROPERTY1;
	}

	public String getPROPERTY2() {
		return PROPERTY2;
	}

	public void setPROPERTY2(String pROPERTY2) {
		PROPERTY2 = pROPERTY2;
	}

	public String getPROPERTY3() {
		return PROPERTY3;
	}

	public void setPROPERTY3(String pROPERTY3) {
		PROPERTY3 = pROPERTY3;
	}

	public String getPROPERTY4() {
		return PROPERTY4;
	}

	public void setPROPERTY4(String pROPERTY4) {
		PROPERTY4 = pROPERTY4;
	}

	public String getPROPERTY5() {
		return PROPERTY5;
	}

	public void setPROPERTY5(String pROPERTY5) {
		PROPERTY5 = pROPERTY5;
	}

	public String getPROPERTY6() {
		return PROPERTY6;
	}

	public void setPROPERTY6(String pROPERTY6) {
		PROPERTY6 = pROPERTY6;
	}

	public String getPROPERTY7() {
		return PROPERTY7;
	}

	public void setPROPERTY7(String pROPERTY7) {
		PROPERTY7 = pROPERTY7;
	}

	public String getPROPERTY8() {
		return PROPERTY8;
	}

	public void setPROPERTY8(String pROPERTY8) {
		PROPERTY8 = pROPERTY8;
	}

	public String getPROPERTY9() {
		return PROPERTY9;
	}

	public void setPROPERTY9(String pROPERTY9) {
		PROPERTY9 = pROPERTY9;
	}

	public String getPROPERTY10() {
		return PROPERTY10;
	}

	public void setPROPERTY10(String pROPERTY10) {
		PROPERTY10 = pROPERTY10;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getVENDOR_EVENT_ID() {
		return VENDOR_EVENT_ID;
	}

	public void setVENDOR_EVENT_ID(String vENDOR_EVENT_ID) {
		VENDOR_EVENT_ID = vENDOR_EVENT_ID;
	}

	public String getVENDOR_EVENT_FACL() {
		return VENDOR_EVENT_FACL;
	}

	public void setVENDOR_EVENT_FACL(String vENDOR_EVENT_FACL) {
		VENDOR_EVENT_FACL = vENDOR_EVENT_FACL;
	}

	public String getVENDOR_EVENT_SEVE() {
		return VENDOR_EVENT_SEVE;
	}

	public void setVENDOR_EVENT_SEVE(String vENDOR_EVENT_SEVE) {
		VENDOR_EVENT_SEVE = vENDOR_EVENT_SEVE;
	}

	public String getVENDOR_VERSION() {
		return VENDOR_VERSION;
	}

	public void setVENDOR_VERSION(String vENDOR_VERSION) {
		VENDOR_VERSION = vENDOR_VERSION;
	}

	public String getVENDOR_SYSTEM_NAME() {
		return VENDOR_SYSTEM_NAME;
	}

	public void setVENDOR_SYSTEM_NAME(String vENDOR_SYSTEM_NAME) {
		VENDOR_SYSTEM_NAME = vENDOR_SYSTEM_NAME;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public int getSEVERITY() {
		return SEVERITY;
	}

	public void setSEVERITY(int sEVERITY) {
		SEVERITY = sEVERITY;
	}

	public String getCATEGORY() {
		return CATEGORY;
	}

	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}

	public String getCOMMENTS() {
		return COMMENTS;
	}

	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}

	public int getFACILITY() {
		return FACILITY;
	}

	public void setFACILITY(int fACILITY) {
		FACILITY = fACILITY;
	}

	public String getFACILITY_LOGIC() {
		return FACILITY_LOGIC;
	}

	public void setFACILITY_LOGIC(String fACILITY_LOGIC) {
		FACILITY_LOGIC = fACILITY_LOGIC;
	}

	public String getFACILITY_LOGIC_SUB() {
		return FACILITY_LOGIC_SUB;
	}

	public void setFACILITY_LOGIC_SUB(String fACILITY_LOGIC_SUB) {
		FACILITY_LOGIC_SUB = fACILITY_LOGIC_SUB;
	}

	public String getREFERENCE_DEVICE() {
		return REFERENCE_DEVICE;
	}

	public void setREFERENCE_DEVICE(String rEFERENCE_DEVICE) {
		REFERENCE_DEVICE = rEFERENCE_DEVICE;
	}

	public String getREFERENCE_SERVICE() {
		return REFERENCE_SERVICE;
	}

	public void setREFERENCE_SERVICE(String rEFERENCE_SERVICE) {
		REFERENCE_SERVICE = rEFERENCE_SERVICE;
	}

	public String getASSOCIATE_FLAG() {
		return ASSOCIATE_FLAG;
	}

	public void setASSOCIATE_FLAG(String aSSOCIATE_FLAG) {
		ASSOCIATE_FLAG = aSSOCIATE_FLAG;
	}

	public int getPRETREAT_POLICY() {
		return PRETREAT_POLICY;
	}

	public void setPRETREAT_POLICY(int pRETREAT_POLICY) {
		PRETREAT_POLICY = pRETREAT_POLICY;
	}

	public String getPRETREAT_OPINION() {
		return PRETREAT_OPINION;
	}

	public void setPRETREAT_OPINION(String pRETREAT_OPINION) {
		PRETREAT_OPINION = pRETREAT_OPINION;
	}

	public String getDEAL_EXPERIENCE() {
		return DEAL_EXPERIENCE;
	}

	public void setDEAL_EXPERIENCE(String dEAL_EXPERIENCE) {
		DEAL_EXPERIENCE = dEAL_EXPERIENCE;
	}

	public int getIS_REPORT() {
		return IS_REPORT;
	}

	public void setIS_REPORT(int iS_REPORT) {
		IS_REPORT = iS_REPORT;
	}

	public String getFAULT_CAUSE() {
		return FAULT_CAUSE;
	}

	public void setFAULT_CAUSE(String fAULT_CAUSE) {
		FAULT_CAUSE = fAULT_CAUSE;
	}

	public int getEVENT_WORTH() {
		return EVENT_WORTH;
	}

	public void setEVENT_WORTH(int eVENT_WORTH) {
		EVENT_WORTH = eVENT_WORTH;
	}

	public String getCOMMENTS_ASSISTANT() {
		return COMMENTS_ASSISTANT;
	}

	public void setCOMMENTS_ASSISTANT(String cOMMENTS_ASSISTANT) {
		COMMENTS_ASSISTANT = cOMMENTS_ASSISTANT;
	}

	public String getACCEPT_CITY() {
		return ACCEPT_CITY;
	}

	public void setACCEPT_CITY(String aCCEPT_CITY) {
		ACCEPT_CITY = aCCEPT_CITY;
	}

	public String getACCEPT_DEPT() {
		return ACCEPT_DEPT;
	}

	public void setACCEPT_DEPT(String aCCEPT_DEPT) {
		ACCEPT_DEPT = aCCEPT_DEPT;
	}

	public String getCONFIRM_STYLE() {
		return CONFIRM_STYLE;
	}

	public void setCONFIRM_STYLE(String cONFIRM_STYLE) {
		CONFIRM_STYLE = cONFIRM_STYLE;
	}

	public String getCELL_TYPE() {
		return CELL_TYPE;
	}

	public void setCELL_TYPE(String cELL_TYPE) {
		CELL_TYPE = cELL_TYPE;
	}

	public String getUSERVIEW_TAG() {
		return USERVIEW_TAG;
	}

	public void setUSERVIEW_TAG(String uSERVIEW_TAG) {
		USERVIEW_TAG = uSERVIEW_TAG;
	}

	public String getSERVICE_TYPE() {
		return SERVICE_TYPE;
	}

	public void setSERVICE_TYPE(String sERVICE_TYPE) {
		SERVICE_TYPE = sERVICE_TYPE;
	}

	public int getHARVEST_TYPE() {
		return HARVEST_TYPE;
	}

	public void setHARVEST_TYPE(int hARVEST_TYPE) {
		HARVEST_TYPE = hARVEST_TYPE;
	}

	public int getUSER_APPERCEIVE() {
		return USER_APPERCEIVE;
	}

	public void setUSER_APPERCEIVE(int uSER_APPERCEIVE) {
		USER_APPERCEIVE = uSER_APPERCEIVE;
	}

	public String getEVENT1() {
		return EVENT1;
	}

	public void setEVENT1(String eVENT1) {
		EVENT1 = eVENT1;
	}

	public String getEVENT2() {
		return EVENT2;
	}

	public void setEVENT2(String eVENT2) {
		EVENT2 = eVENT2;
	}

	public String getEVENT3() {
		return EVENT3;
	}

	public void setEVENT3(String eVENT3) {
		EVENT3 = eVENT3;
	}

	public String getEVENT4() {
		return EVENT4;
	}

	public void setEVENT4(String eVENT4) {
		EVENT4 = eVENT4;
	}

	public String getEVENT5() {
		return EVENT5;
	}

	public void setEVENT5(String eVENT5) {
		EVENT5 = eVENT5;
	}

	public String getEVENT6() {
		return EVENT6;
	}

	public void setEVENT6(String eVENT6) {
		EVENT6 = eVENT6;
	}

	public static String getUSER_TAG() {
		return USER_TAG;
	}

	public int getIS_PRETREAT() {
		return IS_PRETREAT;
	}

	public void setIS_PRETREAT(int iS_PRETREAT) {
		IS_PRETREAT = iS_PRETREAT;
	}

	@Override
	public String toString() {
		return "MSEvent [USERS_TAG=" + USERS_TAG + ", RECORD_ID=" + RECORD_ID + ", EVENT_ID=" + EVENT_ID
				+ ", OBJECT_ID=" + OBJECT_ID + ", KEY_VALUE=" + KEY_VALUE
				+ ", DESCR=" + DESCR + ", COUNTS=" + COUNTS + ", START_TIME="
				+ START_TIME + ", LAST_TIME=" + LAST_TIME + ", UP_SEVERITY="
				+ UP_SEVERITY + ", PARENT_ID=" + PARENT_ID + ", SOURCE_ID="
				+ SOURCE_ID + ", ACK_TAG=" + ACK_TAG + ", ACK_USER=" + ACK_USER
				+ ", ACK_TIME=" + ACK_TIME + ", CLEAR_TAG=" + CLEAR_TAG
				+ ", CLEAR_USER=" + CLEAR_USER + ", CLEAR_TIME=" + CLEAR_TIME
				+ ", ISOLATE_TAG=" + ISOLATE_TAG + ", ISOLATE_TIME="
				+ ISOLATE_TIME + ", RESTORE_TAG=" + RESTORE_TAG
				+ ", RESTORE_TIME=" + RESTORE_TIME + ", PRETREAT_TAG="
				+ PRETREAT_TAG + ", PRETREAT_TIME=" + PRETREAT_TIME
				+ ", DISP_TAG=" + DISP_TAG + ", DISP_USER=" + DISP_USER
				+ ", DISP_TIME=" + DISP_TIME + ", DISP_PATTERN=" + DISP_PATTERN
				+ ", DISP_RULES=" + DISP_RULES + ", DISP_FAULT_CAUSE="
				+ DISP_FAULT_CAUSE + ", DISP_UNDO_CAUSE=" + DISP_UNDO_CAUSE
				+ ", DISP_ID=" + DISP_ID + ", DISP_STATUS=" + DISP_STATUS
				+ ", DISP_RECEIVER=" + DISP_RECEIVER + ", DISP_DETAIL="
				+ DISP_DETAIL + ", LIMIT_TAG=" + LIMIT_TAG + ", OPER_COMM="
				+ OPER_COMM + ", CUSTOMER_TAG=" + CUSTOMER_TAG + ", WORTH="
				+ WORTH + ", REPORT_TAG=" + REPORT_TAG + ", PROJECT_STATUS="
				+ PROJECT_STATUS + ", INHERIT_TYPE=" + INHERIT_TYPE
				+ ", RELATION_TAG=" + RELATION_TAG + ", RESTORE_ID="
				+ RESTORE_ID + ", PARAS1=" + PARAS1 + ", PARAS2=" + PARAS2
				+ ", PARAS3=" + PARAS3 + ", PARAS4=" + PARAS4 + ", PARAS5="
				+ PARAS5 + ", PARAS6=" + PARAS6 + ", PARAS7=" + PARAS7
				+ ", PARAS8=" + PARAS8 + ", PARAS9=" + PARAS9 + ", PARASA="
				+ PARASA + ", PARASB=" + PARASB + ", PARASC=" + PARASC
				+ ", PARASD=" + PARASD + ", PARASE=" + PARASE + ", PARASF="
				+ PARASF + ", PARASG=" + PARASG + ", SOURCE_SYSTEM="
				+ SOURCE_SYSTEM + ", COLLECTION_TYPE=" + COLLECTION_TYPE
				+ ", COLLECTION_INFO=" + COLLECTION_INFO + ", OCCUR_TIME="
				+ OCCUR_TIME + ", DISCOVER_TIME=" + DISCOVER_TIME
				+ ", SAVE_TIME=" + SAVE_TIME + ", ORIGIN_DESC=" + ORIGIN_DESC
				+ ", OBJECT_NAME=" + OBJECT_NAME + ", OBJECT_ALIAS="
				+ OBJECT_ALIAS + ", OBJECT_IP=" + OBJECT_IP
				+ ", OBJECT_STATUS_DETL=" + OBJECT_STATUS_DETL
				+ ", OBJECT_STATUS_ADMIN=" + OBJECT_STATUS_ADMIN
				+ ", OBJECT_SEVERITY=" + OBJECT_SEVERITY + ", OBJECT_CLASS="
				+ OBJECT_CLASS + ", OBJECT_DESC=" + OBJECT_DESC
				+ ", OBJECT_CUSTOMER=" + OBJECT_CUSTOMER + ", OBJECT_TYPE="
				+ OBJECT_TYPE + ", OBJECT_STATUS_PROJECT="
				+ OBJECT_STATUS_PROJECT + ", OBJECT_STATUS_VENDOR="
				+ OBJECT_STATUS_VENDOR + ", OBJECT_STATUS_RESOURCE="
				+ OBJECT_STATUS_RESOURCE + ", OBJECT_VENDOR=" + OBJECT_VENDOR
				+ ", OBJECT_CUSTOMER_ID=" + OBJECT_CUSTOMER_ID + ", DEVICE_ID="
				+ DEVICE_ID + ", DEVICE_NAME=" + DEVICE_NAME
				+ ", DEVICE_ALIAS=" + DEVICE_ALIAS + ", DEVICE_IP=" + DEVICE_IP
				+ ", DEVICE_SERVICE=" + DEVICE_SERVICE + ", DEVICE_LEVEL="
				+ DEVICE_LEVEL + ", DEVICE_LOCATION=" + DEVICE_LOCATION
				+ ", DEVICE_TYPE=" + DEVICE_TYPE + ", DEVICE_VERSION="
				+ DEVICE_VERSION + ", DEVICE_DESC=" + DEVICE_DESC
				+ ", DEVICE_VENDOR=" + DEVICE_VENDOR + ", DEVICE_NETWORK="
				+ DEVICE_NETWORK + ", DEVICE_MODEL=" + DEVICE_MODEL
				+ ", DEVICE_STATUS_PROJECT=" + DEVICE_STATUS_PROJECT
				+ ", DEVICE_STATUS_RESOURCE=" + DEVICE_STATUS_RESOURCE
				+ ", DEVICE_STATUS_VENDOR=" + DEVICE_STATUS_VENDOR
				+ ", ANOTHER_ALIAS=" + ANOTHER_ALIAS + ", ANOTHER_TYPE="
				+ ANOTHER_TYPE + ", ANOTHER_TAG=" + ANOTHER_TAG
				+ ", ANOTHER_SEVERITY=" + ANOTHER_SEVERITY
				+ ", ANOTHER_STATUS_VENDOR=" + ANOTHER_STATUS_VENDOR
				+ ", ANOTHER_STATUS_RESOURCE=" + ANOTHER_STATUS_RESOURCE
				+ ", ANOTHER_STATUS_PROJECT=" + ANOTHER_STATUS_PROJECT
				+ ", DOMAIN=" + DOMAIN + ", PROPERTY1=" + PROPERTY1
				+ ", PROPERTY2=" + PROPERTY2 + ", PROPERTY3=" + PROPERTY3
				+ ", PROPERTY4=" + PROPERTY4 + ", PROPERTY5=" + PROPERTY5
				+ ", PROPERTY6=" + PROPERTY6 + ", PROPERTY7=" + PROPERTY7
				+ ", PROPERTY8=" + PROPERTY8 + ", PROPERTY9=" + PROPERTY9
				+ ", PROPERTY10=" + PROPERTY10 + ", TITLE=" + TITLE
				+ ", VENDOR_EVENT_ID=" + VENDOR_EVENT_ID
				+ ", VENDOR_EVENT_FACL=" + VENDOR_EVENT_FACL
				+ ", VENDOR_EVENT_SEVE=" + VENDOR_EVENT_SEVE
				+ ", VENDOR_VERSION=" + VENDOR_VERSION
				+ ", VENDOR_SYSTEM_NAME=" + VENDOR_SYSTEM_NAME + ", NAME="
				+ NAME + ", SEVERITY=" + SEVERITY + ", CATEGORY=" + CATEGORY
				+ ", COMMENTS=" + COMMENTS + ", FACILITY=" + FACILITY
				+ ", FACILITY_LOGIC=" + FACILITY_LOGIC
				+ ", FACILITY_LOGIC_SUB=" + FACILITY_LOGIC_SUB
				+ ", REFERENCE_DEVICE=" + REFERENCE_DEVICE
				+ ", REFERENCE_SERVICE=" + REFERENCE_SERVICE
				+ ", ASSOCIATE_FLAG=" + ASSOCIATE_FLAG + ", PRETREAT_POLICY="
				+ PRETREAT_POLICY + ", PRETREAT_OPINION=" + PRETREAT_OPINION
				+ ", DEAL_EXPERIENCE=" + DEAL_EXPERIENCE + ", IS_REPORT="
				+ IS_REPORT + ", FAULT_CAUSE=" + FAULT_CAUSE + ", EVENT_WORTH="
				+ EVENT_WORTH + ", COMMENTS_ASSISTANT=" + COMMENTS_ASSISTANT
				+ ", ACCEPT_CITY=" + ACCEPT_CITY + ", ACCEPT_DEPT="
				+ ACCEPT_DEPT + ", CONFIRM_STYLE=" + CONFIRM_STYLE
				+ ", CELL_TYPE=" + CELL_TYPE + ", USERVIEW_TAG=" + USERVIEW_TAG
				+ ", SERVICE_TYPE=" + SERVICE_TYPE + ", HARVEST_TYPE="
				+ HARVEST_TYPE + ", USER_APPERCEIVE=" + USER_APPERCEIVE
				+ ", EVENT1=" + EVENT1 + ", EVENT2=" + EVENT2 + ", EVENT3="
				+ EVENT3 + ", EVENT4=" + EVENT4 + ", EVENT5=" + EVENT5
				+ ", EVENT6=" + EVENT6 + ", IS_PRETREAT=" + IS_PRETREAT + "]";
	}

}