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
 openurl
 login
 booleanuserrole_Ess
 export
 logout
 */

 
public class BOOLEAN
{
	public String UserName,Password;
	public String UserRole;
	
	public  int iRow;
	WebDriver driver;
	
	
	
	public  void BOOLEAN(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	
	@Test
	public  void boolean_datadriventest( )throws Exception
	{  
		
		  ExcelApiTest3 eat = new ExcelApiTest3();
		  int numberowsInputdata=eat.getRowCount("E://BOOLEAN//TC02_BOOLEAN.xls","Sheet1");

				 for(int i=1;i<2;i++)
				 {		 
					 UserName=eat.getCellData("E://BOOLEAN//TC02_BOOLEAN.xls","Sheet1",i,0);
					 Password=eat.getCellData("E://BOOLEAN//TC02_BOOLEAN.xls","Sheet1",i,1);
					 UserRole=eat.getCellData("E://BOOLEAN//TC02_BOOLEAN.xls","Sheet1",i,2);
					 System.out.println("User name is"+UserName);
					 System.out.println(" Password is "+Password);
					
					 System.out.println(" UserRole is "+UserRole);

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
		
		
		BOOLEAN Bl=new BOOLEAN();
			Bl.BOOLEAN(driver);
			
			
		//Search by UserRole
			System.out.println(" ");
			System.out.println("___________Starts_________________");	
			Boolean str=false;
			
			str=Bl.Search_userrolein_users(iRow, UserRole);
			if(str==true)
			{
			System.out.println("YES-UserRole is present in UserRole");
			}
			else
			{
			System.out.println("No-UserRole is not present in UserRole");	
			System.out.println("__________Ends__________________");	
			}
			
			
				
		
			// New method starts
			System.out.println(" ");
			System.out.println("___________Starts_________________");
			System.out.println("****Export VacancySearch method starts here****");	
			Bl.ExportUserManagement();
			System.out.println("___________Ends_________________"); 
			
			driver.quit();
					
	}		
	
					
		 // 	driver.quit();



	// starts method for  UserRole Search 
		public  Boolean Search_userrolein_users(int iRow,String UserRole )throws Exception
		{ 
			
			
			System.out.println("UserRole is : "+ UserRole);
			
			Boolean Record_Present=false;
			//driver.findElement(By.xpath(OR.Admin)).click();	
			
			System.out.println("reached here1");
			
		     Actions actions = new Actions(driver);   
			 WebElement ele=driver.findElement(By.xpath(OR.ADMIN_focus));
			 actions.moveToElement(ele).click().perform();
			 
			System.out.println("reached here2");
			 
			 Actions actions1 = new Actions(driver);   
			 WebElement ele1=driver.findElement(By.xpath(OR.ADMIN_USERMANAGEMENT_focus));
			 actions1.moveToElement(ele1).click().perform();
			 
			System.out.println("reached here3");
			 
			 
			 Select listbox =new Select(driver.findElement(By.xpath(OR.UserRole_Listbox)));
			 listbox.selectByVisibleText(UserRole);
			 
			 driver.findElement(By.xpath(OR.search_click)).click();

			 

		    //No. of columns
	        List  columns = driver.findElements(By.xpath(OR.NoColumns)); 
	        System.out.println("No of columns are : " + columns.size());
	        
	        //No.of rows 
	        List  rows = driver.findElements(By.xpath(OR.NoRows)); 
	        System.out.println("No of rows are : " + rows.size());
	        
					    for ( int i=1 ; i<=rows.size() ;i++)
					    {
					      	String str1="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "[" + 2 +"]";
					      	
					        WebElement CellText1=driver.findElement(By.xpath(str1));
					    		   
					    	String valueIneed1 = CellText1.getText();
					       
					        
						    	if ( UserRole.equals(valueIneed1) )
						    	{
						    	    	 Record_Present=true;
						    	    	 System.out.println("True- UserRole Text Value is: " + valueIneed1);
						    	    	 return Record_Present;
						    	    	 //Employee ID exist in employee list
						    	}
						    	else
						    	{
						    		 System.out.println("Cell Text Value is:" + valueIneed1);
								     System.out.println("Seracching for UserRole is:" +UserRole);
						    	}
						    	
						  					    	
					    }  //After for loop
					    
					    System.out.println("*******UserRole method completed*****");
					    return Record_Present;
					    
	
	
}
				
			// Ends method for  VacancySearch
				
				public  void ExportUserManagement()throws Exception
				{ 
					 Actions actions = new Actions(driver);   
					 WebElement ele=driver.findElement(By.xpath(OR.ADMIN_focus));
					 actions.moveToElement(ele).click().perform();
					 
					System.out.println("reached here2");
					 
					 Actions actions1 = new Actions(driver);   
					 WebElement ele1=driver.findElement(By.xpath(OR.ADMIN_USERMANAGEMENT_focus));
					 actions1.moveToElement(ele1).click().perform();
					 
					 
					 Select listbox =new Select(driver.findElement(By.xpath(OR.UserRole_Listbox)));
					 listbox.selectByVisibleText("ESS");
					
					System.out.println("reached here3");
					 driver.findElement(By.xpath(OR.search_click)).click();
					
			        //No. of columns
			        List  columns = driver.findElements(By.xpath(OR.NoColumns)); 
			        System.out.println("No of columns are : " + columns.size());
			        
			        //No.of rows 
			        List  rows = driver.findElements(By.xpath(OR.NoRows)); 
			        System.out.println("No of rows are : " + rows.size());
			        
			       
			      
			        			ExcelApiTest3 eat = new ExcelApiTest3();
			         
							    for ( int i=1 ; i<=rows.size() ;i++)
							    {
							    	  for ( int j=2 ,k=0; j<=columns.size() ;j++,k++)
							    	   {
							    		  
							    		  System.out.println("hai....112");
							      		   String str1="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "[" + j +"]";
							      		
							      		 System.out.println("hai....113");
							      		 
							      		//*[@id='recordsListTable']/thead/tr/th
							    		    WebElement CellText1=driver.findElement(By.xpath(str1));
							    		    
							    		    System.out.println("hai....114");
							    		   
							    	        String valueIneed1 = CellText1.getText();
							    	        System.out.println("Cell Text Value is: " + valueIneed1);
							    	        
							    	        if (valueIneed1 !=null)
							    	        eat.PutCellData( "E://BOOLEAN//TC02_BOOLEAN.xls","Sheet5",i,k,valueIneed1);
							    	        else
							    	        eat.PutCellData( "E://BOOLEAN//TC02_BOOLEAN.xls","Sheet5",i,k,"Blank Data");
							    	        	
							    	   }
							    }
			   
				}	
		
				
				
			   			
					
				
				
				
}