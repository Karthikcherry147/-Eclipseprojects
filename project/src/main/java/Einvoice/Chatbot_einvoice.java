package Einvoice;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chatbot_einvoice {
	@SuppressWarnings({ "unused", "unchecked" })
	public static <JSONParser> void main(String[] args) throws InterruptedException, FileNotFoundException, IOException, ParseException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		driver.get("https://bot.dialogflow.com/0be7b5cb-0cea-49ff-9322-0587847dcab6");
		System.out.println("EinvoiceChatbot opened");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	    driver.switchTo().frame("frame");
	FileInputStream fsIP = new FileInputStream(new File("C:\\Users\\DELL\\Desktop\\WorkSpace\\einv_chatbot.xlsx")); // Read the spreadsheet 	// that needs to be 	// updated
	XSSFWorkbook wb = new XSSFWorkbook(fsIP); // Access the workbook
	XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
	XSSFFont font = wb.createFont();
	CellStyle style = wb.createCellStyle();
	XSSFCell cell = null; // declare a Cell object
	int rowCount = worksheet.getLastRowNum();
	worksheet.getFirstRowNum();
	System.out.println(rowCount);
	String name = null;
	for (int i = 0; i < rowCount + 1; i++) {
		Row row = worksheet.getRow(i);

		// System.out.println(row);

		// Create a loop to print cell values in a row
		for (int j = 0; j < 1; j++) {
			// Print Excel data in console

			WebElement q1 = driver.findElement(By.xpath("/html/body/div[2]/div[5]/form/input"));

			q1.sendKeys(row.getCell(j).getStringCellValue());
			q1.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
//			List<WebElement> response = driver.findElements(By.className("server-response"));
//			response.get(response.size()-1).click();
//			//System.out.println(response);


			//List<WebElement> response = driver.findElements(By.className("server-response"));

			//System.out.println(response.size());
			// System.out.println(row.getCell(j).getStringCellValue()+"|| "+ response);

			List<WebElement> dynamicList = driver.findElements(By.className("server-response"));
			int dynamicListSize = dynamicList.size();
			WebElement latestOption = dynamicList.get(dynamicListSize - 1);
			//latestOption.click();




			int x = 0;
			for (WebElement w : dynamicList)

			{
				x = x + 1;
				name = w.getText();

				// System.out.println(response + " : " + i);
				if (i + 1 == x) {

					System.out.println(row.getCell(j).getStringCellValue() + "|| " + name);

					// cell = worksheet.getRow(i).getCell(2);

					row.createCell(1).setCellValue(name);
		}
			}
			}
	}


	FileOutputStream output_file = new FileOutputStream(new File("C:\\Users\\DELL\\Desktop\\WorkSpace\\einv_chatbot.xlsx")); // Open FileOutputStream to
	// write updates
wb.write(output_file); // write changes
fsIP.close(); // Close the InputStream
output_file.close(); // close the stream
wb.close();
//prints the message on the console
System.out.print("excel");

	}
}
