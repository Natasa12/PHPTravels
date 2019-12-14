package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCustomers extends BasicPage {

	private By account = By.cssSelector("#social-sidebar-menu > li:nth-child(5) > a");
	private By customers = By.xpath("//*[@id=\"ACCOUNTS\"]/li[3]/a");
	private By edit = By
			.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[10]/td[8]/span/a[1]");
	private By fname = By.name("fname");
	private By lname = By.name("lname");
	private By email = By.name("email");
	private By password = By.name("password");
	private By mobile = By.name("mobile");
	
	private By country = By.xpath("//*[@id=\"s2id_autogen1\"]/a/span[1]");
	private By input= By.cssSelector("input.select2-input");
	
	private By address1 = By.name("address1");
	private By address2 = By.name("address2");
	private By status = By.cssSelector("select.form-control");
	private By checkbox = By.cssSelector("label input");
	private By submit = By.cssSelector("div.panel-footer button");

	
	private By search = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/a");
	private By searchFiled= By.cssSelector("input.xcrud-searchdata.xcrud-search-active.input-small.form-control");
	private By go = By.cssSelector("a.xcrud-action.btn.btn-primary");
	
	private By noCustomers= By.tagName("td");
	
	public TravelsCustomers(WebDriver driver) {
		super(driver);
	}

	public void AccountCustomers() throws InterruptedException {
		WebElement a = this.driver.findElement(account);
		a.click();
		WebElement c = this.driver.findElement(customers);
		c.click();
		Thread.sleep(2000);
	}

	public void ClickOnEdit() throws InterruptedException {
		WebElement e = this.driver.findElement(edit);
		e.click();
		Thread.sleep(2000);
	}

	public void setFName(String firstname) {
		this.driver.findElement(this.fname).clear();
		this.driver.findElement(this.fname).sendKeys(firstname);
	}

	public void setLName(String lastname) {
		this.driver.findElement(this.lname).clear();
		this.driver.findElement(this.lname).sendKeys(lastname);
	}

	public void setEmail(String Email) {
		this.driver.findElement(this.email).clear();
		this.driver.findElement(this.email).sendKeys(Email);
	}

	public void setPassword(String Password) {
		this.driver.findElement(this.password).clear();
		this.driver.findElement(this.password).sendKeys(Password);
	}

	public void setMoile(String Mobile) {
		this.driver.findElement(this.mobile).clear();
		this.driver.findElement(this.mobile).sendKeys(Mobile);
	}

	public void setCountry(String Country) 
	{
		WebElement selectElement = this.driver.findElement(this.country);
		selectElement.click();
		WebElement i= this.driver.findElement(this.input);
		i.sendKeys("Serbia");
		i.sendKeys(Keys.ENTER);
	}

	public void setAddress1(String Address1)
	{
		this.driver.findElement(this.address1).clear();
		this.driver.findElement(this.address1).sendKeys(Address1);
	}

	public void setAddress2(String Address2) 
	{
		this.driver.findElement(this.address2).clear();
		this.driver.findElement(this.address2).sendKeys(Address2);
	}

	public void setStatus(String Status)
	{
		WebElement selectElement = this.driver.findElement(this.status);
		Select select = new Select(selectElement);
		List<WebElement> allOptions = select.getOptions();
		select.selectByVisibleText(Status);
	}

	public void setCheckBox() throws InterruptedException
	{
		WebElement check=this.driver.findElement(this.checkbox);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", check);
		Thread.sleep(1000);
		check.click();
	}

	public void clickSubmit() throws InterruptedException
	{
		WebElement submit=this.driver.findElement(this.submit);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", submit);
		Thread.sleep(1000);
		submit.click();
	} 

	public void setInformation(String FirstName, String LastName, String Email, String Password, String Mobile, String Country,String Address1, String Address2, String Status) throws Exception
	{
		this.setFName(FirstName);
	    Thread.sleep(3000);
	    
		this.setLName(LastName);
		Thread.sleep(3000);
		
		this.setEmail(Email);
		Thread.sleep(3000);

		this.setPassword(Password);
		Thread.sleep(3000);
		this.setMoile(Mobile);
		Thread.sleep(3000);
		
		this.setCountry(Country);
		Thread.sleep(3000);
		
		this.setAddress1(Address1);
		Thread.sleep(3000);
		
		this.setAddress2(Address2);
		Thread.sleep(3000);
		
		this.setStatus(Status);
		Thread.sleep(3000);
		
     }
	public void searchGo(String name) throws InterruptedException
	{
		this.driver.findElement(this.search).click();
		Thread.sleep(1000);
		this.driver.findElement(this.searchFiled).sendKeys(name);
		Thread.sleep(2000);
		this.driver.findElement(this.go).click();
		Thread.sleep(2000);
		
	}
	boolean found = true;
	public boolean foundCustomers()
	{
		WebElement f= this.driver.findElement(this.noCustomers);
		if(f.getText().contains("Entries not found"))
		{
			found=false;
		}
		return found;
	}
}
