package seleniumworkplace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username =driver.findElement(By.id("user-name"));
//		new Actions(driver).sendKeys(username, "hi").perform();
//		new Actions(driver).click(username).sendKeys( "hello").perform();//username box focus pannittu type pannum
		
		
		WebElement password =driver.findElement(By.id("password"));
		Actions key=new Actions(driver);
		key.click( password).sendKeys("hi").perform();
		System.out.println(password.getAttribute("value"));
//		key.keyDown(Keys.CONTROL).sendKeys(password,"A").keyUp(Keys.CONTROL).perform();//select  the "hi" text from password box
//		key.keyDown(Keys.CONTROL).sendKeys(password,"C").keyUp(Keys.CONTROL).perform();//copy the "hi" text from password box
//		key.keyDown(Keys.CONTROL).sendKeys(password,"v").keyUp(Keys.CONTROL).perform();//paste the "hi" text in username box
		
		
		
		

	}

}
