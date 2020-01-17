package HappierWork_Flow.HappierWork_Flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	public static void login(WebDriver driver) throws InterruptedException {
		driver.get("https://angular-freebird-dot-dev-happierwork.appspot.com/");
		
		driver.manage().window().maximize();
		
	

		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("shreya.majithia@searcelabs.com");

		WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
		next.click();
		
		
		
		
		
		
		//waitforelement(driver,password);
		WebElement password = driver.findElement(By.name("password"));

		//Thread.sleep(5000);

		
		password.sendKeys("searce@123");

	
		
		
		WebElement next1 = driver.findElement(By.xpath("//*[text()='Next']"));
		waitforelement(driver,next1);

		
		next1.click();
	}
	
	public static void waitforelement(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(
		  ExpectedConditions.elementToBeClickable(element));
		
	}
	
//	public static void sendKeys(WebDriver driver1,WebElement element,int timeout,String value) {
//		
//		WebDriverWait wait=new WebDriverWait(driver1, timeout);
//		wait.until(ExpectedConditions.(element));
//		element.sendKeys(value);
//		
//		
//		
//	}

}
