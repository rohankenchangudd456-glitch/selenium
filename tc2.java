package tc.ss;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Click the link
		driver.findElement(By.linkText("Udemy Courses")).click();
		
		// FIX: Increased time from 1 second to 10 seconds. 
		// Selenium won't wait the full 10s; it will continue as soon as the window appears.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		// Get and print the IDs
		Set<String> Id = driver.getWindowHandles();
		System.out.println("Id of multiples window: " + Id);
		
		// Good practice to close the browser
		driver.quit();
	}
}