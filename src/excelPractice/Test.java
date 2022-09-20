package excelPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path="C:\\Users\\hp-pc\\Desktop\\Velocity Ketu\\Manual\\Assignment\\Test Cases\\Demo.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet1");
//		Row row=sheet.getRow(0);
//		int a,b;
//		a=sheet.getPhysicalNumberOfRows();
//		b=row.getPhysicalNumberOfCells();  //int return
//		System.out.println(a+"   "+b);
//		
//		int x,y;
//		x=sheet.getLastRowNum(); //int return
//		y=row.getLastCellNum();  //short return
//		
//		System.out.println(x+"    "+y);
	
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			Row row=sheet.getRow(i);
	
			for(int j=0;j<row.getLastCellNum();j++)
			{
				String  value=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
