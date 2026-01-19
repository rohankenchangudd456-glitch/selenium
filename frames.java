package tc.ss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");

		WebElement fr1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(fr1);

		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input\r\n" + "")).sendKeys("Rohan");
		driver.switchTo().defaultContent();
		
		
		WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm2);
		driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("Raghu");
		
		driver.switchTo().defaultContent();
		
		WebElement frm3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Mallikarjun");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"i21\"]/div[2]")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement fr4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(fr4);
		driver.findElement(By.xpath("//*[@id=\"id4\"]/div/input")).sendKeys("Renuka");

	}

}
