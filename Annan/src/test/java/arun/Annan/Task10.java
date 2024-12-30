package arun.Annan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	    String Actual=driver.getTitle();
	    System.out.println(Actual);
	    String Actualurl=driver.getCurrentUrl();
	    String Expected="https://practicetestautomation.com/practice-test-login/";
	    if(Actualurl.equalsIgnoreCase(Expected)) {
	    	
	    	driver.findElement(By.cssSelector("#username")).sendKeys("incorrectUser");
	 	    driver.findElement(By.cssSelector("input[type=\"password\"][name=\"password\"]")).sendKeys("Password123");
	 	    driver.findElement(By.cssSelector(".btn")).click();
	 	    String Text=driver.findElement(By.cssSelector(".show")).getText();
	 	    System.out.println(Text);
	 	    driver.close();
	    }
	    else {
	    	System.out.println("failed");
	    }

	}

}
