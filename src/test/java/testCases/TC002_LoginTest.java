package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Project1.Project1.Homepage;
import Project1.Project1.Loginpage;
import Project1.Project1.Myaccountpage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	@Test(groups={"Sanity","Master"})
	public void loginpage() {
		try {
			logger.info("***********start login page**********");
			Homepage hp = new Homepage(driver);
			hp.account();
			hp.login();

			logger.info("**********login page************");
			Loginpage lp = new Loginpage(driver);
			lp.email(p.getProperty("email"));
			lp.password(p.getProperty("password"));
			lp.button();

			logger.info("*****************accountpage***********************");
			Myaccountpage ap = new Myaccountpage(driver);
			boolean tracepage = ap.accountpages();
			Assert.assertTrue(tracepage);
			ap.logout();
		} catch (Exception e) {
			Assert.fail();
		}
		
		logger.info("***************TC002 Fineshed**********");
	}
}