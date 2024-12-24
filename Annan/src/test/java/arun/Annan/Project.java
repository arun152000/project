package arun.Annan;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String Homepage=driver.getTitle();
		System.out.println(Homepage);
		driver.getCurrentUrl();
		WebElement ak=driver.findElement(By.xpath("//b[text()=\"DemoSalesManager\"]"));
		String username=ak.getText();
		System.out.println(username);
		String expec="DemoSalesManager";
		if(username.equalsIgnoreCase(expec)) {
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement obj=driver.findElement(By.cssSelector("#createLeadForm_companyName"));
		obj.sendKeys("VALLINAYAGAMS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vallinayagam");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9080067588");
		driver.findElement(By.cssSelector("input[type=submit][name=submitButton]")).click();
		
		String str="VALLINAYAGAMS";
		String  name=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String[] split=name.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			if((split[i]).equalsIgnoreCase(str)){
				System.out.println(split[i]+" ");
				System.out.println("test case passed sucess");
			}
			
		}
		driver.quit();
	}
}

		
		