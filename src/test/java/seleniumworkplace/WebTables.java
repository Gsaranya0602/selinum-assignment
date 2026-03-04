package seleniumworkplace;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		String url="https://www.tutorialspoint.com/selenium/practice/webtables.php";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
//		WebElement table=driver.findElement(By.tagName("table"));
//		List<WebElement>row=driver.findElements(By.tagName("tr"));
//		for(WebElement rows:row) {
//			List<WebElement>cells=rows.findElements(By.tagName("td"));
//			for(WebElement cell:cells) {
//				System.out.print(cell.getText()+"\t");//  "\t"-means( 1 time press tab key)
//			}
//			System.out.print("\n");// move to next line (or) add mt line
//		}
		
		

		WebElement table = driver.findElement(By.tagName("table"));

		// Get first row (after header)
		WebElement row = table.findElements(By.tagName("tr")).get(2);//get(2) = get the second row

		// Get cells of that row
		List<WebElement> cells = row.findElements(By.tagName("td"));

		for(WebElement cell : cells) {
		    System.out.print(cell.getText()+" ");
		}

		
		driver.quit();
	}

}
