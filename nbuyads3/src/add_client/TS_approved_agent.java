package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_approved_agent {
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
	//approved
	d1.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/ul/li[22]/a/span[1]")).click();
	//approved agent
	d1.findElement(By.xpath(".//*[@id='approveagent']/a/span")).click();
	//view
		d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr/td[7]/a[1]/span")).click();
		//edit
		d1.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/a[2]")).click();
		//cancel
		d1.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/a[1]")).click();
	//looking for approved agent
	d1.findElement(By.name("CmsUsersApprovalSearch[name]")).sendKeys("jagan");
	d1.findElement(By.name("CmsUsersApprovalSearch[mobile]")).sendKeys("9754666542");
	d1.findElement(By.name("CmsUsersApprovalSearch[city]")).sendKeys("chennnai");
	d1.findElement(By.name("CmsUsersApprovalSearch[pincode]")).sendKeys("600035");
	WebElement e1=d1.findElement(By.name("CmsUsersApprovalSearch[status]"));
	e1.click();
	Select s1=new Select(e1);
	s1.selectByVisibleText("Active");
	Thread.sleep(2000);
	
	
	
}
}