package seleniumWebDriverDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\spring-tool-suite\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate()
				.to("\\\\ndafile\\Study Materials\\JEE\\2018\\Java Full Stack\\Module 3\\App\\hotelbooking.html");
		/*
		 * (1)
		 * */
		
		/*String actualHeading =driver.findElement(By.xpath("//h2")).getText();
		System.out.println(actualHeading);
		String HeadingIWant = "Hotel Booking Form";
		System.out.println(HeadingIWant);
		int result = HeadingIWant.compareTo(actualHeading);
		if(result==0) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
		}*/
		
		/*
		 * (2)
		 * */
		
		/*System.out.println(driver.findElement(By.id("txtFirstName")).getAttribute("name"));*/
		
		/*
		 * (3)
		 * */
		
		/*driver.findElement(By.id("txtFirstName")).sendKeys("Prasanthi");
		System.out.println(driver.findElement(By.id("txtFirstName")).getAttribute("value"));*/
		
		/*
		 * (4)
		 * */
		
		driver.findElement(By.id("txtFirstName")).sendKeys("Prasanthi");
		driver.findElement(By.id("txtLastName")).sendKeys("Pinjarla");
		driver.findElement(By.id("txtEmail")).sendKeys("Prasanthi@gmail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("9440380136");
		driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys("Chennai");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//select[@name='state']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//select[@name='persons']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='txtCardholderName']")).sendKeys("Prasanthi");
		driver.findElement(By.xpath("//input[@id='txtDebit']")).sendKeys("2345975610594621");
		driver.findElement(By.xpath("//input[@id='txtCvv']")).sendKeys("234");
		driver.findElement(By.xpath("//input[@id='txtMonth']")).sendKeys("04");
		driver.findElement(By.xpath("//input[@id='txtYear']")).sendKeys("2023");
		
		driver.findElement(By.className("btn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();  // click okay button
		
		//alert.dismiss();  // close alert
		
		
	}

}
