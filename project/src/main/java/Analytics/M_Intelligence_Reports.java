
package Analytics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class M_Intelligence_Reports {

	Masters master = new Masters();
	@SuppressWarnings({ "unused", "rawtypes" })
	public void M1(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try
		{
			master.Scroll(driver);
			WebElement a1 = driver.findElement(By.xpath("//a[contains(text(),'M1. Inter-State')]"));
			 js.executeScript("arguments[0].click();", a1);
			Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_tostate']")));
			dropdown.selectByValue("7");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			//System.out.println("No of rows are : " + rows.size());
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(30).getCell(3);
				cell.setCellValue("OK");
				System.out.println("M1. Inter-State : " + "OK");
			}else
			{cell = worksheet.getRow(30).getCell(3);
			cell.setCellValue("NOTOK");
				System.out.println("M1. Inter-State : " + "NOTOK");
			}

			master.Home(driver);
		}catch(ElementClickInterceptedException e)
		{

		}

	}



		@SuppressWarnings({ "deprecation", "unused" })
		public void M2(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException, IOException
		{
			try
			{
//				String filename1= "M2_Report on Intra-State Movement.xls.crdownload";
//				String path1 = "C:\\Users\\DELL\\Downloads";
//				File file1 = new File(path1+"\\"+filename1);          //file to be delete
//				if(file1.delete())                      //returns Boolean value

				master.Scroll(driver);
				driver.findElement(By.xpath("//a[contains(text(),'M2. Intra-State')]")).click();
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
				 Thread.sleep(5000);
				 Thread.sleep(5000);
				String filename= "M2_Report on Intra-State Movement.xls.crdownload";
				String path = "C:\\Users\\DELL\\Downloads";
				File file = new File(path+"\\"+filename);

				boolean valuetrue= isFileDownloaded(path,filename);
			if(valuetrue==true) {

				cell = worksheet.getRow(31).getCell(3);
				cell.setCellValue("OK");
				 System.out.println("M2. Intra-State : " + "OK");
			}else
			{
				cell = worksheet.getRow(31).getCell(3);
				cell.setCellValue("NOTOK");
				System.out.println("M2. Intra-State : " + "NOTOK");
				 master.Home(driver);
			}
//					File to_file = new File("C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\Reports");
//	 				FileUtils.copyDirectory(file, to_file);
//	 				if (from_file.renameTo(to_file))
//	 				{
//	 				System.out.println("Successfully moved file");
//	 				}
//	 				else
//	 				{
//	 				System.out.println("Error while moving file");
//	 				}
//	 				System.out.println("OK");
//				}


				/*
				 * /////vikas File dir = new File(path); // do { // for (File file1 :
				 * dir.listFiles()) { M2_Report on Intra-State Movement.xls
				 *
				 * if (!file.getName().equals("M2_Report on Intra-State Movement.xls")) {
				 * Thread.sleep(600); //file.delete(); System.out.println("" + " " +
				 * file.getName() + " Read successfully"); if (file.exists()) {
				 *
				 * //File from_file = new File("C:\\Users\\DELL\\Downloads"); File to_file = new
				 * File("C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\Reports");
				 * FileUtils.copyDirectory(file, to_file); // if (from_file.renameTo(to_file))
				 * // { // System.out.println("Successfully moved file"); // } // else // { //
				 * System.out.println("Error while moving file"); // } System.out.println("OK");
				 * } else { System.out.println("NOTOK"); } } System.out.println("" + " " +
				 * file.getName() + " Waiting to complete Download"); // } //
				 * System.out.println("" + " " + file.getName() + " successfully2"); //} while
				 * (file.exists());
				 */
	/////
			 master.Home(driver);
			}catch(ElementClickInterceptedException e)
			{

			}
//



				}



		public static boolean isFileDownloaded(String downloadPath, String fileName) {
			//   File dir = new File(downloadPath);
			   //File[] dir_contents = dir.listFiles();
               boolean  sucs = false;
               //System.out.println(fileName);
               File f = new File(downloadPath + "\\" + fileName);
               //System.out.println(f);
               if(f.exists() && !f.isDirectory()) {
            	   sucs = true;
	            	//System.out.println(fileName);
               } else
			       {
			            	sucs =false;

			       }

			return sucs;

			   }
//--------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------//

@SuppressWarnings("rawtypes")
public void M3(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet)
{
	try
	{
		master.Scroll(driver);
		driver.findElement(By.xpath("//a[contains(text(),'M3. HSN')]")).click();
		Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_tostate']")));
		dropdown.selectByValue("7");
		Select dropdown1 = new Select (driver.findElement(By.xpath("//select[@id='ddl_hsnchptr']")));
		dropdown1.selectByValue("72");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
	     List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	     if(rows.size()>=1)
	     {
	    	 cell = worksheet.getRow(32).getCell(3);
				cell.setCellValue("OK");
	    	 System.out.println("M3.HSN : " + "OK");
	     }else
	     {
	    	 cell = worksheet.getRow(32).getCell(3);
				cell.setCellValue("NOTOK");
	    	 System.out.println("M3.HSN : " + "NOTOK");
	     }
	     master.Home(driver);
	}catch(Exception ex)
	{

	}

}

@SuppressWarnings("rawtypes")
public void M4(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet)
{
	try
	{
		master.Scroll(driver);
		driver.findElement(By.xpath("//a[contains(text(),'M4. Transporter ID')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_gstin']")).sendKeys("29ADMFS6015J1ZM");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	    if(rows.size()>=1)
	    {
	    	cell = worksheet.getRow(33).getCell(3);
			cell.setCellValue("OK");
	   	 System.out.println("M4.Transporter ID : " + "OK");
	    }else
	    {
	    	cell = worksheet.getRow(33).getCell(3);
			cell.setCellValue("NOTOK");
	   	 System.out.println("M4. Transporter ID : " + "NOTOK");
	    }
	    master.Home(driver);
	}catch(Exception ex)
	{

	}

}

@SuppressWarnings("rawtypes")
public void M5(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException
{
	try
	{
		driver.findElement(By.xpath("//a[contains(text(),'Vehicle No.')]")).click();
	    driver.findElement(By.xpath("//input[@id='txt_vhicl']")).sendKeys("ABC1234");
	    driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		Thread.sleep(1000);
	    Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_zonestate']")));
		dropdown.selectByValue("1");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	    if(rows.size()>=1)
	    {
	    	cell = worksheet.getRow(34).getCell(3);
			cell.setCellValue("OK");
	   	 System.out.println("M5. Vehicle No : " + "OK");
	    }else
	    {
	    	cell = worksheet.getRow(34).getCell(3);
			cell.setCellValue("NOTOK");
	   	 System.out.println("M5. Vehicle No : " + "NOTOK");
	    }
	    master.Home(driver);
	}catch(Exception ex)
	{

	}

}

@SuppressWarnings("rawtypes")
public void M6(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet)
{
	try
	{
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[13]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")).click();

		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>1)
		{
			cell = worksheet.getRow(35).getCell(3);
			cell.setCellValue("OK");
			 System.out.println("M6. Rejected EWB : " + "OK");
		}else
		{
			cell = worksheet.getRow(3).getCell(3);
			cell.setCellValue("NOTOK");
			 System.out.println("M6. Rejected EWB : " + "NOTOK");
		}
		master.Home(driver);
	}catch(Exception ex)
	{

	}

}


@SuppressWarnings("rawtypes")
public void M7(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet)
{
	try
	{
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[13]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>1)
		{
			cell = worksheet.getRow(36).getCell(3);
			cell.setCellValue("OK");
			 System.out.println("M7. Cancelled EWB : " + "OK");
		}else
		{
			cell = worksheet.getRow(36).getCell(3);
			cell.setCellValue("NOTOK");
			 System.out.println("M7. Cancelled EWB : " + "NOTOK");
		}master.Home(driver);
	}catch(Exception ex)
	{

	}

}


@SuppressWarnings("rawtypes")
public void M8(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet)
{
	try
	{
		driver.findElement(By.xpath("//a[contains(text(),'Tax Evasion Prone Commodities')]")).click();
		Select dropdown =  new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_tostate']")));
		dropdown.selectByValue("37");
		 Thread.sleep(2000);
		Select dropdown1 =  new Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[4]/select[1]")));
		dropdown1.selectByValue("4");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>1)
		{
			 System.out.println("M8. Tax Evasion Prone Commodities : " + "OK");
		}else
		{
			 System.out.println("M8. Tax Evasion Prone Commodities : " + "NOTOK");
		}master.Home(driver);
	}catch(Exception ex)
	{

	}


}
@SuppressWarnings("rawtypes")
public void M9(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet)
{
	try
	{
		driver.findElement(By.xpath("//a[contains(text(),'URP Ewaybills')]")).click();
		Select dropdown =  new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_tostate']")));
		dropdown.selectByValue("1");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>1)
		{
			cell = worksheet.getRow(37).getCell(3);
			cell.setCellValue("OK");
			 System.out.println("M9. URP Ewaybills: " + "OK");
		}else
		{
			cell = worksheet.getRow(37).getCell(3);
			cell.setCellValue("NOTOK");
			 System.out.println("M9. URP Ewaybills : " + "NOTOK");
		}master.Home(driver);
	}catch(Exception ex)
	{

	}


}

@SuppressWarnings("rawtypes")
public void M10(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException
{
	try
	{
		driver.findElement(By.xpath("//a[contains(text(),'Watch List Reports on Taxpayer')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows1.size()>=1)
		{
		String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).click();
		Thread.sleep(2000);
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		 int a = Integer.parseInt(str);
		 if(a==(rows.size()-1))
		 {
			 cell = worksheet.getRow(38).getCell(3);
				cell.setCellValue("OK");
		 	 System.out.println("M10. Watch List Reports on Taxpayer : " + "OK");
	}else
	{
		cell = worksheet.getRow(38).getCell(3);
		cell.setCellValue("NOTOK");
		 System.out.println("M10. Watch List Reports on Taxpayer : " + "NOTOK");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 master.Home(driver);
	}
		}else
		{
			cell = worksheet.getRow(38).getCell(3);
			cell.setCellValue("NOTOK");
			 System.out.println("M10. Watch List Reports on Taxpayer : " + "NOTOK");
			 master.Home(driver);
		}
	Thread.sleep(2000);
		 driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(3) div.modal-dialog div.modal-content div.modal-header div.text-right.col-xl-1.p-0 > button.close")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 master.Home(driver);
	}catch(Exception ex)
	{

	}

}
@SuppressWarnings("rawtypes")
public void M11(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException
{
	try
	{
		driver.findElement(By.xpath("//a[contains(text(),'Watch List Reports on Transporter')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows1.size()>=1)
			{
			String str1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).getText();
			 Thread.sleep(2000);
			WebElement e1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]"));
			js.executeScript("arguments[0].click();", e1);
			Thread.sleep(2000);
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
			 int a = Integer.parseInt(str1);
			 if(a==(rows.size()-1))
			 {
				 cell = worksheet.getRow(1).getCell(5);
					cell.setCellValue("OK");
			 	 System.out.println("M11. Watch List Reports on Transporter : " + "OK");
		}else
		{
			cell = worksheet.getRow(1).getCell(5);
			cell.setCellValue("NOTOK");
			 System.out.println("M11. Watch List Reports on Transporter : " + "NOTOK2");
			 Thread.sleep(2000);
			 driver.navigate().back();
			 master.Home(driver);
		}
			}else
			{
				cell = worksheet.getRow(1).getCell(5);
				cell.setCellValue("NOTOK");
				 System.out.println("M11. Watch List Reports on Transporter : " + "NOTOK1");
				 master.Home(driver);
			}

			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(3) div.modal-dialog div.modal-content div.modal-header div.text-right.col-xl-1.p-0 > button.close")).click();
			 Thread.sleep(2000);
			 driver.navigate().back();
			 master.Home(driver);
		//}


	}catch(Exception ex)
	{

	}

}


@SuppressWarnings("rawtypes")
public void M12(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
{
	try
	{
		driver.findElement(By.xpath("//a[contains(text(),'Watch List Reports on Vehicle')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).getText();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		//System.out.println("No of rows : " + rows.size());
		 int a11 = Integer.parseInt(str);
		// System.out.println(a11);


		 if (a11 == (rows.size()-1))
		 {
			 cell = worksheet.getRow(2).getCell(5);
			 cell.setCellValue("OK");
		 	 System.out.println("M12.Watch List Reports on Vehicle : " + "OK");
		 }else
		 {
			 cell = worksheet.getRow(2).getCell(5);
			 cell.setCellValue("NOTOK");
				 System.out.println("M12.Watch List Reports on Vehicle : " + "NOTOK");
				 Thread.sleep(2000);
				 driver.navigate().back();
				 master.Home(driver);
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(3) div.modal-dialog div.modal-content div.modal-header div.text-right.col-xl-1.p-0 > button.close")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 master.Home(driver);
	}catch(Exception ex)
	{

	}


}
}

