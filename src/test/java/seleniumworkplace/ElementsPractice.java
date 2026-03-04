package seleniumworkplace;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementsPractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement lik:links) {
			
			System.out.println(lik.getAttribute("href"));
		
		}
		
//		driver.get("https://www.tutorialspoint.com/");
//		List<WebElement>image=driver.findElements(By.tagName("img"));
//		for(WebElement images:image) {
//			System.out.println(images.getAttribute("src"));
//		}
//		
	}

}
