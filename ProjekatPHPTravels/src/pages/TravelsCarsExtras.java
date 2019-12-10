package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCarsExtras extends BasicPage {

	
	
	private By add= By.cssSelector("a.btn.btn-success.xcrud-action");
	
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
		
		WebElement selectElement= driver.findElement(By.tagName("select"));// selektovanje statusa
		 Select select = new Select(selectElement);
	        List<WebElement> allOptions = select.getOptions();
	        select.selectByVisibleText("Yes");
		
	        WebElement price = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div/input"));
	        price.sendKeys("300");//dodavanje cene
	        
	        WebElement save= driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/a[1]"));
	        save.click();//cuvanje
	        
	}

}
