package arun.Annan;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	@Test(groups="socket")
	public void Home(){
		System.out.println("arun");
	}
	@Test(groups="arun")
	public void House() {
		System.out.println("kumar");
	}
	@Test(groups= {"arun","socket"})
	public void rent() {
		System.out.println("valli");
	}
	@Test(groups="term")
	public void real() {
		System.out.println("walter");
	}
}
		
