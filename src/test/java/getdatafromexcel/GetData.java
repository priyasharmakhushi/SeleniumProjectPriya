package getdatafromexcel;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class GetData {	
	@DataProvider
	@Test
	String[][] Setdata() throws BiffException, IOException {	
		String data[][];
		String path = "C:\\Users\\CROMA CAMPUS\\Desktop\\Data.xls";		
		FileInputStream  fileInputStream = new FileInputStream(path);		
		Workbook workbook = Workbook.getWorkbook(fileInputStream);		
		Sheet sheet  = workbook.getSheet("One");
		int row = sheet.getRows();
		int col = sheet.getColumns();		
		System.out.println(row +  " " +  col);
		data = new String[row][col];		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Cell c1 = sheet.getCell(j,i);
				String value = c1.getContents();
				//System.out.println(value);
				data[i][j] = value;				
			}
		}
		return data;		
	}
	@Test(dataProvider = "Setdata")
	void Getdata(String username , String password)
	{
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		
		WebDriver driver = new ChromeDriver();
		
	}
}
