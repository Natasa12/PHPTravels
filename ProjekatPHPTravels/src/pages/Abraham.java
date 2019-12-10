package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Abraham extends BasicPage {

	private By button= By.cssSelector(".lc-eoed9h .e1mwfyk10.lc-4rgplc.e1m5b1js0");
	public Abraham(WebDriver driver) {
		super(driver);
	}

	public void Ambraham()
	{
		WebElement abraham= this.driver.findElement(button);
		if(abraham!=null)
		{
			abraham.click();
		}
	}
}
