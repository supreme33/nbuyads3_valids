package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_Size {
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
	//view
	WebElement e1=d1.findElement(By.cssSelector("a[class='nav-link nav-toggle']"));
	e1.click();
	Thread.sleep(2000);
	d1.findElement(By.xpath(".//*[@id='size']/a/span")).click();
	d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr[1]/td[6]/a[1]/span")).click();
	d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div[2]/a[2]")).click();
	d1.findElement(By.xpath(".//*[@id='form-signup']/div/div/div/div[2]/div/button")).click();
	Thread.sleep(2000);
	//add new
	d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/a")).click();
	WebElement e2=d1.findElement(By.xpath(".//*[@id='size-applicationid']"));
	e2.click();
	Select s2=new Select(e2);
	s2.selectByVisibleText("nTracky");
	WebElement e3=d1.findElement(By.xpath(".//*[@id='size-screenid']"));
	e3.click();
	Select s3=new Select(e3);
	s3.selectByVisibleText("Product Screen");
	Thread.sleep(1000);
	WebElement e4=d1.findElement(By.name(".//*[@id='size-sizevalueid']"));
	e4.click();
	Select s4=new Select(e4);
	s4.selectByIndex(3);
	Thread.sleep(1000);
	d1.findElement(By.xpath(".//*[@id='mydiv']/div[1]/div/div/span[2]")).click();
	d1.findElement(By.xpath(".//*[@id='form-signup']/div/div/div/div[2]/div/button")).click();
	Thread.sleep(2000);
	//show
	WebElement e5=d1.findElement(By.id("drop_page"));
	e5.click();
	Select s5=new Select(e5);
	s5.selectByVisibleText("20");
	Thread.sleep(2000);
	
	//looking
	d1.findElement(By.name("SizeSearch[ApplicationId]")).sendKeys("Any");
	d1.findElement(By.name("SizeSearch[ScreenId]")).sendKeys("Any");
	d1.findElement(By.name("SizeSearch[SizeValueId]")).sendKeys("Full");
	WebElement e6=d1.findElement(By.name("SizeSearch[Status]"));
	e6.click();
	Select s6=new Select(e6);
	s6.selectByVisibleText("Active");
	d1.quit();

}
}