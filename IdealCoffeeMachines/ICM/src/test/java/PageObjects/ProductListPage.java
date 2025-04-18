package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListPage extends BasePage
{
        public ProductListPage(WebDriver driver)
        {
        	super(driver);
        }
        
        @FindBy(xpath="//h5[text()='Ideal SS Grinder']")
        WebElement clkProduct;
        
        public void ClkSelProduct()
        {
        	clkProduct.click();
        }
} 
