package seleniumworkplace;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {// vea vera website screen shot edukka ippdi method create pannivachuttu
//	                                \\ atha call panni screen shot eduthukkalam
	public static void takesScreenshot(TakesScreenshot screenshot,String path) throws IOException {
	
	File src=screenshot.getScreenshotAs(OutputType.FILE);
	File dest=new File(path);
	FileUtils.copyFile(src,dest);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	String	path ="C:\\Users\\LENOVO\\eclipse-workspace\\seleniumworkplace\\screenshot\\screen.npg";
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Random rnd=new Random();//it's give number for (path)its help to avoid duplicate screenshot file
	int no=rnd.nextInt();
	String path1=path+no+".png";
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	takesScreenshot(screenshot,path1);
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	takesScreenshot(screenshot,path1);

	
	
	
	

	}

}
