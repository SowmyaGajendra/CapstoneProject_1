package Pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
public class Base {
	

	


		public  RemoteWebDriver driver;
		
		@Parameters({"url"})
		@BeforeSuite
		public void preSetUp(String url) throws InterruptedException
		{
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//span[@role='button']")).click();
			//Thread.sleep(3000);
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}

	}

