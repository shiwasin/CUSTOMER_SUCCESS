package csx_offer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Create_Offer {
	
	String Brow="C:\\setup\\geckodriver.exe";
	@Test
	public void Offer_Status_AfterSubmitting() throws InterruptedException, AWTException{
	
	 String Brow="C:\\setup\\geckodriver.exe";
	 System.setProperty("webdriver.gecko.driver",Brow);
	 FirefoxProfile profile=new FirefoxProfile();
	 WebDriver driver=new FirefoxDriver();
	 Actions action=new Actions(driver);
	
	 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
	 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
	 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
	 driver.findElement(By.id("login-button")).click();
	 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
	 String pTitle=driver.getTitle();
	 System.out.println(pTitle);
	 Assert.assertEquals(pTitle, "Customer Success Portal");
	 System.out.println("Page Title Verified:"+pTitle);
	 
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 driver.findElement(By.cssSelector("span.cust-success-icon.icon-for-add")).click();
	 
	 
	  //driver.findElement(By.xpath("//input[@id='offerSeq1']")).sendKeys("shiwasin");
	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("SMH");
	  LocalDateTime now = LocalDateTime.now();  
	   System.out.println("ssa"+dtf.format(now));  
	  System.out.println("a"+dtf);
	  
	    SimpleDateFormat formatter = new SimpleDateFormat("sHs");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));  
	  Thread.sleep(5000);
	  System.out.println(driver.findElement(By.cssSelector("button.btn")).isEnabled());
	  driver.findElement(By.id("offerSeq2")).sendKeys("Test1"+formatter.format(date));
	  Thread.sleep(3000);
	  driver.findElement(By.id("offerSeq1")).sendKeys("shrutipa");


	  Actions hover=new Actions(driver);
	  hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).click().build().perform();
	  driver.findElement(By.id("offerSeq3")).sendKeys("Testd"+formatter.format(date));
	  hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).click().build().perform();
	  hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).doubleClick().build().perform();

	  
		 driver.findElement(By.id("offerSeq3")).clear();
		 Thread.sleep(2000);

		 action.moveToElement(driver.findElement(By.cssSelector("button.btn"))).click().build().perform();
		 System.out.println(driver.findElement(By.cssSelector("button.btn")).getText());
		 
		 //----Offer_configuration--//
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[2]/div/div/app-checkbox-element/div/label/span")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[2]/div/div/app-radio-element/div/label/span")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div/div/app-radio-element/div/label/span")).click();
		 Thread.sleep(3000);
		

		 action.moveToElement(driver.findElement(By.xpath("//a[2]/button"))).click().build().perform();
		 Thread.sleep(5000);
		
		 action.moveToElement(driver.findElement(By.xpath("//a[2]/button"))).click().build().perform();
		 Thread.sleep(5000);
		 //----Call-to-Action---//
		 driver.findElement(By.xpath("//div[2]/app-checkbox-element/div/label/span")).click();
		 driver.findElement(By.id("cta2")).sendKeys("Test");
		 Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//a[2]/button"))).click().build().perform();

		//----------------Submitting_the_Offer----------------------//
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//button[2]"))).click().build().perform();
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		driver.findElement(By.cssSelector("button.btn.btn--primary")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.btn.btn--primary")).click();
		Thread.sleep(5000);
		String Offer_Name=driver.findElement(By.cssSelector(".row:nth-child(2) tr:nth-child(1) .td-ellpses")).getText();
		
		
		Assert.assertEquals(driver.findElement(By.cssSelector(".row:nth-child(2) > .col-md-4:nth-child(2) tr:nth-child(1) > td:nth-child(2)")).getText(), "Submitted");
		System.out.println(Offer_Name+"   "+"status is"+"   "+driver.findElement(By.cssSelector(".row:nth-child(2) > .col-md-4:nth-child(2) tr:nth-child(1) > td:nth-child(2)")).getText());		
		driver.close();
	}
	//@Test
	
	public void Offer_status_withSubmitting() throws InterruptedException{
		
		 String Brow="C:\\setup\\geckodriver.exe";
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 Actions action=new Actions(driver);
		
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
		 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Title Verified:"+pTitle);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 
		 if(driver.findElement(By.cssSelector("span.cust-success-icon.icon-for-add")).isEnabled()){

		 driver.findElement(By.cssSelector("span.cust-success-icon.icon-for-add")).click();
		 
		 
		  //driver.findElement(By.xpath("//input[@id='offerSeq1']")).sendKeys("shiwasin");
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("SMH");
		  LocalDateTime now = LocalDateTime.now();  
		   System.out.println("ssa"+dtf.format(now));  
		  System.out.println("a"+dtf);
		  
		    SimpleDateFormat formatter = new SimpleDateFormat("sHs");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date));  
		  
		  /*Robot rb=new Robot();
		  rb.keyPress(KeyEvent.VK_TAB);
		  rb.keyRelease(KeyEvent.VK_TAB);
		  rb.keyPress(KeyEvent.VK_TAB);
		  rb.keyRelease(KeyEvent.VK_TAB);
		  rb.keyPress(KeyEvent.VK_TAB);
		  rb.keyRelease(KeyEvent.VK_TAB);*/
		  //action.moveToElement(driver.findElement(By.cssSelector("#offerSeq1"))).click().build().perform();
		  
		  
		  //driver.findElement(By.cssSelector("#offerSeq1")).sendKeys("shrutipa");
		  Thread.sleep(5000);
		  System.out.println(driver.findElement(By.cssSelector("button.btn")).isEnabled());
		  driver.findElement(By.id("offerSeq2")).sendKeys("Test1"+formatter.format(date));
		  Thread.sleep(3000);
		  driver.findElement(By.id("offerSeq1")).sendKeys("shrutipa");
		  Thread.sleep(5000);

		  Actions hover=new Actions(driver);
		  hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).click().build().perform();
		  driver.findElement(By.id("offerSeq3")).sendKeys("Testd"+formatter.format(date));
		  hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).click().build().perform();
			// hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).
		  hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).doubleClick().build().perform();

		  
			 driver.findElement(By.id("offerSeq3")).clear();
			 Thread.sleep(2000);

			 //hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).doubleClick().build().perform();
			 action.moveToElement(driver.findElement(By.cssSelector("button.btn"))).click().build().perform();
			 //action.moveToElement(driver.findElement(By.cssSelector("button.btn"))).click().build().perform();
			 Thread.sleep(2000);
			 driver.findElement(By.linkText("Home")).click();
			 Thread.sleep(5000);
			 
			 String Offer_Name=driver.findElement(By.cssSelector(".row:nth-child(2) tr:nth-child(1) .td-ellpses")).getText();
				
				
				Assert.assertEquals(driver.findElement(By.cssSelector(".row:nth-child(2) > .col-md-4:nth-child(2) tr:nth-child(1) > td:nth-child(2)")).getText(), "In Progress");
				System.out.println(Offer_Name+"   "+"status is"+"   "+driver.findElement(By.cssSelector(".row:nth-child(2) > .col-md-4:nth-child(2) tr:nth-child(1) > td:nth-child(2)")).getText());		
				
		 }
		 else{
			 System.out.println("user has guest access");
		 }
		 driver.close();
		
		
	}
	//@Test
	
	public void Add_icon_Enable_toAdmin() throws InterruptedException{
		
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 Actions action=new Actions(driver);
		
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
		 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Title Verified:"+pTitle);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 Assert.assertEquals(driver.findElement(By.cssSelector("span.cust-success-icon.icon-for-add")).isEnabled(),true);
		// if(driver.findElement(By.cssSelector("span.cust-success-icon.icon-for-add")).isEnabled()){

		
		 driver.close();
	}
	
	@Test
	
	public void verify_nextbutton_Enable_toAdmin() throws InterruptedException{
		
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 Actions action=new Actions(driver);
		
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
		 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Title Verified:"+pTitle);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.findElement(By.cssSelector("span.cust-success-icon.icon-for-add")).click();
		 
		 
		  //driver.findElement(By.xpath("//input[@id='offerSeq1']")).sendKeys("shiwasin");
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("SMH");
		  LocalDateTime now = LocalDateTime.now();  
		  System.out.println("ssa"+dtf.format(now));  
		  System.out.println("a"+dtf);
		  
		  SimpleDateFormat formatter = new SimpleDateFormat("sHs");  
		  Date date = new Date();  
		  System.out.println(formatter.format(date));  
		  
		  
		  
		  Thread.sleep(5000);
		  driver.findElement(By.id("offerSeq2")).sendKeys("Test1"+formatter.format(date));
		  Thread.sleep(3000);
		  driver.findElement(By.id("offerSeq1")).sendKeys("shrutipa");
		  Thread.sleep(5000);

		 Assert.assertEquals(driver.findElement(By.cssSelector("button.btn")).isEnabled(),true);
		 driver.close();
		
	}
	
	@Test
	
	public void Verify_OfferName_Unique() throws InterruptedException{
		
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 Actions action=new Actions(driver);
		
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
		 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Title Verified:"+pTitle);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		String Offer_Name=driver.findElement(By.cssSelector(".row:nth-child(2) tr:nth-child(1) .td-ellpses")).getText();

		 driver.findElement(By.cssSelector("span.cust-success-icon.icon-for-add")).click();
		 
		  Thread.sleep(5000);
		  driver.findElement(By.id("offerSeq2")).sendKeys(Offer_Name);
		  driver.findElement(By.id("offerSeq2")).sendKeys(Keys.TAB);
		  //System.out.println(driver.findElement(By.cssSelector("html body.cui app-root app-main div.content.mainContainer main.row div.col-md-12 div.container app-message-bar")).getText());
		  Thread.sleep(2000);
		  System.out.println(driver.findElement(By.xpath("//span[2]")).getText());
		 
		  

		 Assert.assertEquals(driver.findElement(By.xpath("//span[2]")).getText(),"Offer"+" "+Offer_Name+" already exists.");
		 driver.close();
	}
	@Test
	
	public void Verify_OffermanagerName_BUcontact_CECID() throws InterruptedException{
		
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 Actions action=new Actions(driver);
		
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
		 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Title Verified:"+pTitle);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		//String Offer_Name=driver.findElement(By.cssSelector(".row:nth-child(2) tr:nth-child(1) .td-ellpses")).getText();

		 driver.findElement(By.cssSelector("span.cust-success-icon.icon-for-add")).click();
		 
		  Thread.sleep(5000);
		  driver.findElement(By.id("offerSeq1")).sendKeys("aasasas");
		 
		  driver.findElement(By.id("offerSeq1")).sendKeys(Keys.TAB);
		  Thread.sleep(2000);
		  System.out.println(driver.findElement(By.cssSelector("div.message.error-msg")).getText());
		 // Assert
		  driver.close();
		  

		
	}
	
	@Test
		public void Verify_OfferName_With_OfferConfiguration_Page() throws InterruptedException, AWTException{
		
		 String Brow="C:\\setup\\geckodriver.exe";
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 Actions action=new Actions(driver);
		
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
		 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Title Verified:"+pTitle);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(15000);
		 driver.findElement(By.cssSelector("span.cust-success-icon.icon-for-add")).click();
		 Thread.sleep(5000);
		 
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("SMH");
		  LocalDateTime now = LocalDateTime.now();  
		  System.out.println("ssa"+dtf.format(now));  
		  System.out.println("a"+dtf);
		  
		  SimpleDateFormat formatter = new SimpleDateFormat("sHs");  
		  Date date = new Date();  
		   
		  Thread.sleep(5000);
		  driver.findElement(By.id("offerSeq2")).sendKeys("Test1"+formatter.format(date));
		  Thread.sleep(3000);
		  driver.findElement(By.id("offerSeq1")).sendKeys("shrutipa");


		  Actions hover=new Actions(driver);
		  hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).click().build().perform();
		  driver.findElement(By.id("offerSeq3")).sendKeys("Testd"+formatter.format(date));
		  hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).click().build().perform();
		  hover.moveToElement(driver.findElement(By.cssSelector("button.btn.btn--small.btn--default"))).doubleClick().build().perform();

		  
			 driver.findElement(By.id("offerSeq3")).clear();
			 Thread.sleep(2000);

			 action.moveToElement(driver.findElement(By.cssSelector("button.btn"))).click().build().perform();
			 Thread.sleep(4000);
			 System.out.println(driver.findElement(By.cssSelector("div.form-group_text")).getText());
			 driver.close();
		}
		@Test
		public void View_Offer_Details() throws InterruptedException{
			
			 System.setProperty("webdriver.gecko.driver",Brow);
			 FirefoxProfile profile=new FirefoxProfile();
			 WebDriver driver=new FirefoxDriver();
			 Actions action=new Actions(driver);
			
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
			 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
			 driver.findElement(By.id("login-button")).click();
			 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
			 String pTitle=driver.getTitle();
			 System.out.println(pTitle);
			 Assert.assertEquals(pTitle, "Customer Success Portal");
			 System.out.println("Page Title Verified:"+pTitle);
			 
			 
			 driver.manage().window().maximize();
			 Thread.sleep(5000);
			 driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(4) > .icon-view")).click();
			 Thread.sleep(5000);
			 Assert.assertEquals(driver.findElement(By.className("offer-disable")).isEnabled(), true);
			 driver.close();
			 
			}
		
			@Test
			public void Edit_Offer_Details() throws InterruptedException{
			

				 String Brow="C:\\setup\\geckodriver.exe";
				 System.setProperty("webdriver.gecko.driver",Brow);
				 FirefoxProfile profile=new FirefoxProfile();
				 WebDriver driver=new FirefoxDriver();
				 Actions action=new Actions(driver);
				
				 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
				 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
				 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
				 driver.findElement(By.id("login-button")).click();
				 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
				 String pTitle=driver.getTitle();
				 System.out.println(pTitle);
				 Assert.assertEquals(pTitle, "Customer Success Portal");
				 System.out.println("Page Title Verified:"+pTitle);
				 
				 driver.manage().window().maximize();
				
				driver.findElement(By.cssSelector("span.cust-success-icon.icon-editable")).click();
				Thread.sleep(5000);
				
				String manager_name=driver.findElement(By.cssSelector("#offerSeq1")).getText();
				System.out.println(manager_name);
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("#offerSeq1")).clear();
				Thread.sleep(3000);
				Assert.assertEquals(manager_name, driver.findElement(By.cssSelector("#offerSeq1")).getText());
				driver.close();
			//	 }
			 
			}
		

}

