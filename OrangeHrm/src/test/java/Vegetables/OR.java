package Vegetables;


import org.openqa.selenium.WebDriver;

public class OR {
	
public static String sTargetTestCaseExcelPath="";	
public static String sTargetFolderPath="";	
public static String sTestCaseName="";	



public static String username="//input[@id='txtUsername']";
public static String password="//input[@id='txtPassword'] ";
public static String login="//input[@id='btnLogin']";

  
//Admin users
public static String Admin_focus="//a[@id='menu_admin_viewAdminModule']";


public static String  Admin_usermg="//a[@id='menu_admin_UserManagement']";
public static String   Admin_Users="//a[@id='menu_admin_viewSystemUsers']";

public static String Admin_Search="//input[@id='searchBtn']";


public static String NoOfColumns="//*[@id='resultTable']/thead/tr/th";
public static String NoofRows="//*[@id='resultTable']/tbody/tr/td[2]";


public static String pim="//a[@id='menu_pim_viewPimModule']";

public static String Pim_configuration="//a[@id='menu_pim_Configuration']";

public static String Pim_listCustomFields="//a[@id='menu_pim_listCustomFields']";

public static String colums="//*[@id='customFieldList']/thead/tr/th";

public static String Rows ="//*[@id='customFieldList']/tbody/tr/td[2]";
 

public static String Time_focus="//a[@id='menu_time_viewTimeModule']";


public static String Time_attendance="//a[@ id='menu_attendance_Attendance']";

public static String Employee_Attendance="//a[@id='menu_attendance_viewAttendanceRecord']";

public static String Colums ="//*[@id='resultTable']/thead/tr/th";


public static String Rows="//*[@id='resultTable']/tbody/tr/td[2]";



public static String Pim="//a[@id='menu_pim_viewPimModule']";
public static String EmployeeList="//a[@id='menu_pim_viewEmployeeList']";


public static String AddEmpliyee="//a[@id='menu_pim_addEmployee']";


public static String EmployeeId="//input[@id='employeeId']";

}
