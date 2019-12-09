package corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class DatDrivenApproach {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\yangala\\Desktop\\Book3.xlsx");
		System.out.println("File Found");
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		String name = sheet.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println("name:"+name);
		
		/*

		 * int last_row = sheet.getLastRowNum();
		
		for(int row=0;row<last_row;row++)
		{
			int last_cell = sheet.getRow(row).getLastCellNum();
			
			for (int cell = 0; cell <last_cell; cell++) 
			{
				if(cell!=1)
					System.out.print(" |"+sheet.getRow(row).getCell(cell).getStringCellValue());
				else
					
				{
					double age = sheet.getRow(1).getCell(1).getNumericCellValue();
					System.out.print(" |"+NumberToTextConverter.toText(age));
					
				}
				
			}
			System.out.println("\n");
		}
		book.close();
		
		 */
	}

}
