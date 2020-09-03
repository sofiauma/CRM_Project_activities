package batch6.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CRM_Project_06_ActivityMenu {
	WebDriver driver;
	WebDriverWait wait;
	
  @Test
  public void verifyLogin() throws Exception {
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/nav/div/div[2]/ul/li[1]/a")));
		WebElement Activities=driver.findElement(By.xpath("//a[text()='Activities']"));
		Assert.assertTrue(Activities.isDisplayed());
		System.out.println("Assert Displayed: "+Activities.isDisplayed());
		Assert.assertTrue(Activities.isEnabled());
		System.out.println("Assert Enabled: "+Activities.isEnabled());
		
	  }
  @BeforeMethod
  public void setup() {
	driver  = new FirefoxDriver();
	wait = new WebDriverWait(driver,20);
	driver.get("https://alchemy.hguy.co/crm/");
	WebElement username=driver.findElement(By.id("user_name"));
	WebElement pwd=driver.findElement(By.id("username_password"));  
	WebElement formId=driver.findElement(By.id("form"));
	username.sendKeys("admin");
	pwd.sendKeys("pa$$w0rd");
	formId.submit();
  }
  
  @AfterMethod
  public void teardown()
  {
	  driver.close();
  }
}

