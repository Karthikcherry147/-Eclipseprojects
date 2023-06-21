package Monitoring_Tool;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Montool_Sub_Class {
	public void einvoice_mode_wise(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Einv_Modewise.aspx");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			String strText025 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_modewise\"]/tbody/tr[3]/td[5]")).getText();
			String strText026 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_modewise\"]/tbody/tr[4]/td[5]")).getText();
			  int a = Integer.parseInt(strText025);
			  int b = Integer.parseInt(strText026);
			  if (a>0 && b>0)
		       {
		    	   cell = worksheet.getRow(5).getCell(1);
	   			cell.setCellValue("OK");
	   			System.out.println("eINVOICE Mode Wise is working fine");
		       }
		       else
		       {
		    	   cell = worksheet.getRow(5).getCell(1);
		    		cell.setCellValue("NOTOK");
		    		System.out.println("eINVOICE Mode Wise is not Working");
		       }

		}catch(Exception e)
		{
			cell = worksheet.getRow(5).getCell(1);
    		cell.setCellValue("NOTOK");
    		System.out.println("eINVOICE Mode Wise is not Working");
		}
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		driver.get(driver.getCurrentUrl());
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//

	}
	public void einvoice_Zone_Wise(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js) throws InterruptedException
	{

		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Einv_Zonewise.aspx");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rbn_type_0']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(2000);
			String strText027 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[11]")).getText();
			String strText028 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[11]")).getText();
			System.out.println(strText027);
			System.out.println(strText028);
			  int a2 = Integer.parseInt(strText027);
			  int b2 = Integer.parseInt(strText028);
			  if (a2>0 && b2>0)
		       {
		    	   cell = worksheet.getRow(6).getCell(1);
	   			cell.setCellValue("OK");
	   			System.out.println("eINVOICE Zone Wise is  working fine");

		       }
		       else
		       {
		    	   cell = worksheet.getRow(6).getCell(1);
		    		cell.setCellValue("NOTOK");
		    		System.out.println("eINVOICE Zone Wise is not working");
		       }
			  driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
				{
			             cell = worksheet.getRow(6).getCell(1);
    		             cell.setCellValue("NOTOK");
		    		System.out.println("eINVOICE Zone Wise Exception");
				}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//

	}
	public void ewaybill_mode_wise(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Ewb_Modewise.aspx");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();

			String strText029 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_modewise\"]/tbody/tr[3]/td[7]")).getText();
			String strText030 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_modewise\"]/tbody/tr[4]/td[7]")).getText();

	          int a3 = Integer.parseInt(strText029);
			  int b3 = Integer.parseInt(strText030);
			  if (a3>0 && b3>0)
		       {
		    	   cell = worksheet.getRow(7).getCell(1);
	   			cell.setCellValue("OK");
	   			System.out.println("EWaybill Mode Wise is working fine");
		       }
		       else
		       {
		    	   cell = worksheet.getRow(7).getCell(1);
		    		cell.setCellValue("NOTOK");
		    		System.out.println("EWaybill Mode Wise is not working");
		       }
			  driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			cell = worksheet.getRow(7).getCell(1);
    		cell.setCellValue("NOTOK");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}
	public void ewaybill_Zone_wise(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js) throws InterruptedException
	{
		try
		{
			driver.get(("https://dashboard.ewaybillgst.gov.in/montool/Ewb_Zonewise.aspx"));
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();


			String strText031 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_zone\"]/tbody/tr[3]/td[11]")).getText();
     		String strText032 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_zone\"]/tbody/tr[4]/td[11]")).getText();
			  int a4 = Integer.parseInt(strText031);
			  int b4 = Integer.parseInt(strText032);
			  if (a4>0 && b4>0)
		       {
		    	   cell = worksheet.getRow(8).getCell(1);
	   			cell.setCellValue("OK");
	   			System.out.println("EWaybill Zone Wise is working fine");
		       }
		       else
		       {
		    	   cell = worksheet.getRow(8).getCell(1);
		    		cell.setCellValue("NOTOK");
		    		System.out.println("EWaybill Zone Wise is not working ");
		       }
			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			cell = worksheet.getRow(8).getCell(1);
    		cell.setCellValue("NOTOK");
    		System.out.println("EWaybill Zone Wise Exception");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}
	public void einvoice_log_error(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
		try {
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Einv_errorlist.aspx?id=LOG");
		String str1 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_err\"]/tbody/tr[1]/th[3]")).getText();
		if(str1==null)

			{
		cell = worksheet.getRow(9).getCell(1);
	    cell.setCellValue("NOTOK");
	    System.out.println("eINVOICE error logs not working ");
			}
			else
			{
				if(str1.contains("Error(Top 100)"))
				{
					cell = worksheet.getRow(9).getCell(1);
					cell.setCellValue("OK");
					System.out.println("eINVOICE error logs working fine");
					driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
				}
				else
				{
					cell = worksheet.getRow(9).getCell(1);
					cell.setCellValue("NOTOK");

				}
			}

		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}catch(Exception e)
	{
		cell = worksheet.getRow(9).getCell(1);
			cell.setCellValue("NOTOK");
			System.out.println("eINVOICE error logs not working ");
	}


//	Thread.sleep(2000);
//	driver.navigate().refresh();
//	driver.get(driver.getCurrentUrl());
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}
	public void ewaybil_log_error(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Einv_errorlist.aspx?id=EWB");
			System.out.println("EWaybill error logs working fine");


			String strText03144 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_ewb_err\"]/tbody/tr[1]/th[3]")).getText();
			System.out.println(strText03144);

			if(strText03144==null)

	 			{
				cell = worksheet.getRow(10).getCell(1);
			    cell.setCellValue("NOTOK");
	 			}
	 			else
	 			{
	 				if(strText03144.contains("Error(Top 500)"))
	 				{
	 					cell = worksheet.getRow(10).getCell(1);
	 					cell.setCellValue("OK");
	 				}
	 				else
	 				{
	 					cell = worksheet.getRow(10).getCell(1);
	 					cell.setCellValue("NOTOK");
	 				}
	 			}
			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			cell = worksheet.getRow(10).getCell(1);
				cell.setCellValue("NOTOK");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}

	public void GSTIN_details_Fr_CP(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/gstin_dtls_cp.aspx");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_gstin']")).sendKeys("29AAACJ4323N1ZC");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			Thread.sleep(2000);
			String strText0313 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txt_json\"]")).getText();
			if(strText0313.contains("ErrorCode"))

	 			{
				cell = worksheet.getRow(11).getCell(1);
			cell.setCellValue("NOTOK");
			System.out.println("GSTN is not working");
	 			}
	 			else
	 			{
					cell = worksheet.getRow(11).getCell(1);
					cell.setCellValue("OK");
					System.out.println("GSTIN details from CP is working fine");
	 			}
			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//

		}catch (Exception e)
		{
			cell = worksheet.getRow(11).getCell(1);
			cell.setCellValue("OK");
			System.out.println("GSTIN details from CP is working fine");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}

	public void Block_status_Fr_CP(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{

		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/blk_status_cp.aspx");
			driver.findElement(By.xpath("//input[@id='txt_gstin']")).sendKeys("29AAACJ4323N1ZC");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			Thread.sleep(1000);

			String strText0314 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txt_json\"]")).getText();


			if(strText0314.contains("ErrorCode"))
	 			{
				cell = worksheet.getRow(12).getCell(1);
			cell.setCellValue("NOTOK");
			System.out.println("Blocking is not working ");
	 			}
	 			else
	 			{
					cell = worksheet.getRow(12).getCell(1);
					cell.setCellValue("OK");
					System.out.println("Block Status from CP is working fine");
	 			}
			//driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//

		}catch (org.openqa.selenium.NoSuchElementException e)
		{
			cell = worksheet.getRow(12).getCell(1);
			cell.setCellValue("NOTOK");
			System.out.println("Block Status from CP is not working fine");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}
	public void Vahan_details (WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Vahan.aspx");
			driver.findElement(By.xpath("//input[@id='txt_vehical_no']")).sendKeys("KA01HS1234");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			Thread.sleep(1000);

			String strText0316 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_tr_err\"]")).getText();
					if(strText0316.contains("MADHU SUDHAN M MANJUNATHA"))

		 			{
					cell = worksheet.getRow(13).getCell(1);
				cell.setCellValue("OK");
				System.out.println("Vahan details from CP is working fine");
		 			}
		 			else
		 			{
						cell = worksheet.getRow(13).getCell(1);
						cell.setCellValue("NOT OK");
						System.out.println("Vahan ");
		 			}

			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			cell = worksheet.getRow(13).getCell(1);
			cell.setCellValue("NOT OK");
			System.out.println("Vahan ");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}

	public void PAN_details (WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
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
				cell = worksheet.getRow(14).getCell(1);
				cell.setCellValue("OK");
				System.out.println("PAN details from CP is working fine");
 			}
 			else
 			{
 				cell = worksheet.getRow(14).getCell(1);
 				cell.setCellValue("NOTOK");
 				System.out.println("PAN is not working");
 			}


			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			cell = worksheet.getRow(14).getCell(1);
				cell.setCellValue("NOTOK");
				System.out.println("PAN is not working");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}


	@SuppressWarnings({ "unused", "rawtypes" })
	public void Fastag_date_Wise(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js  ) throws InterruptedException
	{
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
			cell = worksheet.getRow(15).getCell(1);
			cell.setCellValue(strText05+ " - " +  strText04);
	         System.out.println(strText05);

			System.out.println(strText05+" : " +strText04);
		}else
		{
			cell = worksheet.getRow(15).getCell(1);
			cell.setCellValue("NOTOK");
			System.out.println("Fastag datewise is not working");
	}
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			cell = worksheet.getRow(15).getCell(1);
			cell.setCellValue("NOTOK");
			System.out.println("Fastag datewise is not working");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}


	public void Fastag_Time_match(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
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
	        		cell = worksheet.getRow(16).getCell(1);
	    			cell.setCellValue("OK");
	    			System.out.println("Fastag data pulling is matching"+strText055);
	              }
	             else
	             {
	            		cell = worksheet.getRow(16).getCell(1);
	        			cell.setCellValue("NOTOK");
	        			System.out.println("Fastag data pulling is not matching");
	             }
	         driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			cell = worksheet.getRow(16).getCell(1);
			cell.setCellValue("NOTOK");
			System.out.println("Fastag data pulling is not matching");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//

	}
	public void einvoice_dex(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
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
 				cell = worksheet.getRow(17).getCell(1);
    			cell.setCellValue(strText056+" - "+ "OK");
    			System.out.println("einvoice dex count is matching");
 			}
 			else
 			{
 				cell = worksheet.getRow(17).getCell(1);
 				cell.setCellValue(strText056+" - "+ "NOTOK");
 				System.out.println("einvoice dex count is matching");
 			}
 			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			cell = worksheet.getRow(17).getCell(1);
				cell.setCellValue("NOTOK");
				System.out.println("einvoice dex count is matching");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}

	public void ewaybill_dex(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js  ) throws InterruptedException
	{
		driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_dexfile.aspx?id=2");
		LocalDate date2y = LocalDate.now().minusDays(4);
		DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		String date3y= formattery.format(date2y);
		  // System.out.println(date3y);
		driver.findElement(By.xpath("//input[@id='txt_dt']")).sendKeys(date3y);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_summary']")).click();
		Thread.sleep(3000);
	    String dex = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]")).getText();
	    if(dex.contains("Data is Matching"))
	    {
	    	System.out.println("OK");
	    }else
	    {
	    	System.out.println("NOTOK");
	    }
		Thread.sleep(10000);

	}
	public void Fastag_Dex_Summaryreport(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
		driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_dexfile.aspx?id=1");
		//LocalDate date2=LocalDate.parse("2018-01-32");
		LocalDate date2y = LocalDate.now().minusDays(4);
		DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		String date3y= formattery.format(date2y);
		  // System.out.println(date3y);
		driver.findElement(By.xpath("//input[@id='txt_dt']")).sendKeys(date3y);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_summary']")).click();
		Thread.sleep(10000);
	}
	public void eINVOCIE_DATA_Consistency(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
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
		       cell = worksheet.getRow(18).getCell(1);
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
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			 cell = worksheet.getRow(18).getCell(1);
			 cell.setCellValue("NOTOKex");
			 System.out.println("einvoice data consistency  is not working");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}

	public void IRN_DATA_Consistency(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
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
       cell = worksheet.getRow(19).getCell(1);
       if (  b1==c1)    //(a1==b1 && b1==c1)//
       {
			cell.setCellValue(strText057+" - "+ "OK");
			System.out.println("IRN data consistency  is working fine");

       }
       }
       else
       {
   			cell.setCellValue(strText057+" - "+ "NOTOK");
   			System.out.println("IRN data consistency  is not matching");
       }
       driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			 cell = worksheet.getRow(19).getCell(1);
			 cell.setCellValue("NOTOK");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
	}

	public void DC_CR_Replication(WebDriver driver,XSSFCell cell, XSSFSheet worksheet , XSSFWorkbook  wb, FileInputStream fsIP, JavascriptExecutor js ) throws InterruptedException
	{
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
			    	   cell = worksheet.getRow(20).getCell(1);
		   			cell.setCellValue("OK");
			       }
			       else
			       {
			    	   cell = worksheet.getRow(20).getCell(1);
			    		cell.setCellValue("NOTOK");
			       }
						driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
		}catch(Exception e)
		{
			cell = worksheet.getRow(20).getCell(1);
    		cell.setCellValue("NOTOK");
		}
	}

}
