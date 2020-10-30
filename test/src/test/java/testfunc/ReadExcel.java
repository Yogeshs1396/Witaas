package testfunc;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("F:\\Training\\test.xlsx"); 
		XSSFWorkbook wb = new XSSFWorkbook(f);
		//XSSFSheet sheet = wb.getSheet("Registration");
		XSSFSheet sheet = wb.getSheetAt(0);
		int row=sheet.getLastRowNum();
		System.out.println(row);
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println(col);
		for(int i=0;i<=row;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<=col;j++)
			{
				String cellv=currentrow.getCell(j).getStringCellValue();
				System.out.print(" " +cellv);
			}
			System.out.println();
		}
				 
	}

}
