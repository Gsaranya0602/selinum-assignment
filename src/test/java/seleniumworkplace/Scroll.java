package seleniumworkplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class Scroll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		
		WebElement dest =driver.findElement(By.id("mongo"));
		Actions mouseAction=new Actions(driver);
//		mouseAction.scrollToElement(dest).perform();// scroll the page for visible specific element
		
//		mouseAction.scrollByAmount(0,600).perform();
		
		ScrollOrigin scroll=ScrollOrigin.fromElement(dest);// scroll the page from this (dest) element
		mouseAction.scrollFromOrigin(scroll,400,500).perform();//(dest) element la irunthu page scroll agum nama kuduthurukka 
		                                                            // mesurement alavukku
		
	}

}
