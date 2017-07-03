package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import PageObject.CyclosHome;
import PageObject.CyclosLeftMenu;
import PageObject.CyclosLogin;
import PageObject.CyclosPayPage;
import PageObject.CyclosPaytReview;
import PageObject.VerifyPaymentToUserTransaction;

public class testCyclosLogin {

	WebDriver driver;
	String URL = "https://demo.cyclos.org/#login";
	String username = "demo";
	String val1 = "Please, review the payment below and click the confirm button";
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

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

	}

	@After
	public void tearDown() throws Exception {

		// driver.quit();

		System.out.println("after test");
	}

	@Test
	public void test() throws InterruptedException {

		// Login Page
		CyclosLogin loginPage = PageFactory.initElements(driver, CyclosLogin.class);

		loginPage.inputUserName(username, "1234");
		// HomePage
		CyclosHome homePage = PageFactory.initElements(driver, CyclosHome.class);

		Thread.sleep(3000);

		homePage.verifyHomePage(username);

		// Paypage
		CyclosPayPage payPage = PageFactory.initElements(driver, CyclosPayPage.class);

		payPage.submitForm("shivam", "100");
		
		Thread.sleep(3000);
		
		//Verify the data from Payment review page

		/*VerifyPaymentToUserTransaction paymentPage = PageFactory.initElements(driver,
				VerifyPaymentToUserTransaction.class);

		paymentPage.checkTextBoxes(val1, val2);

		Thread.sleep(3000);
*/
		// Review Paypage

		CyclosPaytReview payConfirmPage = PageFactory.initElements(driver, CyclosPaytReview.class);

		Thread.sleep(3000);

		payConfirmPage.clickConfirmButton();

		Thread.sleep(3000);
		
		

		CyclosLeftMenu clickLeftMenu = PageFactory.initElements(driver, CyclosLeftMenu.class);

		Thread.sleep(2000);

		clickLeftMenu.numberOfLinks();

	}

}
