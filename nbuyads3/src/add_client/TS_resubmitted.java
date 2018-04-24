package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_resubmitted {
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
	//resubmitted subs
	d1.findElement(By.id("resubmittedsubscription")).click();
	//looking for resubmitted subs
	d1.findElement(By.name("ResubmitSubscriptionSearch[VendorId]")).sendKeys("ultra");
	d1.findElement(By.name("ResubmitSubscriptionSearch[PackageId]")).sendKeys("dfs");
	d1.findElement(By.name("ResubmitSubscriptionSearch[CategoryId]")).sendKeys("dsff");
	Thread.sleep(1000);
	WebElement e1=d1.findElement(By.xpath(".//*[@id='w0-filters']/td[5]/select"));
	e1.click();
	Select s1=new Select(e1);
	s1.selectByIndex(1);
	//show
	Thread.sleep(1000);
		WebElement e2=d1.findElement(By.id("drop_page"));
		e2.click();
		Select s2=new Select(e2);
		s2.selectByVisibleText("20");
		Thread.sleep(2000);
	
	
}
}