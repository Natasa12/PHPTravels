package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCars extends BasicPage {

	
	public By tabel = By.cssSelector("#content > div.panel.panel-default > div.panel-body tbody");
	private List<WebElement> rows = driver.findElements(By.className("xcrud-row"));
	public TravelsCars(WebDriver driver)
	{
		super(driver);
	}
	public List<WebElement> carsList()
	{
		List<WebElement> cars = new ArrayList<WebElement>();
		for(int i = 0; i < rows.size(); i++)
		{
			WebElement name = rows.get(i).findElements(By.tagName("td")).get(4);
			cars.add(name);
		}
		return cars;
	}
	public int carsCount()
	{
		return carsList().size();
	}
	boolean found=false;
	public boolean getNumOFCars()
	{
		if(this.carsCount()==10)
		{
			found= true;
		}
		return found;
	}
	public int getOrders()
	{
		int sum = 0;
		for(int i = 0; i < rows.size(); i++)
		{
			String order = rows.get(i).findElements(By.tagName("td")).get(9).findElement(By.cssSelector("[type='number']")).getAttribute("value");
			sum=sum + Integer.parseInt(order);
		}
		return sum;
	}
	public boolean getNumOfOrders()
	{
		if(this.getOrders()>50)
		{
			found= true;
		}
		return found;
	}
	public  void getUpload() throws Exception 
	{
		WebElement upload = rows.get(0).findElements(By.tagName("td")).get(8);
		upload.click();
		Thread.sleep(2000);
		
		WebElement add= driver.findElement(By.cssSelector("a.btn.btn-success"));
		add.click();
		WebElement dropFile= driver.findElement(By.cssSelector("input.dz-hidden-input"));

       dropFile.sendKeys("D:\\Java1\\ProjekatPHPTravels\\auto.jpg");
		Thread.sleep(2000);
	}
	public int PhotoExist()
	{
		List<WebElement> photoCars=driver.findElements(By.cssSelector("img.img-responsive.colorbox.cboxElement"));
		return photoCars.size();
			
	}
	

}
