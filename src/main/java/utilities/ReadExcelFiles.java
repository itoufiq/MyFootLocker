package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFiles {
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet workshtt;
	
	public XSSFSheet readFromExcel(String path) throws Exception {
		try {
			//FileReader flr = new FileReader(new File(path));
			//BufferedReader bfr = new BufferedReader(flr);
			 fis = new FileInputStream(new File(path));
			 workbook = new XSSFWorkbook(fis);
			//XSSFSheet worksht = workbook.getSheet("createAcPage");
			workshtt = workbook.getSheetAt(0);
					
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return workshtt;
		
		
	}

}
