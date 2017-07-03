package PageObject;

//import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.stylesheets.LinkStyle;

public class CyclosLeftMenu {
	
	WebDriver driver1 = new FirefoxDriver();

	/*@FindBy(css = ".leftMenuItems .leftMenuItem [href='#history!id=7762070814178015807']")
	WebElement accountInfo;
	*/
	
	//@FindBy(tagName="a")
	
	@FindBy(css=".leftMenuLink")
	java.util.List<WebElement> linksNumber;
	

	

	/*public void accountInfoVerification(String checkAccountInfo) {

		assertTrue(accountInfo.getText().equals(checkAccountInfo));

	}
	*/
	public void numberOfLinks(){
		
		System.out.println(linksNumber.size());
		
		for (int i = 1; i<=linksNumber.size(); i++){
			if (linksNumber.findElements(By.linkText(user)).size() > 1) {
				linksNumber.findElement(By.linkText(user)).click();
			} 
			
			System.out.println(linksNumber.get(i).getText());
		}
	}
	ublic void selectFromQuickSearch(String user, String amount, String description) throws InterruptedException {
		userRadioButton.click();
		quickSearch.sendKeys(user);
		Thread.sleep(900);

		//IMPORTANT 'driver.findElements(By.linkText(user)).size() > 1' verifies if an element is present
		if (driver.findElements(By.linkText(user)).size() > 1) {
			driver.findElement(By.linkText(user)).click();
		}
		wait.until(ExpectedConditions.visibilityOf(userIsSelected));
		insertAmount(amount);
		paymentReview(user, amount, description);
	} 
}
