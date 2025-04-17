package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class TC_001_AccountRegistrationTest extends BaseClass {
@Test
	public void verifyaccreg() throws InterruptedException
	{
		HomePage hp = new HomePage(driver) ;
		logger.info("click my acc");
		hp.clickmyacc();
		logger.info("click my reg");
		hp.clickreg();
		
		RegistrationPage rp = new RegistrationPage(driver) ;
		logger.info("enter 1st name");
		rp.enterfname(randomeString());
		logger.info("enter last name");
		rp.enterlname(randomeString());
		logger.info("enter email ");
		rp.enteremail(randomeString()+"@gmail.com");
		logger.info("enter phonenumber");
		rp.phonenum(randomeNumber());
		
		String password=randomAlphaNumeric();
		logger.info("enter password");
		rp.enterpword(password);
		
		rp.passwordconfirmation(password);
		
		rp.ppolicy();
		
		Thread.sleep(3);
		rp.continuebutton();
		logger.info("completed");
/*String confirmdmessage = rp.verifymsgconfirmation() ;

Assert.assertEquals(confirmdmessage, "Your Account Has Been Created!");*/
		
	}
	
}
