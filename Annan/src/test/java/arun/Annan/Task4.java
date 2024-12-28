package arun.Annan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("http://omayo.blogspot.com/");
	    String actual=driver.getTitle();
	    System.out.println(actual);
	    String expected="omayo (QAFox.com)";
	    if(actual.equalsIgnoreCase(expected)) {
	    	System.out.println("pass");
	    	
	    }
	    else {
	    	System.out.println("fail");
	    }
	    String current=driver.getCurrentUrl();
    	System.out.println(current);
    	driver.close();
    	
	}
	    

}
