package utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

public static void main (String [] args) throws IOException{
	
	FileInputStream fis = new FileInputStream("D:\\Ravi Agrawal\\Practice\\Test.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
    //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
    //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
	Row row1 = sheet.getRow(0);
	Cell cell1 = row1.getCell(0);
	//System.out.println(cell1);
	//System.out.println(sheet.getRow(0).getCell(0));
	String textRead = cell1.getStringCellValue();
	System.out.println(textRead);
	//String cellval = cell.getStringCellValue();
	//System.out.println(cellval);
	
	Row row2 = sheet.createRow(1);
	Cell cell2 = row2.createCell(0);
	String textToWrite = "I'm Ravi and learning Java.";
	//cell2.setCellType(cell2.CELL_TYPE_STRING);
	cell2.setCellValue(textToWrite);
	FileOutputStream fos = new FileOutputStream("D:\\Ravi Agrawal\\Practice\\Test.xlsx");
	wb.write(fos);
	fos.close();
	System.out.println("END OF WRITING DATA IN EXCEL");
	
	}
} 