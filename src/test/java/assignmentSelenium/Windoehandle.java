package assignmentSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windoehandle {

	public static void main(String[] args) throws InterruptedException {
		String url="https://vinothqaacademy.com/multiple-windows/";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parent=driver.getWindowHandle();
		
		WebElement windowbutton=driver.findElement(By.cssSelector("button[name='newbrowserwindow123']"));
		windowbutton.click();
		
		
		
		Set<String>child=driver.getWindowHandles();
		
		for(String handle:child) {
			
			if(!handle.equals(parent)) {
				driver.switchTo().window(handle);
			driver.manage().window().maximize();
			
			System.out.println("child window id:"+handle);
				System.out.println("child window title:"+driver.getTitle());
				
			}
			
			}
		
driver.quit();
	}

}
