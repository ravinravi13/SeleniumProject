package Utilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	
	
	public static String[][] ReadExcel()
	{
		String FileLoaction ="./test-data/Logindata.xlsx";
		XSSFWorkbook wbook = null;
		
		try {
			 wbook = new XSSFWorkbook(FileLoaction);
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		XSSFSheet sheet = wbook.getSheetAt(0);
		int row_length = sheet.getLastRowNum();
		System.out.println("row :"+row_length);
		short cell_length = sheet.getRow(0).getLastCellNum();
		System.out.println("cell :"+cell_length);
		String data[][] = new String[row_length][cell_length];
		for(int i=1;i<=row_length;i++)
		{
			 XSSFRow row = sheet.getRow(i);
			 for(int j=0;j<cell_length;j++)
			 {
				 XSSFCell cell = row.getCell(j);
				 DataFormatter df = new DataFormatter();
				  String Value = df.formatCellValue(cell);
				  data[i-1][j] = Value;
			 }
		}
		return data;
	}
}



