package testfunc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class extest {

	private static Workbook workbook;

	@Test()
	public void getexcel() throws IOException

	{

		File f = new File("F:\\Training\\CS1.xlsx");
		FileInputStream fi = new FileInputStream(f);

		Workbook workbook = WorkbookFactory.create(fi);
		Sheet sheet0 = workbook.getSheetAt(0);
		DataFormatter dataFormatter = new DataFormatter();

		/*
		 * Row row0 = sheet0.getRow(0); Cell cellB = row0.getCell(1);
		 * System.out.println(cellB);
		 */

		System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
		for (Row row : sheet0) {
			for (Cell cell : row) {
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.print(cellValue + "\t");
				if (cellValue.contains("RATINGS")) {

					if (cellValue.valueOf(4) != null) {

						System.out.println("Driver will click");

					}
				}
			}

		}

	}



}



