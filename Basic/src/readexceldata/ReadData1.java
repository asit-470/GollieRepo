package readexceldata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
FileInputStream fl;

	File src=new File("C:\\Users\\asit.n\\Desktop\\testdata.xlsx");
	fl = new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fl);
	XSSFSheet st=wb.getSheetAt(0);
	int rowcount=st.getLastRowNum();
	System.out.println(rowcount);
	for(int i=0;i<rowcount;i++) {
		String data=st.getRow(i).getCell(0).getStringCellValue();
		String data1=st.getRow(i).getCell(1).getStringCellValue();
		System.out.println(data+"     "+data1);
		wb.close();
	}
	


	}

}

