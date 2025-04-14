package utils;
 
import java.io.FileInputStream;
 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ReadingExcel {
 
    
     /**
      * @author 10830767 -Raghul senthil 
      * Description: This method is to read the data from the excel
      * @param path
      * @param sheet
      * @param row
      * @param cell
      * @return
      */
    public static String DataReader(String path, String sheet, int row, int cell) {
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ path);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            return workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
<<<<<<< HEAD
<<<<<<< HEAD
}
=======
}
>>>>>>> 4ef1a98cbb1ee767528cd96f2fe7568654a8078d
=======
}
>>>>>>> 9f219f829f86dbf13c3e5531cb180372efe454ad
