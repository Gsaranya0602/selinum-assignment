package assignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		WebElement search=driver.findElement(By.id("APjFqb"));
//        search.sendKeys("chatgpt");
//        Thread.sleep(2000);
////        driver.findElement(By.xpath("(//span[text()='chatgpt'])[1]")).click();
//        Thread.sleep(2000);
//WebElement element=driver.findElement(By.xpath("(//span[text()='chatgpt'])[1]"));
//Actions mouse=new Actions(driver);
//mouse.click(element).perform();
////mouse.moveToElement(element).perform();

//    
//		WebElement search = driver.findElement(By.name("q"));
//		search.sendKeys("Selenium");
//		search.sendKeys(Keys.ENTER);
        
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");

		WebElement box = driver.findElement(By.id("fullname"));
		box.sendKeys("Selenium Testing");

		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.perform();
        
        
        
        
//        driver.get("https://chatgpt.com/");
////      WebElement box=  driver.findElement(By.cssSelector("div[class='recaptcha-checkbox-checkmark']"));
////      box.click();
//
//        driver.findElement(By.cssSelector("button[data-testid='login-button']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("email")).sendKeys("saranyag1103@gmail.com");
//        driver.findElement(By.cssSelector("button[type='submit']")).click(); 
//        driver.findElement(By.xpath("button[type='submit']")).click();
	}

}
