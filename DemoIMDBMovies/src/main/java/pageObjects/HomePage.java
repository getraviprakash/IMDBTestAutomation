package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	String ExpTitle = "IMDb - Movies, TV and Celebrities - IMDb";
	
	By mnuMovies = By.id("navTitleMenu");
	By mnuTopRated = By.linkText("Top Rated Movies");
	//WebElement web_Element_To_Be_Hovered  = driver.findElement(By.id("navTitleMenu"));
	//By mnuTopMovies = By.xpath("//*[@id="navMenu1"]/div[2]/ul[1]/li[6]/a");
	
	//By txtSearchBar = By.xpath(".//input[@placeholder='Search']");
	//By ProductCategory = By.xpath(".//*[@id='desktop-header-cnt']/div[2]/div[3]/div/ul/li[2]");
	
	
	public void VerifyTitle()
	{
		SoftAssert softAssert = new SoftAssert();
		String ActualTitle = driver.getTitle();
		softAssert.assertEquals(ActualTitle, ExpTitle, "Title of Myntra Home Page not as expected.");
		softAssert.assertAll();
	}
	
	
	public void GetMovieDetails() {
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(mnuMovies));
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.id("navTitleMenu")));
		//action.moveToElement(driver.findElement(By.linkText("Top Rated Movies")));
		//action.click().build().perform();
		action.moveToElement(driver.findElement(mnuMovies)).moveToElement(driver.findElement(mnuTopRated)).click().build().perform();
		
		
	}

}
	