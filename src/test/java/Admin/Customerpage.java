package Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customerpage {


public WebDriver driver;

/*@FindBy(xpath="")
public WebElement x;
*/
 @FindBy(id="username")
 public WebElement uname;

 @FindBy(id="login")
 public WebElement pswd;

 @FindBy(xpath="//*[text()='Sign in']/parent::*")
 public WebElement signin;

 @FindBy(xpath="//*[@class='action-close']")
 public WebElement popupclose;
 
 @FindBy(id="menu-magento-customer-customer")
 public WebElement customers;
 
 @FindBy(xpath="//li[@id='menu-magento-customer-customer']//li[1]")
 public WebElement Allcustomers; 
 
 @FindBy(id="add")
 public WebElement newcustomer; 
 
 
 @FindBy(name="customer[firstname]")
 public WebElement firstname; 

 @FindBy(name="customer[lastname]")
 public WebElement lastname; 
 
 @FindBy(name="customer[email]")
 public WebElement email; 
 
 @FindBy(id="save")
 public WebElement savecustomer; 
 
 
 //address locators
 
 @FindBy(xpath="//a[@id='tab_address']")
 public WebElement address; 
 
 @FindBy(xpath="//button[@class='scalable add']")
 public WebElement addnewaddress; 
 
 
 @FindBy(name="address[new_0][firstname]")
 public WebElement addfirstname; 
 
 @FindBy(name="address[new_0][lastname]")
 public WebElement addlastname; 
 
 @FindBy(name="address[new_0][street][0]")
 public WebElement addstreetname; 

 @FindBy(name="address[new_0][city]")
 public WebElement addcityname; 
 
 
 @FindBy(name="address[new_0][country_id]")
 public WebElement addcountryname; 
 
 @FindBy(name="address[new_0][region_id]")
 public WebElement addstatename;
 
 @FindBy(name="address[new_0][postcode]")
 public WebElement addpostcode; 
 
 
 @FindBy(name="address[new_0][telephone]")
 public WebElement addtelephone; 
 
 
//Customer group
	
	@FindBy(xpath="//span[text()='Customer Groups']")
	public WebElement Customergroup;
	
	@FindBy(xpath="//span[contains(text(),'Add New Customer Group')]")
	public WebElement addgroup;
	
	@FindBy(xpath="//input[@id='customer_group_code']")
	public WebElement groupname;
	
	@FindBy(xpath="//span[contains(text(),'Save Customer Group')]")
	public WebElement savegroup;
	
 // cusotmer group assign to customer
	@FindBy(xpath="//button[contains(text(),'Filters')]")
	public WebElement filter;
	@FindBy(xpath="(//input[@name='email'])[1]")
	public WebElement filteremail;
	
	@FindBy(xpath="//span[contains(text(),'Apply Filters')]")
	public WebElement applyfilter;

	@FindBy(xpath="//input[@id='idscheck1']")
	public WebElement checkbox;
	
	@FindBy(xpath="//div[@class='col-xs-2']//button[@class='action-select']")
	public WebElement actions;
	
	@FindBy(xpath="(//*[@class='action-menu-item'])[4]")
	public WebElement assinggroup;
	
	//Test1group
	
	@FindBy(xpath="//button[@class='action-primary action-accept']")
	public WebElement ok;
	
	@FindBy(xpath="(//*[@class='action-menu-item'])[9]")
	public WebElement grp;
	
	
	
 // operations
 
public Customerpage (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void uname(String arg)
{
	uname.sendKeys(arg);
}

public void pswd(String arg)
{
	pswd.sendKeys(arg);
}

public void signin()
{
	signin.click();
}

public void popupclose()
{
	popupclose.click();
}


public void customers()
{
	customers.click();
}

public void Allcustomers()
{
	Allcustomers.click();
}
public void newcustomer()
{
	newcustomer.click();
}

public void firstname(String arg)
{
	firstname.sendKeys(arg);
}

public void lastname(String arg)
{
	lastname.sendKeys(arg);
}
public void email(String arg)
{
	email.sendKeys(arg);
}
public void savecustomer()
{
	savecustomer.click();
}

// address operations

public void address()
{
	address.click();
}

public void addnewaddress()
{
	addnewaddress.click();
}

public void addfirstname(String arg)
{
	addfirstname.sendKeys(arg);
}

public void addlastname(String arg)
{
	addlastname.sendKeys(arg);
}

public void addstreetname(String arg)
{
	addstreetname.sendKeys(arg);
}

public void addcityname(String arg)
{
	addcityname.sendKeys(arg);
}

public void addcountryname()
{
	addcountryname.click();;
}

public void addstatename()
{
	addstatename.click();
}

public void addpostcode(String arg)
{
	addpostcode.sendKeys(arg);
}

public void addtelephone(String arg)
{
	addtelephone.sendKeys(arg);
}

public void Customergroup()
{
	Customergroup.click();
}

public void addgroup()
{
	addgroup.click();
}
public void groupname(String arg1)
{
	groupname.sendKeys(arg1);
}

public void savegroup()
{
	savegroup.click();
}

public void filter()
{
	filter.click();
}
public void filteremail(String arg)
{
	filteremail.sendKeys(arg);
}
public void applyfilter()
{
	applyfilter.click();
}

public void checkbox()
{
	checkbox.click();
}
public void actions()
{
	actions.click();
}
public void assinggroup()
{
	assinggroup.click();
}


public void ok()
{
	ok.click();
}
public void grp()
{
	grp.click();
}










}