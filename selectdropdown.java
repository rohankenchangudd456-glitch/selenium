package tc.ss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drp = driver.findElement(By.xpath("//*[@id=\"country\"]"));

		Select drp1 = new Select(drp);
		//drp1.selectByIndex(2);
		List<WebElement> op=drp1.getOptions();
		System.out.println(op.size());
		
		
		

	}

}
