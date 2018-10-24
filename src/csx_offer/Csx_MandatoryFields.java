package csx_offer;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Csx_MandatoryFields {
	
	@Test
	public void OfferConfiguration_Mandatory_Fields() throws InterruptedException{
		
		
		
			
			 String Brow="C:\\setup\\geckodriver.exe";
			 System.setProperty("webdriver.gecko.driver",Brow);
			 FirefoxProfile profile=new FirefoxProfile();
			 WebDriver driver=new FirefoxDriver();
			 Actions action=new Actions(driver);
			
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("vrdeshmu");
			 driver.findElement(By.id("passwordInput")).sendKeys("Qwerty9943#");
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
				 Thread.sleep(3000);
				 //----Next Button disable without selecting Route to Engagement*,Meter,HealthScore
				 Thread.sleep(3000);
				 System.out.println(driver.findElement(By.xpath("//a[2]/button")).isEnabled());
				 Assert.assertEquals(driver.findElement(By.xpath("//a[2]/button")).isEnabled(), false);
				 Thread.sleep(3000);
				 //----Next Button disable without selecting Meter,HealthScore
				 driver.findElement(By.xpath("//div[2]/div/div/app-checkbox-element/div/label/span")).click();
				 Thread.sleep(3000);
				 Assert.assertEquals(driver.findElement(By.xpath("//a[2]/button")).isEnabled(), false);
				 Thread.sleep(3000);
				 
				//----Next Button disable without selecting HealthScore
				 driver.findElement(By.xpath("//div[2]/div/div/app-radio-element/div/label/span")).click();
				 Thread.sleep(3000);
				 Assert.assertEquals(driver.findElement(By.xpath("//a[2]/button")).isEnabled(), false);
				 Thread.sleep(3000);
				 
				//----Next Button should enable now
				 driver.findElement(By.xpath("//div[2]/div/div/app-radio-element/div/label/span")).click();
				 Thread.sleep(3000);
				 Assert.assertEquals(driver.findElement(By.xpath("//a[2]/button")).isEnabled(), true);
				 Thread.sleep(3000);
			
				 
				 //----Offer_configuration--//
				 /*Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[2]/div/div/app-checkbox-element/div/label/span")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//div[2]/div/div/app-radio-element/div/label/span")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div/div/app-radio-element/div/label/span")).click();
				 Thread.sleep(3000);
*/
	}
//	}


}
