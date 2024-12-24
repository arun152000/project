package arun.Annan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Depandsonmethod {
    @Test()
	public void arun() {
    	System.out.println("arj");

	}
    @Test(dependsOnMethods="arun")
    public void Manoj() {
    	System.out.println("Man");
    }
    @Test(dependsOnMethods="Manoj")
    public void Akko() {
    	System.out.println("akko");
    }
    @Test(dependsOnMethods="Akko")
    public void allu() {
    	System.out.println("akko");
    }
    @Test()
    public void arwn() {
    	System.out.println("devan");
    }
}
