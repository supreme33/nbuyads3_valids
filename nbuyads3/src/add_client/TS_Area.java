package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_Area {
	@Test
	public void Testcase_area() throws InterruptedException{
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("nbuyads.appinstitute.in/admin");
		//login
		d1.findElement(By.id("adminloginform-email")).sendKeys("balaji2469@gmail.com");
		d1.findElement(By.id("adminloginform-password")).sendKeys("4972gWBwBC");
		d1.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		//area
		d1.findElement(By.id("locationarea")).click();
	
		//add new
		d1.findElement(By.cssSelector("[class='btn sbold green']")).click();
		WebElement e1=d1.findElement(By.name("LocationArea[StateId]"));
		e1.click();
		Select s1=new Select(e1);
		s1.selectByIndex(1);
		WebElement e2=d1.findElement(By.name("LocationArea[LocationId]"));
		e2.click();
		Select s2=new Select(e2);
		s2.selectByIndex(1);
		d1.findElement(By.name("LocationArea[AreaName]")).sendKeys("tharamani");
		d1.findElement(By.xpath(".//*[@id='mydiv']/div[1]/div/div/span[2]")).click();
		//cancel
		d1.findElement(By.xpath(".//*[@id='form-signup']/div/div/div/div[2]/div/a")).click();
		
		//show
		WebElement e3=d1.findElement(By.id("drop_page"));
		e3.click();
		Select s3=new Select(e3);
		s3.selectByVisibleText("20");
		//looking for area
		d1.findElement(By.name("LocationAreaSearch[StateId]")).sendKeys("Tamilnadu");
		d1.findElement(By.name("LocationAreaSearch[LocationId]")).sendKeys("Chennai");
		d1.findElement(By.name("LocationAreaSearch[AreaName]")).sendKeys("Tnagar");
		WebElement e4=d1.findElement(By.xpath(".//*[@id='w0-filters']/td[5]/select"));
		e4.click();
		Select s4=new Select(e4);
		s4.selectByVisibleText("In-active");
		Thread.sleep(2000);
		
		//view
//		WebElement e5=d1.findElement(By.cssSelector("span[class='glyphicon glyphicon-pencil']"));
//		e5.click();
		
		//view
		d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr/td[6]/a[1]/span")).click();
		//edit
		Thread.sleep(2000);
		d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div[2]/a[2]")).click();
		d1.findElement(By.name("LocationArea[StateId]")).sendKeys(Keys.ENTER);
		d1.findElement(By.name("LocationArea[LocationId]")).sendKeys(Keys.ENTER);
		d1.findElement(By.name("LocationArea[AreaName]")).sendKeys("Chrompet");
		d1.quit();
}
}