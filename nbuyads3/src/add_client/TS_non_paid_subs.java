package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_non_paid_subs {
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
	d1.findElement(By.xpath(".//*[@id='subscription']/a/span")).click();
	//looking for non-paid
	d1.findElement(By.name("SubscriptionnotpaidSearch[VendorId]")).sendKeys("ultra");
	d1.findElement(By.name("SubscriptionnotpaidSearch[PaymentStatus]")).sendKeys("Not-Paid Subscription");
	WebElement e2=d1.findElement(By.name("SubscriptionnotpaidSearch[Status]"));
	e2.click();
	Select s2=new Select(e2);
	s2.selectByVisibleText("Enabled");
	Thread.sleep(1000);
	//show
	WebElement e1=d1.findElement(By.id("drop_page"));
	e1.click();
	Select s1=new Select(e1);
	s1.selectByVisibleText("50");
	Thread.sleep(2000);

	//cancel button is missing in view page so in pending
	
	Thread.sleep(2000);
}
}