package tc.ss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class datepickers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.vrlbus.in/");
		driver.findElement(By.className("btn-close")).click();
		driver.findElement(By.xpath("//*[@id=\"FromCity\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FromCity-option-43\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ToCity-option-117\"]")).click();
		driver.findElement(By.cssSelector("tbody tr:nth-child(4) td:nth-child(6)")).click();
		//driver.findElement(By.cssSelector("//button[normalize-space()='Search']")).click();

		WebElement searchBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("searchbtn")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", searchBtn);

	}

}
