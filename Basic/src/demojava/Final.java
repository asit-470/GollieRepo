package demojava;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Final {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asit.n\\Desktop\\JAVA and Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://suryainternational.azurewebsites.net/Admin/");
				driver.findElement(By.name("txtLoginName")).sendKeys("jyotiprakash.m@kencloud.co.in");
				driver.findElement(By.name("txtPassword")).sendKeys("Test@1234");
				driver.findElement(By.name("btnSignin")).click();
				
				
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//a[@href='GalleryDetails.aspx']")).click();
				driver.findElement(By.id("CPMain_btnAddGalary")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Thread.sleep(5000);
				driver.findElement(By.id("ctl00_CPMain_RadWindowGallary_C_RadDropDownProducts")).click();
				Thread.sleep(5000);
				
			
				
	}}