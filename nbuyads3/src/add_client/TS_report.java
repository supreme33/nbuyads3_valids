package add_client;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_report {
	@Test
	public void Testcase_city() throws InterruptedException, AWTException{
	WebDriver d1=new FirefoxDriver();
	d1.get("http:\\www.google.com");
	d1.get("nbuyads.appinstitute.in/admin");
	//login
	d1.findElement(By.id("adminloginform-email")).sendKeys("balaji2469@gmail.com");
	d1.findElement(By.id("adminloginform-password")).sendKeys("4972gWBwBC");
	d1.findElement(By.name("login-button")).click();
	Thread.sleep(2000);
	d1.findElement(By.id("report")).click();
	//show
	WebElement e1=d1.findElement(By.id("drop_page"));
	e1.click();
	Select s1=new Select(e1);
	s1.selectByVisibleText("50");
	Thread.sleep(2000);
	//looking for report
	d1.findElement(By.name("SubscriptiondateSearch[VendorId]")).sendKeys("Emarket");
	d1.findElement(By.name("SubscriptiondateSearch[PackageId]")).sendKeys("Any Semi Quarter Package");
	d1.findElement(By.name("SubscriptiondateSearch[CategoryId]")).sendKeys("Others");
	Thread.sleep(1000);
	WebElement e2=d1.findElement(By.xpath(".//*[@id='subscriptiondatesearch-createddate-container']/div"));
	e2.click();
	Select s2=new Select(e2);
	s2.selectByVisibleText("Last 7 Days");
	Thread.sleep(1000);
	WebElement e3=d1.findElement(By.name("SubscriptiondateSearch[Status]"));
	e3.click();
	Select s3=new Select(e3);
	s3.selectByVisibleText("Disabled");
	
	
	
	

}
}