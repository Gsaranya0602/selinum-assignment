package assignmentSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableexcercice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement table =	driver.findElement(By.tagName("table"));
	WebElement row=table.findElements(By.tagName("tr")).get(3);
	
		List<WebElement>cells=row.findElements(By.tagName("td"));
		for(WebElement cell:cells) {
		System.out.print(cell.getText()+" ");
	}
	
		

	}

}
