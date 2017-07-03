package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

public class CyclosLogin {
	
	@FindBy(css=".loginForm [type='text']")
	WebElement loginName;
	@FindBy(css=".loginForm [type='password']")	
	WebElement password;
	@FindBy(css=".loginForm [type='button']")
	WebElement button;
	
	
	public void inputUserName(String username, String pass ){
		
		loginName.sendKeys(username);
		password.sendKeys(pass);
		button.click();
		
	}
	


	
	
	
	
	/*public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://demo.cyclos.org/#login");
		
		//Elements by xpath
		//WebElement loginName = driver.findElement(By.xpath("//div[2]/div/input"));
		//WebElement password = driver.findElement(By.xpath("//div[2]/div/div/input"));
		
		
		//Elements by cssSelector
		WebElement loginName = driver.findElement(By.cssSelector(".loginForm [type='text']"));
		WebElement password = driver.findElement(By.cssSelector(".loginForm [type='password']"));
		WebElement button = driver.findElement(By.cssSelector(".loginForm [type='button']"));
		
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on a element: Login-->Paymanet page
		
		
	 driver.close();
	}*/

}
