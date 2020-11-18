/**
 * 
 */
package com.dd.schoolAdminPanel.constants;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


public class MasterConstants {

	public static String LOGIN_AUTHENTICATION = "LOGIN_AUTHENTICATION";
	
	public static final String BASE_DIR = "SET_TRACE";
	public static final String APP_MODE_TEST = "SHU-STRACE-TEST";
	public static final String APP_MODE_PROD = "SHU-STRACE-PROD";
	
	public static String START_ROW = "0";
	public static String NO_OF_RECORDS_PER_PAGE = "25";
	public static String NO_OF_RECORDS_PER_PAGE_5 = "5";
	public static String NO_OF_RECORDS_PER_PAGE_10 = "10";
	public static String NO_OF_RECORDS_ATTENDANCE_PAGE = "50";
	
	public static String JASON_SUCCESS_OBJECT = "msg";
	public static String JASON_SUCCESS = "success";
	public static String JASON_FAILURE = "failure";
	
	//VIEW REQUEST
	public static String JOB_REQUEST_LIST = "jobRequestList";
	public static String JOB_REQUEST_LIST_TOTAL_COUNT = "jobRequestListTotalCount";
	public static String USER_ID_ADMIN = "ADMIN";
	
	public static String LOCATION_LIST = "LOCATION_LIST";
	public static String LOCATION_LIST_TOTAL_COUNT = "LOCATION_LIST_TOTAL_COUNT";
	
	public static String BOX_CAPACITY_LIST = "BOX_CAPACITY_LIST";
	public static String BOX_CAPACITY_LIST_TOTAL_COUNT = "BOX_CAPACITY_LIST_TOTAL_COUNT";
	
	public static String FG_SA_LINK_LIST = "FG_SA_LINK_LIST";
	public static String FG_SA_LINK_LIST_TOTAL_COUNT = "FG_SA_LINK_LIST_TOTAL_COUNT";
	
	public static String ITEM_COMBO_LIST = "ITEM_COMBO_LIST";
	public static String ITEM_COMBO_LIST_TOTAL_COUNT = "ITEM_COMBO_LIST_TOTAL_COUNT";
	
	public static String REF_ITEM_COMBO_LIST = "REF_ITEM_COMBO_LIST";
	public static String REF_ITEM_COMBO_LIST_TOTAL_COUNT = "REF_ITEM_COMBO_LIST_TOTAL_COUNT";
	
	public static String TOOLS_COMBO_LIST = "TOOLS_COMBO_LIST";
	public static String TOOLS_COMBO_LIST_TOTAL_COUNT = "TOOLS_COMBO_LIST_TOTAL_COUNT";
	
	public static String WIP_LINK_LIST = "WIP_LINK_LIST";
	public static String WIP_LINK_LIST_TOTAL_COUNT = "WIP_LINK_LIST_TOTAL_COUNT";
	
	public static String DJ_COMBO_LIST = "DJ_COMBO_LIST";
	public static String DJ_COMBO_LIST_TOTAL_COUNT = "DJ_COMBO_LIST_TOTAL_COUNT";
	
	public static String RECEIPT_NO_COMBO_LIST = "RECEIPT_NO_COMBO_LIST";
	public static String RECEIPT_NO_COMBO_LIST_COUNT = "RECEIPT_NO_COMBO_LIST_COUNT";
	
	public static String FORM = "FORM";
	public static String REPORT = "REPORT";
	public static String MOBILE = "MOBILE";
	
	public static String MAX_ROW_10 = "10";
	public static String MAX_ROW_14 = "14";
	public static String MAX_ROW_25 = "25";
	public static String MAX_ROW_20 = "20";
	public static String MAX_ROW_50 = "50";
	public static String MAX_ROW_100 = "100";
	public static String MAX_ROW_200 = "200";
	
	public static String xmlDir = "/com/vital/xml/query/";
	public static String fileDir = "/com/vital/base/filepath/xml/";
	
	public static int ADMIN_GROUP_ID = 1; 
	
//	public static String MAIN_DIRECTORY = "";
//	public static String IMPORT_GENERAL_DOCUMENT_DIRECTORY = "";
//	public static String EXPORT_GENERAL_DOCUMENT_DIRECTORY = "";
//	public static String IMPORT_STUDENT_PHOTO_DIRECTORY = "";
	
	public static String SYSTEM_OS = "";
	
	public static String WEB_SERVER_HOME_DRIVE = "WEB_SERVER_HOME_DRIVE";

	public static String PICK_LIST_COMBO = "PICK_LIST_COMBO";
	public static String PICK_LIST_COMBO_TOTAL_COUNT = "PICK_LIST_COMBO_TOTAL_COUNT";

	public static String THAWING_PROCESS_SCAN_FROM_CHILLER = "SCAN FROM CHILLER";
	public static String THAWING_PROCESS_SCAN_BEFORE_USE = "SCAN BEFORE USE";
	public static String THAWING_PROCESS_RETURN_TO_CHILLER = "RETURN TO CHILLER";
	public static String THAWING_PROCESS_MIXER = "MIXER";
	public static String THAWING_PROCESS_PRODUCT_LEVEL_THREE = "LEVEL 3";
	public static String THAWING_PROCESS_STATUS_SCRAPPED = "LOT SCRAPPED";
	
	public static String PROGRAM_LIST = "PROGRAM_LIST";
	public static String PROGRAM_LIST_TOTAL_COUNT = "PROGRAM_LIST_TOTAL_COUNT";

	public static int MESSAGE_SEND_STATUS = 1; 
	public static int MESSAGE_UNSEND_STATUS = 0; 
	public static int MESSAGE_INVALID_STATUS = 2; 
	public static int MESSAGE_INQUEUE_STATUS = 3; 
	public static int MESSAGE_REJECT_STATUS = 4; 
	public static int PROCESS_RECORDS_PER_PAGE = 20; 

	public static String MAIN_DIRECTORY_FOR_UPLOAD_AND_EXPORT = "import,processing,export,error,processed,email,repair";
	public static String SUB_DIRECTORY_FOR_REQUIRED_MAIN_DIRECTORY = "import,processing,processed,error,export";
	public static String SUB_DIRECTORY_REQUIRED_FOR_REPAIR = "import,processing,processed,error,repair";
	
	//ITEM SPECIFICATION 
	public static int PARENT_ORG_ID = 82;
	
	// Mail notification for PT200 and DGS
	public static String MAIL_NOTIFICATION_PROCESS_NAME_FOR_PT200 = "PT200";
	public static String MAIL_NOTIFICATION_PROCESS_NAME_FOR_DGS = "DGS";
	public static String MAIL_NOTIFICATION_PROCESS_NAME_FOR_DGS_PT200 = "DGS-PT200";
	public static String MAIL_NOTIFICATION_PROCESS_NAME_FOR_INLINE_SCANNER = "INLINE SCANNER";

	// Mail Notification for Before repair Import
	public static String MAIL_NOTIFICATION_PROCESS_NAME_FOR_BEFORE_REPAIR = "BEFORE REPAIR";
	
	// Mail Notification for During repair Import
	public static String MAIL_NOTIFICATION_PROCESS_NAME_FOR_DURING_REPAIR = "DURING REPAIR";
	
	// Mail Notification for Repair Confirmation Import
	public static String MAIL_NOTIFICATION_PROCESS_NAME_FOR_REPAIR_CONFIRMATION = "REPAIR CONFIRMATION";

	
	// Mail Notification for Packing Oqc Import
	public static String MAIL_NOTIFICATION_PROCESS_NAME_FOR_PACKING_OQC = "PACKING OQC";
	
	// Mail Notification for Palletization Import
	public static String MAIL_NOTIFICATION_PROCESS_NAME_FOR_PALLETIZATION = "PALLETIZATION";
	
	
	// LANGUAGE COMBO LIST
	public static String[] LANGUAGE_NAME_LIST ={"English","Hungarian"};
	public static String[] LANGUAGE_CODE_LIST ={"en","hu"};
	public static String[] LANGUAGE_COUNTRY_CODE_LIST ={"US","HU"};
	
	// LOT EXPIRATION TYPE COMBO LIST
	public static String[] LOT_EXPIRY_NAME ={"No Expiration","From Receipt Date","From Production Date","Fixed Date"};
	public static String[] LOT_EXPIRY_NAME_ID ={"0","1","2","3"};
	
	// UOM COMBO LIST
	public static String[] UOM_NAME ={"mm","cm","in","ft","m","mg","g","kg"};
	public static String[] UOM_ID ={"mm","cm","in","ft","m","mg","g","kg"};
	
	//PROCESS NAME COMBO
	public static String[] PROCESSS_NAME ={"PT200","DGS","BEFORE REPAIR","DURING REPAIR","REPAIR CONFIRMATION","PACKING OQC",
		                                    "PALLETIZATION","APPLICATION SERVER IP","APPLICATION SERVER USERNAME","APPLICATION SERVER PASSWORD",
		                                    "CLIENT ARCHIVED","INLINE_SCANNER","INLINE SCANNER CLIENT ARCHIVED","INLINE SCANNER CLIENT CONFIG"
		                                   ,"PALLETIZATION","PACKING OQC","BEFORE REPAIR","DURING REPAIR","REPAIR CONFIRMATION","SMT CLIENT CONFIG",
		                                   "BEFORE_STOCK_TAKE","BEFORE STOCK TAKE CLIENT ARCHIVED","WIP_STOCK_TAKE","WIP STOCK TAKE CLIENT ARCHIVED",
		                                   "DJ PCB LINKAGE","DJ PCB LINKAGE ARCHIVED","OMRON COPY PATH","OMRON READ PATH","OMRON WRITE PATH","OMRON SUBPROCESS","IMAGE PATH","DOCUMENT_PATH",
		                                   "SIMOS SOCKET READER IP","SIMOS SOCKET READER PORT","PALLETIZATION_SPECIAL_KEY","PRINTER PATH","PRINTER FILE FORMAT","QC PCB PRINT PATH"};
	public static String[] PROCESSS_NAME_ID ={"PT200","DGS","BEFORE REPAIR","DURING REPAIR","REPAIR CONFIRMATION","PACKING OQC",
		                                      "PALLETIZATION","APPLICATION SERVER IP","APPLICATION SERVER USERNAME","APPLICATION SERVER PASSWORD",
		                                      "CLIENT ARCHIVED","INLINE_SCANNER","INLINE SCANNER CLIENT ARCHIVED","INLINE SCANNER CLIENT CONFIG",
		                                      "PALLETIZATION","PACKING OQC","BEFORE REPAIR","DURING REPAIR","REPAIR CONFIRMATION","SMT CLIENT CONFIG",
		                                      "BEFORE_STOCK_TAKE","BEFORE STOCK TAKE CLIENT ARCHIVED","WIP_STOCK_TAKE","WIP STOCK TAKE CLIENT ARCHIVED",
		                                      "DJ PCB LINKAGE","DJ PCB LINKAGE ARCHIVED","OMRON COPY PATH","OMRON READ PATH","OMRON WRITE PATH","OMRON SUBPROCESS","FILE PATH","DOCUMENT_PATH",
		                                      "SIMOS SOCKET READER IP","SIMOS SOCKET READER PORT","PALLETIZATION_SPECIAL_KEY","PRINTER PATH","PRINTER FILE FORMAT","QC PCB PRINT PATH"};

	//IOQ RESULT NAME COMBO
	public static String[] IQC_RESULT_NAME ={"ACCEPT","REJECT"};
	public static String[] IQC_RESULT_NAME_ID ={"ACCEPT","REJECT"};
	
	//IOQ STATUS COMPLETED NAME COMBO
	public static String[] IQC_STATUS_NAME ={"Y","N"};
	public static String[] IQC_STATUS_NAME_ID ={"Y","N"};
	
	//PROCESS NAME COMBO
	public static String[] PROGRAM_NAME ={"PT200","DGS"};
	public static String[] PROGRAM_NAME_ID ={"PT200","DGS"};
	
	//Master Pick List 
	public static String MASTER_PICK_FROM_SOURCE = "Master Pick";
	
	// TRANSFER NOTE 
	public static String TRANSFER_NOTE_DEFAULT_SUB_INVENTORY = "TRANSFER NOTE";
	
	// STAGE MAPPING COMBO LIST
	public static String[] STAGE_PROCESS_NAME ={"ICTFCT","PACKING OQC","TRANSFER","RECEIVING","RETURN","SMT","DIP","HI BACKFLUSH","MOVE TO OWH","PROD RECEIVING","OWH RECEIVING"};
	public static String[] STAGE_PROCESS_NAME_DISP ={"ICTFCT","Packing OQC","Transfer","Receiving","Return","SMT","DIP","HI Backflush","Move to OWH","PROD Receiving","OWH Receiving"};
	
	//PACKING OQC JOB
	public static String PACKING_OQC_JOB_BOOKED = "BOOKED";
	public static String PACKING_OQC_JOB_COMPLETED = "COMPLETED";
	
	public static String DO_NO_RECEIVING_COMBO_LIST = "DO_NO_RECEIVING_COMBO_LIST";
	public static String DO_NO_RECEIVING_COMBO_LIST_TOTAL_COUNT = "DO_NO_RECEIVING_COMBO_LIST_TOTAL_COUNT";
	
	public static String SMT_CSV_IMPORT_CSV_EXPORT = "SMT CSV COMPONENT LIST REPORT";
	
	public static String ORACLE_INTERFACE_USER_LIST = "ORACLE_INTERFACE_USER_LIST";
	public static String ORACLE_INTERFACE_USER_TOTAL_COUNT = "ORACLE_INTERFACE_USER_TOTAL_COUNT";
	
	public static String STRING_NULL_VALUE   = "null";
	public static String STRING_NULL		 = null;
    public static String STRING_EMPTY_VALUE  = "";
    public static Boolean BOOLEAN_TRUE       = true;
    public static Boolean BOOLEAN_FALSE      = false;
    public static int NUMBER_ZERO            = 0;
    public static Double  NUMBER_DOUBLE      = 0.0;
    public static String[] STRING_NULL_ARRAY = null;
	
    //ITEM REGISTER
    public static String ITEM_REGISTER_SUMMARY_EXPORT = "ITEM_REGISTER_SUMMARY_EXPORT";
    public static String ITEM_REGISTER_EXPORT = "ITEM_REGISTER_DETAILS_EXPORT";
 
	
	//ITEM EXPIRATION REPORT
	public static String ITEM_EXPIRATION_REPORT = "ITEM_EXPIRATION_REPORT";

	//ITEM SPECIFICATION 
	public static String ITEM_SPECIFICATION_EXPORT = "ITEM_SPECIFICATION_EXPORT";
	
	public static String FG_ITEM_COMBO_LIST = "FG_ITEM_COMBO_LIST";
	public static String FG_ITEM_COMBO_LIST_TOTAL_COUNT = "FG_ITEM_COMBO_LIST_TOTAL_COUNT";
	
	public static  boolean VALIDATE_ALLOW_FASTER_SEND_EMAIL_PROCESS = true;
	public static  int VALIDATE_FASTER_EMAIL_EXCEPTION = 30 ;
	
	//Job Monitor Summary
    public static String JOB_MONITOR_SUMMARY_EXPORT = "JOB_MONITOR_SUMMARY_EXPORT";
	
	 //DEAD STOCK PROVISION COMBO
 	public static String[] DEAD_STOCK_PROVISION ={"DEAD STOCK- APPLY WRITE OFF BY SES","DEAD STOCK - APPLY WRITE OFF BY SD","UNDER CUSTOMER LIABILITY - ECN /DESIGN CHANGE",
 												  "UNDER PROVISIONED BY SD","PENDING INVESTIGATION","UNDER CUSTOMER LIABILITY -DISCONTINUE OF MODEL",
 												  "UNDER NEGOTIATION WITH CUSTOMER BY SD","END OF LIFE EXPECTED","UNDER CUSTOMER LIABILITY - REDUCTION OF SALES ORDERS/FORECAST",
 												  "RANKING LED","RANKING RESISTORS"
 												 };
 	public static String[] DEAD_STOCK_PROVISION_DISP ={"Dead Stock- Apply Write OFF by SES","Dead Stock - Apply Write OFF by SD","Under Customer Liability - ECN /Design Change",
 													   "Under Provisioned by SD","Pending Investigation","Under Customer Liability -Discontinue of Model",
 													   "Under Negotiation with Customer by SD","End of Life Expected","Under Customer Liability - Reduction of Sales Orders/Forecast",
 													   "Ranking LED","Ranking Resistors"
 													  };
 	
 	//ICTFCT  
    public static String   	NULL_VALUE				     =   null;
    public static String   	STRING_DASH				     =   " - ";
    public static String    STRING_VALUE_ADD_FNMODE      = "a";
    public static String    STRING_VALUE_VIEW_FNMODE     = "v";
    public static String    STRING_VALUE_EDIT_FNMODE     = "e";

    //PALLET TYPE 
    public static String   	UPDATEDDT_DT_EQUALS 		      =   "updatedDt";
    public static String   	CREATEDDT_DT_EQUALS		          =   "createdDt";
    
 	//BOX TYPE 
    public static String    ADD_EQUALS      		 		  =   "a";
    public static String    EDIT_EQUALS      		 		  =   "e";
    public static String 	ACTIVE_ON_EQUALS 				  =   "on";
    public static String 	SEARCHBOX_Y_EQUALS      		  =   "Y";
    public static String 	SEARCHBOX_N_EQUALS       		  =   "N";
    public static String 	SEARCHBOX_ALL_EQUALS	 		  =   "ALL";
    public static char   	ACTIVE_Y		 		 		  =   'Y';	
    public static char   	ACTIVE_N		  		 		  =   'N';
    public static String    DESC_EQUALS     		 		  =   "DESC";
    public static String    SEARCHVALUE_PERCENT     		  =   "%";
    public static String   	SORT_SQUARE_BRACKET				  =   "[";
    public static String   	UPDATED_DT_DISP_EQUALS	          =   "updatedDtDisp";
    public static String   	CREATED_DT_DISP_EQUALS	          =   "createdDtDisp";
    public static String   	UPDATED_DT_EQUALS		          =   "updatedDt";
    public static String   	CREATED_DT_EQUALS		          =   "createdDt";

    
    
	public static boolean aoiImportValidate = true;
	public static String SYSTEM = "SYSTEM";
	public static boolean ictImportValidate = true;
	public static boolean hiokiImportValidate = true;
	public static boolean willTechImportValidate = true;



	public static String ASSEMBLY_ITEM_COMBO_LIST = "ASSEMBLY_ITEM_COMBO_LIST";
	public static String ASSEMBLY_ITEM_COMBO_LIST_TOTAL_COUNT = "ASSEMBLY_ITEM_COMBO_LIST_TOTAL_COUNT";
		
    public static int DJ_PCB_PLAY_STATUS           = 0;
	public static int DJ_PCB_PAUSE_STATUS          = 3;
	public static int DJ_PCB_STOP_STATUS           = 4;
	
	//PACKING
    public static int  PACKING_PRINT_BARCODE_PORT = 56428; //56425;
    public static String PACKING_PRINT_BARCODE_TCP_IP = "192.168.3.8"; //"SEM-100";
    
    //PALLETIZATION
    public static String PALLETIZATION_INFO_PALLET_EXPORT = "PALLETIZATION_INFO_PALLET_EXPORT";
    public static int  PALLET_PRINT_BARCODE_PORT = 56428; //56425;
    public static String PALLET_PRINT_BARCODE_TCP_IP = "192.168.3.8"; //"SEM-100";

    //REPAIR
    public static String REPAIR_EXPORT = "REPAIR_EXPORT";
    public static String PARENT_MODEL="Parent Model";
    
    //SCRAP
    public static String SCRAP_EXPORT = "SCRAP_EXPORT";
    
    //ITEM SPEC ITEM COMBO
    public static String ITEM_SPEC_COMBO_LIST ="ITEM_SPEC_COMBO_LIST";
    public static String ITEM_SPEC_COMBO_LIST_TOTAL_COUNT="ITEM_SPEC_COMBO_LIST_TOTAL_COUNT";
    
    //model name combo
    public static String MODEL_NAME_COMBO_LIST ="MODEL_NAME_COMBO_LIST";
    public static String MODEL_NAME_COMBO_LIST_TOTAL_COUNT="MODEL_NAME_COMBO_LIST_TOTAL_COUNT";
    
    //Omron
    public static String SMB_FILE_SHARING_PROTOCAL  ="smb:";
    public static String IMPORT_DIRECTORY_CSV_OMRON_BACKUP_IMPORT = "VT-PRISM-0001";
    public static String IMPORT_DIRECTORY_CSV_OMRON_BACKUP_IMPORT_SUB = "CSV_Output";
    
    //Repair Process name combo
    public static String REPAIR_PROCESS_NAME_COMBO_LIST ="REPAIR_PROCESS_NAME_COMBO_LIST";
    public static String REPAIR_PROCESS_NAME_LIST_TOTAL_COUNT="REPAIR_PROCESS_NAME_LIST_TOTAL_COUNT";
    
    //Repair Process name combo
    public static String REPAIR_PROCESS_DTL_LIST ="REPAIR_PROCESS_DTL_LIST";
    public static String REPAIR_PROCESS_DTL_LIST_COUNT="REPAIR_PROCESS_DTL_LIST_COUNT";
    
    //Repair Issue Name combo
    public static String REPAIR_ISSUE_NAME_LIST ="REPAIR_ISSUE_NAME_LIST";
    public static String REPAIR_ISSUE_NAME_LIST_COUNT="REPAIR_ISSUE_NAME_LIST_COUNT";
    
    //Repair Issue Name combo
    public static String REPAIR_POSITION_NAME_LIST ="REPAIR_POSITION_NAME_LIST";
    public static String REPAIR_POSITION_NAME_LIST_COUNT="REPAIR_POSITION_NAME_LIST_COUNT";
    
    //OMRON FILE SETUPS
    public static ArrayList<String> readDrive = null;
    public static ArrayList<String> writeDrive = null;
    public static ArrayList<String> subProcessName = null;
    public static ArrayList<String> setupFiles1 = new ArrayList<String>();
    public static ArrayList<String> setupFiles2 = new ArrayList<String>();
    public static ArrayList<String> setupFiles3 = new ArrayList<String>();
    public static String s_readDrive;
    public static String s_writeDrive;
    public static String s_subProcessNames;
    public static String readFolderPath;
    public static String writeFolderPath;
    public static String subProcessesName;
    public static String readPath;
    public static String writePath;
    public static String processType;
    public static String backupFilePath;
    public static String OMRON_DIRECTORY = "OMRON";
    
  //LOGIC DATA
    public static String HIPOT = "HIPOT";
    public static String DIGITALTEST = "DIGITALTEST";
    public static String ICT = "ICT";
    public static String PACKING = "PACKING";
    public static String PACKED = "PACKED";
    public static String DELETED = "DELETED";
    public static String LOGIC_DATA_PROJECT_CD = "LDA";
    public static String SENT_TO_CUSTOMER_FLAG = "P";
    
    public static String EMPTY_STRING  = "";
    
    public static String MODIFY_STAGES  = "MODIFY STAGES";
    
    public static String LOCAL_PROJECT_CODE_COMBO_LIST = "LOCAL_PROJECT_CODE_COMBO_LIST";
	public static String LOCAL_PROJECT_CODE_COMBO_LIST_COUNT = "LOCAL_PROJECT_CODE_COMBO_LIST_COUNT";
	
  //TRACEABILITY
	public static String TRACEABILITY_CURRENT_PROCESS_EXPORT="TRACEABILITY_CURRENT_PROCESS_EXPORT";
	public static String TRACEABILITY_ALL_PROCESS_EXPORT="TRACEABILITY_ALL_PROCESS_EXPORT";
	public static String TRACEABILITY_PROCESS_HISTORY_EXPORT="TRACEABILITY_PROCESS_HISTORY_EXPORT";
	
	//model name combo
    public static String SUBINVENTORY_COMBO_LIST ="SUBINVENTORY_COMBO_LIST";
    public static String SUBINVENTORY_COMBO_LIST_TOTAL_COUNT="SUBINVENTORY_COMBO_LIST_TOTAL_COUNT";
    
    public static String DELIVERY_NOTE_EXPORT = "DELIVERY NOTE EXPORT";
  
    //JUST IN TIME PICKING STATUS 
	public static String JUST_IN_TIME_PICKING_REQUESTED = "PENDING";
	public static String JUST_IN_TIME_PICKING_PROCESSED = "PROCESSED";
	public static String JUST_IN_TIME_PICKING_SHORTAGE = "SHORTAGE";
	public static String JUST_IN_TIME_PICKING_SUGGESTED = "SUGGESTED";
	public static String JUST_IN_TIME_PICKING_REQUEST_NOT_POSTED = "REQUEST NOT POSTED";
	
	public static String SUB_LED_COMBO_LIST = "SUB_LED_COMBO_LIST";
	public static String SUB_LED_COMBO_LIST_TOTAL_COUNT = "SUB_LED_COMBO_LIST_TOTAL_COUNT";

	//CREATE DJ
	public static String  CREATE_DJ_HDR_ID 	  = "CREATE_DJ_HDR_ID";
	public static String  GROUP_NO 			  = "GROUP_NO";
	public static String  CREATE_DJ_FG_NAME	  = "CREATE_DJ_FG_NAME";
	public static String  CREATE_DJ_REMARKS	  = "CREATE_DJ_REMARKS";
	public static String  CREATE_DJ_FROM_DT	  = "CREATE_DJ_FROM_DT";
	public static String  CREATE_DJ_TO_DT	  = "CREATE_DJ_TO_DT";
	public static String  CREATE_PROJECT_CD	  = "CREATE_PROJECT_CD";
	public static String  CREATE_FG_QTY	 	  = "CREATE_FG_QTY";
	public static String  CREATE_DJ_NO	 	  = "CREATE_DJ_NO";
	public static String  CREATE_FROM_DT	  = "CREATE_FROM_DT";
	public static String  CREATE_TO_DT	      = "CREATE_TO_DT";
	public static String  CREATE_PICK_FREEZED = "CREATE_PICK_FREEZED";
	public static String  CREATE_PCB_SUBINV	  = "CREATE_PCB_SUBINV";
	public static String  DJ_RANK_NAME_ID_1	  = "DJ_RANK_NAME_ID_1";
	public static String  DJ_RANK_NAME_ID_2	  = "DJ_RANK_NAME_ID_2";
	public static String  DJ_SUB_LED	      = "DJ_SUB_LED";
	public static String  DJ_GROUP_NO	      = "DJ_GROUP_NO";
	public static String  DJ_ID	      		  = "DJ_ID";
	
	//DJ COMPLETION IMPORT
	public static String  IMPORT_DJ_NO	  = "IMPORT_DJ_NO";
	public static String  IMPORT_DJ_ID	  = "IMPORT_DJ_ID";
	public static String  IMPORT_WIP_ENTITY_ID	  = "IMPORT_WIP_ENTITY_ID";
	
	//pick list rank name 
    public static String RANK_NAME_1_COMBO_LIST = "RANK_NAME_1_COMBO_LIST";
	public static String RANK_NAME_1_COMBO_LIST_TOTAL_COUNT = "RANK_NAME_1_COMBO_LIST_TOTAL_COUNT";
	
	public static String RANK_NAME_2_COMBO_LIST = "RANK_NAME_2_COMBO_LIST";
	public static String RANK_NAME_2_COMBO_LIST_TOTAL_COUNT = "RANK_NAME_2_COMBO_LIST_TOTAL_COUNT";
	
	public static String PAIR_NEW_GROUP_LIST = "PAIR_NEW_GROUP_LIST";
	public static String FPAIR_NEW_GROUP_COUNT = "FPAIR_NEW_GROUP_COUNT";
	
	//BOM COSTING REPORT 
	 public static String FG_ITEM_FOR_PROJECT_COMBO_LIST = "FG_ITEM_FOR_PROJECT_COMBO_LIST";
    public static String FG_ITEM_FOR_PROJECT_COMBO_LIST_COUNT = "FG_ITEM_FOR_PROJECT_COMBO_LIST_COUNT";
    public static String PROJECT_CODE_FOR_BOM_LIST = "PROJECT_CODE_FOR_BOM_LIST";
    public static String BOM_COSTING = "BOM_COSTING_REPORT";
    
  //CREATE DJ
    public static String CREATE_DJ_SUMMARY_EXPORT = "CREATE_DJ_SUMMARY_EXPORT";
    public static String CREATE_DJ_PCB_DETAILS_EXPORT = "CREATE_DJ_PCB_DETAILS_EXPORT";
    
    public static String MASTER_SHORTAGE_EXPORT = "MASTER_SHORTAGE_EXPORT";
    public static String MASTER_PICK_LIST_EXPORT = "MASTER_PICK_LIST_EXPORT";
    
  //DJ Over Production Details Report
	public static String DJ_OVER_PRODUCTION_DETAILS_REPORT = "DJ OVER PRODUCTION DETAILS REPORT";
	public static String DJ_OVER_PRODUCTION_DETAILS = "DJ OVER PRODUCTION DETAILS";
	public static String DJ_OVER_PRODUCTION_DETAILS_EMAIL_FILE_NAME = "DJ OVER PRODUCTION DETAILS";
	
	//DJ COMPLETION
	 public static String DJ_COMPLETION = "DJ_COMPLETION";
	 
	//SHIPPING INSTRUCTION 
	public static String SHIPPING_EXPORT = "SHIPPING_EXPORT";
		
	//SHIPPPING
	public static String SHIPPING_INSTRUCTION_REPORT = "SHIPPING_INSTRUCTION_REPORT";
	public static String SHIPPING_INSTRUCTION  = "SHIPPING INSTRUCTION";
	public static String SMT_SECONDARY_SRC_SUBINV = "IWHF2";
	public static String SHIPPING_PALLET_REPORT = "SHIPPING_PALLET_REPORT";
	
	//SMT LINE STATUS COMBO
	public static String SMT_LINE_STATUS_REASON_COMBO_LST  = "SMT_LINE_STATUS_REASON_COMBO_LST";
	public static String SMT_LINE_STATUS_REASON_COMBO_LST_COUNT = "SMT_LINE_STATUS_REASON_COMBO_LST_COUNT";
	//SMT LINE AUDIT REPORT
	public static String SMT_STATUS_AUDIT_EXPORT = "SMT_PRODUCTIVITY_EXPORT";
	
    public static String ERROR_FROM_LOGIC_DATA = "Error from logic data from PCB :";
    
    public static String FILE_PATH = null;
    public static String FILE_FORMAT = null;
    
    public static String PRINTER_PATH="PRINTER PATH";
    public static String PRINTER_FILE_FORMAT="PRINTER FILE FORMAT";

    public static String[] PROCESSS_RESULT={"OK","NG","NOT DONE","NOT REQUIRED" };
    public static String[] PROCESSS_RESULT_ID={"0","1","2","-1" };

    public static Connection CONNECTION_NULL=null;

    //SINTERFACE REPORT
    public static String SINTERFACE_SUMMARY_REPORT = "SINTERFACE_SUMMARY_REPORT";
    public static String SINTERFACE_DETAIL_REPORT = "SINTERFACE_DETAIL_REPORT";
    
    //PRODUCTION REAL TIME STATUS
    public static String PROD_REAL_TIME_EXPORT_REPORT="PRODUCTION_REAL_TIME_STATUS_EXPORT";
    
    public static String INACTIVE_TRANSACTION= "Transaction is In-Active";
    public static String SESSION_CLOSED= "Session is closed";
    public static String ACTIVE_TRANSACTION= "Transaction is Active";
    
	public static boolean hiokiValidate = false;
	
	public static AtomicInteger instanceCounter = new AtomicInteger(0);

	public static AtomicInteger counter = new AtomicInteger(0);

	public static String OUTSOURCE_PCB_DTL = "Outsource_PCB_Details";
	public static String OUTSOURCE_PCB = "OUTSOURCE_PCB_DTL";

	public static String SPI_DIRECTORY = "SPI";
	public static boolean spiValidate = false;
	public static boolean spiImportValidate = true;
	
	
	public static String PROCESS_TYPE_VALIDATION = "VALIDATION";
	public static String MSL_STATUS_PICK_FROM_OVEN = "PICK FROM OVEN";
	public static String MSL_STATUS_PICK_FROM_DESICATOR = "PICK FROM DRYCABINET";
	public static String MSL_BEFORE_USE_PROCESS_NAME = "LOAD TO LINE"; //Process name changed from MSL BEFORE USE to LOAD TO LINE
	public static String PROCESS_TYPE_SAVE_OR_UPDATE = "SAVE OR UPDATE";
	public static String VALIDATION_SUCCESS = "SUCCESS";
	public static String RETURN_TO_OVEN_OR_DESICCATOR_PROCESS_NAME = "RETURN TO OVEN/DRYCABINET";
	public static String PICK_FROM_OVEN_OR_DESICCATOR_PROCESS_NAME = "PICK FROM OVEN/DRYCABINET";
	public static String PROCESS_TYPE_SCRAP = "SCRAP";
	public static String VALIDATION_SCRAP = "Scanned Lot is Expired. Kindly move to scrap";
	
	public static String MSL_PROCESS_STATUS_SCRAPPED = "LOT SCRAPPED";

	public static String ERSA_DIRECTORY = "ERSA";
	public static boolean ersaValidate = false;
	public static boolean ersaImportValidate = true;
	
	public static String BARE_PCB_TRACEABILITY_REPORT = "Bare PCB Traceability Report";
	
	public static String MISSION_CREATION_STATUS = "Mission Created";
	
	public static String OMRON_DETAILS_EXPORT = "OMRON_DETAILS_EXPORT";
	public static String OMRON_TRACEABILITY = "OMRON TRACEABILITY";
	

	public static String PCB_PROCESS_REPORT= "PCB Process Traceability Report";
	
	public static String YAZAKI_TRACEABILITY_DTL = "Yazaki";
	public static String YAZAKI_TRACEABILITY_REPORT = "YAZAKI_TRACEABILITY_REPORT";
	
	public static String STATUS_CODE = "STATUS CODE";
	public static String STATUS_MESSAGE = "STATUS MESSAGE";
	
	public static String QC_PCB_PRINT_PATH = "QC PCB PRINT PATH";
	
	public static String PCB_TRACEABILITY_COUNT="Daily Honeywell Production Report";
	
	//TRACABILITY HISTORY SCREEN ON 27-12-2018 BY Dd
	public static String PARENT_TABLE_NAME_PCB_PROCESS_RESULTS = "SINTERFACE.PCB_SERIAL_NO_PROCESS_RESULTS";
	
	//TRACABILITY HISTORY
    public static String TRACABILITY_HISTORY_SUMMARY_REPORT = "TRACABILITY_HISTORY_SUMMARY_REPORT";
    public static String TRACABILITY_HISTORY_DETAIL_REPORT = "TRACABILITY_HISTORY_DETAIL_REPORT";
    
    //To Check and Trigger Email Automatically for Pending Records in SINTERFACE for more than 2 mins by Dd on 5-3-2019
    public static String SINTERFACE_PENDING_RECORD_DETAILS_REPORT = "SINTERFACE_PENDING_RECORD_DETAILS_REPORT";
	public static String SINTERFACE_PENDING_RECORDS_REPORT = "SINTERFACE PENDING RECORDS REPORT";

    //The below code added due to STRACE-ORACLE Comparison Report on 19-02-2019 by Dd.
    public static String COMPARISON_OF_STRACE_AND_ORACLE_STOCK_REPORT = "STRACE-ORACLE StockReport";
    
  //Thawing Time process Type 23-04-2019
  	public static String[] THAWING_TIME_PROCESS_TYPE ={"SCAN FROM CHILLER","MIXER"};
  	public static String[] THAWING_TIME_PROCESS_TYPE_DISP ={"SCAN FROM CHILLER","MIXER"};
  	
  //SCAN FROM CHILLER ERROR REPORT 
    public static String SCAN_FROM_CHILLER_ERROR_EXPORT = "SCAN_FROM_CHILLER_ERROR_EXPORT";
    
    //SCAN BEFORE USE ERROR REPORT
    public static String SCAN_BEFORE_USE_ERROR_EXPORT = "SCAN_BEFORE_USE_ERROR_EXPORT";
    
    //RETURN TO CHILLER ERROR REPORT
    public static String RETURN_TO_CHILLER_ERROR_EXPORT = "RETURN_TO_CHILLER_ERROR_EXPORT";
    
    //The below code added due to Stencil/Squeegee Configuration on 30-03-2019 by Dd.
    public static String STENCIL_SQUEEGEE_ID_COMBO_LIST = "STENCIL_SQUEEGEE_ID_COMBO_LIST";
    public static String STENCIL_SQUEEGEE_ID_COMBO_LIST_TOTAL_COUNT= "STENCIL_SQUEEGEE_ID_COMBO_LIST_TOTAL_COUNT";
    public static String SUPPORT_ID_COMBO_LIST = "SUPPORT_ID_COMBO_LIST";
    public static String SUPPORT_ID_COMBO_LIST_TOTAL_COUNT= "SUPPORT_ID_COMBO_LIST_TOTAL_COUNT";
    public static String STENCIL_SQUEEGEE_EXPIRED= "EXPIRED";
    public static char   STENCIL_SQUEEGEE_EXPIRED_NOTATION= 'E';
    public static String STENCIL_SQUEEGEE_ACTIVE= "ACTIVE";
    public static String STENCIL_SQUEEGEE_INACTIVE= "INACTIVE";
    public static String STENCIL_SQUEEGEE_TYPE_STENCIL= "STENCIL";
    public static String STENCIL_SQUEEGEE_TYPE_SQUEEGEE= "SQUEEGEE";
    public static String ASC_EQUALS = "ASC";
    public static String STENCIL_SQUEEGEE_CONFIGURATION_REPORT = "STENCIL_SQUEEGEE_REPORT";
    public static String STENCIL_SQUEEGEE_EXPIRYDATE_AND_REMAININGCOUNT_WARNING_REPORT = "Tool Status Report";

	//TRACEABILITY REPORTS
	 public static String SCAN_FROM_CHILLER = "SCAN_FROM_CHILLER";
	 public static String SCAN_BEFORE_USE = "SCAN_BEFORE_USE";
	 public static String RETURN_TO_CHILLER = "RETURN_TO_CHILLER";
	 public static String SCRAP_LOT = "SCRAP_LOT";
	 
	 public static String DEFAULT_LOSS_INVENTORY = "LOSS";
	 public static int LOCATOR_TYPE = 5;
	 public static String RETURN_TO_PROD_LIST_WAREHOUSE = "'LOSS'";
     
	//IDM ITEM COMBO
	    public static String IDM_ITEM_COMBO_LIST = "IDM_ITEM_COMBO_LIST";
	    public static String IDM_ITEM_COMBO_LIST_TOTAL_COUNT = "IDM_ITEM_COMBO_LIST_TOTAL_COUNT";

   //PCB HONEYWELL PROCESS COUNT
    public static String PCB_HONEYWELL_COUNT="PCB HONEYWELL COUNT";
    
    public static String CUSTOMER_SERIAL_NOT_MATCHED="Customer Serial Not Matched";

    //PG TRACEABILITY
    public static String PCB_COUNT_LIST="PCB COUNT LIST";
    public static String PCB_COUNT="PCB COUNT";
    public static String PCB_RESET_COUNT="PCB RESET COUNT";

    //The below code added due to All Process Failed DTL report on 17-05-2019 by Theiva
    public static String ALL_PROCESS_FAILED_DTL="All_Process_Failed_Dtl";
    public static String PROCESS_FAILED_TRACEABILITY_REPORT="PROCESS FAILED TRACEABILITY REPORT";
    
    public static String PALLET_PRINT_TYPE_AUTO = "AUTO";
    public static String PALLET_PRINT_TYPE_MANUAL = "MANUAL";
    
    public static boolean KIC_ERSA_REFLOW_VALIDATE = false;
    public static boolean KIC_ERSA_REFLOW_IMPORT_VALIDATE = true;
    
    public static boolean SPG_XML_VALIDATE = false;
    public static boolean SPG_XML_IMPORT_VALIDATE = true;
    
    public static String WAITING_FOR_OVEN_PROCESS_NAME = "WAITING FOR OVEN";
    
  //The below code added due to packing traceability DTL report on 22-07-2019 by Theiva
    public static String PACKED_QTY_REPORT_PATH="Packed_Qty_Report";
    public static String PACKED_QTY_REPORT="PACKED QTY REPORT";

    public static String PACKED_QTY_SUMMARY_REPORT="PACKED QTY SUMMARY REPORT";
    
    public static boolean VISCOM_XML_VALIDATE = false;
    public static boolean VISCOM_XML_IMPORT_VALIDATE = true;
    
    
    public static boolean SOLTEC_XML_VALIDATE = false;
    public static boolean SOLTEC_XML_IMPORT_VALIDATE = true;

    
    public static String TOOL_STATUS_REPORT = "Tool Status Report";
    
    public static String REPACKING_PROCESS_NAME = "REPACKING";
    
    public static boolean NEDAP_FCT_XML_VALIDATE = false;
    public static boolean NEDAP_FCT_XML_IMPORT_VALIDATE = true;

    public static boolean SOLDERING_XML_VALIDATE = false;
    public static boolean SOLDERING_XML_IMPORT_VALIDATE = true;
    public static String PROJECT_CODE_FOR_PCB_LIST = "PROJECT_CODE_FOR_PCB_LIST";
    public static boolean DATAIO_TXT_VALIDATE = false;
    public static boolean DATAIO_TXT_IMPORT_VALIDATE = true;
    
 
    public static String EDI = "EDI";
 
    //below code added for Transfer QC mobile module by Shankavi on 27-04-2020
    public static String MSL_LEVEL_1 = "1";
    
    //below code added for Packing Restriction in Model Module by Shankavi on 16-06-2020
    public static String RESTRICTION_GROUP_LIST = "RESTRICTION_GROUP_LIST";
	public static String RESTRICTION_GROUP_LIST_COUNT = "RESTRICTION_GROUP_LIST_COUNT";
	
	//Traceability NPM Process on 25-06-2020 by Mouli
	public static String NPM_PROCESS_DTL_LIST ="NPM_PLACEMENT_PROCESS_DTL_LIST";
	
	 //below code added for Model Date language mobile module by Shankavi on 13-07-2020
    public static String DEFAULT_DATE_LANGUAGE = "DENMARK";

    //Pro Forma Invoice on 14-07-2020 by Dd
	public static String PROFORMA_INVOICE_PROJECT_CODE = "BOC";
	public static String PROFORMA_INVOICE_SEQUENCE_NO = "PROFORMA_INVOICE_SEQUENCE_NO";
	public static String PROFORMA_INVOICE_SEQUENCE_ERROR_MESSAGE = "ERROR_MESSAGE";
	
	//Reflow Traceability by Dd on 20-07-2020
    public static boolean REFLOW_TRACEABILITY_VALIDATE = false;
    public static boolean REFLOW_TRACEABILITY_IMPORT_VALIDATE = true;
    public static String REFLOW_TRACEABILITY_ITEM_NAME_SUBSTRING = ".xml";
    
    public static String ICT_REPORT_PATH="ICT_Report";
    public static String BOSCH_ICT_REPORT="Bosch ICT Report";


 
 
}
