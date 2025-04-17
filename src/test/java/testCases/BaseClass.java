package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j
//import org.apache.logging.log4j.core.tools.picocli.CommandLine.Parameters;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//import com.beust.jcommander.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	
	
	@BeforeClass
	@Parameters({ "browser"})
	public void setup( String br)
	{
logger=LogManager.getLogger(this.getClass());//Log4j
		
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver(); break;
		case "edge": driver=new EdgeDriver(); break;
		case "firefox": driver=new FirefoxDriver(); break;
		
		default: System.out.println("No matching browser..");
					return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}


	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	
	
}
	
	
	

