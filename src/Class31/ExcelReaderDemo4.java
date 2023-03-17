package Class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ExcelReaderDemo4 {
    public static void main(String[] args) throws IOException {

        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("sheet1");
        int nOfRows=sheet1.getPhysicalNumberOfRows();

       var excelData=new ArrayList<>();
       // List<Map<String,String>> excelData=new ArrayList<>();
        for (int i = 0; i < nOfRows; i++) {
            Row row= sheet1.getRow(i);
            LinkedHashMap rowMap=new LinkedHashMap();
            rowMap.put("Name",row.getCell(0));
            rowMap.put("age",row.getCell(1));
            rowMap.put("city",row.getCell(2));
            rowMap.put("salary",row.getCell(3));
            System.out.println(rowMap);

        }
    }
}

