package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.Myaccpage;

public class TC_002_Loginpage extends BaseClass {

	@Test()
	public void verify_login()
	{
		logger.info("test started");
		logger.debug("start");
		try
		{
		HomePage hp = new HomePage(driver) ;
		
		hp.clickmyacc();
		
		hp.clicklogin();

		
		Loginpage lp = new Loginpage(driver) ;
		
		lp.clickemail("pcr123@gmail.com");
		
		lp.clickpword("poorna434");
		
		Myaccpage map = new Myaccpage(driver) ;
		
		boolean res = map.myaccpa() ;
		
		Assert.assertEquals(res, true); 
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("test completed");
		
		
	}
	
	
	
	
	
}
