package html;
//import MercuryDemoTours;


import org.testng.annotations.Test;

//import MercuryDemoTours.OR;

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
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

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
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
import html.*;

import java.awt.Desktop;
import java.io.*;

//import SamSung.*;


public class Test8 {
	

	

	@Test
	public  void MyHtm4() throws Exception {
		
		TestHTMLReporter5 TH3 = new TestHTMLReporter5();	  
		  String HtmlOutputFileName= TH3.CretaeHTMLFile("TC07_Add Employee","Chrome");	
		  
		 // System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
		  WebDriver driver4=TestBrowser.OpenChromeBrowser();
				  
		  driver4.get("http://www.newtours.demoaut.com/");
		  TH3.HTMLScreenShot("Open Mercury Demo tours","	Succefully Opened","Pass", HtmlOutputFileName,driver4);
		  
		  driver4.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter user Name","User Name Succefully Entered","Pass", HtmlOutputFileName,driver4);
		  
		  driver4.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter Password","	Password Succefully passed ","Pass", HtmlOutputFileName,driver4);

		  TH3.HTMLCloser(HtmlOutputFileName);
		  driver4.quit();
	
	}
	
	

	@Test
	public  void MyHtm1() throws Exception {
		
		
		  TestHTMLReporter5 TH = new TestHTMLReporter5();
		  String HtmlOutputFileName= TH.CretaeHTMLFile("TC08_Add Employee","Chrome");
		  
		  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
		  WebDriver driver=TestBrowser.OpenChromeBrowser();
		 	
		  driver.get("http://www.newtours.demoaut.com/");
		  TH.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver);

		  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver);
	
		  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH.HTMLScreenShot("Enter Password","	Succefully passed ","Pass", HtmlOutputFileName,driver);
	
		  TH.HTMLCloser(HtmlOutputFileName);
		  driver.quit();  
		
	}
	

	

	@Test
	public  void MyHtm2() throws Exception {

		  TestHTMLReporter5 TH1 = new TestHTMLReporter5();	  
		  String HtmlOutputFileName= TH1.CretaeHTMLFile("TC02_Add Employee","Chrome");
		  
		  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
		  WebDriver driver2=TestBrowser.OpenChromeBrowser();
		  
		  driver2.get("http://www.newtours.demoaut.com/");
		  TH1.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver2);
		  
		  driver2.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH1.HTMLScreenShot("Enter  Password Name","	Succefully Entered","Pass", HtmlOutputFileName,driver2);

		  driver2.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH1.HTMLScreenShot("Enter Password","	Succefully passed ","Pass", HtmlOutputFileName,driver2);
	
		  TH1.HTMLCloser(HtmlOutputFileName);
		  driver2.quit();
	}
	
	

	@Test
	public  void MyHtm3() throws Exception {
		


		 TestHTMLReporter5 TH4 = new TestHTMLReporter5();	  
		  String HtmlOutputFileName= TH4.CretaeHTMLFile("TC03_Add Employee","Chrome");
		  
		  //  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
	
		  WebDriver driver3=TestBrowser.OpenChromeBrowser();
		
	
		  
		  driver3.get("http://www.newtours.demoaut.com/");
		  TH4.HTMLScreenShot("Open Browser","	Succefully Entered","Pass", HtmlOutputFileName,driver3);

		  
		  TH4.HTMLScreenShot("Open 1","	Open 1 Selected ","Pass", HtmlOutputFileName,driver3);
		  
		  TH4.HTMLScreenShot("Open 2","	Open 2 Selected ","Pass", HtmlOutputFileName,driver3);
		  
		  
		  driver3.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH4.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver3);
		  
	
		  
		  driver3.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH4.HTMLScreenShot("Enter Password","	Succefully passed ","Pass", HtmlOutputFileName,driver3);

		 
		  TH4.HTMLCloser(HtmlOutputFileName);
		  driver3.quit();
		  
		  
		
	}
	
	
	/*
	@Test
	public  void Mydifftime() throws Exception {
		
		 SimpleDateFormat sdfDate1 = new SimpleDateFormat("dd-MMM-yyyy h:mm:ss a"); 
		 Date d1 = new Date();
		 String strDate1 = sdfDate1.format(d1);
		 
		 	Thread.sleep(120);
		 
		 SimpleDateFormat sdfDate2 = new SimpleDateFormat("dd-MMM-yyyy h:mm:ss a"); 
		 Date d2 = new Date();
		 String strDate2 = sdfDate2.format(d2);
		 
		 long difference1 = d1.getTime() - d2.getTime();
		 System.out.println(difference1/1000);
		 
		 /*
		 
		/* String time1 = "12:00:00";
			String time2 = "12:01:00";
	 
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			Date date1 = format.parse(time1);
			Date date2 = format.parse(time2);
			long difference = date2.getTime() - date1.getTime();
			System.out.println(difference/1000);*/
		
	
		
	//}
	
	
	
	
	
		@BeforeTest
	    public void suiteSetup1() throws Exception {
			

			  String xlsFile="C://Users//Admin//Desktop//HTML Report//HtmlTemplates//TC05.xls";
			  String xlsFileSheet="Sheet1";
			 
			 ExcelApiTest3 eat = new ExcelApiTest3();
			 eat.clearsheetdata(xlsFile,xlsFileSheet);
	    }  
		
		
		
		@AfterTest
	    public void AftersuiteSetup2() throws Exception {
			 
			 TestHTMLReporter5 TH5 = new TestHTMLReporter5();	
			 TH5.Regression_CretaeHTMLFile();
			
			
	    }    
		
			
	
}

	
	