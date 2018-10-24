package csx_offer;

import java.awt.AWTException;
import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Create_Offer_byGuest {
	
//@Test
	public void Login_Guest() {
		
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
		// Thread.sleep(5000);
		}

	@Test
	public void verify_addoffer_isDisable() throws InterruptedException{
		
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
		WebElement button=driver.findElement(By.cssSelector("html body.cui app-root app-main div.content.mainContainer main.row div.col-md-12 div.container.route-container app-dashboard div div div.row.mt-40 div.col-md-4 h6 span.rightIcons span.cust-success-icon.icon-for-add.disabled"));
		if (button.isEnabled()){
			System.out.println("dqwdeq");
		}else{
			System.out.println("no");
			System.out.println("aqeasss");
		}
		
	}
		
}
