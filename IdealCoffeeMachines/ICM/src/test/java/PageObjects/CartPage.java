package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage
{
        public CartPage(WebDriver driver)
        {
        	super(driver);
        }
        
        @FindBy(xpath="//span[text()='Proceed to Checkout ']")
        WebElement ClkCheckoutBtn;
        
        public void ClickCheckoutButton()
        {
        	ClkCheckoutBtn.click();
        }
}
