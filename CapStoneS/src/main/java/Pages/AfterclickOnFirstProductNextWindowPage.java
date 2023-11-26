package Pages;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.RemoteWebDriver;

	import Pack1.Base;

	public class AfterclickOnFirstProductNextWindowPage extends Base
	{
		

		public AfterclickOnFirstProductNextWindowPage(RemoteWebDriver driver) {
			this.driver=driver;
		}
		
		public AfterclickOnFirstProductNextWindowPage enterPinCode()
		{
			driver.findElement(By.id("pincodeInputId")).sendKeys("560068");
			return this;
		}
		
		public AfterclickOnFirstProductNextWindowPage clickOnPINCheck() throws InterruptedException
		{
			driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
			Thread.sleep(3000);
			return this;
		}
		
		public AfterAddToCartPage clickOnGoToCart() throws InterruptedException
		{
			WebElement addCartElement = driver.findElement(By.xpath("(//li[@class='col col-6-12'])[1]"));
			addCartElement.click();
			Thread.sleep(2000);
			return new AfterAddToCartPage(driver);
			
		}

	}


