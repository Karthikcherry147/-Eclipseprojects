package Monitoring_Tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Montooldata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Se"
				+ "leninum\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://dashboard.ewaybillgst.gov.in/montool/");
		System.out.println("Application opened");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("karthik");
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("abc123@@");
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter captcha");
//		String captcha = scan.nextLine();
		driver.findElement(By.xpath("//input[@id='txtCaptchanew']")).sendKeys("MSAVK");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtotp']")).sendKeys("102020");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btncont']")).click();
		
		try {
			FileInputStream fsIP = new FileInputStream(
					new File("E:\\WorkSpace\\montool_data.xlsx")); // Read the spreadsheet 	// that needs to be 	// updated

			XSSFWorkbook wb = new XSSFWorkbook(fsIP); // Access the workbook
			XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
		//	XSSFFont font = wb.createFont();
			 CellStyle style = wb.createCellStyle();
			Cell cell = null; // declare a Cell object
	
			
//-----------------------------------------------------------------------------------------
//////////////			eINVOICE  Mode wise //
			try
			{
				driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
				driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();

				String einvcol1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]")).getText();
				String einvcol2 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
				String einvcol3 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")).getText();
				String einvcol4 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")).getText();
				String einvcol5 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]")).getText();
				String einvcol6 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]")).getText();
				String einvcol7 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]")).getText();
				
				
				String einvcol11 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]")).getText();
				String einvcol22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
				String einvcol33 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")).getText();
				String einvcol44 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]")).getText();
				String einvcol55 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]")).getText();
				String einvcol66 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[6]")).getText();
				String einvcol77 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[7]")).getText();

				String einvcol111 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]")).getText();
				String einvcol222 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
				String einvcol333 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]")).getText();
				String einvcol444 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]")).getText();
				String einvcol555 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[5]")).getText();
				String einvcol666 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[6]")).getText();
				String einvcol777 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[7]")).getText();
				
				
				
				cell = worksheet.getRow(3).getCell(1);
	    		cell.setCellValue(einvcol1);
	    		cell = worksheet.getRow(3).getCell(2);
	    		cell.setCellValue(einvcol2);
	    		cell = worksheet.getRow(3).getCell(3);
	    		cell.setCellValue(einvcol3);
	    		cell = worksheet.getRow(3).getCell(4);
	    		cell.setCellValue(einvcol4);
	    		cell = worksheet.getRow(3).getCell(5);
	    		cell.setCellValue(einvcol5);
	    		cell = worksheet.getRow(3).getCell(6);
	    		cell.setCellValue(einvcol6);
	    		cell = worksheet.getRow(3).getCell(7);
	    		cell.setCellValue(einvcol7);

	    		
	    		cell = worksheet.getRow(4).getCell(1);
	    		cell.setCellValue(einvcol11);
	    		cell = worksheet.getRow(4).getCell(2);
	    		cell.setCellValue(einvcol22);
	    		cell = worksheet.getRow(4).getCell(3);
	    		cell.setCellValue(einvcol33);
	    		cell = worksheet.getRow(4).getCell(4);
	    		cell.setCellValue(einvcol44);
	    		cell = worksheet.getRow(4).getCell(5);
	    		cell.setCellValue(einvcol55);
	    		cell = worksheet.getRow(4).getCell(6);
	    		cell.setCellValue(einvcol66);
	    		cell = worksheet.getRow(4).getCell(7);
	    		cell.setCellValue(einvcol77);
	    		
	    		cell = worksheet.getRow(5).getCell(1);
	    		cell.setCellValue(einvcol111);
	    		cell = worksheet.getRow(5).getCell(2);
	    		cell.setCellValue(einvcol222);
	    		cell = worksheet.getRow(5).getCell(3);
	    		cell.setCellValue(einvcol333);
	    		cell = worksheet.getRow(5).getCell(4);
	    		cell.setCellValue(einvcol444);
	    		cell = worksheet.getRow(5).getCell(5);
	    		cell.setCellValue(einvcol555);
	    		cell = worksheet.getRow(5).getCell(6);
	    		cell.setCellValue(einvcol666);
	    		cell = worksheet.getRow(5).getCell(7);
	    		cell.setCellValue(einvcol777);
	    		
	    		
	    		
	    		
	    	
			}catch(Exception e)
			{
				
			}
			
//////--------------------------------------------------------------------------------------------------------------------//
//////            //eINVOICE  Zone wise //
//			try
//			{
//				driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
//				WebElement Q1 =  driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
//				js.executeScript("arguments[0].click();", Q1);
//				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rbn_type_0']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
//				String strText027 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[11]")).getText();
//				String strText028 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[11]")).getText();
//				  int a2 = Integer.parseInt(strText027);
//				  int b2 = Integer.parseInt(strText028);
//				  if (a2>0 && b2>0)
//			       {
//			    	   cell = worksheet.getRow(8).getCell(1);
//		   			cell.setCellValue("OK");
//		   			System.out.println("eINVOICE Zone Wise is  working fine");
//
//			       }
//			       else
//			       {
//			    	   cell = worksheet.getRow(8).getCell(1);
//			    		cell.setCellValue("NOTOK");
//			    		driver.navigate().back();
//			    		System.out.println("eINVOICE Zone Wise is not working");
//			       }		  
//		
//					driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
//
//			}catch(Exception e)
//					{
//				             cell = worksheet.getRow(8).getCell(1);
//	    		             cell.setCellValue("NOTOK");
//			             driver.navigate().back();
//			    		System.out.println("eINVOICE Zone Wise is not working");
//
//					}
//	
//////////---------------------------------------------------------------------------------------------------------------------
////////*** e-waybill  Mode wise *** //
//				try
//				{
//					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
//					WebElement w3 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
//					js.executeScript("arguments[0].click();", w3);
//					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
//					System.out.println("EWaybill Mode Wise working fine");
//					String strText029 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_modewise\"]/tbody/tr[3]/td[7]")).getText();
//					String strText030 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_modewise\"]/tbody/tr[4]/td[7]")).getText();
//
//			          int a3 = Integer.parseInt(strText029);
//					  int b3 = Integer.parseInt(strText030);
//					  if (a3>0 && b3>0)
//				       {
//				    	   cell = worksheet.getRow(9).getCell(1);
//			   			cell.setCellValue("OK");
//
//				       }
//				       else
//				       {
//				    	   cell = worksheet.getRow(9).getCell(1);
//				    		cell.setCellValue("NOTOK");
//				       }
//				
//						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
//				}catch(Exception e)
//				{
//					cell = worksheet.getRow(9).getCell(1);
//		    		cell.setCellValue("NOTOK");
//		    		System.out.println("NOTOK Exception");
//		    		driver.navigate().back();
//				}
//////////---------------------------------------------------------------------------------------------------------------
//////////			// e-waybill zone wise//
//				try
//				{
//					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
//					WebElement w2 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
//					js.executeScript("arguments[0].click();", w2);
//					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
//					System.out.println("EWaybill Zone Wise working fine");
//
//					String strText031 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_zone\"]/tbody/tr[3]/td[11]")).getText();
//		     		String strText032 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_zone\"]/tbody/tr[4]/td[11]")).getText();
//					  int a4 = Integer.parseInt(strText031);
//					  int b4 = Integer.parseInt(strText032);
//					  if (a4>0 && b4>0)
//				       {
//				    	   cell = worksheet.getRow(10).getCell(1);
//			   			cell.setCellValue("OK");
//				       }
//				       else
//				       {
//				    	   cell = worksheet.getRow(10).getCell(1);
//				    		cell.setCellValue("NOTOK");
//				       }
//	
//						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
//				}catch(Exception e)
//				{
//					cell = worksheet.getRow(10).getCell(1);
//		    		cell.setCellValue("NOTOK");
//				System.out.println("NOTOK Exception");
//		    		driver.navigate().back();
//				}

//////------------------------------------------------------------------------------------------



			fsIP.close(); // Close the InputStream

			FileOutputStream output_file = new FileOutputStream(new File("E:\\WorkSpace\\montool_data.xlsx")); // Open FileOutputStream to
																								// write updates
			wb.write(output_file); // write changes

			output_file.close(); // close the stream

			wb.close();
			// prints the message on the console
			System.out.println("Excel file has been generated successfully.");

		}

					catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	}


