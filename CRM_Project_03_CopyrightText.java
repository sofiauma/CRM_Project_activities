package batch6.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CRM_Project_03_CopyrightText {
	WebDriver driver=new FirefoxDriver();
	
  @Test
  public void Copyright() {
	  WebElement Copyright=driver.findElement(By.xpath("//div[@class='p_login_bottom']/a[1]"));
	  System.out.println("First Copyright text in the footer is : "+Copyright.getText());
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://alchemy.hguy.co/crm/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
