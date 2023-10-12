package ExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String CUSTNAME = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
		String CUSTDESC = wb.getSheet("CreateCustomer").getRow(1).getCell(3).getStringCellValue();
     	System.out.println(CUSTNAME);
		System.out.println(CUSTDESC);
	}
}
