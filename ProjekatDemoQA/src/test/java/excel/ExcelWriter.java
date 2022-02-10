//package excel;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//
//public class ExcelWriter {
//    public static void main(String[] args) {
//        // pravi novi workbook
//        XSSFWorkbook wb = new XSSFWorkbook();
//        // pravim novi sheet(list) u tom workbuku
//        Sheet sh1 = wb.createSheet("Textbox");
//
//        try {
//            // pravim taj fajl sa imenom "MojExecelFajl.xlsx"
//            OutputStream fajl = new FileOutputStream("MojExecellFal.xlsx");
//            // upisujem workbook u taj fajl
//            wb.write(fajl);
//            // zatvaram workbook
//            wb.close();
//        } catch (IOException e) {
//            System.out.println("Desila se greska " + e.getMessage());
//        }
//
//    }
//}
