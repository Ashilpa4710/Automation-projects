package sel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mulwindowsinsta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SWT\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.linkText("Forgot password?")).click();
		Set<String>a=driver.getWindowHandles();
		Iterator<String>it=a.iterator();
		while(it.hasNext())
		{
			String childwindow=it.next();
			driver.switchTo().window(childwindow);
		}
	}

}
