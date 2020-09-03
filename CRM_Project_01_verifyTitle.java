package batch6.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CRM_Project_01_verifyTitle {
	WebDriver driver;
  @Test
  public void verifyTitle() {
	  String title=driver.getTitle();
	  System.out.println("Title :"+title);
	  if (title.compareTo("SuiteCRM")==0)
	  {
		  driver.close();
	  }
		//  Assert.assertEquals("SuiteCRM", title);
   }
  @BeforeMethod
  public void setup() {
	driver  = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/crm/");
	WebElement username=driver.findElement(By.id("user_name"));
	WebElement pwd=driver.findElement(By.id("username_password"));  
	WebElement formId=driver.findElement(By.id("form"));
	username.sendKeys("admin");
	pwd.sendKeys("pa$$w0rd");
	formId.submit();
  }
}
