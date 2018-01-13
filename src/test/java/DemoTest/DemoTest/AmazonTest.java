package DemoTest.DemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTest {
public static WebDriver driver; 

	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
	}
	
	@Test
	public void searchProduct(){
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("sports shoes");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
}
