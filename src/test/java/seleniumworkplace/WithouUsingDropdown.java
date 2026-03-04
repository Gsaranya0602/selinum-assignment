package seleniumworkplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class WithouUsingDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement dropdown=driver.findElement(By.id("course"));
		dropdown.click();
	 driver.findElement(By.cssSelector("option[value='python']")).click();//dirct aha click pandrathu
	 
//		WebElement option=driver.findElement(By.cssSelector("option[value='python']"));//webelement  aha find pannittu approm click pandrathu
//		option.click();
	 
//		String text=option.getText();//click panna text(java) aha print panni pakkurathu
//		System.out.println(text);
//		
		

	}

}
