package test;

import static org.junit.Assert.*;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import PageObject.CyclosLogin;
import PageObject.VerifyPaymentToUserTransaction;

public class testVerifyPaymentToUser {
	
	WebDriver driver;
	String URL = "https://demo.cyclos.org/#login";
	
	String val1="Please, review the payment below and click the confirm button";
	String val2 = "Payment review";		

	@Before
	public void setUp() throws Exception {
		
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "//src//Resources//geckodriver.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(URL);
		Thread.sleep(3000);

	}

	
	@Test
	public void test() {
		
		VerifyPaymentToUserTransaction paymentPage  = PageFactory.initElements(driver, VerifyPaymentToUserTransaction.class);
		
		paymentPage.checkTextBoxes(val1, val2);
		
	}

	
	
	@After
	public void tearDown() throws Exception {
		
		System.out.println("after test");
	}

}
