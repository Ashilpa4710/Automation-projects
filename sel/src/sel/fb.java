package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class fb {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver .findElement(By.id("email")).sendKeys("ash");
		driver .findElement(By.id("pass")).sendKeys("ashi");
		driver .findElement(By.id("loginbutton")).click();
		driver.close();
	}

}
