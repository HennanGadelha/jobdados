package com.jobdados.jobdados.csv;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeitorCsv {
    public static void main(String[] args)  {

        String nome = "";
        double idade = 0;
        List<Pessoa> pessoas = new ArrayList<>();

        try {
            File file = new File("E:\\Projetos\\tcc\\teste.xlsx");
            FileInputStream planilha = new FileInputStream(file);

            XSSFWorkbook workbook = new XSSFWorkbook(planilha);
            XSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();

            while(rowIterator.hasNext()) {

                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.iterator();

                while (cellIterator.hasNext()){

                    Cell cell = cellIterator.next();

                    switch (cell.getCellType()) {

                        case STRING:
                            nome = cell.getStringCellValue();
                            System.out.println("nome" + cell.getStringCellValue());
                            break;

                        case NUMERIC:
                            idade = cell.getNumericCellValue();
                            System.out.println("idade" + cell.getNumericCellValue());
                            break;
                    }
                    Pessoa p = new Pessoa(nome, idade);
                    pessoas.add(p);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeitorCsv.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        } catch (IOException ex) {
            Logger.getLogger(LeitorCsv.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        System.out.println(pessoas);
    }
}
