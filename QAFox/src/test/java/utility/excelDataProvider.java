package utility;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;

public class excelDataProvider 
{

	public static FileInputStream FIS_ExcelData;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	
	
	public excelDataProvider() throws Exception
	{
		FIS_ExcelData = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testData.xlsx");
		workbook = new XSSFWorkbook(FIS_ExcelData);
	}
	
	
	@DataProvider(name="dataToTC2") // Providing data to TC2
	public String[][] dataReader() throws Exception
	{
		sheet = workbook.getSheet(configReader.readPS("testDataSheet")); // reading sheetName from properties file using user defined static method
		int totalRow = sheet.getLastRowNum();
		int totalCol = sheet.getRow(0).getLastCellNum();
		int i,j;	String arr[][] = new String[totalRow][totalCol];
		DataFormatter Format = new DataFormatter();

		for(i=1;i<=totalRow;i++)
		{
			for(j=0;j<totalCol;j++){
				arr[i-1][j] = Format.formatCellValue(sheet.getRow(i).getCell(j));}
		}
		return arr;
	}
	
	
	
	@DataProvider(name="dataToTC1_SignUP") // Providing data to TC1
	public String[][] dataReader_TC1() throws Exception
	{
		sheet = workbook.getSheet(configReader.readPS("registerSheet")); // reading sheetName from properties file using user defined static method
		int totalRow = sheet.getLastRowNum();
		int totalCol = sheet.getRow(0).getLastCellNum();
		int i,j;	String arr[][] = new String[totalRow][totalCol];
		DataFormatter Format = new DataFormatter();

		for(i=1;i<=totalRow;i++)
		{
			for(j=0;j<totalCol;j++){
				arr[i-1][j] = Format.formatCellValue(sheet.getRow(i).getCell(j));}
		}
		return arr;
	}
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////
	/*
	public static void display() throws Exception										//
	{
		excelDataProvider OB = new excelDataProvider();
	
		int a,b;
		int lastCol,lastRow;
		String arr1[][] = new String[50][50];

		lastRow = sheet.getLastRowNum();
		lastCol = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total Row -->"+lastRow); //6								//
		System.out.println("Total Col -->"+lastCol); //2
		for(a=1;a<=lastRow;a++)
		{
			for(b=0;b<lastCol;b++)
			{
			//System.out.print(sheet.getRow(a).getCell(b) + " || ");					//
			arr1[a][b]=sheet.getRow(a).getCell(b).toString();
			}
			System.out.println("");
		}
		System.out.println("----------------------");
		
		for(a=1;a<=lastRow;a++)
		{
			for(b=0;b<lastCol;b++)
			{
			System.out.print(arr1[a][b]);												//
		
			}
			System.out.println("");
		}
		
		
	} */
	///////////////////////////////////////////////////////////////////////////////////////////
	
}

