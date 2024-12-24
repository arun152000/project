package arun.Annan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class SamplePrograms{
	@Test(dataProvider="logistics")
	public void Task1(String user,String email,String current,String permamant) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys(user);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("currentAddress")).sendKeys(current);
		driver.findElement(By.id("permanentAddress")).sendKeys(permamant);
		driver.quit();
	}
	@DataProvider(name="logistics")
	public String[][] arun(){
		String[][] data=new String[2][4];
		data[0][0]="arun2000";
		data[0][1]="arunabi1000";
		data[0][2]="bykaara";
		data[0][3]="byata";
		
		data[1][0]="arun2000";
		data[1][1]="arunabi1000";
		data[1][2]="bykaara";
		data[1][3]="valli";
		return data;
	}
}

