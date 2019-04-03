//import MercuryDemoTours;

package  EXPORT;
import org.testng.annotations.Test;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
/*
 Openbrowser
 openurL
 login
 Admin,
 export
 logout
 */

 
public class Admin_varioususerssearch
{
	public String UserName,Password;
	public String UsersName,Users_Role,Epname,Epstatus;
	
	public  int iRow;
	WebDriver driver;
	
	
	
	public  void Admin_varioususerssearch(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	
	@Test
	public  void boolean_datadriventest( )throws Exception
	{  
		
		  ExcelApiTest3 eat = new ExcelApiTest3();
		  int numberowsInputdata=eat.getRowCount("E://OrangeHrm//TC03_searchidname.xls","Sheet1");

				 for(int i=1;i<2;i++)
				 {		 
					 UserName=eat.getCellData("E://OrangeHrm//TC03_searchidname.xls","Sheet1",i,0);
					 Password=eat.getCellData("E://OrangeHrm//TC03_searchidname.xls","Sheet1",i,1);
					 UsersName=eat.getCellData("E://OrangeHrm//TC03_searchidname.xls","Sheet1",i,2);
					 Users_Role=eat.getCellData("E://OrangeHrm//TC03_searchidname.xls","Sheet1",i,3);
					 Epstatus=eat.getCellData("E://OrangeHrm//TC03_searchidname.xls","Sheet1",i,4);
					 Epname=eat.getCellData("E://OrangeHrm//TC03_searchidname.xls","Sheet1",i,5);
					 
					 System.out.println("User name is"+UserName);
					 System.out.println(" Password is "+Password);
					
					 System.out.println(" UsersName is "+UsersName);

					  iRow=i;
					 call_allmethods(iRow);
					 
				 }
			
				 
				 driver.quit();
				 
	}
	
	
	
	
	public   void call_allmethods(int iRow )throws Exception
	{  
		
		
	
		driver=TestBrowser.OpenChromeBrowser();
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		Login l1=new Login();
		l1.Login(driver);
		l1.openOrangeHRM();
		l1.OrangeHRMlogin(UserName,Password);
		l1.OrangeHRMSigninClick();
		
		
		Admin_varioususerssearch Av=new Admin_varioususerssearch();
			Av.Admin_varioususerssearch(driver);
			
			
		//Search by UserRole
			System.out.println(" ");
			System.out.println("___________Starts_________________");	
			Boolean str=false;
			
			str=Av.Search_users__role(iRow, UsersName,Users_Role,Epname,Epstatus);	
					if(str==true)
			{
			System.out.println("YES-UsersName is present in UsersName");
			}
			else
			{
			System.out.println("No-UsersName is not present in UsersName");	
			System.out.println("__________Ends__________________");	
			}
			
			
				
		
			// New method starts
			System.out.println(" ");
			System.out.println("___________Starts_________________");
			System.out.println("****Export VacancySearch method starts here****");	
			Av.ExportUsersname();
			System.out.println("___________Ends_________________"); 
			
			driver.quit();
					
	}		
	
					
		 // 	driver.quit();



	// starts method for  UserRole Search 
		public Boolean Search_users__role(int iRow,String UsersName,String Users_Role,String Epname, String Epstatus)throws Exception
		{ 
			
			
			System.out.println("UsersName is : "+ UsersName);
			System.out.println("Users_Role IS : "+ Users_Role);
			System.out.println("Epname is : "+ Epname);
			System.out.println("Epstatus is : "+ Epstatus);
			Boolean Record_Present=false;
			//driver.findElement(By.xpath(OR.Admin)).click();	
			
			System.out.println("reached here1");
			
		     Actions actions = new Actions(driver);   
			 WebElement ele=driver.findElement(By.xpath(OR.Admin_focus));
			 actions.moveToElement(ele).click().perform();
			 
			 
			 Actions actions1 = new Actions(driver);   
			 WebElement ele1=driver.findElement(By.xpath(OR.ADMIN_USERMANAGEMENT_focus));
			 
			 
			 driver.findElement(By.xpath(OR.ADMIN_USERS_click)).click();
			 
			 
			 driver.findElement(By.xpath(OR.UserRole_Listbox)).sendKeys(EMPNAME);
			 actions.moveToElement(ele).click().perform();
			 
			 driver.findElement(By.xpath(OR.emp_name)).sendKeys(EMPNAME);
			 actions.moveToElement(ele).click().perform();
			 driver.findElement(By.xpath(OR.emp_searchclick)).click();
			 
			 
			 
			 
			 
			 
			 

		    //No. of columns
	        List  columns = driver.findElements(By.xpath(OR.Users_colums); 
	        System.out.println("No of columns are : " + columns.size());
	        
	        //No.of rows 
	        List  rows = driver.findElements(By.xpath(OR.a)); 
	        System.out.println("No of rows are : " + rows.size());
	        
					    for ( int i=1 ; i<=rows.size() ;i++)
					    {
					      	String str1="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "[" + 2 + "]";
					      	WebElement CellText1=driver.findElement(By.xpath(str1));
					    	String EMPID1 = CellText1.getText();
					       
					        
					    	
					    	String str2="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "[" + 3 + "]";
					      	WebElement CellText2=driver.findElement(By.xpath(str2));
					    	String EMPNAME1 = CellText2.getText();
					       
					    	
					    	String str3="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "[" + 5 + "]";
					      	WebElement CellText3=driver.findElement(By.xpath(str3));
					    	String JOBTITLE1 = CellText3.getText();
					       
	   	if ( EMPID.equals(EMPID1 ) &&  EMPNAME.equals(EMPNAME1 ) &&  JOBTITLE.equals(JOBTITLE ))
	    	{
	  	 Record_Present=true;
	   	 System.out.println("True- EMPID Text Value is: " + EMPID1);
	   	 return Record_Present;
	   	 //Employee ID exist in employee list
						    	}
						    	else
						    	{
						    		 System.out.println("Cell Text EMPID is:" + EMPID1);
						    		 System.out.println("Cell Text EMPNAME is:" + EMPNAME1);
								     System.out.println("Seracching for JOBTITLE is:" +JOBTITLE1);
						    	}
						    	
						  					    	
					    }  //After for loop
					    
					    System.out.println("*******UserRole method completed*****");
					    return Record_Present;
					    
	
	
}
				
			// Ends method for  VacancySearch
				
				public  void ExportUsersname()throws Exception
				{ 
					  Actions actions = new Actions(driver);   
						 WebElement ele=driver.findElement(By.xpath(OR.Admin_focus));
						 actions.moveToElement(ele).click().perform();
						 
						 driver.findElement(By.xpath(OR.BSEMPCLICK)).click();
						 
						System.out.println("reached here2");
						
						 //driver.findElement(By.xpath(OR.BSEMPNAMESENDKEY)).sendKeys(EMPNAME);
						 //driver.findElement(By.xpath(OR.BSIDSENDKEY)).sendKeys(EMPID);
						 
						 //Select listbox =new Select(driver.findElement(By.xpath(OR.BSJOBTITLELISTBOX)));
						// listbox.selectByVisibleText(JOBTITLE);
						 
						 driver.findElement(By.xpath(OR.)).click();

						 
//No. of columns
						 List  columns = driver.findElements(By.xpath(OR.BSCOLOUMNS)); 
					        System.out.println("No of columns are : " + columns.size());
					        
					        //No.of rows 
					        List  rows = driver.findElements(By.xpath(OR.BSROWS)); 
					        System.out.println("No of rows are : " + rows.size());
					         
			       
			      
			        			ExcelApiTest3 eat = new ExcelApiTest3();
			         
							    for ( int i=1 ; i<=rows.size() ;i++)
							    {
							    	  for ( int j=2 ,k=0; j<=columns.size() ;j++,k++)
							    	   {
							    		  
							    		  System.out.println("hai....112");
							      		   String str1="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "["+ j +"]";
							      		   
							      		 String str2="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "["+ j +" ]";
							      		 
							      		 String str3="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "["+ j + "]";
							      		 System.out.println("hai....113");
							      		 
							      		//*[@id='recordsListTable']/thead/tr/th
							    		   
							      		 WebElement CellText1=driver.findElement(By.xpath(str1));
							      		 WebElement CellText2=driver.findElement(By.xpath(str2));
							      		 WebElement CellText3=driver.findElement(By.xpath(str3));
							    		    System.out.println("hai....114");
							    		   
							    	        String valueIneed1 = CellText1.getText();
							    	        String valueIneed2 = CellText2.getText();
							    	        String valueIneed3 = CellText3.getText();
							    	        
							    	        System.out.println("Cell Text Value is: " + valueIneed1);
							    	        
							    	        if (valueIneed1 !=null)
							    	        eat.PutCellData( "E://OrangeHrm//TC03_searchidname.xls","Sheet5",i,k,valueIneed1);
							    	        else
							    	        eat.PutCellData( "E://OrangeHrm//TC03_searchidname.xls","Sheet5",i,k,"Blank Data");
							    	        	
							    	        
							    	        if (valueIneed2 !=null)
								    	        eat.PutCellData( "E://OrangeHrm//TC03_searchidname.xls","Sheet5",i,k,valueIneed2);
								    	        else
								    	        eat.PutCellData( "E://OrangeHrm//TC03_searchidname.xls","Sheet5",i,k,"Blank Data");
								    	        
							    	        
							    	        if (valueIneed3 !=null)
								    	        eat.PutCellData( "E://OrangeHrm//TC03_searchidname.xls","Sheet5",i,k,valueIneed3);
								    	        else
								    	        eat.PutCellData( "E://OrangeHrm//TC03_searchidname.xls","Sheet5",i,k,"Blank Data");
								    	        
							    	   }
							    }
			   
				}	
		
				
				
			   			
					
				
				
				
}