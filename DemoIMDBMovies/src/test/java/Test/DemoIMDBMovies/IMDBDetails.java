package Test.DemoIMDBMovies;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.TopRatedMovies;
import utilities.ConnectToSQLite;

public class IMDBDetails extends BaseClass 
{
	HomePage objHomePage;
	TopRatedMovies objTopRatedMovies;
	
	@Test (priority = 1)
	public void VerifyUiElementsAndTitle() throws InterruptedException {
	HomePage objHomePage = new HomePage(driver);
	
	//objHomePage.VerifyTitle();
	//objHomePage.GetMovieDetails();
	}
	
	@Test (priority = 2)
	public void CaptureAndPrintMoviesData() throws IOException	{
	TopRatedMovies objTopRatedMovies = new TopRatedMovies(driver);
	ArrayList<String> movieHeader = (ArrayList<String>) objTopRatedMovies.GetMovieHeader();
	ArrayList<String> movieTitle = (ArrayList<String>) objTopRatedMovies.GetMovieTitle();
	ArrayList<String> movieRank = (ArrayList<String>) objTopRatedMovies.GetMovieRank();
	/*
	//Script for connecting to SQLite DB and creating table.
	String headerCol1 = movieHeader.get(0).replaceAll("\\s+", "").replaceAll("&", "");
	String headerCol2 = movieHeader.get(1).replaceAll("\\s+", "");
	ConnectToSQLite.connectDatabase("DB1.db", headerCol1, headerCol2);
	
	//Script for inserting records in table
	for (int i = 0; i < movieTitle.size(); i++) {
		ConnectToSQLite.insertData(movieTitle.get(i), movieRank.get(i));
		}
	*/
	//Fetching records from SQLite DB and printing results in Webpage.
	ConnectToSQLite.fetchData();
	
	}

}
