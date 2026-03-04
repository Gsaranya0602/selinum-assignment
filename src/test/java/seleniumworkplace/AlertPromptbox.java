package seleniumworkplace;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPromptbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa-practice.com/elements/alert/prompt#");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//scroll down the webpage 
		js.executeScript("window.scrollBy(0,1200)");
		
		driver.findElement(By.className("a-button")).click();
		Alert alertbox=driver.switchTo().alert();
		Thread.sleep(2000);
	alertbox.sendKeys("hello");
	
		alertbox.accept();
		
		
		
		

	}

}
