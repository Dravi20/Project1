package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Project1.Project1.Homepage;
import Project1.Project1.Loginpage;
import Project1.Project1.Myaccountpage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_loginDD extends BaseClass {

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class ,groups="DataDriven")
	public void loginDD(String email ,String pass, String exp) {
		try {
		Homepage hp = new Homepage(driver);
		hp.account();
		hp.login();

		logger.info("**********login page************");
		Loginpage lp = new Loginpage(driver);
		lp.email(email);
		lp.password(pass);
		lp.button();

		logger.info("*****************accountpage***********************");
		Myaccountpage ap = new Myaccountpage(driver);
		boolean tracepage = ap.accountpages();
		if(exp.equalsIgnoreCase("Valid")) {
			if(tracepage==true) {
				ap.logout();
			Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		if(exp.equalsIgnoreCase("Invalid")) {
			if(tracepage==true) {
				ap.logout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		} }
		catch(Exception e) {
			Assert.fail();
		}
		}
		}
		
		
		
		
		
		
		
		
		
	

