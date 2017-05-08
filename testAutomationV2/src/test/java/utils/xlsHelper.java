package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import generics.constant;

public class xlsHelper extends constant{

	public xlsHelper(){
		log.info("xlsHelper Object is initialized..");
	}
	
	public void write(String fileName,String sheetName){
		 String pathName=xlsPath+fileName+".xlsx";
		 XSSFWorkbook workbook = new XSSFWorkbook();
	     XSSFSheet sheet = workbook.createSheet(sheetName);
	     Object[][] datatypes = {
	                {"Datatype", "Type", "Size(in bytes)"},
	                {"int", "Primitive", 2},
	                {"float", "Primitive", 4},
	                {"double", "Primitive", 8},
	                {"char", "Primitive", 1},
	                {"String", "Non-Primitive", "No fixed size"}
	        };

	     int rowNum = 0;
	     
	     for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(pathName);
            workbook.write(outputStream);
           // workbook.close(); (This have some Comilation Problem with Maven Source , Need to be fixed)
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }     
	}
	
	//Read Function doesnt return anything in this function , its only form a printStream to console
	@SuppressWarnings("resource")
	public void read(String fileName,String sheetName){
		try {
            String pathName=xlsPath+fileName+".xlsx";
            FileInputStream excelFile = new FileInputStream(new File(pathName));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheet(sheetName);
            Iterator<Row> iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {
                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
 
                while (cellIterator.hasNext()) {
	                Cell currentCell = cellIterator.next();
	                if (currentCell.getCellTypeEnum() == CellType.STRING) {
	                    System.out.print(currentCell.getStringCellValue() + ",");
	                } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
	                    System.out.print(currentCell.getNumericCellValue() + ",");
	                }
                }           
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
	
}



