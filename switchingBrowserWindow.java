package tc.ss;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> windowid = driver.getWindowHandles();

		// Approach1
		List<String> windowList = new ArrayList(windowid);
		String parenTD = windowList.get(0);
		String childList = windowList.get(1);
		driver.switchTo().window(childList);
		driver.switchTo().window(parenTD);
		

		System.out.println(driver.getTitle());

	}

}
