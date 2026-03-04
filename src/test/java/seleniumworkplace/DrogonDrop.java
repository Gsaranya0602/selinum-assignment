package seleniumworkplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogonDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		WebElement src =driver.findElement(By.cssSelector("img[src='logo.png']"));
		WebElement dest =driver.findElement(By.id("droparea"));
		Actions mouseAction=new Actions(driver);
//		mouseAction.dragAndDrop(src,dest).perform();
		mouseAction.dragAndDropBy(src,260,0).perform();

	}

}
