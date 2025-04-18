package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage
{
		public SignUpPage(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(xpath="//button[text()='Signup']")
		WebElement ClkSignUpTxt;
		
		@FindBy(xpath="//input[@id='sign-up_name']")
		WebElement EntFullName;
		
		@FindBy(xpath="//input[@id='sign-up_email']")
		WebElement EntEmail;
		
		@FindBy(xpath="//input[@id='sign-up_mobile_number']")
		WebElement EntMobileNumber;
		
		@FindBy(xpath="//input[@id='sign-up_password']")
		WebElement EntPassword;
		
		@FindBy(xpath="//input[@id='sign-up_confirm_password']")
		WebElement EntConfirmPassword;
		
		@FindBy(xpath="//span[text()='SIGN UP']")
		WebElement ClkSignUp;
		
		public void ClkSignUp()
		{
			ClkSignUpTxt.click();
		}
		
		public void EnterFullName(String FullName)
		{
			EntFullName.sendKeys(FullName);
		}
		
		public void EnterEmail(String Email)		
		{
			EntEmail.sendKeys(Email);
		}
		
		public void EnterMobileNumber(String Telephone)
		{
			EntMobileNumber.sendKeys(Telephone);
		}
		
		public void EntPassword(String Password)
		{
			EntPassword.sendKeys(Password);
		}
		
		public void EntConfirmPassword(String ConfirmPassword)
		{
			EntConfirmPassword.sendKeys(ConfirmPassword);
		}
		
		public void ClickSignUp()
		{
			ClkSignUp.click();
		}
}
