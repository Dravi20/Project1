package Project1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registrationpage extends Basepage {

	WebDriver driver;

	public Registrationpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "input-firstname")
	WebElement firstname;
	@FindBy(id = "input-lastname")
	WebElement lastname;
	@FindBy(id = "input-email")
	WebElement email;
	@FindBy(id = "input-telephone")
	WebElement telephone;

	@FindBy(id = "input-password")
	WebElement password;

	@FindBy(id = "input-confirm")
	WebElement confpassword;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement checkbox;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement button;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confmsg;
	@FindBy(xpath = "//a[normalize-space()='Continue']")
	WebElement cont;
	/*
	 * @FindBy(xpath =
	 * "//body/nav[@id='top']/div[@class='container']/div[@id='top-links']/ul[@class='list-inline']/li[1]")
	 * WebElement logout;
	 */

	public void firstname(String first) {
		firstname.sendKeys(first);
	}

	public void lastname(String last) {
		lastname.sendKeys(last);
	}

	public void email(String ema) {
		email.sendKeys(ema);
	}

	public void tephone(String ph) {
		telephone.sendKeys(ph);
	}

	public void password(String pass) {
		password.sendKeys(pass);
	}

	public void conformpass(String conf) {
		confpassword.sendKeys(conf);
	}

	public void check() {
		checkbox.click();
	}

	public void button() {
		button.click();
	}

	public String getConfirmationMsg() {
		try {
			return (confmsg.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}

	public void conti() {
		cont.click();
	}

	/*
	 * public void log() { logout.click(); }
	 */
	public Homepage Homepage() {
		return new Homepage(driver);
	}
}
