package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsLogin extends BasicPage {

	private By email = By.cssSelector("[name='email']");
	private By password = By.cssSelector("[name='password']");
	private By rememberMe = By.cssSelector("ins.iCheck-helper");
	private By forget = By.id("link-forgot");
	private By logIn = By.tagName("button");

	public TravelsLogin(WebDriver driver) {
		super(driver);
	}

	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}

	public void setPassword(String password) {
		this.driver.findElement(this.password).sendKeys(password);
	}

	public void setRememberMe() {
		this.driver.findElement(this.rememberMe).click();
	}

	public WebElement getForget() {
		return this.driver.findElement(forget);
	}

	public void clickOnLoginBtn() {
		this.driver.findElement(this.logIn).click();
	}

	public void singIn(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.setRememberMe();
		this.clickOnLoginBtn();
	}
	

}
