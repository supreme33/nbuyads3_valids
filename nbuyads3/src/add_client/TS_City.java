package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_City {
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
		//manage city
		d1.findElement(By.id("location")).click();
		//view
		WebElement e=d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr[1]/td[5]/a[1]/span"));
		e.click();
		d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div[2]/a[2]")).click();
		WebElement et=d1.findElement(By.name("Location[StateId]"));
		et.click();
		Select sa=new Select(et);
		sa.selectByVisibleText("Assam");
		d1.findElement(By.xpath(".//*[@id='form-signup']/div/div/div/div[2]/div/a")).click();
				
		//show
		WebElement e2=d1.findElement(By.id("drop_page"));
		e2.click();
		Select s2=new Select(e2);
		s2.selectByVisibleText("20");
		Thread.sleep(2000);
		//add
		d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/a")).click();
	    WebElement e1=d1.findElement(By.name("Location[StateId]"));
		e1.click();
		Select s=new Select(e1);
		s.selectByIndex(3);
		d1.findElement(By.name("Location[LocationName]")).sendKeys("Chennai");
		d1.findElement(By.xpath(".//*[@id='mydiv']/div[1]/div/div/span[2]")).click();
		//cancel
		d1.findElement(By.xpath(".//*[@id='form-signup']/div/div/div/div[2]/div/a")).click();
		//looking for city&state
		d1.findElement(By.name("LocationSearch[StateId]")).sendKeys("Tamilnadu");
	//d1.findElement(By.xpath(".//*[@id='w0-filters']/td[3]/input")).sendKeys("Madurai");
		WebElement e3=d1.findElement(By.name("LocationSearch[Status]"));
		Select s3=new Select(e3);
		s3.selectByVisibleText("Active");
		
		
		Thread.sleep(2000);
	
		d1.quit();
}
}