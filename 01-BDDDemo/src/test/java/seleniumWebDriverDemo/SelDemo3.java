package seleniumWebDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelDemo3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\spring-tool-suite\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate()
				.to("\\\\ndafile\\Study Materials\\JEE\\2018\\Java Full Stack\\Module 3\\App\\hotelbooking.html");
		driver.manage().window().maximize();
		
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtFirstName")).sendKeys("Prasanthi");
		driver.findElement(By.id("txtLastName")).sendKeys("Pinjarla");
		driver.findElement(By.id("txtEmail")).sendKeys("Prasanthi@gmail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("9440380136");
		driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys("Chennai");
		
		WebElement city =driver.findElement(By.name("city"));
		Select select = new Select(city);
		//select.selectByVisibleText("Bangalore");
		//select.selectByValue("Pune");
		select.selectByIndex(2);
		
		WebElement state =driver.findElement(By.name("state"));
		select = new Select(state);
		//select1.selectByVisibleText("Karnataka");
		select.selectByValue("Tamilnadu");
		
		
		WebElement noOfPersons =driver.findElement(By.name("persons"));
		 select = new Select(noOfPersons);
		//select2.selectByVisibleText("5");
		select.selectByIndex(6);
		
		driver.findElement(By.xpath("//input[@id='txtCardholderName']")).sendKeys("Prasanthi");
		driver.findElement(By.xpath("//input[@id='txtDebit']")).sendKeys("2345975610594621");
		driver.findElement(By.xpath("//input[@id='txtCvv']")).sendKeys("234");
		driver.findElement(By.xpath("//input[@id='txtMonth']")).sendKeys("02");
		driver.findElement(By.xpath("//input[@id='txtYear']")).sendKeys("2023");
		
		
		
		
		//driver.findElement(By.className("btn")).click();
		//select.deselectAll(); When to de-select all the checkboxes
		
		
	}
}
