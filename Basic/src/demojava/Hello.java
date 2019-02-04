package demojava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Hello {

	@Test

	public void print() {

		System.out.println("Welcome to jenkin");

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\asit.n\\Desktop\\JAVA and Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
