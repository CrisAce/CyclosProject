package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CyclosPayPage {
	
	@FindBy(css=".autoCompleteFieldContainer [type='text']")
	WebElement userInput;
	
	@FindBy(css=".inputField.large.rightAligned")
	WebElement amount;
	
	@FindBy(css=".inputField.full")
	WebElement descriptionInput;
	
	@FindBy(css=".actionButton")
	WebElement submitButton;
	
	public void submitForm(String usernamePayPage, String amountPayPage) throws InterruptedException{
		
		userInput.sendKeys(usernamePayPage);
		Thread.sleep(1000);
		amount.sendKeys(amountPayPage);
		Thread.sleep(1000);
		submitButton.click();
	}

}
