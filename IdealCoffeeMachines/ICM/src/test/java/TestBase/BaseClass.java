package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass
{
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	
	@BeforeClass
	@Parameters({"os","browser"})
    public void SetUp(String os, String br ) throws IOException, InterruptedException
    {
	   FileReader file = new FileReader(".\\src\\test\\resources\\config.properties");
	   p = new Properties();
	   p.load(file);
	   logger = LogManager.getLogger(this.getClass());
		
	   switch(br.toLowerCase())
		  { 
		   case "chrome": driver = new ChromeDriver(); break;
		   case "firefox": driver = new FirefoxDriver();break;
		   case "Edge": driver = new EdgeDriver();break;
		   default: System.out.println("Invalid browser"); return;
		  }
	   
       driver.manage().deleteAllCookies();
       driver.get(p.getProperty("AppUrl"));
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //   Thread.sleep(5000);
    }
    
	@AfterClass
    public void TearDown()
    {
       driver.quit();	
    }
}
