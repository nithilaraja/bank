package com.ibanking.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.Object;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
import org.apache.poi.ss.util.NumberToTextConverter;
//import org.apache.poi.ss.util.NumberToTextConverter;
public class ExcelData {
  
  
  public static Object[][]read(String File, String SheetName )throws IOException
  {
  FileInputStream ip = new FileInputStream(File);

 Workbook wb = new XSSFWorkbook(ip);

  Sheet sheet = wb.getSheet(SheetName);

  Row row = sheet.getRow(1);

  int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

  int ColCount = row.getLastCellNum();

  Object [][] excelData = new Object[rowCount][ColCount];

  
  for(int i=1;i<=rowCount;i++)

  {

  for(int j=0;j<row.getLastCellNum();j++)

  {

  excelData[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();  

  }

  }

  return excelData;
}
  }



