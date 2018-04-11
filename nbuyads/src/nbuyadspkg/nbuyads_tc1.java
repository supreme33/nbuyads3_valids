package nbuyadspkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class nbuyads_tc1 {

	@Test
	public void Testcase1() throws InterruptedException, AWTException{
		
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("https://www.nbuyads.com/admin/site/login#!");
		d1.findElement(By.id("adminloginform-email")).sendKeys("superadmin@gmail.com");
		d1.findElement(By.id("adminloginform-password")).sendKeys("1234567");
		d1.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		/*Manage Agents*/
		d1.findElement(By.id("cmsuser")).click();
		/*add new*/
		WebElement e1 = d1.findElement(By.cssSelector("a[class='btn sbold green']"));
		e1.click();
		/*filling details*/
		d1.findElement(By.id("cmsusersignupform-name")).sendKeys("agent");
		d1.findElement(By.id("cmsusersignupform-email")).sendKeys("sdfs@gmail.com");
		d1.findElement(By.id("cmsusersignupform-mobile")).sendKeys("9788514566");
		WebElement e2 =d1.findElement(By.id("cmsusersignupform-profileimage"));
		e2.click();
		Thread.sleep(2000);
		/*adding new profile image*/
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_A);
		r1.keyRelease(KeyEvent.VK_A);
		r1.keyPress(KeyEvent.VK_G);
		r1.keyRelease(KeyEvent.VK_G);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		/*filling*/
		d1.findElement(By.id("cmsusersignupform-address")).sendKeys("sdjfhsu,serdgwser,erwr");
		d1.findElement(By.id("cmsusersignupform-area")).sendKeys("tambaram");
		d1.findElement(By.id("cmsusersignupform-city")).sendKeys("Chennai");
		d1.findElement(By.name("CmsUserSignupForm[pincode]")).sendKeys("600001");
		d1.findElement(By.className("bootstrap-switch-label")).click();
		/*create*/
		d1.findElement(By.name("signup-button")).click();
		
		Thread.sleep(5000);	
		d1.quit();
	}
}
