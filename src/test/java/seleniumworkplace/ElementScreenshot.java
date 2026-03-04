package seleniumworkplace;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {
// one Element mattum screenshot edukka
	public static void main(String[] args) throws IOException {
		String	path ="C:\\Users\\LENOVO\\eclipse-workspace\\seleniumworkplace\\screenshot\\screen.npg";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Random rnd=new Random();
		int no=rnd.nextInt();
		String path1=path+no+".png";
		WebElement botton=driver.findElement(By.id("login-button"));
		File src= botton.getScreenshotAs(OutputType.FILE);
		File dest=new File(path1);// it's create file
		FileUtils.copyFile(src,dest);

	}

}
