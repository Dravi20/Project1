package Project1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {
	public WebDriver driver;
	public Loginpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="input-email")
	WebElement email;

	@FindBy(id="input-password")
	WebElement password;

	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbutton;
	
	public void email(String emai) {
		email.sendKeys(emai);
	}
	public void password(String pass) {
		password.sendKeys(pass);
	}

	public void button() {
		loginbutton.click();
	}
}
