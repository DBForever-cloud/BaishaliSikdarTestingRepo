package BaseClassPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setup(String browserName)
	{
		if(browserName.equals("chrome")) {
			this.driver= new ChromeDriver();
		}
		else if(browserName.equals("edge")) {
			this.driver= new EdgeDriver();
		}
		else {
			this.driver= new FirefoxDriver();

		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}

