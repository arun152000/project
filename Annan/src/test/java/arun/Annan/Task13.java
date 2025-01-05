package arun.Annan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("https://www.saucedemo.com/");
	    String url=driver.getCurrentUrl();
	    WebElement linkedInPwd = driver.findElement(By.id("password"));
		  
		WebElement linkedInEmail = driver.findElement(with(By.tagName("input")).above(linkedInPwd));
		  
		linkedInEmail.sendKeys("standard_user");
		WebElement linkedInPwd1 = driver.findElement(By.id("user-name"));
		  
		WebElement linkedInEmail1 = driver.findElement(with(By.tagName("input")).below(linkedInPwd1));
		  
		linkedInEmail1.sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		driver.findElement(By.cssSelector("#checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Arunkumar");
		driver.findElement(By.cssSelector("#last-name")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("625004");
		driver.findElement(By.name("continue")).click();
		String print=driver.findElement(By.cssSelector(".summary_total_label")).getText();
		System.out.println(print);
		driver.findElement(By.id("finish")).click();
		String actual=driver.findElement(By.cssSelector(".complete-header")).getText();
		System.out.println(actual);
		driver.close();
		  

	}

}
