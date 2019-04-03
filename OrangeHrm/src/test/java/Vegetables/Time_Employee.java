//import MercuryDemoTours;

package  Vegetables;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import java.util.*;


 
public class Time_Employee
{
	public String UserName,Password;
	
	
	
	
	
	
	public  int iRow;
	WebDriver driver;
	public  void AdminUsermg(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	
	
	
	@Test
	public  void DatadrivenTest_AddEmployess( )throws Exception
	{  
		
		  	  ExcelApiTest3 eat = new ExcelApiTest3();
			 int numberowsInputdata=eat.getRowCount("E://OrangeHrm//TC02_Admin_users.xls","Sheet4");

				 for(int i=1;i<2;i++)
				 {		 
			         UserName=eat.getCellData("E://OrangeHrm//TC02_Admin_users.xls","Sheet4",i,0);
					 Password=eat.getCellData("E://OrangeHrm//TC02_Admin_users.xls","Sheet4",i,1);
					 
					 System.out.println("User Name is :"+UserName);
					 
					 
						
					 iRow=i;
					 call_allmethods(iRow);
				 }
	}
				 
				 
		public   void call_allmethods(int iRow )throws Exception
					{  
						
						driver=TestBrowser.OpenChromeBrowser();
						
						Login l1=new Login();
						l1.Login(driver);
						l1.openOrangeHRM();
			 			l1.OrangeHRMlogin(UserName,Password);
						l1.OrangeHRMSigninClick();
						
						Time_Employee Tc= new Time_Employee();
						 Tc.Time_Employee(driver);
						
						System.out.println(" ");
						System.out.println("___________Starts_________________");
						System.out.println("****Export EmployeeList method starts here****");	
						Tc.Export_Employee();
						System.out.println("___________Ends_________________");
					
						
						
					}	
						
		
		public  void Export_Employeelist()throws Exception
		{ 
			
			
			Actions actions = new Actions(driver);   
			 WebElement ele=driver.findElement(By.xpath(OR.Time_focus));
			
			 actions.moveToElement(ele).click().build().perform();


			

			 Actions actions1 = new Actions(driver);   
			 WebElement ele1=driver.findElement(By.xpath(OR.Time_attendance));
			
			 actions1.moveToElement(ele1).click().build().perform();

			driver.findElement(By.xpath(OR.Employee_Attendance)).click();
			
			
	//No. of columns
	        List  columns = driver.findElements(By.xpath(OR.colums)); 
	        //System.out.println("No of columns are : " + columns.size());
	        
	        //No.of rows 
	        List  rows = driver.findElements(By.xpath(OR.Rows)); 
	       // System.out.println("No of rows are : " + rows.size());
	        
	       
	      
	        			ExcelApiTest3 eat = new ExcelApiTest3();
	         
					    for ( int i=1 ; i<=rows.size() ;i++)
					    {
					    	  for ( int j=2 ,k=0; j<=columns.size() ;j++,k++)
					    	   {
					      		   String str1="//*[@id=''resultTable'']/tbody/tr["  + i +  "]"  + "/td" + "[" + j +"]";
					      		   
					      		//*[@id="resultTable"]/tbody/tr[1]/td[2]
					    		    WebElement CellText1=driver.findElement(By.xpath(str1));
					    		   
					    	        String valueIneed1 = CellText1.getText();
					    	      //  System.out.println("Cell Text Value is: " + valueIneed1);
					    	        
					    	        if (valueIneed1 !=null)
					    	        eat.PutCellData( "E://OrangeHrm//TC03_Pim_configration.xls","Sheet5",i,k,valueIneed1);
					    	        else
					    	        eat.PutCellData( "E://OrangeHrm//TC03_Pim_configration.xls","Sheet5",i,k,"Blank Data");
					    	        	
					    	   }
					    }
	   
		
					    /*   
				        Don't Delete the below comment code - I have to explain below Logic 
				        
				        WebElement CellText=driver.findElement(By.xpath(" //*[@id='resultTable']/tbody/tr[1]/td[8]"));
				        String valueIneed = CellText.getText();
				        System.out.println("Cell Text Value is: " + valueIneed);         
				      	String str="//*[@id='resultTable']/tbody/tr[1]/td[8]";
				      	String str1="//*[@id='resultTable']/tbody/tr["  +1+  "]"  + "/td" + "[" + 8 +"]"; 
				        */
		}
	        
		
	
	
	
				 
				 
	}
	
	
	
	
	
		













	