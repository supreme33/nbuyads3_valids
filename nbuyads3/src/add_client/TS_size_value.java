package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TS_size_value {
	@Test
	public void Testcase_city() throws InterruptedException{
	WebDriver d1=new FirefoxDriver();
	d1.get("http:\\www.google.com");
	d1.get("nbuyads.appinstitute.in/admin");
	//login
	d1.findElement(By.id("adminloginform-email")).sendKeys("balaji2469@gmail.com");
	d1.findElement(By.id("adminloginform-password")).sendKeys("4972gWBwBC");
	d1.findElement(By.name("login-button")).click();
	Thread.sleep(1000);
	//manage size
	WebElement e1=d1.findElement(By.cssSelector("a[class='nav-link nav-toggle']"));
	e1.click();
	Thread.sleep(2000);
	//size value
	d1.findElement(By.xpath(".//*[@id='size-value']/a/span")).click();
	//reset
	d1.findElement(By.xpath(".//*[@id='p0']/a")).click();
	//view
	d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr[1]/td[6]/a/span")).click();
	//cancel
	d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div[2]/a")).click();
	d1.quit();
}
}