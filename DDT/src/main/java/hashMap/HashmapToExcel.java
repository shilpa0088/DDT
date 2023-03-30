package hashMap;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashmapToExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb =new XSSFWorkbook();
		XSSFSheet sheet= wb.createSheet("Student Information");
		
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		map.put("Shilpa", 1675);
		map.put("Shilpa1", 1665);
		map.put("Shilpa3", 1685);
		map.put("Shilpa5", 1635);
		map.put("Shilpa2", 1625);
		
            int rowno=0;

		for(Map.Entry entry : map.entrySet()) {
			
			XSSFRow row = sheet.createRow(rowno++);
			
			row.createCell(0).setCellValue((String)entry.getKey());
			row.createCell(1).setCellValue((Integer)entry.getValue());
		}
		
		
			FileOutputStream fos = new FileOutputStream(".\\Datafiles\\Students_info.xlsx");
            wb.write(fos);
            fos.close();
            System.out.println("sucess");
						
			
			
		}
		
		
	}
