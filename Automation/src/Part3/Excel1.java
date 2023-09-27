package Part3;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Excel1 {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("D:\\Selenium\\Excel\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Sheet sh=book.getSheet("Sheet1");
		int a=0;
		int b=1;
		for(int i=a;i<=sh.getLastRowNum();i++)
		{
			for(int j=b;j<=1;j++)
			{
	    String s=sh.getRow(i).getCell(j).getStringCellValue();
			System.out.println(s);
	}

}}}
