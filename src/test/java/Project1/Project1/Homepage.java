package Project1.Project1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage  extends Basepage{
	public WebDriver driver;
	public Homepage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement account;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
WebElement register;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
WebElement login;



public void account() {
	account.click();
	}

public void reg() {
	register.click();
}
public void login() {
	login.click();
}


}
