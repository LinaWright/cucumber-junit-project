package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
@Test
    public void read_from_excel_file() throws IOException {
    String path = "SampleData.xlsx";
    FileInputStream fileInputStream = new FileInputStream(path);

    //workbook>sheet>roll>cell

    //1. Create a workbook
    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

    //2.We need to get specific sheet from currently opened workbook
    XSSFSheet sheet = workbook.getSheet("Employees");

    //3.Select roll and cell
    //Print out mary's cell
    //Indexes start from 0
    System.out.println(sheet.getRow(1).getCell(0));

    //print out Developer
    System.out.println(sheet.getRow(3).getCell(2));

    //return the count of used cells only
    //start counting from 1
    int usedRows = sheet.getPhysicalNumberOfRows();
    System.out.println(usedRows);

    //Returns the number from top cell to bottom cell
    //it doesn't care if the cell is empty or not
    //starts counting from 0
    int lastUsedRoll = sheet.getLastRowNum();
    System.out.println(lastUsedRoll);

    //TODO: Create a logic to print Vinod's name
    for(int rowNum=0;rowNum<usedRows; rowNum++){
        if(sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")){
            System.out.println(sheet.getRow(rowNum).getCell(0));
        }
    }

    //TODO: Create a logic to print Lina's Job_ID
    //Check if name is Lina --> print out Job_ID of Lina
    for (int rowNum = 0; rowNum < usedRows; rowNum++) {
        sheet.getRow(rowNum).getCell(0).toString().equals("Lina");
            System.out.println("Lina's job ID is: " + sheet.getRow(rowNum).getCell(2));
        }
    }

}

