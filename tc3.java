package tc.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://testautomationpractice.blogspot.com/");
				
				// 1. Store the element in a WebElement variable
				WebElement sunday = driver.findElement(By.id("sunday"));
				
				// 2. Check the status using the element
				boolean isSelected = sunday.isSelected();
				System.out.println("Is Sunday selected? " + isSelected);
				
				// 3. Click the element (NOT the boolean variable)
				sunday.click();
				
				// Optional: Verify the click worked
				System.out.println("Is Sunday selected now? " + sunday.isSelected());
			
		
			driver.findElement(By.cssSelector("a[href='https://testautomationpractice.blogspot.com/p/playwrightpractice.html']")).click();
			driver.quit();
	
	}
	
	
	
	

		
	

}
