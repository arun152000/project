package arun.Annan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	    String actual=driver.getTitle();
	    System.out.println(actual);
	    String Expected="Test Login | Practice Test Automation";
	    if(actual.equalsIgnoreCase(Expected)) {
	    driver.findElement(By.cssSelector("#username")).sendKeys("student");
	    driver.findElement(By.cssSelector("input[type=\"password\"][name=\"password\"]")).sendKeys("Password123");
	    driver.findElement(By.cssSelector(".btn")).click();
	    }
	    else {
	    	System.out.println("page title validation is not validated");
	    }
	    driver.close();

	}

}
