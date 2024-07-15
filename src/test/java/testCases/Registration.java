package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Project1.Project1.Homepage;

import Project1.Project1.Registrationpage;
import testBase.BaseClass;



public class Registration extends BaseClass {
	
	
	@Test(groups={"Regression","Master"})
public void verifyacountreg() {
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		logger.debug("This is a debug log message");
	
		Homepage hp = new Homepage(driver);
		hp.account();
		hp.reg();
		  
		 
		 
	
	logger.info("************starting registration********");
	Registrationpage rp = new Registrationpage(driver);
	rp.firstname(randomstring().toUpperCase());
	rp.lastname(randomstring().toUpperCase());
	
	
	rp.email(randomstring()+"@gmail.com");
	
	
	
	rp.tephone(randomnumber());
	String password=randomalphanumberic();
	rp.password( password);
	rp.conformpass( password);
	rp.check();
	rp.button();
	String conf=rp.getConfirmationMsg();
	Assert.assertEquals(conf, "Your Account Has Been Created!");
	rp.conti();
	//rp.log();
}
	
}
