package batch6.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CRM_Project_02_HeaderImageUrl {
	WebDriver driver;
  @Test
  public void verifyHeaderImageUr() {
	  WebElement HeaderImage=driver.findElement(By.xpath("//form[@id='form']/div/img"));
	  String imageurl=HeaderImage.getAttribute("src");
	  System.out.println("URL of the image :"+imageurl);
   }
  @BeforeMethod
  public void setup() {
	driver  = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/crm/");
  }

  @AfterClass
  public void teardown() {
	  driver.close();
  }

}
