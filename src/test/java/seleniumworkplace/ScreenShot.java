package seleniumworkplace;

import java.io.File;
import java.io.IOException;
import java.util.random.*;
import java.util.Random;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
//		String	path ="C:\\Users\\LENOVO\\eclipse-workspace\\seleniumworkplace\\screenshot\\screen.png";
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//	
//		TakesScreenshot screenshot=(TakesScreenshot) driver;// it is used to take screen shot
//		File src=screenshot.getScreenshotAs(OutputType.FILE);// temporay save file
//		File dest=new File(path);//it is used to create file & permanant save file
//		FileUtils.copyFile(src,dest);
		
		// using Random
		//it's give number for (path)its help to avoid duplicate screenshot file
		String	path ="C:\\Users\\LENOVO\\eclipse-workspace\\seleniumworkplace\\screenshot\\screen.png";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/");
		Random rnd=new Random();
		int no=rnd.nextInt();
		String path1=path+no+".png";
		TakesScreenshot screenshot=(TakesScreenshot) driver;// it is used to take screen shot
		File src=screenshot.getScreenshotAs(OutputType.FILE);// temporay save file
		File dest=new File(path1);//it is used to create file & permanant save file
		FileUtils.copyFile(src,dest);
		driver.close();
		
	}

}
