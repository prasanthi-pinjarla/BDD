package selNavigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNavigations {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\spring-tool-suite\\Chrome Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("\\\\ndafile\\Study Materials\\JEE\\2018\\Java Full Stack\\Module 3\\App\\hotelbooking.html");
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	
	
	/*driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();*/
	
	
	
	
	
}
}