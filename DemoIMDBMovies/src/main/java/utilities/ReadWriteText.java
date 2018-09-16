package utilities;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteText {

	 public static void main(String [] args) throws IOException {
		 
		 /*FileReader is meant for reading streams of characters. 
		 For reading streams of raw bytes, consider using a FileInputStream.*/
		 FileReader fileReader = new FileReader("D:\\Ravi Agrawal\\Imp Links.txt"); 
		     /*BufferedReader reads text from a character-input stream, buffering characters 
		     so as to provide for the efficient reading of characters, arrays, and lines. */
		     BufferedReader bufferReader = new BufferedReader(fileReader);
		 
		     String textfromfile = null; //
		     // Using while loop to read the file until there are no more lines
		     while( (textfromfile = bufferReader.readLine()) != null ){
		         System.out.println(textfromfile);
		     }
		     fileReader.close();
		     // Close the BufferedReader object to prevent memory leak
		     bufferReader.close();
		 
	 
		     String textToWrite = "I am learning Java from SoftwareTestingMaterial.";
		     // Import BufferedWriter and FileWriter classes
		     /* BufferedWriter writes text to a character-output stream, buffering characters 
		     so as to provide for the efficient writing of single characters, arrays, and strings. */
		     //Import FileWriter and BufferedWriter class
		     BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("D:\\Ravi Agrawal\\Practice\\WriteToFile.txt"));
		     bufferWriter.write(textToWrite);
		         // Close the BufferedWriter object to prevent memory leak
		     bufferWriter.close();
	 
	 }
	}

