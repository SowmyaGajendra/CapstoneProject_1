package Pages;



	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.RemoteWebDriver;

	import Pack1.Base;

	public class SearchResultsPage extends Base
	{
	

		public SearchResultsPage(RemoteWebDriver driver) {
			this.driver=driver;
		}
		
		public AfterclickOnFirstProductNextWindowPage clickOnTheFirstResult()
		{
			driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
			Set<String> windowHandle = driver.getWindowHandles();
			List<String> window=new ArrayList<String>(windowHandle);
			driver.switchTo().window(window.get(1));
			return new AfterclickOnFirstProductNextWindowPage(driver);
		}

	}


