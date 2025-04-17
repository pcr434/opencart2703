package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//elements 	
		
		@FindBy(xpath="//span[normalize-space()='My Account']") WebElement myacc;
		
		@FindBy(xpath = "(//a[normalize-space()='Register'])[1]") WebElement reg ;
		
		@FindBy(xpath = "((//a[normalize-space()='Login'])[1]") WebElement login ;
	
		
		public void clickmyacc()
		{
			myacc.click();
		}
		
		public void clickreg()
		{
			reg.click();
		}
		
		public void clicklogin()
		{
			login.click();
		}
		
		
		
		
		
		
	}


