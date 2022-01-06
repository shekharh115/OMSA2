package AutoFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static XSSFRow Row;
	public static  XSSFCell Cell;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	public static void selectExcelFile(){
		try {
			FileInputStream excel = new FileInputStream("D:\\Users\\XY59005\\Desktop\\KDF.xlsx");
			 wb = new XSSFWorkbook(excel);
			 sh = wb.getSheet("Keywords");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(" An error occcured: pres any key to continue ...  ");
			DriverScript.sc.nextLine();
		}
	}
	
	
	public static String getCellData(int RowNum, int ColNum)  {
		try {
		Cell = sh.getRow(RowNum).getCell(ColNum);
		String cellData = Cell.getStringCellValue();
		System.out.println(cellData);
		return cellData;
		}
		catch (Exception e){
			System.out.println("Error getCellData");
		}
		return null;
		}
	}


