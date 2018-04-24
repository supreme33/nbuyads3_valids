package add_client;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS_categories {
	@Test
	public void Testcase_categories() throws InterruptedException{
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("nbuyads.appinstitute.in/admin");
		//login
		d1.findElement(By.id("adminloginform-email")).sendKeys("balaji2469@gmail.com");
		d1.findElement(By.id("adminloginform-password")).sendKeys("4972gWBwBC");
		d1.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		//categories
		d1.findElement(By.id("categories")).click();
		//new
		d1.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/a")).click();
		d1.findElement(By.name("Categories[CategoryName]")).sendKeys("Computers");
		d1.findElement(By.xpath(".//*[@id='mydiv']/div[1]/div/div/span[2]")).click();
		d1.findElement(By.name("signup-button")).click();
		Thread.sleep(2000);
		//view
		d1.findElement(By.xpath(".//*[@id='w0']/table/tbody/tr[3]/td[4]/a[1]/span")).click();
		//edit
		d1.findElement(By.cssSelector("a[class='btn btn-success']")).click();
		d1.findElement(By.name("Categories[CategoryName]")).sendKeys("su");
		d1.findElement(By.name("signup-button")).click();
		Thread.sleep(2000);
		//looking for categories
		d1.findElement(By.name("CategoriesSearch[CategoryName]")).sendKeys("Toys");
		WebElement e1=d1.findElement(By.xpath(".//*[@id='w0-filters']/td[3]/select"));
		e1.click();
		Select s1=new Select(e1);
		s1.selectByVisibleText("Active");
		WebElement e2=d1.findElement(By.cssSelector("btn btn-danger reset"));
		e2.click();
		//show
		WebElement e3=d1.findElement(By.id("drop_page"));
		e3.click();
		Select s2=new Select(e3);
		s2.selectByVisibleText("20");
		Thread.sleep(2000);
		d1.quit(); 
	}

}
