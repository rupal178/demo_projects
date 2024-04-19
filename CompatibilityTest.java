package CapstoneProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 *  Validate Travel app application on different browser
 */
public class CompatibilityTest {

	public static void main(String[] args) {
		
		//edge browser
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
		
		// Chrome brwoser
		//	WebDriverManager.chromedriver().setup();
		//	WebDriver driver=new ChromeDriver();
		
		// Firefox driver
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost:8080/TravelApp/");
		driver.manage().window().maximize();
		
		  

	}

}
