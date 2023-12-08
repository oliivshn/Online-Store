package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//Create a new instance of the chrome driver
		WebDriver wd= new ChromeDriver();
		
		//Launch the shopee online store website
		wd.get("https://shopee.co.id/");
		
		//Print message to the screen
		System.out.println("Succesfully opened the website Shopee DemoQA");
		
//		//Wait for 5 secs]
//		Thread.sleep(5000);
		
		//close the driver
		wd.quit();
	}

}