package seleniumworkplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickDoubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-practice.netlify.app/double-click");
		WebElement element=driver.findElement(By.id("bugs-form"));
		Actions mouseAction=new Actions(driver);
		mouseAction.click(element).perform();//click element
//		mouseAction.doubleClick(element).perform();//double click
//		mouseAction.moveToElement(element).perform();//mouse hover
	}

}
