package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsMenu extends BasicPage{

	

//	private By element = By.cssSelector("#social-sidebar-menu > li");
//	public TravelsMenu(WebDriver driver) {
//		super(driver);
//	}
//	public List<WebElement> getMenu()
//	{
//		return this.driver.findElements(element);
//	}
//
//	public void goToMenu() throws InterruptedException
//	{
//		List<WebElement> lista= this.getMenu();
//		
//		lista.get(0).click();
//		Thread.sleep(3000);
//		lista.get(1).click();
//		Thread.sleep(3000);
//		
//	}
//	
	private By dashboard= By.xpath("//*[@id=\"social-sidebar-menu\"]/li[1]/a");
	private By updates= By.xpath("//*[@id=\"social-sidebar-menu\"]/li[2]/a");
	private By modules = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[3]/a");
	private By tours = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[9]/a");
	private By cars = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[10]/a");
	private By coupons = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[15]/a");
	private By newsletter= By.xpath("//*[@id=\"social-sidebar-menu\"]/li[16]/a");
	private By bookings = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[17]/a");
	private By addTours= By.xpath("//*[@id=\"Tours\"]/li[2]/a");
	private By goCars=By.xpath("//*[@id=\"Cars\"]/li[1]/a");
	private By goCarsExtras= By.xpath("//*[@id=\"Cars\"]/li[2]/a");
	
	public TravelsMenu(WebDriver driver) {
		super(driver);
	}

	public void goToDashboard() throws InterruptedException
	{
		WebElement d= this.driver.findElement(dashboard);
		d.click();
		Thread.sleep(1000);
	}
	public void goToUpdates() throws InterruptedException
	{
		WebElement u= this.driver.findElement(updates);
		u.click();
		Thread.sleep(1000);
	}
	
	public void goToModules() throws InterruptedException
	{
		WebElement m = this.driver.findElement(modules);
		m.click();
		Thread.sleep(1000);
	}
	public void goToTours() throws InterruptedException
	{
		WebElement t= this.driver.findElement(tours);
		t.click();
		Thread.sleep(1000);
	}
	public void goToCars() throws InterruptedException
	{
		WebElement c= this.driver.findElement(cars);
		c.click();
		Thread.sleep(1000);
	}
	public void goToCoupons() throws InterruptedException
	{
		WebElement c= this.driver.findElement(coupons);
		c.click();
		Thread.sleep(1000);
	}
	public void goToNewsletter() throws InterruptedException
	{
	WebElement n = this.driver.findElement(newsletter);
	n.click();
	Thread.sleep(1000);
	}
	public void goToBookings() throws InterruptedException
	{
		WebElement b = this.driver.findElement(bookings);
		b.click();
		Thread.sleep(1000);
	}
	public void goToAddTours() throws InterruptedException
	{
		WebElement a= this.driver.findElement(addTours);
		a.click();
		Thread.sleep(1000);
	}
	public void goCarsCars() throws InterruptedException
	{
		WebElement cc= this.driver.findElement(goCars);
		cc.click();
		Thread.sleep(1000);
	}
	public void goCarsExtras() throws InterruptedException
	{
		WebElement e= this.driver.findElement(goCarsExtras);
		e.click();
		Thread.sleep(1000);
	}
//	private By menu= By.cssSelector("div.social-sidebar ul i");
//	public TravelsMenu(WebDriver driver) {
//		super(driver);
//	}
//	public List<WebElement> getMenu()
//	{
//		return this.driver.findElements(menu);
//	}
//	public  void getMenuMenu() throws Exception
//	{
//		List<WebElement> lista= this.getMenu();
//		
//
//		lista.get(0).click();//dashboard
//		Thread.sleep(3000);
//		lista.get(1).click();//updates
//		Thread.sleep(3000);
//		lista.get(2).click();//modules
//		Thread.sleep(3000);
//		lista.get(8).click();//tours
//		Thread.sleep(3000);
//		List<WebElement> tourslist= this.driver.findElements(By.cssSelector("#Tours a"));
//		tourslist.get(1).click();//add new 
//		Thread.sleep(3000);
//		lista.get(9).click();//cars
//		
//	}


	
}
