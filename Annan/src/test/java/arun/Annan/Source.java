package arun.Annan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Source {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		WebElement obj=driver.findElement(By.xpath("//*[@id=\"ext-gen252\"]"));
		JavascriptExecutor allu = (JavascriptExecutor) driver;
		allu.executeScript("arguments[0].value='VALLINAYAGAM';", obj);
		WebElement email=	driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", email);
		WebElement ojj=driver.findElement(By.cssSelector(".x-grid3-cell-inner.x-grid3-col-partyId"));
		JavascriptExecutor cse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", ojj);
	}
}