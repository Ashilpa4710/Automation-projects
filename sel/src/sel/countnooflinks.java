package sel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countnooflinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SWT\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String homepage="https://www.facebook.com/login/";
		driver.get(homepage);
		
		System.out.println("total link in foot "+driver.findElements(By.tagName("a")).size());
		WebElement foot=driver.findElement(By.id("footer"));
		System.out.println("total link in footer"+driver.findElements(By.tagName("a")).size());
	}

}
