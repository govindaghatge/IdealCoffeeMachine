package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetInTouch extends BasePage
{
	public GetInTouch(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement EntFirstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement EntLastName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement EntEmail;
	
	@FindBy(xpath="//input[@id='contact_number']")
	WebElement EntMobileNumber;
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement EntMessage;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement ClkSubmit;
	
	public void EnterFirstName(String Fname)
	{
		EntFirstName.sendKeys(Fname);
	}
	
	public void EnterLastName(String Lname)
	{
		EntLastName.sendKeys(Lname);
	}
	
	public void EnterEmail(String Email)
	{
	    EntEmail.sendKeys(Email);
	}
	
	public void EnterMobileNumber(String Mobile)
	{
		EntMessage.sendKeys(Mobile);
	}
	
	public void EnterMessage(String Message)
	{
	    EntMessage.sendKeys(Message);	
	}
	
	public void ClickSubmitBtn()
	{
		ClkSubmit.click();
	}
}
