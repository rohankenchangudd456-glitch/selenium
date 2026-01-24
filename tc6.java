package tc.ss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		/*driver.findElement(By.cssSelector("#alertBtn")).click();
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
		driver.findElement(By.cssSelector("#confirmBtn")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();*/
		
		driver.findElement(By.cssSelector("#promptBtn")).click();
		Alert alrt=driver.switchTo().alert();
		Thread.sleep(5000);
		alrt.getText();
		Thread.sleep(2000);
		alrt.sendKeys("Welcome to selenium");
		alrt.accept();
		alrt.dismiis();
		
		
		
	}

}
