package utility;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import base.*;

public class WriteToExcel
{

	public FileOutputStream FOS;
	public XSSFWorkbook ReportWorkbook;
	public XSSFSheet TestReportSheet;
	public XSSFRow TestReportRow;
	
	public WriteToExcel() throws Exception
	{
		FOS = new FileOutputStream("D:\\GIT_All_Local_Repo\\GIT_Local_QAFox_Automation\\QAFox\\test-output\\TestReport.xlsx");
		ReportWorkbook = new XSSFWorkbook();
		TestReportSheet = ReportWorkbook.createSheet("TestReport");
	}

	//===========================
	
	public void TestRepostExcel(String data1, int i , int j) throws Exception
	{
				
		XSSFRow TestReportRow = TestReportSheet.createRow(i);
		TestReportRow.createCell(j).setCellValue(data1);
	
	}	
		
	public void fileclose() throws Exception
	{
		ReportWorkbook.write(FOS);
		FOS.close();
	}
			
	//==========================

	
	
	
}
