package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_ad_type {
	@Test
	public void Testcase_city() throws InterruptedException{
	WebDriver d1=new FirefoxDriver();
	d1.get("http:\\www.google.com");
	d1.get("nbuyads.appinstitute.in/admin");
	//login
	d1.findElement(By.id("adminloginform-email")).sendKeys("balaji2469@gmail.com");
	d1.findElement(By.id("adminloginform-password")).sendKeys("4972gWBwBC");
	d1.findElement(By.name("login-button")).click();
	Thread.sleep(2000);
	//adtype
	d1.findElement(By.id("type")).click();
	//looking for ad-type
	d1.findElement(By.name("TypeSearch[TypeName]")).sendKeys("Impression With Redirect");
	WebElement e1=d1.findElement(By.name("TypeSearch[Status]"));
	Select s1=new Select(e1);
	s1.selectByVisibleText("Active");
	d1.quit();
	}
}
