package seleniumworkplace;

import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parenthandle= driver.getWindowHandle();
				WebElement windowbutton=driver.findElement(By.id("newWindowBtn"));
				windowbutton.click();
				
			Set <String> handles=driver.getWindowHandles();
			
			for (String handle:handles) {
				
				if(!handle.equals(parenthandle)) {
					
					driver.switchTo().window(handle);
					System.out.println("child handle:"+handle);
					System.out.println(driver.getTitle());
				}
				System.out.println("Parent handle:"+handle);
			}
			driver.quit();
				

	}

}
