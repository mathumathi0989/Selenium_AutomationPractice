package Selenium.AutoPractices;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataPro {

	@Test(dataProvider="hashdata")
	public void login(String uName, String pwd) {
		System.out.println(uName);
		System.out.println(pwd);
	}
 
	
	
	@DataProvider(name="hashdata")
	public Object[][] getCre() {
		HashMap<String, String> map = new HashMap<>();
		map.put("mathu", "test12");
		map.put("mathi", "test34");
		Object[][] ar = new Object[map.size()][2];
		
		int i=0;
		for(String key: map.keySet()) {
			ar[i][0] = key;
			ar[i][1] = map.get(key);
			i++;
		}
		return ar;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
