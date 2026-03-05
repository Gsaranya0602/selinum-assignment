package seleniumworkplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocaters {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		WebElement text=driver.findElement(By.id("fullname"));
		
		WebElement label=driver.findElement(RelativeLocator.with(By.tagName("h1")).above(text));
		System.out.println(label.getText());
		
		WebElement fullname=driver.findElement(RelativeLocator.with(By.tagName("label")).toLeftOf(text));
		System.out.println(fullname.getText());
		
		WebElement submit=driver.findElement(RelativeLocator.with(By.tagName("input"))
				.below(By.id("password")));
		System.out.println(submit.getAttribute("value"));
		
		
		
		 driver.close();

	
	}

}
