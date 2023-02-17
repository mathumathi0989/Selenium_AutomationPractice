package Selenium.AutoPractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

	Object[][] arr;
	@DataProvider(name="dataN")
	public Object[][] excelData() throws IOException {
		File f = new File("D:\\Dummy.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	int CountSheets = wb.getNumberOfSheets();
	for(int i=0; i<CountSheets; i++) {
		String sh = wb.getSheetAt(i).getSheetName();
		if(sh.equalsIgnoreCase("userCred")) {
			XSSFSheet Sheet = wb.getSheet(sh);
		int countRow = Sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows " +countRow);
		
		HashMap<String,String> map = new HashMap<>();
		for(int j=1;j<countRow; j++) {
			String	username = Sheet.getRow(j).getCell(0).getStringCellValue();
			String	password = Sheet.getRow(j).getCell(1).getStringCellValue();
		map.put(username, password);
		}
		
	 arr = new Object[map.size()][2];
	
	int k = 0;
	for(String key: map.keySet()) {
		arr[k][0] = key;
		arr[k][1] = map.get(key);
		k++;
	}	
	
		}
		}
	return arr;

	
	}
	
		
	
	@Test(dataProvider = "dataN")
	public void metho(String uName, String pwd) throws IOException {
	
		System.out.println("Username is " +uName );
		System.out.println("Password is " +pwd);
		
	}
		
		
		
	}



