package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCarsExtras extends BasicPage {

	
	
	private By add= By.cssSelector("a.btn.btn-success.xcrud-action");
	private By search= By.cssSelector(".xcrud-search-toggle.btn.btn-default");
	List<WebElement> row= driver.findElements(By.cssSelector(".xcrud-row"));
	public TravelsCarsExtras(WebDriver driver) {
		super(driver);
		}
	
	public void GoToAdd() throws Exception
	{
		WebElement a= this.driver.findElement(add);//klik na add
		a.click();
		Thread.sleep(2000);
		
		WebElement thumb = driver.findElement(By.className("xcrud-upload"));//dodavanje slike u thumb
		thumb.sendKeys("D:\\Java1\\ProjekatPHPTravels\\volan.jpg");
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.cssSelector(".col-sm-9 .xcrud-input.form-control"));//dodavanje name
		name.sendKeys("Driving force");
		Thread.sleep(2000);
		
		WebElement selectElement= driver.findElement(By.tagName("select"));// selektovanje statusa
		 Select select = new Select(selectElement);
	        List<WebElement> allOptions = select.getOptions();
	        select.selectByVisibleText("Yes");
	        Thread.sleep(2000);
		
	        WebElement price = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div/input"));
	        price.sendKeys("300");//dodavanje cene
	        Thread.sleep(2000);
	        
	        WebElement save= driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/a[1]"));
	        JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", save);
			Thread.sleep(1000);
	        save.click();//cuvanje
	        Thread.sleep(2000);
	        
	}
	boolean found=false;
	public boolean CheckAdd(String name)
	{
		for(int i = 0;i<row.size();i++)
		{
		WebElement name1= row.get(i).findElements(By.tagName("td")).get(4);
		if(name1.getText().contains(name))
		{
			found=true;
		}
		}
		return found;
	}
	

}
