package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_paidSubs {
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
	//paid subs
	d1.findElement(By.id("subscriptionpaid")).click();
	Thread.sleep(2000);
	//view
	d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr/td[6]/a/span")).click();
	Thread.sleep(2000);
	//cancel
	d1.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/a")).click();
	//show
	WebElement e1=d1.findElement(By.id("drop_page"));
	e1.click();
	Select s1=new Select(e1);
	s1.selectByVisibleText("20");
	Thread.sleep(2000);
	//looking
	d1.findElement(By.name("SubscriptionpaidSearch[VendorId]")).sendKeys("Green");
	d1.findElement(By.name("SubscriptionpaidSearch[PackageId]")).sendKeys("semi");
	d1.findElement(By.name("SubscriptionpaidSearch[CategoryId]")).sendKeys("Laundry");
	Thread.sleep(1000);
	WebElement e2=d1.findElement(By.name("SubscriptionpaidSearch[Status]"));
	e2.click();
	Select s2=new Select(e2);
	s2.selectByIndex(2);
	Thread.sleep(2000);
	d1.quit();
	
	
}
}