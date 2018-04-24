package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_Screen {
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
	//screen
	d1.findElement(By.id("screen")).click();
	//view
	d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr[1]/td[6]/a[1]/span")).click();
	//edit
	d1.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/a[2]")).click();
	//update
	d1.findElement(By.name("signup-button")).click();
	Thread.sleep(2000);
	//show
	WebElement e1=d1.findElement(By.id("drop_page"));
	e1.click();
	Select s1=new Select(e1);
	s1.selectByVisibleText("20");
	Thread.sleep(2000);
	//add new
	d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/a")).click();
	WebElement e2=d1.findElement(By.id("screen-applicationid"));
	e2.click();
	Select s2=new Select(e2);
	s2.selectByVisibleText("Any");
	d1.findElement(By.name("Screen[ScreenName]")).sendKeys("any");
	d1.findElement(By.xpath(".//*[@id='screen-screentype']/label[1]/input")).click();
	d1.findElement(By.xpath(".//*[@id='mydiv']/div[1]/div/div/span[2]")).click();
	//cancel
	d1.findElement(By.xpath(".//*[@id='form-signup']/div/div/div/div[2]/div/a")).click();
	//looking for application
	d1.findElement(By.name("ScreenSearch[ApplicationId]")).sendKeys("Any");
	d1.findElement(By.name("ScreenSearch[ScreenName]")).sendKeys("Any");
//	WebElement e3=d1.findElement(By.name("ScreenSearch[ScreenType]"));
//	e3.click();
//	Select s3=new Select(e3);
//	s3.selectByVisibleText("Scrollable");
	WebElement e4=d1.findElement(By.xpath(".//*[@id='w0-filters']/td[5]/select"));
	e4.click();
	Select s4=new Select(e4);
	s4.selectByVisibleText("Active");
	d1.quit();
	
	}
}