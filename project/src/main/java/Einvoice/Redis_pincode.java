package Einvoice;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redis_pincode {

	@SuppressWarnings("unused")
	public static <JSONParser> void main(String[] args) throws InterruptedException, FileNotFoundException, IOException, ParseException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		//driver.get("https://bot.dialogflow.com/0be7b5cb-0cea-49ff-9322-0587847dcab6");

		driver.get("https://einvoice1.gst.gov.in/Others/PincodeSearch");
		System.out.println("EinvoiceChatbot opened");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	   // driver.switchTo().frame("frame");
	FileInputStream fsIP = new FileInputStream(new File("E:\\WorkSpace\\mst_picode_maping.xlsx")); // Read the spreadsheet 	// that needs to be 	// updated
	XSSFWorkbook wb = new XSSFWorkbook(fsIP); // Access the workbook
	XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
	XSSFFont font = wb.createFont();
	CellStyle style = wb.createCellStyle();
	XSSFCell cell = null; // declare a Cell object
	int rowCount = worksheet.getLastRowNum();
	worksheet.getFirstRowNum();
	System.out.println(rowCount);
	//String name = null;
	for (int i = 1; i < rowCount+1; i++) {
		Row row = worksheet.getRow(i);

		 //System.out.println(row);

		// Create a loop to print cell values in a row
		for (int j = 0; j < 1; j++) {
			// Print Excel data in console

			int a = (int)row.getCell(j).getNumericCellValue();

			String b = Integer.toString(a);
			//System.out.println(b);



			WebElement q1 = driver.findElement(By.xpath("//input[@id='txtGstin']"));
			q1.clear();
			q1.sendKeys(b);

	       //driver.findElement(By.xpath("//input[@id='txtGstin']")).sendKeys(b);
			driver.findElement(By.xpath("//input[@id='txtCaptchaCode']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();





			String str = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]")).getText();

//System.out.println(str);

System.out.println(b + "|| " + str);
row.createCell(1).setCellValue(b);
row.createCell(2).setCellValue(str);

			}
	}


	FileOutputStream output_file = new FileOutputStream(new File("E:\\WorkSpace\\mst_picode_maping.xlsx")); // Open FileOutputStream to
// write updates
wb.write(output_file); // write changes
fsIP.close(); // Close the InputStream
output_file.close(); // close the stream
wb.close();
//prints the message on the console
System.out.print("excel");

	}
}
