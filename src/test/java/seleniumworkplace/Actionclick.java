package seleniumworkplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclick {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://qa-practice.netlify.app/checkboxes");
	WebElement chekbox =driver.findElement(By.id("checkbox1"));
	Actions mouseAction=new Actions(driver);
	mouseAction.moveToElement(chekbox).click().perform();
	boolean isselect=chekbox.isSelected();
	System.out.println( isselect);
	
//	mouseAction.moveByOffset(0,190).click().perform();
	


	}

}
