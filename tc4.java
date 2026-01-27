package tc.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://testautomationpractice.blogspot.com/");
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.navigate().to("https://www.youtube.com/@sdetpavan/playlists");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		

	}

}
