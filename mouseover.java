package tc.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ptm=driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
		WebElement ltp=driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/div/a[2]"));
		
		Actions act=new Actions(driver);
		//mouseoveraction
		act.moveToElement(ptm).moveToElement(ltp).click().build().perform();

	}

}
