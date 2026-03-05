package assignmentSelenium;
 
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Preview {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/");
		driver.manage().window().maximize();
       WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(20));

		WebElement freeEbooks=
				wait.until(ExpectedConditions.visibilityOfElementLocated
						(By.cssSelector("a.no_border[href='https://www.globalsqa.com/free-ebooks/']")));
     
		WebElement machineLearning = driver.findElement( 
				By.cssSelector("#menu-item-7132>a[href='https://www.globalsqa.com/free-machine-learning-ebooks/']")
				);

		Actions act = new Actions(driver);
		
		act.moveToElement(freeEbooks).perform();
		act.moveToElement(machineLearning).click().perform();
		
	}

}