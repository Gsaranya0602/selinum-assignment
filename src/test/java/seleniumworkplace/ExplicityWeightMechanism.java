package seleniumworkplace;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWeightMechanism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		WebDriverWait wait=new  WebDriverWait (driver, Duration.ofSeconds(10));
		driver.findElement(By.id("btn2")).click();
		WebElement text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		text.sendKeys("hello");

	}

}
