package utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectToSQLite {
	
	public static void connectDatabase(String fileName, String movieName, String rating) {
		String url = "jdbc:sqlite:C:/sqlite/db/"+fileName;
		String createTable = "CREATE TABLE IF NOT EXISTS TopRatedMovies" + "("+movieName+" text, " +rating+" text);";
		System.out.println("Connection URL is: "+url);
		System.out.println("Create table query is: " +createTable);
		
		try {
		//Establish connection
			Connection conn = DriverManager.getConnection(url);
        if(conn!=null) {
      	
        //Create a new database
        	DatabaseMetaData meta = conn.getMetaData();
        	System.out.println("Connection to SQLite has been established.");
        	System.out.println("The driver name is: "+meta.getDriverName());
        	System.out.println("A new database has been created.");
        	
        	 Statement stmt = conn.createStatement(); 
        	//Create a new Table
             stmt.execute(createTable);
             System.out.println("New table has been created.");
        	}   

		} catch (SQLException e) {
            System.out.println(e.getMessage());
        	}
	}
		  
	public static void insertData(String RankTitle, String IMDbRating) {
		String url = "jdbc:sqlite:C:/sqlite/db/DB1.db";
		String deleteData= "DELETE FROM TopRatedMovies";
		String insertQuery = "INSERT INTO TopRatedMovies (RankTitle, IMDbRating) VALUES (?,?)";
        try {
        	Connection conn = DriverManager.getConnection(url);
        	//PreparedStatement pstmt1 = conn.prepareStatement(deleteData);
        	//pstmt1.executeUpdate();
        	PreparedStatement pstmt2 = conn.prepareStatement(insertQuery); 
            pstmt2.setString(1, RankTitle);
            pstmt2.setString(2, IMDbRating);
            pstmt2.executeUpdate();
                        	
        }	catch (SQLException e) {
            System.out.println(e.getMessage());
        	}
    }

	public static void fetchData() throws IOException{
		String url = "jdbc:sqlite:C:/sqlite/db/DB1.db";
        
    try {
    	Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        String selectQuery = "SELECT RankTitle, IMDbRating FROM TopRatedMovies";
        
        ResultSet rs = stmt.executeQuery(selectQuery);
        
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\Projects\\Koko Assignment\\DBResults.html"));
        pw.println("<TABLE BORDER><TR><TH>Movie Name (Year)</TH><TH>IMDb Rating</TH></TR>");
        
        while(rs.next()) {
        	pw.println("<TR><TD>" + rs.getString("RankTitle") + "</TD><TD>" +rs.getString("IMDbRating")+"</TD>" );
        	}
        
        pw.println("</TABLE>");
        pw.close();
        }	
        catch (SQLException e) {
        System.out.println(e.getMessage());
    	}
    
	}
}
