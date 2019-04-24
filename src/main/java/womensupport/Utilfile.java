package womensupport;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import womenBaseScript.DriverScript;

public class Utilfile extends DriverScript {
	
	File fil;
     XSSFWorkbook WB;
	 XSSFSheet sheet;
	 FileInputStream file;
	
	public  Utilfile(String xlpath)
	{
		try
		{
			 fil = new File(xlpath);
			
			 file = new FileInputStream(fil);
			 
			   WB = new XSSFWorkbook( file);
			 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
		
		public int getrowvalue(int sheetindex)
		{
			
			int row = WB.getSheetAt(sheetindex).getLastRowNum();
			row=row+1;
			return row;
		}
		public  String getData(int sheetnum,int row,int col)
		{
		  sheet = WB.getSheetAt(sheetnum);
			
			String Data = sheet.getRow(row).getCell(col).toString();
			
		
		  return Data;
		
		}
		
		
}


