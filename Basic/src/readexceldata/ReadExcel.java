package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
FileInputStream fl;
try {
	File src=new File("C:\\Users\\asit.n\\Desktop\\testdata.xlsx");
	fl = new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fl);
	XSSFSheet st=wb.getSheetAt(1);
	String data=st.getRow(0).getCell(0).getStringCellValue();
	String data1=st.getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
	System.out.println(data1);
	wb.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}

	}

}
