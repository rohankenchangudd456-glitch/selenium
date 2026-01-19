package tc.ss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
      // for(int i=3;i<checkboxes.size();i++)
     //  {
    	 //  checkboxes.get(i).click();
       //}
	
	for(int i=0;i<2;i++)
	{
		checkboxes.get(i).click();
	}
	
	Thread.sleep(5000);
	for(int i=0;i<2;i++)
	{
		checkboxes.get(i).click();
	}
   
   
	
	
}
}