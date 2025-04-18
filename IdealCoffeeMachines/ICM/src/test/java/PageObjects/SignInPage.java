package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage
{
     public SignInPage(WebDriver driver)
     {
    	 super(driver);
     }
     
     @FindBy(xpath="//input[@id='login_email']")
     WebElement ClkEmail;
     
     @FindBy(xpath="//input[@id='login_password']")
     WebElement ClkPassword;
     
     @FindBy(xpath="//span[text()='SIGN IN']")
     WebElement ClkSignInBtn;
     
     public void EnterEmail(String Email)
     {
    	 ClkEmail.sendKeys(Email);
     }
     
     public void EnterPassword(String Password)
     {
    	 ClkPassword.sendKeys(Password);
     }
     
     public void ClkBtn()
     {
    	 ClkSignInBtn.click();
     }
     
}
