package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends BasePage
    {
        public ProductDescriptionPage(WebDriver driver)
        {
            super(driver);	
	    }
        
        @FindBy(xpath="//button[text()='Buy Now']")
        WebElement BuyNow;
        
        @FindBy(xpath="//button[text()='Add to Cart']")
        WebElement AddtoCartBtn;
        
        @FindBy(xpath="//button[text()='Go to Cart']")
        WebElement  GotoCart;
        
        public void ClkBuyNow()
        {
        	BuyNow.click();
        }
        
        public void ClkAddtoCartBtn()
        {
        	AddtoCartBtn.click();
        }
        
        public void ClkGoToCart()
        {
        	GotoCart.click();
        }
}
