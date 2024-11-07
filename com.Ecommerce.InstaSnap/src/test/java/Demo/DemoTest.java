package Demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	@Test
	public void verify() throws IOException
	{
	 //configure the browser
		WebDriverManager.chromedriver().setup();
	//Launch browser
		WebDriver driver=new ChromeDriver();
		
	//Navigate to the Application
		driver.get("https://www.selenium.dev/");
		WorkbookFactory.create(false);
	}
}
