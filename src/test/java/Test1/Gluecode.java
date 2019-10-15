package Test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Admin.Customerpage;
import Admin.Product;
import Frontend.Homepage;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gluecode {

	
	public WebDriver driver;
	public Homepage Hp;
	public Customerpage Cp;
	public Scenario S; 
	public Properties Pro;
	public WebDriverWait wait;
	public Product Pd;
                                                                                                                                                                                                   
	@Before
	public void method1 (Scenario s) throws IOException 
		{
		this.S=s;
		
		Pro = new Properties();
		FileInputStream fip = new FileInputStream("src\\test\\resources\\Propertyfile\\Configuation.properties");
		Pro.load(fip);
		}
		
	
	@Given("^open application with \"([^\"]*)\"$")
	public void method2(String br) throws InterruptedException
	  {
		if(br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Pro.getProperty("chromedriver"));					
			driver= new ChromeDriver();	
		}
		
		else if(br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", Pro.getProperty("firefoxdriver"));					
			driver = new FirefoxDriver();

		Thread.sleep(3000);
		}	
				
    driver.manage().window().maximize();			
    Hp = new Homepage(driver);
    Cp = new Customerpage(driver);
    Pd = new Product(driver);
    
	driver.get(Pro.getProperty("url2"));
	wait = new WebDriverWait(driver,50);
	  }
	  
	@When("^create new customer \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method3(String arg,String arg1, String arg2, String arg3, String arg4) throws InterruptedException
	{
	Hp.create();
	Thread.sleep(2000);
	Hp.fname(arg);
	Thread.sleep(2000);
	Hp.lname(arg1);
	Thread.sleep(2000);
	Hp.email(arg2);
	Thread.sleep(2000);
	Hp.password(arg3);
	Thread.sleep(2000);
	Hp.psdcnf(arg4);
	Thread.sleep(5000);
	Hp.create();
	
	}
	
	
	@When("^create new customer from admin \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method4(String arg1, String arg2, String arg3,String arg4, String arg5 ) throws InterruptedException
	{
		Cp.uname(arg1);
		Thread.sleep(2000);
		Cp.pswd(arg2);
		Thread.sleep(2000);
		Cp.signin();
		Thread.sleep(3000);
		Cp.popupclose();
		Thread.sleep(3000);
		Cp.customers();
		Thread.sleep(2000);
		Cp.Allcustomers();
		Thread.sleep(2000);
		Cp.newcustomer();
		Thread.sleep(2000);
		Cp.firstname(arg3);
		Thread.sleep(2000);
		Cp.lastname(arg4);
		Thread.sleep(2000);
		Cp.email(arg5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(3000);
	}
	@And("^click on save customer$")
	public void method7() throws InterruptedException
	{
		Thread.sleep(2000);
		Cp.savecustomer();
						
	}
	
	@And("^close the browser$")
	public void method5() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
	@And("^create address \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method6(String arg3, String arg4, String arg5, String arg6) throws InterruptedException
	{
		
		Cp.address();
		Thread.sleep(2000);
		Cp.addnewaddress();
		Thread.sleep(5000);
		Cp.addstreetname(arg3);
		Cp.addcityname(arg4);
		Select state = new Select(Cp.addstatename);
		state.selectByVisibleText("New York");
		Cp.addpostcode(arg5);
		Cp.addtelephone(arg6);
		Thread.sleep(5000);
	}
	 
	
	@Then("^login in to admin \"(.*)\" and \"(.*)\"$")
	public void method4(String arg1, String arg2) throws InterruptedException
	{
		Cp.uname(arg1);
		Thread.sleep(2000);
		Cp.pswd(arg2);
		Thread.sleep(2000);
		Cp.signin();
		Thread.sleep(3000);
		Cp.popupclose();
		Thread.sleep(4000);
	}
	
	@When("^Create customer group \"(.*)\"$")
	public void method4(String arg1) throws InterruptedException
	{
		Cp.customers();
		Thread.sleep(2000);
		Cp.Customergroup();
		Thread.sleep(2000);
		Cp.addgroup();
		Thread.sleep(2000);
		Cp.groupname(arg1);
		Thread.sleep(2000);
		Cp.savegroup();
	}
	
	@Then("^Assign customer group to a customer \"(.*)\"$")
	public void method10(String arg1) throws InterruptedException
	{
		Cp.customers();
		Thread.sleep(2000);
		Cp.Allcustomers();
		Thread.sleep(4000);
		Cp.filter();
		Thread.sleep(2000);
		Cp.filteremail.clear();
		Thread.sleep(3000);
		Cp.filteremail(arg1);
		Cp.applyfilter();
		Thread.sleep(3000);
		Cp.checkbox();
		Thread.sleep(2000);
		Cp.actions();
		Thread.sleep(2000);
		Cp.assinggroup();
		Thread.sleep(2000);
		Cp.grp();
		Thread.sleep(6000);
		Cp.ok();
		
	}

	@Then("^Create a product \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method12(String arg1, String arg2,String arg3) throws InterruptedException
	{
		
	Pd.catalog();	Thread.sleep(2000);
	Pd.products();	Thread.sleep(4000);
	Pd.addnewproduct();	Thread.sleep(4000);
	Pd.producname(arg1);	Thread.sleep(2000);
	Pd.sku.clear();	Thread.sleep(2000);
	Pd.sku(arg2);
	Pd.price(arg3);	Thread.sleep(2000);
	Pd.save();
	wait.until(ExpectedConditions.visibilityOf(Pd.successmsg));

	}
	@Then("^Update a product \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method13(String arg1, String arg2,String arg3,String arg4) throws InterruptedException
	{
		
	Pd.catalog();Thread.sleep(2000);
	Pd.products();Thread.sleep(4000);
	Pd.filter();Thread.sleep(2000);
	Pd.entersku.clear();
	Pd.entersku(arg1);
	Pd.applyfilter();Thread.sleep(4000);
	Pd.edit();Thread.sleep(3000);
	Pd.producname.clear();
	Pd.producname(arg2);
	Pd.sku.clear();	Thread.sleep(2000);
	Pd.sku(arg3);	Thread.sleep(2000);
	Pd.price.clear();Thread.sleep(2000);
	Pd.price(arg4);	Thread.sleep(2000);
	Pd.save();	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(Pd.successmsg));
	
	}
	

	@Then("^Create a catalog rule \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method11(String arg1,String arg2,String arg3) throws InterruptedException
	{
	Pd.marketing();Thread.sleep(2000);
	Pd.catalogpr();Thread.sleep(2000);
	Pd.addnewrule();Thread.sleep(4000);
	Pd.rulename(arg1);Thread.sleep(2000);
	Pd.ruledesc(arg2);
	Pd.websites();
	Pd.CustomerGroups();
	Pd.Actions();Thread.sleep(2000);
	Pd.DiscountAmount(arg3);Thread.sleep(2000);
	Pd.saverule();
	wait.until(ExpectedConditions.visibilityOf(Pd.savedrulemsg));
		
	}
	
	@Then("^Create a cart rule \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method14(String arg1,String arg2,String arg3,String arg4) throws InterruptedException
	{
	Pd.marketing();Thread.sleep(2000);
	Pd.cartpr();Thread.sleep(2000);
	Pd.addnewrule();Thread.sleep(4000);
	Pd.rulename(arg1);Thread.sleep(2000);
	Pd.ruledesc(arg2);
	Pd.websites();
	Pd.CustomerGroups();
	Select s = new Select(Pd.coupontype);
	s.selectByVisibleText("Specific Coupon");
	Thread.sleep(2000);
	Pd.couponcode(arg3);
	Pd.Actions();Thread.sleep(2000);
	Pd.DiscountAmount(arg4);Thread.sleep(2000);
	Pd.saverule();
	wait.until(ExpectedConditions.visibilityOf(Pd.savedrulemsg));

	}
}
