package seleniumworkplace;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultiselector { 

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement dropdown=driver.findElement(By.id("ide"));
		Select option=new Select(dropdown);
        option.selectByValue("ec");
		option.selectByVisibleText("IntelliJ IDEA");
		option.selectByVisibleText("Visual Studio");
		List<WebElement>selection=option.getAllSelectedOptions();
		for(WebElement selections:selection) {
			System.out.println(selections.getText());
		}
		Thread.sleep(2000);
		driver.quit();
		

	}

}
