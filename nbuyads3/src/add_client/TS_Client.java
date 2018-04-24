package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_Client {
	@Test
	public void Testcaseforclient() throws InterruptedException{
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("nbuyads.appinstitute.in/admin");
		//login
		d1.findElement(By.id("adminloginform-email")).sendKeys("balaji2469@gmail.com");
		d1.findElement(By.id("adminloginform-password")).sendKeys("4972gWBwBC");
		d1.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		//manage client
		d1.findElement(By.id("size-value")).click();
		//add new
		d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/a")).click();
		//filling details
		d1.findElement(By.name("VendorSignupForm[business_name]")).sendKeys("supreme");
		d1.findElement(By.name("VendorSignupForm[contact_name]")).sendKeys("ab");
		d1.findElement(By.name("VendorSignupForm[email]")).sendKeys("abc@gmail.com");
		d1.findElement(By.name("VendorSignupForm[mobile]")).sendKeys("8877996655");
		WebElement e2=d1.findElement(By.id("vendorsignupform-location_id"));
		Select s2=new Select(e2);
		s2.selectByVisibleText("Theni");
		d1.findElement(By.name("VendorSignupForm[address]")).sendKeys("sdas,dsd,dsd.");
		d1.findElement(By.xpath(".//*[@id='mydiv']/div[1]/div/div/span[3]")).click();
		//cancel
		d1.findElement(By.xpath(".//*[@id='form-signup']/div/div/div/div[2]/div/a")).click();
		//view
		d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr[9]/td[7]/a[1]/span")).click();
		//edit
		d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div[2]/a[2]")).click();
		d1.findElement(By.name("Vendor[business_name]")).sendKeys("super");
		//update
		WebElement e5=d1.findElement(By.name("signup-button"));
		e5.click();
		Thread.sleep(2000);
		//looking for client
		d1.findElement(By.name("VendorSearch[agent_id]")).sendKeys("karan");
		d1.findElement(By.name("VendorSearch[business_name]")).sendKeys("Groceries");
		d1.findElement(By.name("VendorSearch[contact_name]")).sendKeys("edward");
		d1.findElement(By.name("VendorSearch[mobile]")).sendKeys("9465454321");
		WebElement e3=d1.findElement(By.name("VendorSearch[status]"));
		e3.click();
		Select s3=new Select(e3);
		s3.selectByVisibleText("Active");
		//show
		WebElement e4=d1.findElement(By.id("drop_page"));
		e4.click();
		Select s4=new Select(e4);
		s4.selectByVisibleText("50");
		Thread.sleep(2000);
     	d1.quit();
		
		
}
}