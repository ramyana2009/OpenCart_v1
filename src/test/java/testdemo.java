import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testdemo {

	@Test
	public void launchapp()
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Application\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver(); 

// Maximize the browser 
// using maximize() method 
driver.manage().window().maximize(); 

// Launching website 
driver.get("https://www.geeksforgeeks.org/"); 
	}

}
