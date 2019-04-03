package EXPORT;


import org.openqa.selenium.WebDriver;

public class OR {
	

public static String sTargetTestCaseExcelPath="";	
public static String sTargetFolderPath="";	
public static String sTestCaseName="";	

public static String username_sendkey="//input[@id='txtUsername']";
public static String password_sendkey="//input[@id='txtPassword']";
public static String login_click="//input[@id='btnLogin']";

//EMP EXPORT


public static String pim_focus="//a[@id='menu_pim_viewPimModule']";
public static String EMPlist_click="//a[@id='menu_pim_viewEmployeeList']";
public static String EMPcolumn="//*[@id='resultTable']/thead/tr/th";
public static String EMProws="//*[@id='resultTable']/tbody/tr/td[2]";

//ADMIN EXPORT

public static String ADMIN_focus="//a[@id='menu_admin_viewAdminModule']";


public static String ADMIN_USERMANAGEMENT_focus="//a[@id='menu_admin_UserManagement']";


public static String ADMIN_USERS_click="//a[@id='menu_admin_viewSystemUsers']";

public static String ADMIN_COLUMNS_click="//*[@id='resultTable']/thead/tr/th";

public static String ADMIN_ROWS_click="//*[@id='resultTable']/tbody/tr/td[2]";

//admin qualifications export
public static String ADMIN_FOCUS="//a[@id='menu_admin_viewAdminModule']";


public static String ADMIN_QUALIFICATIONS_FOCUS="//a[@id='menu_admin_Qualifications']";


public static String ADMIN_SKILLS_CLICK="//a[@id='menu_admin_viewSkills']";

public static String ADMIN_NUMOFCOLUMNS="//*[@id='recordsListTable']/thead/tr/th";

public static String ADMIN_NUMOFROWS="//*[@id='recordsListTable']/tbody/tr/td[2]";
//BooLEAN USERROLE
public static String Admin_focus="//a[@ id='menu_admin_viewAdminModule' ]";

public static String UserManagement_focus="//a[@id='menu_admin_UserManagement']";
public static String UserRole_Listbox="//select[@id='searchSystemUser_userType']";
public static String NoColumns="//*[@id='resultTable']/thead/tr/th";
public static String NoRows="//*[@id='resultTable']/tbody/tr/td[2]/a";
public static String search_click="//input[@id='searchBtn']";
//Pim Jobtitle Search
public static String Pim_focus="//a[@id='menu_pim_viewPimModule']";


public static String Employee_focus="//a[@id='menu_pim_viewEmployeeList']";

public static String Jobtitle_listbox="//select[@id='empsearch_job_title']";
public static String Jobtitle_search_click="//input[@id='searchBtn']";

public static String PimColumns="//*[@id='resultTable']/thead/tr/th";
public static String PimRows="//*[@id='resultTable']/tbody/tr/td[2]";

//pimempidsearch
public static String Pim_focus1="//*[@id='menu_pim_viewPimModule']";
public static String emp_listclick="//*[@id='menu_pim_viewEmployeeList']";
public static String empid_sendkey="//*[@id='empsearch_id']";

public static String emp_searchclick="//*[@id='searchBtn']";

public static String empcoloumns="//*[@id='resultTable']/thead/tr/th";
public static String emprows="//*[@id='resultTable']/tbody/tr/td[2]";
public static String emp_name="//*[@id='empsearch_employee_name_empName']";


//boolean various search
public static String BSpimfocus="//a[@id='menu_pim_viewPimModule']";

public static String BSEMPCLICK="//a[@id='menu_pim_viewEmployeeList']";

public static String BSEMPNAMESENDKEY="//input[@id='empsearch_employee_name_empName' ] ";

public static String BSIDSENDKEY="//input [@id='empsearch_id']";

public static String BSJOBTITLELISTBOX="//select[@id='empsearch_job_title' ]";

public static String BSSEARCHCLICK="//input[@id='searchBtn' ]";

public static String BSCOLOUMNS="//*[@id='resultTable']/thead/tr/th";

public static String BSROWS="//*[@id='resultTable']/tbody/tr/td[1]";

//PIMEPLIST
public static String PIMfocus="//*[@id='menu_pim_viewPimModule']";
public static String PIMEMPLISTFocus="//*[@id='menu_pim_viewEmployeeList']";
public static String PIMSERCHclick="//*[@id='searchBtn']";
public static String PIMADDClick="//*[@id='btnAdd']";
public static String PIMFIRSTnamesendkeys="//*[@id='firstName']";
public static String Middlenamesendkeys="//*[@id='middleName']";
public static String Lastnamesendkeys="//*[@id='lastName']";
public static String PIMEPIDsendkeys="//*[@id='employeeId']";
public static String PIMPhotosclick="//*[@id='photofile']";
public static String PIMSaveclick="//*[@id='btnSave']";

//RCrecuitment
public static String RC_focus="//*[@id='menu_recruitment_viewRecruitmentModule']";

public static String RC_recruitment_focus="//*[@id='menu_recruitment_viewCandidates']";

public static String RC_add_click="//*[@id='btnAdd']";

public static String RC_fristname_sendkeys="//*[@id='addCandidate_firstName']";
public static String RC_middlename_sendkeys="//*[@id='addCandidate_middleName']";
                   
public static String  RC_lastname_sendkeys="//*[@id='addCandidate_lastName']"; 

public static String RC_Email_sendkeys="//*[@id='addCandidate_email']";
public static String RC_contactsendkeys="//*[@id='addCandidate_contactNo']";
public static String RCvacancylistbox="//*[@id='addCandidate_vacancy']";
public static String RCsaveclick="//*[@id='btnSave']";

}