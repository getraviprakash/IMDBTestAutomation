package Test.DemoIMDBMovies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	static WebDriver driver;
	String URL = "https://www.imdb.com/chart/top?ref_=ft_250";
	
	  @BeforeSuite				// It is run once, before all Tests in the suite
	  public void beforeSuite() throws InterruptedException {
		  System.out.println("Launching Browser");
		  //Mention the path of chromedriver file.
		  System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Workspace\\DemoIMDBMovies\\Resources\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(URL);
		  System.out.println("Browser is opened.");  
	  }

	  @AfterSuite(enabled = true)				// It is run once, after all Tests in the suite
	  public void afterSuite() {
		  System.out.println("Closing Browser");
		  driver.quit();
	  }
}
