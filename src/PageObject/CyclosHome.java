package PageObject;


import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class CyclosHome {
	
	@FindBy(css=".statusMenuLink-personal .statusMenuText")
	WebElement statusMenu;
	
	@FindBy(linkText="Pay user")
	WebElement payUserButton;
	
	public void verifyHomePage(String check) throws InterruptedException{
		
	assertTrue(statusMenu.getText().equals(check));
	
	payUserButton.click();
	
	Thread.sleep(3000);
	
	}

}
