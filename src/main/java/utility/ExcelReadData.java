package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {
	
	public static String readData(String sheetname,int rownum,int cellnum) throws IOException
	{
		String path="C:\\Users\\Sagar\\eclipse-workspace\\TestProject\\src\\main\\java\\testexceldata\\Logindata.xlsx";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}

}
