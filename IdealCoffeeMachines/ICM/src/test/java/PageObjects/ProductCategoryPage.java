package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCategoryPage extends BasePage
{
    public ProductCategoryPage(WebDriver driver)
    {
    	super(driver);
    }
    
    @FindBy(xpath="//a[normalize-space()='GRINDERS']")
    WebElement ClkCategory;
    
    @FindBy(xpath="//a//span[text()='See All']")
    WebElement ClkSeeAll;
    
    public void ClkCategoryTxt()
    {
    	ClkCategory.click();
    }
    
    public void ClkSeeAllBtn()
    {
    	ClkSeeAll.click();
    }
    
}
