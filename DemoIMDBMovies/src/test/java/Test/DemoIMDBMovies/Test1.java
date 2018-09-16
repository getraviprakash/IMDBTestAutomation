package Test.DemoIMDBMovies;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Workspace\\DemoIMDBMovies\\Resources\\chromedriver.exe");
		  driver = new ChromeDriver();
	
		  driver.get("http://facebook.com");
	
		  System.out.println(driver.getTitle());
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		  Cookie name = new Cookie("This is my cookie.", "123456");
			driver.manage().addCookie(name);
			
			Set<Cookie> cookie = driver.manage().getCookies();
			
			for(Cookie c : cookie){
				System.out.println(c);
			}
	
	
	}
	}
