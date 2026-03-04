package seleniumworkplace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webelementmethod {

	public static void main(String[] args) {
		String url="https://www.saucedemo.com/";
	WebDriver browser=new ChromeDriver();
	browser.get(url);
	WebElement logo=browser.findElement(By.className("login_logo"));
	System.out.println(logo.getText());
	
	WebElement login=browser.findElement(By.cssSelector( "input[data-test='password']"));
	System.out.println(login.getAttribute("type"));
	
	browser.close();
	}
 
}
