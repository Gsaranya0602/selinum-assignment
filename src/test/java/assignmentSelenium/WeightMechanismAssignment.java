package assignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightMechanismAssignment {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		WebElement txtbox=driver.findElement(By.id("txt2"));
		WebElement button2=	driver.findElement(By.id("btn2"));
		
		if(txtbox.isEnabled()) {
			txtbox.sendKeys("hello");
			button2.click();
		}
		button2.sendKeys("hi");
		

	}

}
