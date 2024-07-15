package Project1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends Basepage {
	public WebDriver driver;
	public Myaccountpage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//h2[normalize-space()='My Account']")
WebElement accountpage;
@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
WebElement logout;
public boolean accountpages() {
	try {
return	(accountpage.isDisplayed());
	}
catch(Exception e) {
	return (false);
}
}
public void logout() {
	logout.click();
}
}
