package assignmentSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//1. Navigate to https://www.globalsqa.com/demo-site/draganddrop/
//    Dragndrop the images from "Photo Manager" to "Trash" also
//    include a logic in ur script to ensure that the dropped item added to the trash.

public class Action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		WebElement frameelement=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frameelement);
		
	 List<WebElement> images=driver.findElements(By.cssSelector("#gallery>li"));
	
	   WebElement trash=driver.findElement(By.id("trash"));

	 Actions move=new Actions(driver);
	 int photo=0;
     for(WebElement image:images) {
	 move.dragAndDrop(image,trash).perform();
	 photo++;
	 }
     List<WebElement> trashImages = driver.findElements(By.xpath("//div[@id='trash']//li"));

     if (trashImages.size() == photo) {
         System.out.println("All images successfully added to Trash");
     } else {
         System.out.println("Drag and Drop Failed");
     }
     driver.quit();

   

   

//2. Navigate to https://www.globalsqa.com/
//    Mouse hover on "Free EBooks" and then select "Free Machine Learning Ebooks"
//		
//		
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://www.globalsqa.com/");
//		driver.manage().window().maximize();
//       WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(20));
//
//		WebElement freeEbooks=
//				wait.until(ExpectedConditions.visibilityOfElementLocated
//						(By.cssSelector("a.no_border[href='https://www.globalsqa.com/free-ebooks/']")));
//     
//		WebElement machineLearning = driver.findElement( 
//				By.cssSelector("#menu-item-7132>a[href='https://www.globalsqa.com/free-machine-learning-ebooks/']")
//				);
//
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(freeEbooks).perform();
//		act.moveToElement(machineLearning).click().perform();
//		
	}

}
