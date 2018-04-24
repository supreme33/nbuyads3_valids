package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_State {
	@Test
	public void Testcase_state() throws InterruptedException{
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("nbuyads.appinstitute.in/admin");
		//login
		d1.findElement(By.id("adminloginform-email")).sendKeys("balaji2469@gmail.com");
		d1.findElement(By.id("adminloginform-password")).sendKeys("4972gWBwBC");
		d1.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		//state
		d1.findElement(By.id("state")).click();
		//show
		WebElement e2=d1.findElement(By.name("sample_1_length"));
		e2.click();
		Select s2=new Select(e2);
		s2.selectByVisibleText("20");
		Thread.sleep(2000);
		
		//looking for state
		d1.findElement(By.name("StateSearch[StateName]")).sendKeys("Karnataka");
		WebElement e1=d1.findElement(By.name("StateSearch[Status]"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Active");
		d1.quit(); 
		
	}
}
