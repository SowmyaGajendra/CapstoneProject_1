package Pages;

import Pack1.Base;


	import org.openqa.selenium.remote.RemoteWebDriver;

	import Pack1.Base;

	public class AfterAddToCartPage extends Base
	
	{
	

		public AfterAddToCartPage(RemoteWebDriver driver) {
			this.driver=driver;
		}
		
		public void verifyTheProductisAddedTOCartORNot()
		{
			String viewCartURl=driver.getCurrentUrl();
			if(viewCartURl.contains("viewcart"))
			{
				System.out.println("Product added to the card sucessuflly");
			}
			else
			{
				System.out.println("Produt not added to the card");
			}
		}
	}
		

	


