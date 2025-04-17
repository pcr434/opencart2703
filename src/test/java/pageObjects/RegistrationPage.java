package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath= "//input[@id='input-firstname']") WebElement fname ;
	
	@FindBy(xpath= "//input[@id='input-lastname']") WebElement lname ;
	
	@FindBy(xpath= "//input[@id='input-email']") WebElement eemail ;
	
	@FindBy(xpath= "//input[@id='input-email']") WebElement tphone ;
	
	@FindBy(xpath= "//input[@id='input-password']") WebElement pword ;
	
	@FindBy(xpath="//input[@id='input-confirm']") WebElement pconfimration ;
	
	@FindBy(xpath= "//input[@name='agree']") WebElement pcyagree ;
	
	
@FindBy(xpath ="//input[@value='Continue']") WebElement ctnubutton ;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement Msgconfirmation ;


public void enterfname(String name)
{
	fname.sendKeys(name);
}
	
public void enterlname(String name)
{
	lname.sendKeys(name);
}

public void enteremail(String name)
{
	eemail.sendKeys(name);
}
	
public void phonenum(String name)
{
	tphone.sendKeys(name);
}

public void enterpword(String name)
{
	pword.sendKeys(name);
}
	
public void passwordconfirmation(String name)
{
	pconfimration.sendKeys(name);
}
public void ppolicy()
{
	pcyagree.click();
}
public void continuebutton()
{
	ctnubutton.click();
}
	
public String verifymsgconfirmation()
{
	try
	{
	String message = Msgconfirmation.getText() ;
	return message ;
	}
	catch (Exception e)
	{
	return ("failed") ;
	}
	
		
}	
}
