
public class ReadingValuesFromExcel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "E:\\ShahAscentSelTraining\\SeleniumTraining\\src\\InputTestData\\TestData.xlsx";
		ExcelReader xl = new ExcelReader(filePath);
		
		String uName = xl.getCellData("Login", "Username", 2);
		String pwd = xl.getCellData("Login", "Password", 2);
		System.out.println(uName);
		System.out.println(pwd);
		xl.addColumn("Login", "Shah");
		xl.setCellData("Login", "Shah", 2, "PASS");
		

	}

}
