package PageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CyclosPaytReview {
	
	@FindBy(css=".actionButton")
	WebElement confirmButton;
	
	public void  clickConfirmButton() throws InterruptedException{
		
		
		Thread.sleep(2000);
		confirmButton.click();
	}

}
