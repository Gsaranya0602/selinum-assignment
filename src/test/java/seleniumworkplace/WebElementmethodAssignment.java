package seleniumworkplace;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Navigate to "https://www.demoblaze.com/"
//Get the text of "Samsung Galaxy S6" and print div>h2.name
//Click the link of "Samsung Galaxy S6"     //a[text()='Samsung galaxy s6']  //a[contains( text(),'Samsung galaxy s6]')    
//Click "Add to Cart" button   "//a[text()='Samsung galaxy s6']"
public class WebElementmethodAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver product=new ChromeDriver();
		product.get("https://www.demoblaze.com/");
		product.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement samsung=product.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
		System.out.print(samsung.getText());
		Thread.sleep(2000);
		
		WebElement samsungs6=product.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
		samsungs6.click();
		Thread.sleep(2000);
		
		WebElement button=product.findElement(By.cssSelector("a.btn"));
		button.click();
		Thread.sleep(2000);
		
//		WebElement cartbutton =product.findElement(By.cssSelector("a.btn"));
//		System.out.println("carttext:"+ cartbutton.getAttribute("onclick"));
//		
		
		
	product.close();	

	}

}
