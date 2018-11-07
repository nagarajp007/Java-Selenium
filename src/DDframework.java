import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDframework {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver1 = new ChromeDriver();
	FileInputStream fs = new FileInputStream("F:\\Qspiders\\Train1.xlsx");
	Workbook wb = WorkbookFactory.create(fs);
	Cell c1 = wb.getSheet("Sheet1").getRow(1).getCell(2);
	String url = c1.getStringCellValue();
	driver1.get(url);
	Cell c2 = wb.getSheet("Sheet1").getRow(2).getCell(2);
	String key1=c2.getStringCellValue();
	driver1.findElement(By.id("lst-ib")).sendKeys(key1);;
	
	//System.out.println(data);
	
	
}
}