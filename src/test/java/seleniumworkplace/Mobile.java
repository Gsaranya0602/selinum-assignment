package seleniumworkplace;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Mobile {

	public static void main(String[] args) {
		 // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.demoblaze.com/prod.html?idp_=1");

        driver.manage().window().maximize();

       

        // Click Add to cart
        driver.findElement(By.xpath("div>a[onclick='addToCart(1)']")).click();

	}

}
