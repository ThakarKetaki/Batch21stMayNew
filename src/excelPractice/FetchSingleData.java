package excelPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchSingleData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		String path="C:\\Users\\hp-pc\\Desktop\\Velocity Ketu\\Manual\\Assignment\\Test Cases\\Demo.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		String value=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		
	}

}
