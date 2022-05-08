package seleniumDemo;

import java.io.IOException;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
	String password = "demouser";
	String email = "user@phptravels.com";
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	options.setExperimentalOption("useAutomationExtension", false);
	options.addArguments("disable-infobars");
	
	driver.get("https://www.phptravels.net/login");
	Thread.sleep(5000);
	
	//driver.findElement(By.className("sign-in")).click();
	//Thread.sleep(5000);
	//driver.findElement(ByTagName.id("email")).sendKeys(email);
	driver.findElement(By.name("email")).sendKeys(email);
	driver.findElement(By.name("password")).sendKeys(password + Keys.ENTER);
	Thread.sleep(5000);
	//driver.findElement(By.className("btn-default")).click();
	Thread.sleep(5000);
	driver.findElement(By.className("menu-toggler")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Flights")).click();
	Thread.sleep(5000);
	driver.quit();	
	
	
	
	try {
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
