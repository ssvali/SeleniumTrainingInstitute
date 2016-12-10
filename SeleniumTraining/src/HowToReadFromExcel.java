import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class HowToReadFromExcel {
	
	public static XSSFSheet ExcelWSheet;
	public static XSSFWorkbook ExcelWBook;
	public static XSSFCell Cell;
	public static XSSFRow Row; 
	static FileOutputStream fileOut =null;
	public static String fPath;

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	/*String SheetName = "Login";
	int RowNum =1;
	int colNum =1;*/
	fPath = System.getProperty("user.dir")+"\\src\\InputTestData\\TestData.xlsx";
	File file = new File(fPath);
	System.out.println(fPath);
	FileInputStream fis = new FileInputStream(file);
	ExcelWBook = new XSSFWorkbook(fis);
	getCellData("Login",1,1);
	//getRowCount("Login");
	//getColumnCount("Login",3);
	setCellData("Login",2,2,"PASS");
	/*ExcelWSheet = ExcelWBook.getSheet(SheetName);
	Row = ExcelWSheet.getRow(RowNum);
	Cell = Row.getCell(colNum);
	String CellData = Cell.getStringCellValue();
	System.out.println(CellData);*/

	}
	
	public static String getCellData(String sheetname, int RowNum, int ColNum)
	{
		ExcelWSheet = ExcelWBook.getSheet(sheetname);
		Row = ExcelWSheet.getRow(RowNum);
		Cell = Row.getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		System.out.println(CellData);
		return CellData;
	}
	
	public static void getRowCount(String sheetname)
	{
		ExcelWSheet = ExcelWBook.getSheet(sheetname);
		int rCount = ExcelWSheet.getLastRowNum()+1;
		System.out.println(rCount);
	}
	
	public static void getColumnCount(String sheetname, int RowNum)
	{
		ExcelWSheet = ExcelWBook.getSheet(sheetname);
		int cCount = ExcelWSheet.getRow(RowNum).getLastCellNum();
		System.out.println(cCount);
	}
	
	public static void setCellData(String sheetname, int RowNum, int ColNum, String data) throws IOException
	{
		ExcelWSheet = ExcelWBook.getSheet(sheetname);
		Row = ExcelWSheet.createRow(RowNum);
		Cell = Row.createCell(ColNum);
		Cell.setCellValue(data);
		Row = ExcelWSheet.getRow(RowNum-1);
		/*if (Row == null)
			Row = ExcelWSheet.createRow(RowNum-1);
		
		Cell = Row.getCell(ColNum);	
		if (Cell == null)
	        Cell = Row.createCell(ColNum);
		
		Cell.setCellValue(data);*/

	    fileOut = new FileOutputStream(fPath);

	    ExcelWBook.write(fileOut);

	    fileOut.close();
	}
}
