package Monitoring_Tool;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mon_tool_daily_Report {
	public static <JSONParser> void main(String[] args) throws InterruptedException, AWTException {
		try
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Montool\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/");
			System.out.println("Application opened");
			driver.manage().window().maximize();
//			Montool_dailyreports_modules mon = new Montool_dailyreports_modules();


//			Robot robot = new Robot();
//			//Press key Ctrl+Shift+i
//			robot.keyPress(KeyEvent.VK_F11);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("karthik");
			driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("abc123@@");
			driver.findElement(By.xpath("//input[@id='txtCaptchanew']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtotp']")).sendKeys("102020");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btncont']")).click();
			String strText0 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label2")).getText();
			String strText = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbl_einv_dt1")).getText();
			String strText1 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbleinv_cnt1")).getText();
			System.out.println(strText0 +" : "+strText+" - " +strText1);

			String strText01 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label5")).getText();
			String strText2 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbl_ewb1_dt")).getText();
			String strText3 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbl_ewb1")).getText();
			System.out.println(strText01 +" : "+strText2+" - "+strText3);

			String strText4 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label3")).getText();
			String strText5 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label8")).getText();
			String strText6 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbl_einvcnt")).getText();
			String strText7 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbl_ewbcnt")).getText();
			String strText8 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_einv_mnth_cnt")).getText();
			String strText9 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ewb_mnt_cnt")).getText();
			System.out.println(strText4 +" : "+strText6+" - " +strText8);
			System.out.println(strText5 +" : "+strText7+" - " +strText9);





				FileInputStream fsIP = new FileInputStream(
						new File("C:\\Users\\\\DELL\\Desktop\\WorkSpace\\Selenium\\Montool.xlsx")); // Read the spreadsheet 	// that needs to be 	// updated

				XSSFWorkbook wb = new XSSFWorkbook(fsIP); // Access the workbook
				XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
			//	XSSFFont font = wb.createFont();
				 CellStyle style = wb.createCellStyle();
				XSSFCell cell = null; // declare a Cell object

				cell = worksheet.getRow(1).getCell(1);
				cell.setCellValue(strText +" - "+strText1+" Crores");
				cell = worksheet.getRow(2).getCell(1);
				cell.setCellValue(strText2 +" - "+strText3+" Crores");

				cell = worksheet.getRow(3).getCell(1);
				cell.setCellValue(strText6 +" - "+strText8+" Crores");

				cell = worksheet.getRow(4).getCell(1);
				cell.setCellValue(strText7 +" - "+strText9+" Crores");

				Montool_dailyreports_modules mt =  new Montool_dailyreports_modules ();


//mon.einvoice_mode_wise(driver, cell, worksheet, wb, fsIP, js);
//mon.einvoice_Zone_Wise(driver, null, worksheet, wb, fsIP, js);
//mon.ewaybill_mode_wise(driver, null, worksheet, wb, fsIP, js);
//mon.ewaybill_Zone_wise(driver, null, worksheet, wb, fsIP, js);
//mon.einvoice_log_error(driver, null, worksheet, wb, fsIP, js);
//mon.ewaybil_log_error(driver, null, worksheet, wb, fsIP, js);
//				mon.GSTIN_details_Fr_CP(driver, null, worksheet, wb, fsIP, js);
//				mon.Block_status_Fr_CP(driver, null, worksheet, wb, fsIP, js);
//				mon.Vahan_details(driver, null, worksheet, wb, fsIP, js);
//				mon.PAN_details(driver, null, worksheet, wb, fsIP, js);
//				mon.Fastag_date_Wise(driver, null, worksheet, wb, fsIP, js);
//		        mon.Fastag_Time_match(driver, null, worksheet, wb, fsIP, js);
//		        mon.RECONCOLIATION(driver, null, worksheet, wb, fsIP, js);
//		        mon.Fastag_Dex_Summaryreport(driver, null, worksheet, wb, fsIP, js);
//		        mon.eINVOCIE_DATA_Consistency(driver, null, worksheet, wb, fsIP, js);
//		        mon.IRN_DATA_Consistency(driver, null, worksheet, wb, fsIP, js);
//		        mon.DC_CR_Replication(driver, null, worksheet, wb, fsIP, js);




				fsIP.close(); // Close the InputStream

				FileOutputStream output_file = new FileOutputStream(new File("C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\Montool.xlsx")); // Open FileOutputStream to
																									// write updates
				wb.write(output_file); // write changes

				output_file.close(); // close the stream

				wb.close();
				// prints the message on the console
				System.out.println("Excel file has been generated successfully.");

		}catch(Exception e)
		{

		}
	}
}
