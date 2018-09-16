package pageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopRatedMovies {
WebDriver driver;
	
	public TopRatedMovies(WebDriver driver) {
		this.driver = driver;
	}
	
	By colHeader = By.xpath("//*[@id='main']/div/span/div/div/div[3]/table/thead/tr/th");
	By colBodyTitle = By.xpath("//*[@id='main']/div/span/div/div/div[3]/table/tbody/tr/td[2]");
	By colBodyRank = By.xpath("//*[@id='main']/div/span/div/div/div[3]/table/tbody/tr/td[3]");
	
	public List<String> GetMovieHeader() {
	
		List<WebElement> headerRow = driver.findElements(colHeader);
			
		//System.out.println("Headers in table are below:");
		//System.out.println("Total headers found: "+headerRow.size());
		List<String> ListHeader = new ArrayList<String>();

		for(WebElement header:headerRow)
		{
			//System.out.println(header.getText());
			if(!header.getText().isEmpty()) {
				ListHeader.add(header.getText()); }
		}
		return (ListHeader);

	}
	
	public List<String> GetMovieTitle() {
		
		List<WebElement> bodyRow1 = driver.findElements(colBodyTitle);
		
		//System.out.println("Total rows found: "+bodyRow.size());
		List<String> ListBodyTitle = new ArrayList<String>();
		for(WebElement body:bodyRow1)
		{
			//System.out.println(body.getText());
			if(!body.getText().isEmpty()) {
			ListBodyTitle.add(body.getText()); }
		}
		//System.out.println("No. of elements present in body: "+ListBody.size());
		return (ListBodyTitle);
	}	
	
	public List<String> GetMovieRank() {
		
		List<WebElement> bodyRow2 = driver.findElements(colBodyRank);
		
		//System.out.println("Total rows found: "+bodyRow.size());
		List<String> ListBodyRank = new ArrayList<String>();
		for(WebElement body:bodyRow2)
		{
			//System.out.println(body.getText());
			if(!body.getText().isEmpty()) {
			ListBodyRank.add(body.getText()); }
		}
		//System.out.println("No. of elements present in body: "+ListBody.size());
		return (ListBodyRank);
	}
}

