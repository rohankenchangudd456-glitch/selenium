package tc.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

	WebElement name=driver.findElement(By.xpath("//input[@id='field1']"));
	WebElement cn=	driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement dc=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		name.clear();
		name.sendKeys("Welcome");
		
		Actions act=new Actions(driver);
		act.doubleClick(dc).build().perform();
		
		//validatiion box2 contains welcome or not
		 
		String txt=cn.getAttribute("value");
		System.out.println("second input box value:"+txt);
		
		if(txt.equals("Welocme"))
		{
		System.out.println("text copied");
		}
		else
		{
			System.out.println("text not copied");
			
		}
		
		
			
		
		
		
		

	}

}
