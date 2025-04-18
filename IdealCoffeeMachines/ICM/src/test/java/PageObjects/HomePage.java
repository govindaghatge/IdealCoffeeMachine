package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
    	super(driver);
    }
    
    @FindBy(xpath="//button[normalize-space()='Signin']")
    WebElement SignIn;
    
    public void SignInTxt()
    {
    	SignIn.click();
    }
}
