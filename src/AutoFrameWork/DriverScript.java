package AutoFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.asynchttpclient.util.HttpConstants.Methods;

public class DriverScript {
	public static Scanner sc = new Scanner(System.in);
	public static Actions act = new Actions();
	public static Method method[];
	public static Properties OR;
	public static String actKey;
	public static String pageObj;
	public static XSSFWorkbook ORWb;
	public static XSSFSheet ORSh;
	public static XSSFRow ORRow;
	public static XSSFCell ORCell;
     
	
	
	
	public static void main(String[] args) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		ExcelUtils.selectExcelFile();
		
		String path_OR = "D:\\Users\\XY59005\\workspace\\OMSA2\\OR.txt";
		FileInputStream fs = new FileInputStream(path_OR);
		ORWb =new XSSFWorkbook(fs);
		ORSh = ORWb.getSheet("OR");
		
		ExcelUtils.getCellData(5, 3);
		

	}


	
	
	}


