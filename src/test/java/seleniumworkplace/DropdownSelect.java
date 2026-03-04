package seleniumworkplace;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	private static WebElement dropdown;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement dropdown=driver.findElement(By.id("course"));
		Select option=new Select(dropdown);//its only using for html<select>tag
		option.selectByIndex(2);//select "dotnet" with using selectByIndex(TYPE 1 dropdown selecter)
		
//		option.selectByValue("python");//select " python" with using  selectByvalue(type2 dropdown selecter
		System.out.println(option.getFirstSelectedOption().getText());
		Thread.sleep(2000);
//		dropdown.click();
//		WebElement option=driver.findElement(By.cssSelector("option[value='java']"));
//		

		driver.close();
		

	}

}
