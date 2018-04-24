package add_client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_Package {
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
	//package
	d1.findElement(By.id("package")).click();
	//show
	WebElement e1=d1.findElement(By.id("drop_page"));
	e1.click();
	Select s1=new Select(e1);
	s1.selectByVisibleText("20");
	Thread.sleep(2000);
	//view
	d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr[1]/td[8]/a[1]/span")).click();
	//edit
	d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div[2]/a[2]")).click();
	//update
	d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/button")).click();
	Thread.sleep(2000);
	//add new
	d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/a")).click();
	WebElement e2=d1.findElement(By.name("Package[ApplicationId]"));
	e2.click();
	Select s2=new Select (e2);
	s2.selectByVisibleText("nTracky");
	WebElement e3=d1.findElement(By.name("Package[ScreenId]"));
	e3.click();
	Select s3=new Select(e3);
	s3.selectByVisibleText("Student Details");
	WebElement e4=d1.findElement(By.xpath(".//*[@id='package-typeid']"));
	e4.click();
	Select s4=new Select(e4);
	s4.selectByVisibleText("Impression");
	d1.findElement(By.name("Package[PackageName]")).sendKeys("Test Package");
	d1.findElement(By.name("Package[Price]")).sendKeys("200");
	d1.findElement(By.xpath(".//*[@id='mydiv']/div[1]/div/div/span[3]")).click();
	d1.findElement(By.xpath(".//*[@id='form-signup']/div/div/div/div[2]/div/a")).click();
	//looking for package
	Thread.sleep(2000);
	d1.findElement(By.name("PackageSearch[ApplicationId]")).sendKeys("nShoppy");
	d1.findElement(By.name("PackageSearch[ScreenId]")).sendKeys("Splash");
	d1.findElement(By.name("PackageSearch[TypeId]")).sendKeys("Impression");
	d1.findElement(By.name("PackageSearch[PackageName]")).sendKeys("Test Package");
	d1.findElement(By.name("PackageSearch[Price]")).sendKeys("123");
	WebElement e5=d1.findElement(By.name("PackageSearch[Status]"));
	e5.click();
	Select s5=new Select(e5);
	s5.selectByVisibleText("Active");
	d1.quit();
}
}