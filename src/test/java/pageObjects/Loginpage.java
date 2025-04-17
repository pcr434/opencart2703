package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {

	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath ="//input[@id='input-email']") WebElement emaile ;
	
	@FindBy(xpath="(//input[@id='input-password'])[1]") WebElement passworde ;
	
	@FindBy(xpath= "//input[@value='Login']") WebElement logine ;
	
	
	public void clickemail(String email)
	{
		emaile.sendKeys(email);
	}
	
	public void clickpword(String pword)
	{
		passworde.sendKeys(pword);
	}
	
	public void clicklogin()
	{
		logine.click();
	}
	
	
	
	
	
}
