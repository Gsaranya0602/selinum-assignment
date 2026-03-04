package seleniumworkplace;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWait {

	public static void main(String[] args) {
		String url="https://www.hyrtutorials.com/p/waits-demo.html";
		WebDriver driver=new ChromeDriver();
		
		Wait<WebDriver> wait=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2));
		driver.get(url);
		driver.findElement(By.id("btn2")).click();
		WebElement text =wait.until(ExpectedConditions.elementToBeClickable(By.id("txt2"));
		text.sendKeys("hi");
				
				
	}

}
