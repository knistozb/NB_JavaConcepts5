
package nb_cl9_hw9_pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NB_cl9_hw9 {

	
	// Assignment:

		// 1. Create 500 random (unique) numbers and put them in a spreadsheet in the first column. Should have 500 rows
		 

		// 2. From the same spreadsheet (part 1)
			// a. Read out the data and syso it in console all 500 random numbers.
	

	
	
	// Question 1: Create 500 random (unique) numbers and put them in a spreadsheet in the first column. Should have 500 rows

	public static void main(String[] args) throws IOException {

		// Writing the spreadsheet
		XSSFWorkbook hw9wb1 = new XSSFWorkbook();
		XSSFSheet hw9ws1 = hw9wb1.createSheet("My HW9");  // Sheet inside the workbook
		
			
		for(int i=0; i<500; i++) {
		hw9ws1.createRow(i).createCell(0).setCellValue(i+1);
		}	
	
		String filelocation = "Data/ExcelHW9.xlsx";   // the extension for excel is .xlsx
			
		File nk1 = new File(filelocation);
		FileOutputStream filewrite = new FileOutputStream(nk1);
			
		hw9wb1.write(filewrite);
			
		
		System.out.println("This should create a brand new excel for this Homework, and completed the task of Question 1!");
		
		filewrite.close();
		
		System.out.println("\n======= End of Question # 1 =========");
		
		// Question 2. From the same spreadsheet (part 1)
		
		// Reading the spreadsheet
		// a. Read out the data and syso it in console all 500 random numbers.
	
		String filepath = "Data/ExcelHW9.xlsx"; 
		
		File nk2 = new File(filepath);
		FileInputStream fileread = new FileInputStream(nk2);
		
		Workbook hw9wb2 = WorkbookFactory.create(fileread);
		Sheet hw9ws2 = hw9wb2.getSheetAt(0);

		
		for (int i =0; i<=500; i++) {
			Row hw9r = hw9ws2.getRow(i);
			Cell hw9c = hw9r.getCell(0);
			System.out.println(hw9c);         // this is just going to print 1 in each line for 500 times since we haven't increased by using the i
//			System.out.println(r0.getCell(0));   // 
//			System.out.println(hw9ws2.getRow(i).getCell(0));	
		}
		
		System.out.println("This should read the newly created Homework excel file, and bring it in the console.");
		
		System.out.println("\n======= End of Question # 2 =========");
		
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

		System.out.println("Good job!! You have now completed the JAVA Assignment #9.");
		
		
		
		fileread.close();
		
		}	

}
