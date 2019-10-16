package AdminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Orders
{

	public WebDriver driver;

	
	
	
	
	// operations
	 
		public Orders (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
	
	
	
	
	
}
