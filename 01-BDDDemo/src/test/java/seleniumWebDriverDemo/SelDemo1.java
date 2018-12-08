package seleniumWebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SelDemo1 {

	public static void main(String[] args) {
		// Step-1 Launch empty browser
		/*WebDriver driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "D:\\spring-tool-suite\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Step-2 Navigate to application
		driver.get("\\\\ndafile\\Study Materials\\JEE\\2018\\Java Full Stack\\Module 3\\App\\login.html");
		
		// Step-3 Enter user name(find the element and perform action)
		//driver.findElement(By.name("userName")).sendKeys("Capgemini");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Capgemini");
		WebElement pass = driver.findElement(By.name("userName"));
		pass.clear();
		pass.sendKeys("Capgemini");
		
		
		// Step-4 Enter password
		//driver.findElement(By.name("userPwd")).sendKeys("Capgemini");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Capgemini");
		WebElement pass1 = driver.findElement(By.name("userPwd"));
		pass1.clear();
		pass1.sendKeys("Capg");
		
		// Step-5 Hit login button
		//driver.findElement(By.className("btn")).click();
		driver.findElement(By.xpath("//input[@type='button']"));
		
		// Step-6 Close browser
		//driver.close();

	}

}
