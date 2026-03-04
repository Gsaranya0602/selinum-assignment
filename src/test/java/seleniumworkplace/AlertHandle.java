package seleniumworkplace;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//type 1 for Alert
//		driver.findElement(By.id("alertBox")).click();//find & click the (click Me)button
//		Alert popup=driver.switchTo().alert();//change the control to alertbox
//		Thread.sleep(2000);
//		System.out.println(popup.getText());// alert box kulla irukkura text print panna
//		popup.accept();//To click ok in alert box
//		
		//type 2 for Alert(Cancel kudukka)
//		driver.findElement(By.id("confirmBox")).click();//find & click the (click Me)button
//		Alert popup1=driver.switchTo().alert();//change the control to alertbox
//		Thread.sleep(2000);
//		System.out.println(popup1.getText());
//		popup1.dismiss();//To click cancel or close in Alert box
		
		//type 3
		driver.findElement(By.id("promptBox")).click();
		Alert popup3=driver.switchTo().alert();
		Thread.sleep(2000);
		popup3.sendKeys("hello");
		
		popup3.accept();
		
	}

}
