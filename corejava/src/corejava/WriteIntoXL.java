package corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoXL {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\yangala\\Desktop\\Book1.xlsx");
		System.out.println("File Found");
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.createSheet("oxora");
		
		for(int i=0;i<5;i++)
		{
			sheet.createRow(i).createCell(i).setCellValue("YpReddy");
		}
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\yangala\\Desktop\\Book2.xlsx");
		
		book.write(fos);
		book.close();
	}

}
