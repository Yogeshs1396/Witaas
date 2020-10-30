package Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Ex {

	private static XSSFWorkbook workbook;

	public static void main(String[] args) throws IOException {

		workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("firstsheet");
		XSSFRow row0 = sheet0.createRow(0);

		Cell cella = row0.createCell(0);
		Cell cellb = row0.createCell(1);
		cella.setCellValue("Rating");
		cellb.setCellValue(4);
		File f = new File("F:\\Training\\CS2.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		workbook.write(fo);
		fo.close();
		System.out.println("File created");

	}

}

