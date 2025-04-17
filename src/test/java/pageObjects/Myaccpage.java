package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccpage extends BasePage {

	public Myaccpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath= "//h2[text()='My Account']")  WebElement myaccp;
	
	
	public boolean myaccpa()
	{
		try
		{
		return myaccp.isDisplayed();
		}
		catch(Exception e)
		{ 
			System.out.println("failes") ;
		}
	}
}
