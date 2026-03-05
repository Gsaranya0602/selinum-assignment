package seleniumworkplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice-automation.com/iframes/");
		driver.switchTo().frame(1);
		WebElement element=driver.findElement(By.id("Layer_1"));
		System.out.println( element.getAttribute("Layer 1"));
		
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame("iframe-1");
//		String frame1=driver.findElement(By.className("navbar__title")).getText();
//		System.out.println(frame1);
		driver.close();
	}

}
