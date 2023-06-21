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
public class Monitortool {

		@SuppressWarnings({ "unused", "rawtypes" })
		public static <JSONParser> void main(String[] args) throws InterruptedException {
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
//			@SuppressWarnings("resource")
//			Scanner scan = new Scanner(System.in);
//			System.out.println("enter captcha");
//			String captcha = scan.nextLine();
			driver.findElement(By.xpath("//input[@id='txtCaptchanew']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtotp']")).sendKeys("102020");
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
			
			
			String StrEinvPDC =  driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceHolder1_einv_day_cnt']")).getText().toString();
			String StrEWBPDC = driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceHolder1_ewb_day_cnt']")).getText().toString();
			String Einvdate = driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceHolder1_lbl_einv_day_cnt']")).getText().toString();
			String Ewbdate = driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceHolder1_lbl_ewb_day_cnt']")).getText().toString();
			System.out.println(Einvdate + " - " + StrEinvPDC);
			System.out.println(Ewbdate + " - " + StrEWBPDC);
			
	

			try {
				FileInputStream fsIP = new FileInputStream(
						new File("E:\\WorkSpace\\Selenium\\Montool.xlsx")); // Read the spreadsheet 	// that needs to be 	// updated

				XSSFWorkbook wb = new XSSFWorkbook(fsIP); // Access the workbook
				XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
			//	XSSFFont font = wb.createFont();
				 CellStyle style = wb.createCellStyle();
				Cell cell = null; // declare a Cell object
				cell = worksheet.getRow(1).getCell(1);
				cell.setCellValue(strText +" - "+strText1+" Crores");
				cell = worksheet.getRow(2).getCell(1);
				cell.setCellValue(strText2 +" - "+strText3+" Crores");
				cell = worksheet.getRow(3).getCell(1);
				cell.setCellValue(strText6 +" - "+strText8+" Crores");
				cell = worksheet.getRow(4).getCell(1);
				cell.setCellValue(strText7 +" - "+strText9+" Crores");			
				cell = worksheet.getRow(5).getCell(1);
				cell.setCellValue(Einvdate + " - " + StrEinvPDC);			
				cell = worksheet.getRow(6).getCell(1);
				cell.setCellValue(Ewbdate + " - " + StrEWBPDC);
				
	//-----------------------------------------------------------------------------------------
//////////////				eINVOICE  Mode wise //
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();

					String strText025 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_modewise\"]/tbody/tr[3]/td[5]")).getText();
					String strText026 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_modewise\"]/tbody/tr[4]/td[5]")).getText();
					  int a = Integer.parseInt(strText025);
					  int b = Integer.parseInt(strText026);
					  if (a>0 && b>0)
				       {
				    	   cell = worksheet.getRow(7).getCell(1);
			   			cell.setCellValue("OK");
			   			System.out.println("eINVOICE Mode Wise working fine");
				       }
				       else
				       {
				    	   cell = worksheet.getRow(7).getCell(1);
				    		cell.setCellValue("NOTOK");
				    		System.out.println("eINVOICE Mode Wise is not Working");
				       }
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}catch(Exception e)
				{
					cell = worksheet.getRow(7).getCell(1);
		    		cell.setCellValue("NOTOK");
		    		System.out.println("NOTOK Exception");
		    		driver.navigate().back();
		    		System.out.println("eINVOICE Mode Wise is not Working");
				}
				
////	//--------------------------------------------------------------------------------------------------------------------//
////	            //eINVOICE  Zone wise //
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
					WebElement Q1 =  driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
					js.executeScript("arguments[0].click();", Q1);
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rbn_type_0']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
					String strText027 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[11]")).getText();
					String strText028 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[11]")).getText();
					  int a2 = Integer.parseInt(strText027);
					  int b2 = Integer.parseInt(strText028);
					  if (a2>0 && b2>0)
				       {
				    	   cell = worksheet.getRow(8).getCell(1);
			   			cell.setCellValue("OK");
			   			System.out.println("eINVOICE Zone Wise is  working fine");

				       }
				       else
				       {
				    	   cell = worksheet.getRow(8).getCell(1);
				    		cell.setCellValue("NOTOK");
				    		driver.navigate().back();
				    		System.out.println("eINVOICE Zone Wise is not working");
				       }		  
			
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//

				}catch(Exception e)
						{
					             cell = worksheet.getRow(8).getCell(1);
		    		             cell.setCellValue("NOTOK");
				             driver.navigate().back();
				    		System.out.println("eINVOICE Zone Wise is not working");

						}
		
//////	//---------------------------------------------------------------------------------------------------------------------
//////*** e-waybill  Mode wise *** //
					try
					{
						driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
						WebElement w3 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
						js.executeScript("arguments[0].click();", w3);
						driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
						System.out.println("EWaybill Mode Wise working fine");
						String strText029 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_modewise\"]/tbody/tr[3]/td[7]")).getText();
						String strText030 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_modewise\"]/tbody/tr[4]/td[7]")).getText();

				          int a3 = Integer.parseInt(strText029);
						  int b3 = Integer.parseInt(strText030);
						  if (a3>0 && b3>0)
					       {
					    	   cell = worksheet.getRow(9).getCell(1);
				   			cell.setCellValue("OK");

					       }
					       else
					       {
					    	   cell = worksheet.getRow(9).getCell(1);
					    		cell.setCellValue("NOTOK");
					       }
					
							driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
					}catch(Exception e)
					{
						cell = worksheet.getRow(9).getCell(1);
			    		cell.setCellValue("NOTOK");
			    		System.out.println("NOTOK Exception");
			    		driver.navigate().back();
					}
//////	//---------------------------------------------------------------------------------------------------------------
////////				// e-waybill zone wise//
					try
					{
						driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
						WebElement w2 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
						js.executeScript("arguments[0].click();", w2);
						driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
						System.out.println("EWaybill Zone Wise working fine");
						String strText031 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_zone\"]/tbody/tr[3]/td[11]")).getText();
			     		String strText032 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_zone\"]/tbody/tr[4]/td[11]")).getText();
						  int a4 = Integer.parseInt(strText031);
						  int b4 = Integer.parseInt(strText032);
						  if (a4>0 && b4>0)
					       {
					    	   cell = worksheet.getRow(10).getCell(1);
				   			cell.setCellValue("OK");
					       }
					       else
					       {
					    	   cell = worksheet.getRow(10).getCell(1);
					    		cell.setCellValue("NOTOK");
					       }
		
							driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
					}catch(Exception e)
					{
						cell = worksheet.getRow(10).getCell(1);
			    		cell.setCellValue("NOTOK");
					System.out.println("NOTOK Exception");
			    		driver.navigate().back();
					}
	
//	////------------------------------------------------------------------------------------------
//////				//eINVOICE  Log error //
					try {
						driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
						WebElement w1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
						js.executeScript("arguments[0].click();", w1);
						String str1 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_err\"]/tbody/tr[1]/th[3]")).getText();
						if(str1==null)

			 			{
						cell = worksheet.getRow(11).getCell(1);
					    cell.setCellValue("NOTOK");
					    System.out.println("eINVOICE error logs not working ");
			 			}
			 			else
			 			{
			 				if(str1.contains("Error(Top 100)"))
			 				{
			 					cell = worksheet.getRow(11).getCell(1);
			 					cell.setCellValue("OK");
			 					System.out.println("eINVOICE error logs working fine");
			 				}
			 				else
			 				{
			 					cell = worksheet.getRow(11).getCell(1);
			 					cell.setCellValue("NOTOK");
			 				}
			 			}

					
							driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
					}catch(Exception e)
					{
						cell = worksheet.getRow(11).getCell(1);
	 					cell.setCellValue("NOTOK");
	 					System.out.println("eINVOICE error logs not working ");
	 					driver.navigate().back();
					}

//
//
//	//------------------------------------------------------------------------------------------
//////				//e waybill  Log error //
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
					WebElement w5 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
					js.executeScript("arguments[0].click();", w5);
					System.out.println("EWaybill error logs working fine");


					String strText03144 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_ewb_err\"]/tbody/tr[1]/th[3]")).getText();
					System.out.println(strText03144);

					if(strText03144==null)

			 			{
						cell = worksheet.getRow(12).getCell(1);
					    cell.setCellValue("NOTOK");
			 			}
			 			else
			 			{
			 				if(strText03144.contains("Error(Top 500)"))
			 				{
			 					cell = worksheet.getRow(12).getCell(1);
			 					cell.setCellValue("OK");
			 				}
			 				else
			 				{
			 					cell = worksheet.getRow(12).getCell(1);
			 					cell.setCellValue("NOTOK");
			 				}
			 			}
					 
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}catch(Exception e)
				{
					cell = worksheet.getRow(12).getCell(1);
 					cell.setCellValue("NOTOK");
 					driver.navigate().back();
				}
//
//
//	//-----------------------------------------------------------------------------
////			//// GSTIN details from CP//
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]")).click();


					WebElement r1 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
					js.executeScript("arguments[0].click();", r1);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_gstin']")).sendKeys("29AAACJ4323N1ZC");
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
					Thread.sleep(2000);
					String strText0313 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txt_json\"]")).getText();
					if(strText0313.contains("ErrorCode"))

			 			{
						cell = worksheet.getRow(13).getCell(1);
					cell.setCellValue("NOTOK");
					System.out.println("GSTN is not working ");
			 			}
			 			else
			 			{
							cell = worksheet.getRow(13).getCell(1);
							cell.setCellValue("OK");
							System.out.println("GSTIN details from CP is working fine");
			 			}
					
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//

				}catch (Exception e)
				{
					cell = worksheet.getRow(13).getCell(1);
					cell.setCellValue("OK");
					driver.navigate().back();
					System.out.println("GSTIN details from CP is working fine");
				}
		
//
//		//// Block GSTIN//---
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]")).click();
					WebElement e13 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
					js.executeScript("arguments[0].click();", e13);
					driver.findElement(By.xpath("//input[@id='txt_gstin']")).sendKeys("29AAACJ4323N1ZC");
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
					Thread.sleep(1000);

					String strText0314 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txt_json\"]")).getText();


					if(strText0314.contains("ErrorCode"))

			 			{
						cell = worksheet.getRow(14).getCell(1);
					cell.setCellValue("NOTOK");
					System.out.println("Blocking is not working ");
			 			}
			 			else
			 			{
							cell = worksheet.getRow(14).getCell(1);
							cell.setCellValue("OK");
							System.out.println("Block Status from CP is working fine");
			 			}
				
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//

				}catch (org.openqa.selenium.NoSuchElementException e)
				{
					cell = worksheet.getRow(14).getCell(1);
					cell.setCellValue("NOTOK");
					driver.navigate().back();
					System.out.println("Block Status from CP is not working fine");
				}




//		////VAHAN details//
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]")).click();
					WebElement e2 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
					js.executeScript("arguments[0].click();", e2);
					driver.findElement(By.xpath("//input[@id='txt_vehical_no']")).sendKeys("KA01HS1234");
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
					Thread.sleep(1000);

					String strText0316 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_tr_err\"]")).getText();
							if(strText0316.contains("MADHU SUDHAN M MANJUNATHA"))

				 			{
							cell = worksheet.getRow(15).getCell(1);
						cell.setCellValue("OK");
						System.out.println("Vahan details from CP is working fine");
				 			}
				 			else
				 			{
								cell = worksheet.getRow(15).getCell(1);
								cell.setCellValue("NOT OK");
								System.out.println("Vahan ");
				 			}

							
								driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}catch(Exception e)
				{
					cell = worksheet.getRow(15).getCell(1);
					cell.setCellValue("NOT OK");
					System.out.println("Vahan ");
					driver.navigate().back();
				}
//
//
//////		////PAN details//
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]")).click();
					WebElement e3 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[5]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
					js.executeScript("arguments[0].click();", e3);
					driver.findElement(By.xpath("//input[@id='txtPanNo']")).sendKeys("BZNPM9430M");
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
					Thread.sleep(2000);

					String strText0317 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_lbl_error_valid\"]")).getText();
					if(strText0317.contains("MANGLORE"))

		 			{
						cell = worksheet.getRow(16).getCell(1);
						cell.setCellValue("OK");
						System.out.println("PAN details from CP is working fine");
		 			}
		 			else
		 			{
		 				cell = worksheet.getRow(16).getCell(1);
		 				cell.setCellValue("NOTOK");
		 				System.out.println("PAN is not working");

		 			}
			
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}catch(Exception e)
				{
					cell = worksheet.getRow(16).getCell(1);
	 				cell.setCellValue("NOTOK");
	 				System.out.println("PAN is not working");
	 				driver.navigate().back();
	 				driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}

			//   ----------------------------------------------------------------------------- //
//				// Fastag dataWise//
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]")).click();
					WebElement e19 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[7]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
					js.executeScript("arguments[0].click();", e19);
					Select dropdown = new  Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")));
					dropdown.selectByValue("2");
					Thread.sleep(2000);

					List  rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
					if(rows1.size()>=2)
					{
					System.out.println("Fastag datewise is working fine");
					List  rows = driver.findElements(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GV_List\"]/tbody/tr"));
			        System.out.println("No of rows are : " + rows.size());
					int lastRowcount = rows.size();
					String strText04 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GV_List\"]/tbody/tr[last()]/td[last()]")).getText();
					String strText05 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GV_List\"]/tbody/tr[last()]/td[1]")).getText();
					cell = worksheet.getRow(17).getCell(1);
					cell.setCellValue(strText05+ " - " +  strText04);
			         System.out.println(strText05);

					System.out.println(strText05+" : " +strText04);
				}else
				{
					cell = worksheet.getRow(17).getCell(1);
					cell.setCellValue("NOTOK");
					System.out.println("Fastag datewise is not working");
					driver.navigate().refresh();
			}
			
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}catch(Exception e)
				{
					cell = worksheet.getRow(17).getCell(1);
					cell.setCellValue("NOTOK");
					driver.navigate().back();
					System.out.println("Fastag datewise is not working");
				}
		   //   ----------------------------------------------------------------------------- //
//				//FASTAG data pulling //
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]")).click();
					WebElement e4 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[7]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
					js.executeScript("arguments[0].click();", e4);
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Button1']")).click();
					Thread.sleep(2000);
			    	 String strText055 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_port\"]/tbody/tr[2]/td[4]")).getText();
			   int a45 = Integer.parseInt(strText055);
			         if(a45>=-15)
			              {
			        		cell = worksheet.getRow(18).getCell(1);
			    			cell.setCellValue("OK");
			    			System.out.println("Fastag data pulling is matching"+strText055);
			              }
			             else
			             {
			            		cell = worksheet.getRow(18).getCell(1);
			        			cell.setCellValue("NOTOK");
			        			System.out.println("Fastag data pulling is not matching");
			             }
					  
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}catch(Exception e)
				{
					cell = worksheet.getRow(18).getCell(1);
        			cell.setCellValue("NOTOK");
        			System.out.println("Fastag data pulling is not matching");
        			driver.navigate().back();
				}
	

		    //   ----------------------------------------------------------------------------- //
		      // RECONCOLIATION//
//		 		// EINVOICE dEX//
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/a[1]")).click();
		 			WebElement e5 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		 			js.executeScript("arguments[0].click();", e5);
		 			Thread.sleep(2000);

		 			String strText0555 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_dtwise\"]/tbody/tr[4]/td[10]/img[1]")).getAttribute("src");
		 			String strText056 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_dtwise\"]/tbody/tr[4]/td[1]")).getText();
		 			String strText057 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_dtwise\"]/tbody/tr[4]/td[1]")).getText();
		 			System.out.println(strText056);
		 			if(strText0555.contains("R"))
		 			{
		 				cell = worksheet.getRow(19).getCell(1);
		    			cell.setCellValue(strText056+" - "+ "OK");
		    			System.out.println("einvoice dex count is matching");
		 			}
		 			else
		 			{
		 				cell = worksheet.getRow(19).getCell(1);
		 				cell.setCellValue(strText056+" - "+ "NOTOK");
		 				System.out.println("einvoice dex count is matching");
		 			}
				
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}catch(Exception e)
				{
					cell = worksheet.getRow(19).getCell(1);
	 				cell.setCellValue("NOTOK");
	 				System.out.println("einvoice dex count is matching");
	 				driver.navigate().back();
				}

		 		//   ----------------------------------------------------------------------------- //

//////			eINVOCIE DATA Consistency //
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/a[1]")).click();
					WebElement e6 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/div[1]/div[1]/ul[1]/li[6]/a[1]"));
					js.executeScript("arguments[0].click();", e6);
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
					String s0 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[1]")).getText();
					System.out.println(s0);
					LocalDate date2y = LocalDate.now().minusDays(1);
					DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
					String date3y= formattery.format(date2y);
					System.out.println(date3y);

					if (s0.contains(date3y))
					{
						System.out.println("test");
					String s1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
					String s2 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")).getText();
					String s3 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[5]")).getText();
					String s4 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[7]")).getText();
					String s5 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[9]")).getText();
					   int a25 = Integer.parseInt(s1);
				       int b25 = Integer.parseInt(s2);
				       int c25 = Integer.parseInt(s3);
				       int d25 = Integer.parseInt(s4);
				       int e25 = Integer.parseInt(s5);
				       cell = worksheet.getRow(20).getCell(1);
				       if (a25==b25 && b25==c25&& c25==d25 && d25==e25)
				       {
				    	   cell.setCellValue("OK");
				    	   System.out.println("einvoice data consistency  is working fine");
				       }
				       }else
				       {
				    	   cell.setCellValue("NOTOK");
				    	   System.out.println("einvoice data consistency  is not working");
				       }
				
					driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}catch(Exception e)
				{
					 cell = worksheet.getRow(20).getCell(1);
					 cell.setCellValue("NOTOKex");
					 System.out.println("einvoice data consistency  is not working");
					 driver.navigate().back();
				}
		

			//   ----------------------------------------------------------------------------- //

////		 			// IRN DATA Consistency
				try
				{
					driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/a[1]")).click();
					WebElement e7 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/div[1]/div[1]/ul[1]/li[7]/a[1]"));
					js.executeScript("arguments[0].click();", e7);
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();

					Thread.sleep(2000);
					LocalDate date2y = LocalDate.now().minusDays(1);
					DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
					String date3y= formattery.format(date2y);
					System.out.println(date3y);
					String strText057 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_irn\"]/tbody/tr[2]/td[1]")).getText();
					if(strText057.contains(date3y))
					{

					//String strText058 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_irn\"]/tbody/tr[2]/td[2]")).getText();
					String strText059 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_irn\"]/tbody/tr[2]/td[3]")).getText();
					String strText060 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_irn\"]/tbody/tr[2]/td[4]")).getText();

			  // int a1 = Integer.parseInt(strText058);
		       int b1 = Integer.parseInt(strText059);
		       int c1 = Integer.parseInt(strText060);
		       cell = worksheet.getRow(21).getCell(1);
		       if (  b1==c1)    //(a1==b1 && b1==c1)//
		       {
					cell.setCellValue(strText057+" - "+ "OK");
					System.out.println("IRN data consistency  is working fine");


		       }
		       else
		       {
		   			cell.setCellValue(strText057+" - "+ "NOTOK");
		   			System.out.println("IRN data consistency  is not matching");
		       }
				}	 else
				       {
				   			cell.setCellValue(strText057+" - "+ "NOTOK");
				   			System.out.println("IRN consistency data is not available");
				       }
				
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}catch(Exception e)
				{
					 cell = worksheet.getRow(21).getCell(1);
					 cell.setCellValue("NOTOK");
					 driver.navigate().back();
				}

		   //   ----------------------------------------------------------------------------- //
		  	 // DC- CR Replication//
				try
				{
				       driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[10]/a[1]")).click();
				       WebElement w11 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[10]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
						js.executeScript("arguments[0].click();", w11);
						Select dropdown21 = new  Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")));
						dropdown21.selectByValue("eway_bill");
						driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
						String strText0581 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_cnt\"]/tbody/tr[3]/td[2]")).getText();
						String strText0267 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_cnt\"]/tbody/tr[3]/td[3]")).getText();
						  int a11 = Integer.parseInt(strText0581);
						  int b11 = Integer.parseInt(strText0267);
						  if (a11>0 && b11>0)
					       {
					    	   cell = worksheet.getRow(22).getCell(1);
				   			cell.setCellValue("OK");
					       }
					       else
					       {
					    	   cell = worksheet.getRow(22).getCell(1);
					    		cell.setCellValue("NOTOK");
					       }
					
							driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}catch(Exception e)
				{
					cell = worksheet.getRow(22).getCell(1);
		    		cell.setCellValue("NOTOK");
		    		driver.navigate().back();
				}



				fsIP.close(); // Close the InputStream

				FileOutputStream output_file = new FileOutputStream(new File("E:\\WorkSpace\\Selenium\\Montool.xlsx")); // Open FileOutputStream to
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


