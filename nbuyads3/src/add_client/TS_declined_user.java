package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_declined_user {
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
	//declined user message
	d1.findElement(By.id("decusermessage")).click();
	//view
	d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr[2]/td[4]/a[1]/span")).click();
	//edit
	d1.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/a[2]")).click();
	WebElement e3=d1.findElement(By.name("DeclineUserMessages[Message]"));
	e3.clear();
	e3.sendKeys("Invalid Data");
	//update
	d1.findElement(By.xpath(".//*[@id='w0']/div/div/div/div[2]/div/div[3]/button")).click();
	Thread.sleep(2000);
	//show
	WebElement e1=d1.findElement(By.id("drop_page"));
	e1.click();
	Select s1=new Select(e1);
	s1.selectByVisibleText("20");
	Thread.sleep(2000);
	//add new
	d1.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/a")).click();
	d1.findElement(By.name("DeclineUserMessages[Message]")).sendKeys("Invalid site");
	d1.findElement(By.xpath(".//*[@id='mydiv']/div/div[1]/div/div/span[3]")).click();
	d1.findElement(By.xpath(".//*[@id='w0']/div/div/div/div[2]/div/div[3]/a")).click();
	//looking for declined user message
	d1.findElement(By.name("DeclineUserMessagesSearch[Message]")).sendKeys("Data");
	WebElement e2=d1.findElement(By.xpath(".//*[@id='w0-filters']/td[3]/select"));
	e2.click();
	Select s2=new Select(e2);
	s2.selectByVisibleText("In-active");
	Thread.sleep(2000);

}
}