package assignmentSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertAssignment {

	public static void main(String[] args) throws InterruptedException {
		String url=("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Handle normal Alert
		
		driver.findElement(By.cssSelector("button[onclick='showAlert()']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("AlertBox text:"+alert.getText());
		alert.accept();
		
		//Handle Prompt alert
		
	WebElement promptbox = driver.findElement(By.cssSelector("button[onclick='myPromp()']"));
	promptbox.click();
	Alert promptalert=driver.switchTo().alert();
	promptalert.sendKeys("HELLO");
	Thread.sleep(2000);
    String text =promptalert.getText();
     System.out.println("Prompt Alert text:"+text);
	promptalert.accept();
		
		driver.quit();
		
		
		

	}

}
