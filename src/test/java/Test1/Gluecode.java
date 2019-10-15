package Test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Admin.Customerpage;
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
	
	
	
}
