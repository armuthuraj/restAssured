package restAssuredDemo1;

import org.testng.annotations.DataProvider;

public class DataForTests {
	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost() {
		
		//First way of pssing data
		/*Object[][] data = new Object[2][3];
		data[0][0]= "ssadaf";
		data[0][1]= "fdfff";
		data[0][2] = 1;
		
		data[1][0]= "ssarrrdaf";
		data[1][1]= "fdfrrwdff";
		data[1][2] = 2;
		
		return data;*/
		
		//Second way of passing data
		
		return new Object[][] {
				{"dfdsf", "dfdfewrv",1},
				{"dfsdfsdf","fdfopko",2}
		};
	}
	
	@DataProvider(name = "dataForDelete")
	public Object [] dataForDelete() {
		return new Object[] {
				4,5,6,7
		};
	}
}
