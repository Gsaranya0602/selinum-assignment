package assignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://vinothqaacademy.com/wait-statement/");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.id("vtsBtn"));
		button.click();
		
		WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(10));
		WebElement textbox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
		textbox.sendKeys("HELLO");
       }
    }
