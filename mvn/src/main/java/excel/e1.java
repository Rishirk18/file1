package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class e1 {
	
	@Test
	public void rew() throws IOException
	{
		
		//excel: apache poi, apache poi ooxml, apache poi ooxml schema
		
		File f= new File("C:\\Users\\admin\\Desktop\\Book1.xlsx");
		FileInputStream fis= new FileInputStream(f); 
		//convert that into workbook
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet= x.getSheetAt(0);
		
		//number of rows
		int row= sheet.getLastRowNum();
		System.out.println("Number of columns in first row is "+ row);
		
		//number of columns: row index
		int col= sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in first row is "+ col);
		
		//row index and column index
		//1,1
		XSSFCell data= sheet.getRow(1).getCell(1);
		System.out.println(data);
		
		//writing
		//2,2
		sheet.getRow(2).createCell(2).setCellValue("TEN");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
	}

}
