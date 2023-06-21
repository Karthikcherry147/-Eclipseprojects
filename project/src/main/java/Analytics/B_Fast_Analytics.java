package Analytics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class B_Fast_Analytics {
	Masters Mstr = new Masters();
	@SuppressWarnings("rawtypes")


	//*** B1.E-WAYBILLS WITH NO VEHICLE MOVEMENT***//
	public void B1(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException {
try {
		driver.findElement(By.xpath("//a[contains(text(),'EWB with No Vehicle Movement')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		List  rows = driver.findElements(By.xpath("/html/body/form/div[3]/main/div[4]/div/table/tbody/tr"));
		//System.out.println("No of rows : " + rows.size());
		if (rows.size()>=2)
		{

			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_grd_veh_mov_ctl04_btn_gstin']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_grd_ewb_dtls_ctl04_btn_ewbno']")).click();
			Thread.sleep(2000);
			String w1 = driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceHolder1_lbl_ewbno']")).getText();
			//System.out.println(w1);
			if (w1.isBlank())
			{cell = worksheet.getRow(8).getCell(1);
	   		cell.setCellValue("NOTOK1");
			}else
			{
				cell = worksheet.getRow(8).getCell(1);
	   		cell.setCellValue("OK");
				System.out.println("B1.E-WAYBILLS WITH NO VEHICLE MOVEMENT : " + "OK");

			}


		}else
		{
			String str = driver.findElement(By.xpath("//td[contains(text(),'No Record Available')]")).getText();
			if(str.contains("No Record Available"))
			{

			cell = worksheet.getRow(8).getCell(1);
   		cell.setCellValue("NOTOK");
			System.out.println("B1.E-WAYBILLS WITH NO VEHICLE MOVEMENT : " + "NOTOK");
			Thread.sleep(2000);
			driver.navigate().back();
			Mstr.Home(driver);
		}
		}
		Thread.sleep(2000);
		WebElement w2 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		js.executeScript("arguments[0].click();", w2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[5]/div[1]/div[1]/div[1]/input[1]")).click();
//		driver.close();
//
//		driver.navigate().back();
		Mstr.Home(driver);
}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}
	}


	//*** B2.VEHICLE MOVEMENT WITHOUT EWB***//

	@SuppressWarnings({ "rawtypes", "unused" })
	public void B2(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
	{try {
		driver.findElement(By.xpath("//a[contains(text(),'Vehicle Movement without EWB')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		List rows1 = driver.findElements(By.xpath("/html/body/form/div[3]/main/div[4]/div/div/div[2]/div/table/tbody/tr"));
	   // System.out.println("No of rows : " + rows1.size());
	    if (rows1.size()>=2)
		{	Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")).click();
			try
			{
			String w1 = driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();

			if (w1.isBlank())
			{cell = worksheet.getRow(9).getCell(1);
	   		cell.setCellValue("NOTOK");
				System.out.println("B2.VEHICLE MOVEMENT WITHOUT EWB : " + "NOTOK");
			}else
			{cell = worksheet.getRow(9).getCell(1);
	   		cell.setCellValue("OK");
				System.out.println("B2.VEHICLE MOVEMENT WITHOUT EWB : " + "OK");
			}}catch (org.openqa.selenium.NoSuchElementException ex1)
			{

			}
		}else
		{cell = worksheet.getRow(9).getCell(1);
   		cell.setCellValue("NOTOK");
			System.out.println("B2.VEHICLE MOVEMENT WITHOUT EWB : " + "NOTOK");
			Thread.sleep(2000);
			driver.close();
			Mstr.Home(driver);
		}	Thread.sleep(2000);
		WebElement w3 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		js.executeScript("arguments[0].click();", w3);
     	Thread.sleep(2000);
         Mstr.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}

 }

//*** B3.VEHICLE MOVEMENT OF CANCELLED EWBS *** //
@SuppressWarnings("rawtypes")
public void B3(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
{
	try
	{
	driver.findElement(By.xpath("//a[contains(text(),'B3. Vehicle Movement of Cancelled EWBs')]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	List rows2 = driver.findElements(By.xpath("//*[@id=\"grd_veh_cnc\"]/tbody/tr"));
	// System.out.println("No of rows : " + rows2.size());
	 if (rows2.size()>=2)
	 {
		cell = worksheet.getRow(10).getCell(1);
		cell.setCellValue("OK");
	    System.out.println("B3.VEHICLE MOVEMENT OF CANCELLED EWBS : " + "OK");
}else
{

	cell = worksheet.getRow(10).getCell(1);
	cell.setCellValue("NOTOK");
	 System.out.println("B3.VEHICLE MOVEMENT OF CANCELLED EWBS : " + "NOTOK");
		Thread.sleep(2000);
	 driver.navigate().back();
	 Mstr.Home(driver);
}

Mstr.Home(driver);
}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}

}


//*** B4.RECYCLING OF EWBS USING SAME VEHICLES.***//
@SuppressWarnings({ "rawtypes", "unused" })
public void B4(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
{try {

	driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtGstin']")).sendKeys("29AAACJ4323N1ZC");
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	List rows3 = driver.findElements(By.xpath("//*[@id=\"grd_ewb_dtls\"]/tbody/tr"));
	// System.out.println("No of rows : " + rows3.size());
		 if (rows3.size()>=2)
		 {cell = worksheet.getRow(11).getCell(1);
			cell.setCellValue("OK");
		    System.out.println("B4.RECYCLING OF EWBS USING SAME VEHICLES. : " + "OK");
	}else
	{
		cell = worksheet.getRow(11).getCell(1);
	cell.setCellValue("NOTOK");
		 System.out.println("B4.RECYCLING OF EWBS USING SAME VEHICLES. : " + "NOTOK");
			Thread.sleep(2000);
		 driver.navigate().back();
		 Mstr.Home(driver);
	}

	Mstr.Home(driver);
}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}

}

//*** B5.RECYCLING OF EWBS USING DIFFERENT VEHICLES ***//
@SuppressWarnings("rawtypes")
public void B5(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
{try {

	driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtGstin']")).sendKeys("29AAACW7253L1ZS");
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();

	List rows3 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/table[1]/tbody[1]/tr"));
	// System.out.println("No of rows : " + rows3.size());
		 if (rows3.size()>=2)
		 {cell = worksheet.getRow(12).getCell(1);
			cell.setCellValue("OK");
		    System.out.println("B5.Recycling of EWBs using different Vehicles : " + "OK");
	}else
	{cell = worksheet.getRow(12).getCell(1);
	cell.setCellValue("NOTOK");
		 System.out.println("B5.Recycling of EWBs using different Vehicles : " + "NOTOK");
			Thread.sleep(2000);
		 driver.navigate().back();
		 Mstr.Home(driver);
	}

	Mstr.Home(driver);
}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}


}




//*** B6.RFID ANALYSIS ON EWB BASED ON GSTIN***//
@SuppressWarnings({ "rawtypes", "unused" })
public void B6(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
{try {
driver.findElement(By.xpath("//a[contains(text(),'B6. Vehicle Movement of EWB based on GSTIN')]")).click();
LocalDate date2 = LocalDate.now().minusDays(8);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
String date3= formatter.format(date2);
System.out.println(date3);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_dt']")).clear();
driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_dt']")).sendKeys(date3);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_sup_gstin']")).sendKeys("29AAACJ4323N1ZC");
Thread.sleep(2000);
WebElement W3 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/input[1]"));
js.executeScript("arguments[0].click();", W3);
Thread.sleep(8000);
List rows5 = driver.findElements(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_grd_ewb_dtls\"]/tbody/tr"));
System.out.println("No of rows : " + rows5.size());
		 if (rows5.size()>=2)
		 {cell = worksheet.getRow(13).getCell(1);
			cell.setCellValue("OK");
		    System.out.println("B6.RFID ANALYSIS ON EWB BASED ON GSTIN : " + "OK");
	}else
	{cell = worksheet.getRow(13).getCell(1);
	cell.setCellValue("NOTOK");
		 System.out.println("B6.RFID ANALYSIS ON EWB BASED ON GSTIN : " + "NOTOK");
			Thread.sleep(2000);
		 driver.navigate().back();
		 Mstr.Home(driver);
	}

	Mstr.Home(driver);
}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}

}

//***B7.MOVEMENT BASED ON VEHICLE NUMBER***//
@SuppressWarnings("rawtypes")
public void B7(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
{try {
	driver.findElement(By.xpath("//a[contains(text(),'B7.Movement based on Vehicle Number')]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_vehno']")).sendKeys("KA50B0821");
	LocalDate date2 = LocalDate.now().minusDays(7);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	String date3= formatter.format(date2);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_dtfrm']")).clear();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_dtfrm']")).sendKeys(date3);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();


List rows  = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/table[1]/tbody[1]/tr"));
if(rows.size()>=2)
{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_GvDetails_ctl04_lnkbtn']")).click();
	Thread.sleep(2000);
	String e1 =  driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceHolder1_lbl_ewbno']")).getText();
	if (e1.isBlank())
			{
		      cell = worksheet.getRow(14).getCell(1);
			cell.setCellValue("NOTOK");
		  System.out.println("B7.MOVEMENT BASED ON VEHICLE NUMBER : " + "NOTOK");
			}
			else
			{
				cell = worksheet.getRow(14).getCell(1);
			cell.setCellValue("OK");
				System.out.println("B7.MOVEMENT BASED ON VEHICLE NUMBER : " + "OK");
				WebElement w4 = driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(10) div.modal-dialog.modal-lg div.modal-content div.modal-header.p-1 > div.col-xl-1.px-0.text-right")).
						findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));

				js.executeScript("arguments[0].click();", w4);
				Thread.sleep(2000);
				driver.close();
				Thread.sleep(2000);
				driver.navigate().back();
				Mstr.Home(driver);


			}
			}else
			{
				cell = worksheet.getRow(14).getCell(1);
				cell.setCellValue("NOTOK");
			  System.out.println("B7.MOVEMENT BASED ON VEHICLE NUMBER : " + "NOTOK");
				Thread.sleep(2000);
				 driver.navigate().back();
				Mstr.Home(driver);
			}

}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}



}

//*** B8.MOVEMENT OF VEHICLES REGISTERED IN STATE/ZONE WATCHLIST***//

@SuppressWarnings({ "rawtypes", "unused" })
public void B8(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
{try {
	driver.findElement(By.xpath("//a[contains(text(),'Movement of Vehicles in Watchlist')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	if(rows.size()>=2)
	{
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")).click();
		String t1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
		if (t1.isBlank())
		{
			cell = worksheet.getRow(15).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("B8.MOVEMENT OF VEHICLES REGISTERED IN STATE/ZONE WATCHLIST : " + "NOTOK");
			driver.navigate().back();
			Mstr.Home(driver);

	}else
	{
		cell = worksheet.getRow(15).getCell(1);
	cell.setCellValue("OK");
		System.out.println("B8.MOVEMENT OF VEHICLES REGISTERED IN STATE/ZONE WATCHLIST : " + "OK");
		Thread.sleep(2000);
		driver.navigate().back();
		Mstr.Home(driver);

	}
}else
	{
	       cell = worksheet.getRow(15).getCell(1);
	       cell.setCellValue("NOTOK");
	     System.out.println("B8.MOVEMENT OF VEHICLES REGISTERED IN STATE/ZONE WATCHLIST : " + "NOTOK");
			Thread.sleep(2000);
	     driver.navigate().back();
			Mstr.Home(driver);
	}

	WebElement w4 = driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(10) div.modal-dialog.modal-lg div.modal-content div.modal-header.p-1 > div.col-xl-1.px-0.text-right")).
			findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	js.executeScript("arguments[0].click();", w4);
	Mstr.Home(driver);
}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}
}


@SuppressWarnings("rawtypes")
public void B9(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
{try {
	driver.findElement(By.xpath("//a[contains(text(),'Movement of Vehicles of Taxpayers in Watchlis')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	Thread.sleep(1000);
	List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	if(rows.size()>=2)
	{

	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")).click();
	Thread.sleep(1000);
	String t2 =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
	if (t2.isBlank())
	{cell = worksheet.getRow(16).getCell(1);
	cell.setCellValue("NOTOK");
	   System.out.println("B9.MOVEMENT OF VEHICLES OF TAXPAYERS IN WATCHLIST : " + " NOTOK");


	}else
	{cell = worksheet.getRow(16).getCell(1);
	cell.setCellValue("OK");
		 System.out.println("B9.MOVEMENT OF VEHICLES OF TAXPAYERS IN WATCHLIST : " + "OK");
	}
	}
	else
	{
		cell = worksheet.getRow(16).getCell(1);
		cell.setCellValue("NOTOK");
		   System.out.println("B9.MOVEMENT OF VEHICLES OF TAXPAYERS IN WATCHLIST : " + " NOTOK");
			Thread.sleep(2000);
		   driver.navigate().back();
		   Mstr.Home(driver);
	}

	WebElement t3 = driver.findElement(By.xpath("//a[@id='btnfinalclose']"));
	js.executeScript("arguments[0].click();", t3);
    Mstr.Home(driver);
}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}

}

@SuppressWarnings({ "deprecation", "rawtypes", "unused" })
public void B10(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
{try {
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")).click();

	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[2]")).sendKeys("29AAACM9840P1ZP");

	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	String Alert = null;
	try
	{
		 Alert alert = driver.switchTo().alert();
		   Alert = driver.switchTo().alert().getText();
			alert.accept();
	}catch (Exception e)
	{
		Alert = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/div[3]")).getText();
		Mstr.Home(driver);
	}

	if (Alert.contains("ewaybills.Count"))
	{
		cell = worksheet.getRow(17).getCell(1);
		cell.setCellValue("OK");
//			System.out.println("B10.Vehicle OutOfPath : " + "OK");
			Mstr.Alert(driver);
			driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_BtnProcess']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>=2)
		{
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).click();

			String a1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[2]/table[2]/tbody[1]/tr[1]/td[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")).getText();
			if (a1.isBlank())
			{
				cell = worksheet.getRow(17).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("B10.Vehicle OutOfPath : " + "NOTOK");

			}else
			{cell = worksheet.getRow(17).getCell(1);
			cell.setCellValue("OK");
				System.out.println("B10.Vehicle OutOfPath : " + "OK");
			}
		}else
		{
			cell = worksheet.getRow(17).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("B10.Vehicle OutOfPath : " + "NOTOK");
				Thread.sleep(2000);
				driver.navigate().back();
				Mstr.Home(driver);
		}

			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnback']")).click();
			Thread.sleep(2000);
			Thread.sleep(1000);
			Mstr.Home(driver);

	}else
	{
		if (Alert.contains("No Records Found to Process"))
		{
			cell = worksheet.getRow(17).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("B10.Vehicle OutOfPath : " + "NOTOK");
		}

	}


}catch(org.openqa.selenium.NoSuchElementException ex4)
{




}



}
}











