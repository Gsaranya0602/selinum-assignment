package assignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyexample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		WebElement box = driver.findElement(By.id("fullname"));
		box.sendKeys("Selenium Testing");

		Actions act = new Actions(driver);

//		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
		act.sendKeys(Keys.ENTER).perform();// ENTER next 
		
//		Actions act = new Actions(driver);
//
//		act.keyDown(Keys.CONTROL)
//		.sendKeys("a")
//		.keyUp(Keys.CONTROL)
//		.sendKeys(Keys.DELETE)
//		.perform();
	}

}
