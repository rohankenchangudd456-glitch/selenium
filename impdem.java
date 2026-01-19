package tc.ss;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class impdem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  ----imp
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));---expl
		//---fluent wait 
		Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement lc = mywait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("input[placeholder=\"Enter Name\"]")));
		lc.sendKeys("Rohan");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rohankenchangudd456@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9110883066");
		driver.findElement(By.id("textarea")).sendKeys("vivekanand nagar 2nd cross gokak");
		driver.findElement(By.cssSelector("input#Wikipedia1_wikipedia-search-input")).sendKeys("modi");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.cssSelector("#male")).click();

		driver.quit(); 
	}

}
