package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constants;

public class ExcelUtility 
{

	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String  getStringData1(int a1,int b1,String sheet1) throws IOException
	
	{
		String filePath=Constants.TESTDATAFILE;
		f=new FileInputStream(filePath);
		w=new XSSFWorkbook(f);
		sh=w.getSheet(sheet1);
		Row r=sh.getRow(a1);
		Cell c=r.getCell(b1);
		return c.getStringCellValue();
		
	}
public static String  getStringData2(int a2,int b2,String sheet2) throws IOException
	
	{
		String filePath=Constants.TESTDATAFILE;
		f=new FileInputStream(filePath);
		w=new XSSFWorkbook(f);
		sh=w.getSheet(sheet2);
		Row r=sh.getRow(a2);
		Cell c=r.getCell(b2);
		return c.getStringCellValue();
		
	}
	
public static String  getStringData3(int a3,int b3,String sheet3) throws IOException

{
	String filePath=Constants.TESTDATAFILE;
	f=new FileInputStream(filePath);
	w=new XSSFWorkbook(f);
	sh=w.getSheet(sheet3);
	Row r=sh.getRow(a3);
	Cell c=r.getCell(b3);
	return c.getStringCellValue();
	
}

public static String  getStringData4(int a4,int b4,String sheet4) throws IOException

{
	String filePath=Constants.TESTDATAFILE;
	f=new FileInputStream(filePath);
	w=new XSSFWorkbook(f);
	sh=w.getSheet(sheet4);
	Row r=sh.getRow(a4);
	Cell c=r.getCell(b4);
	return c.getStringCellValue();
	
}

public static String  getStringData5(int a5,int b5,String sheet5) throws IOException

{
	String filePath=Constants.TESTDATAFILE;
	f=new FileInputStream(filePath);
	w=new XSSFWorkbook(f);
	sh=w.getSheet(sheet5);
	Row r=sh.getRow(a5);
	Cell c=r.getCell(b5);
	return c.getStringCellValue();
	
}


	
	  public static String getIntegerData5(int a,int b,String sheet5) throws  IOException 
	  { 
	String filePath=Constants.TESTDATAFILE; 
	f=new FileInputStream(filePath); 
	w=new XSSFWorkbook(f);
	sh=w.getSheet(sheet5);
	Row r=sh.getRow(a); 
	Cell c=r.getCell(b);
	int x=(int) c.getNumericCellValue();
	  
	  return String.valueOf(x);
	  
	  }
	  
	  public static String  getStringData6(int a6,int b6,String sheet6) throws IOException

	  {
	  	String filePath=Constants.TESTDATAFILE;
	  	f=new FileInputStream(filePath);
	  	w=new XSSFWorkbook(f);
	  	sh=w.getSheet(sheet6);
	  	Row r=sh.getRow(a6);
	  	Cell c=r.getCell(b6);
	  	return c.getStringCellValue();
	  	
	  }
	  public static String  getStringData7(int a7,int b7,String sheet7) throws IOException

	  {
	  	String filePath=Constants.TESTDATAFILE;
	  	f=new FileInputStream(filePath);
	  	w=new XSSFWorkbook(f);
	  	sh=w.getSheet(sheet7);
	  	Row r=sh.getRow(a7);
	  	Cell c=r.getCell(b7);
	  	return c.getStringCellValue();
	  	
	  }
	  public static String  getStringData8(int a8,int b8,String sheet8) throws IOException

	  {
	  	String filePath=Constants.TESTDATAFILE;
	  	f=new FileInputStream(filePath);
	  	w=new XSSFWorkbook(f);
	  	sh=w.getSheet(sheet8);
	  	Row r=sh.getRow(a8);
	  	Cell c=r.getCell(b8);
	  	return c.getStringCellValue();
	  	
	  }
	  public static String  getStringData9(int a9,int b9,String sheet9) throws IOException

	  {
	  	String filePath=Constants.TESTDATAFILE;
	  	f=new FileInputStream(filePath);
	  	w=new XSSFWorkbook(f);
	  	sh=w.getSheet(sheet9);
	  	Row r=sh.getRow(a9);
	  	Cell c=r.getCell(b9);
	  	return c.getStringCellValue();
	  	
	  }
	 
}
