package Frontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public WebDriver driver;
	
	/*@FindBy(xpath="")
	public WebElement x;
	*/
	
	@FindBy(xpath="(//*[text()='Create an Account'])[1]")
	public WebElement createnewaccout;
	
	@FindBy(id="firstname")
	public WebElement fname;
	
	@FindBy(id="lastname")
	public WebElement lname;
	
	@FindBy(id="email_address")
	public WebElement email;
	
	@FindBy(id="password")
	public WebElement psd;
	
	@FindBy(id="password-confirmation")
	public WebElement psdcnf;
	
	@FindBy(xpath="//*[@title='Create an Account']")
	public WebElement createbtn;
	
	
	
	
	
	
	// operations
	
	public Homepage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	// forgot username and password
		
	
		
		public void create()
		{
			createnewaccout.click();
						
		}
	
		public void fname(String arg)
		{
			fname.sendKeys(arg);
		}
		
		public void lname(String arg)
		{
			lname.sendKeys(arg);
		}
		
		public void email(String arg)
		{
			email.sendKeys(arg);
		}
	
		
		public void password(String arg)
		{
			psd.sendKeys(arg);
		}
		
		public void psdcnf(String arg)
		{
			psdcnf.sendKeys(arg);
		}
		
		
		public void psdcnf()
		{
			createbtn.click();
		}
		
		
		
		
		
}
