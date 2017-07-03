package PageObject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyPaymentToUserTransaction {
	
	@FindBy(css=".notificationText.notificationText-singleLine")
	WebElement notificationText;
	
	String A= notificationText.getText();
	
	
	@FindBy(css="div[class='pageHeadingText']")
	WebElement paymentReviewBox;
	
	String B = paymentReviewBox.getText();
	
	public void  checkTextBoxes(String notificationText2,String paymentReviewBox2 ){
		
		
		assertTrue(A.equals(notificationText2));
		
		assertTrue(B.equals(paymentReviewBox2));
		
		
		
	}
	
	

}
