package TestCase;



	import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

	import Pack1.Base;
	import Pages.Flipkart_HomePage;

	public class RunFlipKart extends Base
	{
	

		@Test
		public void runTestCaseFlipkart() throws InterruptedException
		{
			
			Flipkart_HomePage flip=new Flipkart_HomePage(driver);
			flip.closePopUpWindow()
			.verifyFlikartLogo()
			.serachForTheProduct()
			.clickOnTheFirstResult()
			.enterPinCode()
			.clickOnPINCheck()
			.clickOnGoToCart()
			.verifyTheProductisAddedTOCartORNot();
		}
	}


