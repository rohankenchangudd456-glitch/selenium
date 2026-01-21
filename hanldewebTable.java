package tc.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hanldewebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int ob = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(ob);

		int th = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(th);

		String namwe = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();

		System.out.println(namwe);
	} 

}
