package seleniumworkplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://qa-practice.netlify.app/checkboxes");
			WebElement checkbox =driver.findElement(By.xpath("//div[@id='content']/h2"));
			Actions mouseAction=new Actions(driver);
			System.out.println(checkbox.getText());
			mouseAction.doubleClick(checkbox).perform();
			mouseAction.contextClick(checkbox).click().perform();//it's perform  right click
	}

}
//h2[text()='Checkboxes']