package arun.Annan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	    driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("DemoSalesManager");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
	    driver.findElement(By.cssSelector(".decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    String Homepage=driver.getTitle();
	    System.out.println(Homepage);
	    driver.close();
	}
}
