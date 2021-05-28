package com.mycompany.app;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Holds all constants of Service module.
 * 
 * @author svutukur
 *
 */
public class ServiceConstants {

	
	/**
	 * 
	 * Empty constructor.
	 * 
	 */
	private ServiceConstants() {

	}
	
	

	public static final String JAR_PATH = "src/main/resources/VeracodeJavaAPI.jar";
	public static final File file = new File("src/main/resources/VeracodeJavaAPI.jar");

	public static final String VERY_HIGH_SEVERITY = "Very High";
	public static final String HIGH_SEVERITY = "High";
	public static final String MEDIUM_SEVERITY = "Medium";
	public static final String LOW_SEVERITY = "Low";
	public static final String VERY_LOW_SEVERITY = "Very Low";
	public static final String INFORMATIONAL_SEVERITY = "Informational";
	public static final String FROM_EMAIL = "securityreports@informatica.com";
	public static final String HOST = "mail.informatica.com";
	public static final String TEMP_FILES = "filestemp";
	public static final String XML_EXTENSION = ".xml";

	public static final String REMOVED = "removed";
	public static final String MODIFIED = "modified";
	public static final String UNMODIFIED = "unmodified";
	public static final String NEW = "new";

	public static final String SPACE = " ";
	public static final String COMMA = ",";
	public static final String PASS = "Pass";

	public static final List<String> OPEN_FLAW_STATUS = Arrays.asList("New", "Open", "Reopened");

	public static final String VID = "-vid";
	public static final String VKEY = "-vkey";
	public static final String OUTPUT_FILE_PATH = "-outputfilepath";
	public static final String APP_ID = "-appid";
	public static final String SANDBOX_ID = "-sandboxid";
	public static final String BUILD_ID = "-buildid";
	public static final String VERSION = "-version";
	public static final String JAVA_JAR = "java -jar";
	public static final String JAVA = "java";
	public static final String JAR = "-jar";
	public static final String ACTION = "-action";
	public static final String VERACODE_JAR_PATH = "/data2/securestats/VeracodeJavaAPI.jar";
	public static final String DETAILED_REPORT = "detailedreport";
	
	
	private static final List<String> veraCodeActionsList = Arrays.asList(ServiceConstants.JAVA, ServiceConstants.JAR,
			JAR_PATH, ServiceConstants.VID, ServiceConstants.VID_VALUE, ServiceConstants.VKEY,
			ServiceConstants.VKEY_VALUE, ServiceConstants.ACTION);

	public static final String VID_VALUE = "9ac35b51f558beddbdb85405a8e84733";
	public static final String VKEY_VALUE = "d19394c4e83f14760e8aa6176d7a98f475223755ffd95773462cd3dfd8e5f0d3bf3a4fbe20b8a2eefacade6979d3d2c7198e92698703e60252726972d8e80c69";
	public static final String FAIL = "FAILED";
	public static final String PDF_FORMAT = "-format pdf";
	public static final String FILEPATH = "-filepath";
	public static final String AUTOSCAN = "-autoscan";
	public static final String MODULES = "-modules";
	public static final String SUCCESS = "SUCCESSFUL";
	public static final String SUBMIT = "SUBMITTED";
	public static final String IN_PROGRESS = "IN_PROGRESS";
	public static final String BUILD_CREATED = "BUILD_CREATED";
	public static final String FILES_UPLOADED = "FILES_UPLOADED";
	public static final String PRESCAN_IN_PROGRESS = "PRESCAN_IN_PROGRESS";
	public static final String CC = "AppSecTeam@informatica.com";
	public static final String SCAN_SUB = " - Scan Status";
	public static final String SCAN_IN_PROGRESS = "SCAN_IN_PROGRESS";
	public static final String PRESCAN_SUCCESS = "PRESCAN_SUCCESS";
	public static final String BLACKDUCK = "BLACKDUCK";
	public static final String VERACODE = "VERACODE";
	public static final String TIMEOUT_MSG = "Server returned HTTP response code: 504";
	public static final String RETRIES_EXHAUSTED = "Retries Exhausted";
	
	public static List<String> getVeracodeActionList() {
		
		return veraCodeActionsList;
	}
	
	public static final String BD_HOST = "polestar";
	public static final String HEADER_ACCEPT = "Accept";
	public static final String HEADER_AUTH = "Authorization";
	public static final String FTP_USER = "ftpupload";
	public static final String FTP_PASSWORD = "ftpupload";
	
	
	// Error Status code::
	
	public static final String VSS01 = "Files not found / invalid filepath";
	public static final String VSS02 = "File size limit exceeded";
	public static final String VSS03 = "Create build failed";
	public static final String VSS04 = "File upload failed";
	public static final String VSS05 = "Pre-Scan failed";
	public static final String VSS06 = "No module id found";
	public static final String VSS07 = "Begin Scan failed";
	public static final String VSS08 = "Build Id not found";
	public static final String VSS09 = "Pre-Scan Cancelled";
	public static final String VSS10 = "Scan Errors";
	public static final String VSS11 = "Scan Internal Error";
	public static final String VSS12 = "Scan Cancelled";
	public static final String VSS13 = "Sandbox Id not found";
	public static final String VSS14 = "Exception occurred";
	public static final String VSS15 = "Config Id not found";
	public static final String VSS16 = "No files to select";
	public static final String VSS200 = "Success";
	
	
	//Veracode Actions.
	
	public static final String GET_BUILD_INFO = "getbuildinfo";
	
	
	// Veracode BuildInfo status.
	public static final String RESULTS_READY = "Results Ready";
	
	
	
	// Date formats.
	
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	
	

}
