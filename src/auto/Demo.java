package auto;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("./data/book1.xlsx");
		 Workbook b = WorkbookFactory.create(f);
		String c = b.getSheet("sheet1").getRow(1).getCell(0).toString();
		System.out.println(c);

	}

}
