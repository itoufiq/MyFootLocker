package utilities;

import org.testng.annotations.DataProvider;

public class MyDataProvider {
	ReadExcelFiles rxl = new ReadExcelFiles();
	@DataProvider(name="createAnAccount")
	public String[][] datapro() {
		String [][] datas = new String [rxl.workshtt.getLastRowNum()][rxl.workshtt.getRow(0).getLastCellNum()];
		for (int i=1; i<=rxl.workshtt.getLastRowNum();i++) {
			for (int j=0;j<rxl.workshtt.getRow(0).getLastCellNum();j++) {
				datas[i-1][j]=rxl.workshtt.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return datas;
	}

}
