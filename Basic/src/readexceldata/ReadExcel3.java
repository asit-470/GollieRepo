package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel3 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
FileInputStream fl;

	File src=new File("C:\\Users\\asit.n\\Desktop\\testdata.xlsx");
	fl = new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fl);
	XSSFSheet st=wb.getSheetAt(0);
	st.getRow(0).createCell(2).setCellValue("Asit");
	st.getRow(0).createCell(3).setCellValue("Kumar");
	st.getRow(0).createCell(4).setCellValue("Nayak");
	FileOutputStream fis=new FileOutputStream(src);
	wb.write(fis);
	wb.close();


	}

}
