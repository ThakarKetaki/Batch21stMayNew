package excelPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path="C:\\Users\\hp-pc\\Desktop\\Book1.xlsx";
		FileInputStream file=new FileInputStream(path);
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row=sheet.getRow(i);
	
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
					try
					{
						String value=sheet.getRow(i).getCell(j).getStringCellValue();	
						System.out.print(value);
						
					}
					catch (Exception e) 
					{
						double value=sheet.getRow(i).getCell(j).getNumericCellValue();
						System.out.print(value);
					}
					System.out.print("  ");
					
			}
			System.out.println();
		}
	}

}
