package assignmentSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Random;

//1. Navigate to the page https://www.tutorialspoint.com/ and take the screenshot after a bit of scroll

public class ScreenshotAssignment1 {

	public static void main(String[] args) throws IOException {
		String location="C:\\Users\\LENOVO\\eclipse-workspace\\seleniumworkplace\\screenshot\\screen.jpg";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Random rand=new Random();
		int num=rand.nextInt();
		String location1 =location+num+".png";
		
		
		Actions mouseAction=new Actions(driver);
		mouseAction.scrollByAmount(0,100).perform();
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File temporary=screenshot.getScreenshotAs(OutputType.FILE);
		File permanent=new File(location1);
		FileUtils.copyFile(temporary, permanent);
		driver.close();
		
	

	}

}
