package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class countnooflinksheader {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SWT\\\\Desktop\\\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String homepage="https://www.nejm.org/";
		driver.get(homepage);
		System.out.println("Total link count"+driver.findElements(By.tagName("a")).size());
		WebElement head=driver.findElement(By.id("navbar-main"));
		System.out.println("Total link in head"+driver.findElements(By.tagName("a")).size());
		WebElement footer=driver.findElement(By.id("footer"));
		System.out.println("Total link in footer"+driver.findElements(By.tagName("a")).size());		
	}

}
