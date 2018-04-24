package add_client;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_subscription {
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
	d1.findElement(By.id("subscription")).click();
	Thread.sleep(2000);
	//view
		d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr/td[6]/a[1]/span")).click();
		Thread.sleep(2000);
		//edit
		d1.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/a[2]")).click();;
		//cancel
		d1.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/a")).click();
	//show
	WebElement e1=d1.findElement(By.id("drop_page"));
	e1.click();
	Select s1=new Select(e1);
	s1.selectByVisibleText("50");
	Thread.sleep(2000);
	//add new
	d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/a")).click();
	Thread.sleep(2000);
	WebElement e2=d1.findElement(By.id("select2-subscription-vendorid-container"));
	e2.click();
	Robot r1=new Robot();
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	WebElement e3=d1.findElement(By.xpath(".//*[@id='subscription-packageid']"));
	e3.click();
	Thread.sleep(1000);
	Select s3=new Select(e3);
	s3.selectByIndex(5);
	Thread.sleep(5000);
	WebElement e4=d1.findElement(By.xpath(".//*[@id='subscription-categoryid']"));
	e4.click();
	Select s4=new Select(e4);
	s4.selectByIndex(5);
	Thread.sleep(3000);
	WebElement e5=d1.findElement(By.xpath(".//*[@id='subscription-stateid']"));
	e5.click();
	Select s5=new Select(e5);
	s5.selectByIndex(1);
	Thread.sleep(3000);
	WebElement e6=d1.findElement(By.xpath(".//*[@id='locationselect']/option[1]"));
	e6.click();
	d1.findElement(By.xpath(".//*[@id='locationselect']/option[3]")).click();
	Select s6=new Select(e6);
	Robot r2=new Robot();
	Thread.sleep(3000);
	r2.keyPress(KeyEvent.VK_CONTROL);
	s6.selectByVisibleText("Chennai");
	s6.selectByVisibleText("Theni");
	Thread.sleep(1000);
	r2.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	d1.findElement(By.name("areamapping-areaid")).click();

	Thread.sleep(2000);
	//looking
	d1.findElement(By.name("SubscriptionSearch[VendorId]")).sendKeys("Emarket");
	d1.findElement(By.name("SubscriptionSearch[PackageId]")).sendKeys("Any Half Package");
	d1.findElement(By.name("SubscriptionSearch[CategoryId]")).sendKeys("Flower");
	Thread.sleep(1000);
	WebElement e7=d1.findElement(By.xpath(".//*[@id='w0-filters']/td[5]/select"));
	e7.click();
	Select s7=new Select(e7);
	s7.selectByVisibleText("Disable");
	
	Thread.sleep(2000);
	d1.quit();
	
}
}