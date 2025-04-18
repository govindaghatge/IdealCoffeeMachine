package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductCategoryPage;
import PageObjects.ProductListPage;
import PageObjects.SignInPage;
import TestBase.BaseClass;

public class TC001_Verify_functionality_of_Add_To_Cart_Module extends BaseClass
{
  
   @Test	
   public void Item_Add_To_Cart()
   {
	     logger.info("***** Starting a Test ******"); 
	     
	     try
	     {
	    	 HomePage hp = new HomePage(driver);
	    	 hp.SignInTxt();
	    	 
	    	 logger.info("***** Clicked on SignIn Text *****");
	    	 
	    	 SignInPage Sp = new SignInPage(driver);
	    	 logger.info("***** Enter user info *****");
	    	 
	    	 Sp.EnterEmail(p.getProperty("Email"));
	    	 Sp.EnterPassword(p.getProperty("Password"));
	    	 Sp.ClkBtn();
	    	 
	    	 ProductCategoryPage Pc = new ProductCategoryPage(driver);
	    	 Pc.ClkCategoryTxt();
	    	 
	    	 logger.info("***** Clicked on Product Category *****");
	    	 
	    	 ProductListPage Pl = new ProductListPage(driver);
	    	 Pl.ClkSelProduct();
	    	 
	    	 logger.info("***** Clicked on Product *****");
	    	 
	     }
	     
	     catch (Exception e)
			{
				logger.error("Test failed: " + e.getMessage());
				Assert.fail("Test failed: " + e.getMessage());
			} 
	     
	     finally
	     {
	    	 logger.info("***** Finished TC001_AccountRegistrationTest *****");
	     }
   }
}
