package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_Utility {
	public String getDataFromProperties(String key) throws FileNotFoundException {
		FileInputStream fs=new FileInputStream(FrameWorkConstants.properties_path);
		Properties poj=new Properties();
		try {
			poj.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = poj.getProperty(key);
		return value;
	}
	
	public String getDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream(FrameWorkConstants.excel_path);
		Workbook work = WorkbookFactory.create(fs);
		Sheet sheet = work.getSheet(sheetname);
		String value = sheet.getRow(row).getCell(cell).toString();
		return value;
	}
	
//	public static String getDataFromExcel1(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
//		FileInputStream fs=new FileInputStream(FrameWorkConstants.excel_path1);
//		Workbook work = WorkbookFactory.create(fs);
//		Sheet sheet = work.getSheet(sheetname);
//		String value = sheet.getRow(row).getCell(cell).toString();
//		return value;
//	}
//	
	public static Object[][] getAllDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream(FrameWorkConstants.excel_path1);
		Workbook book = WorkbookFactory.create(fs);
		Sheet sh = book.getSheet(sheetName);
		int lastrownumber = sh.getPhysicalNumberOfRows();
		int lastcellnumber = sh.getRow(0).getPhysicalNumberOfCells();
		Object [][]arr=new Object[lastrownumber-1][lastcellnumber];
		for(int i=1;i<lastrownumber;i++) {
			for(int j=0;j<lastcellnumber;j++) {
				arr[i-1][j]=sh.getRow(i).getCell(j).toString();
			}
		}
		return arr;
		
		
	}

	
}
