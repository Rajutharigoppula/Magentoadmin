package Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	public WebDriver driver;

	@FindBy(xpath="")
	public WebElement x;
	
	@FindBy(xpath="//*[@id='menu-magento-catalog-catalog']")
	public WebElement catalog;
	@FindBy(xpath="(//*[text()='Products']/parent::*)[1]")
	public WebElement products;
	@FindBy(xpath="//button[@id='add_new_product-button']")
	public WebElement addnewproduct;
	@FindBy(name="product[name]")
	public WebElement producname;
	@FindBy(name="product[sku]")
	public WebElement sku;
	@FindBy(name="product[price]")
	public WebElement price;
	@FindBy(xpath="//*[@id='save-button']")
	public WebElement save;
	
	@FindBy(xpath="//div[contains(text(),'You saved the product.')]")
	public WebElement successmsg;
	
	//updation product
	@FindBy(xpath="//button[contains(text(),'Filters')]")
	public WebElement filter;
	@FindBy(xpath="//*[@name='sku']")
	public WebElement entersku;
	@FindBy(xpath="//span[contains(text(),'Apply Filters')]")
	public WebElement applyfilter;
	@FindBy(xpath="//a[@class='action-menu-item']")
	public WebElement edit;
	
	//cart rule
	@FindBy(xpath="//*[@id='menu-magento-backend-marketing']")
	public WebElement marketing;
	@FindBy(xpath="//*[text()='Catalog Price Rule']/parent::*")
	public WebElement catalogpr;
	@FindBy(xpath="//button[@id='add']")
	public WebElement addnewrule;
	@FindBy(xpath="//*[@name='name']")
	public WebElement rulename;
	@FindBy(xpath="//*[@name='description']")
	public WebElement ruledesc;
	@FindBy(xpath="//option[contains(text(),'Main Website')]")
	public WebElement websites;
	@FindBy(xpath="(//*[@name='customer_group_ids']/child::*)[1]")
	public WebElement CustomerGroups;
	@FindBy(xpath="(//*[@class='admin__collapsible-title'])[2]")
	public WebElement Actions;
	@FindBy(xpath="//*[@name='discount_amount']")
	public WebElement DiscountAmount;
	@FindBy(xpath="//button[@id='save']")
	public WebElement saverule;
	@FindBy(xpath="//div[contains(text(),'You saved the rule.')]")
	public WebElement savedrulemsg;
	
	 // operations
	 
	public Product (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void catalog()
	{
		catalog.click();
	}

	public void products()
	{
		products.click();
	}
	public void addnewproduct()
	{
		addnewproduct.click();
	}
	public void producname(String arg)
	{
		producname.sendKeys(arg);
	}
	public void sku(String arg)
	{
		sku.sendKeys(arg);
	}
	public void price(String arg)
	{
		price.sendKeys(arg);
	}
	public void save()
	{
		save.click();
	}
// product updation
	
	public void filter()
	{
		filter.click();
	}
	public void entersku(String arg)
	{
		entersku.sendKeys(arg);
	}
	public void applyfilter()
	{
		applyfilter.click();
	}
	public void edit()
	{
		edit.click();
	}
	
	public void marketing()
	{
		marketing.click();
	}
	public void catalogpr()
	{
		catalogpr.click();
	}
	public void addnewrule()
	{
		addnewrule.click();
	}
	public void rulename(String arg)
	{
		rulename.sendKeys(arg);
	}
	
	public void ruledesc(String arg)
	{
		ruledesc.sendKeys(arg);
	}
	public void websites()
	{
		websites.click();
	}
	public void CustomerGroups()
	{
		CustomerGroups.click();
	}
	public void Actions()
	{
		Actions.click();
	}
	public void DiscountAmount(String arg)
	{
		DiscountAmount.sendKeys(arg);
	}
	public void saverule()
	{
		saverule.click();
	}
	
}
