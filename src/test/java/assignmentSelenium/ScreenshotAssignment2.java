package assignmentSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotAssignment2 {
	//2. Navigate to https://www.qa-practice.com/ and take screenshot of "Text Input"
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\LENOVO\\eclipse-workspace\\seleniumworkplace\\screenshot\\INPUTscreen.jpg";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa-practice.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Random rand=new Random();
		int num=rand.nextInt();
		String path1 =path+num+".png";
		
		WebElement input=driver.findElement(By.cssSelector("li>a[href='/elements/input/simple']"));
		
		File temporary=input.getScreenshotAs(OutputType.FILE);
		File permanent=new File(path1);
		FileUtils.copyFile(temporary, permanent);
		driver.quit();
		
		
	}

}
