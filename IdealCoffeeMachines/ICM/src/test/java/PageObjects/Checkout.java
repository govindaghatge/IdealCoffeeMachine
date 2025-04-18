package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends BasePage
{
       public Checkout(WebDriver driver)
       {
    	   super(driver);
       }
       
       @FindBy(xpath="//span[text()='Make payment']")
       WebElement ClkMakePayment;
       
       public void MakePayment()
       {
    	   ClkMakePayment.click();
       }
}
