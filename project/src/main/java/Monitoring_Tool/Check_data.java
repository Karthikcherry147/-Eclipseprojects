package Monitoring_Tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Check_data {
	@SuppressWarnings({ "unused", "rawtypes" })
	public static <JSONParser> void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://dashboard.ewaybillgst.gov.in/montool/");
		System.out.println("Application opened");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("karthik");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("abc123@@");
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter captcha");
//		String captcha = scan.nextLine();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtCaptchanew']")).sendKeys("MSAVK");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtotp']")).sendKeys("102020");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btncont']")).click();


		driver.get("https://dashboard.ewaybillgst.gov.in/montool/Checkdata.aspx");
try
{
	FileInputStream fsIP = new FileInputStream(new File("E:\\WorkSpace\\GSTINs.xlsx")); // Read the spreadsheet 	// that needs to be 	// updated
	XSSFWorkbook wb = new XSSFWorkbook(fsIP); // Access the workbook
	XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
	XSSFFont font = wb.createFont();
	CellStyle style = wb.createCellStyle();
	XSSFCell cell = null; // declare a Cell object
	int rowCount = worksheet.getLastRowNum();
	worksheet.getFirstRowNum();
	System.out.println(rowCount);
	//String name = null;
	for (int i = 1; i < rowCount; i++) {
		Row row = worksheet.getRow(i);

		 //System.out.println(row);

		// Create a loop to print cell values in a row
		for (int j = 0; j < 1; j++) {
			// Print Excel data in console

		//	int a = (int)row.getCell(j).getStringCellValue());

		//	String b = Integer.toString(a);
			//System.out.println(b);



			WebElement q1 = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtGstin']"));
			q1.clear();
			q1.sendKeys(row.getCell(j).getStringCellValue());
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_searchBtn']")).click();
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(1000);
			String str = null;

		try
		{
			str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/th[1]")).getText();

			 if(str.contains("Gstin Details from Redies"))
				{
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_delete']")).click();
					Alert alert =driver.switchTo().alert();
					alert.dismiss();
					js.executeScript("window.scrollBy(1000,0)", "");
				}else
				{

				}
		}
		catch(Exception e)
		{

			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Checkdata.aspx");

		}





			}
	}
}catch(Exception e)
{

	 driver.navigate().refresh();

}





//		FileOutputStream output_file = new FileOutputStream(new File("E:\\WorkSpace\\mst_picode_maping.xlsx")); // Open FileOutputStream to
//	// write updates
//	wb.write(output_file); // write changes
//	fsIP.close(); // Close the InputStream
//	output_file.close(); // close the stream
//	wb.close();
//	//prints the message on the console
//	System.out.print("excel");




}
}