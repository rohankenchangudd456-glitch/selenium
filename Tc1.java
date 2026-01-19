package tc.ss;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.linkText("Udemy Courses")).click();
		
		Set<String> Id=driver.getWindowHandles();
		System.out.println("Id of multiples window:"+ Id);
		driver.findElement(By.cssSelector("input[placeholder=\"Enter Name\"]")).sendKeys("Rohan");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rohankenchangudd456@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9110883066");
		driver.findElement(By.id("textarea")).sendKeys("vivekanand nagar 2nd cross gokak");
		driver.findElement(By.cssSelector("input#Wikipedia1_wikipedia-search-input")).sendKeys("modi");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.cssSelector("#male")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.cssSelector("p[class='description'] span")).isDisplayed() );
		System.out.println(driver.findElement(By.cssSelector("p[class='description'] span")).getText());
		driver.findElement(By.cssSelector("	#sunday")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource ());
		//String Id=driver.getWindowHandle();
	//	System.out.println("browser window id" + Id);
	
		

		driver.quit();

	}

}
