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

public class CRM_Project_04_verifyLogin {
	WebDriver driver;
	WebDriverWait wait;
	
  @Test
  public void verifyLogin() throws Exception {
	  driver.get("https://alchemy.hguy.co/crm/");
		WebElement username=driver.findElement(By.id("user_name"));
		WebElement pwd=driver.findElement(By.id("username_password"));  
		WebElement formId=driver.findElement(By.id("form"));
		username.sendKeys("admin");
		pwd.sendKeys("pa$$w0rd");
		formId.submit();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/nav/div/div[2]/ul/li[1]/a")));
		WebElement home=driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul/li[1]/a"));
		Assert.assertTrue(home.isDisplayed());
  }
  @BeforeMethod
  public void setup() {
	driver  = new FirefoxDriver();
	wait = new WebDriverWait(driver,20);
  }
  
  @AfterMethod
  public void teardown()
  {
	  driver.close();
  }
}

