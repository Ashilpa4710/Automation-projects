package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SWT\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		System.out.println("title is " +driver.getTitle());
		String expected="Meet Guru99 – Free Training Tutorials & Video for IT Courses";
		String actual = driver.getTitle();
		if (expected.contentEquals(actual))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
