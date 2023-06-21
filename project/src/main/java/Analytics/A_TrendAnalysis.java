package Analytics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class A_TrendAnalysis {



	Masters Mas = new Masters();

	@SuppressWarnings("rawtypes")


	public void A1(WebDriver driver, Cell cell,XSSFSheet worksheet ) {
		try {
		driver.findElement(By.xpath("//a[contains(text(),'A1. EWBs by Newly Registered Taxpayers')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Button1']")).click();
		List  rows = driver.findElements(By.xpath("//*[@id=\"grd_details\"]/tbody/tr"));
		//System.out.println("No of rows are : " + rows.size());
	 if (rows.size() >= 5)

	 {
		 cell = worksheet.getRow(1).getCell(1);
			cell.setCellValue("OK");
		 System.out.println("A1.EWBS BY NEWLY REGISTERED TAXPAYERS : " + "OK");
		 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_export_excel']")).click();
	 }else
//	 {String str = driver.findElement(By.xpath("//td[contains(text(),'Details Not Found !!')]")).getText();
//		if(str.contains("Details Not Found !!"))
//		{
//
//
//			 cell = worksheet.getRow(1).getCell(1);
//				cell.setCellValue("NOTOK");
			 System.out.println("A1.EWBS BY NEWLY REGISTERED TAXPAYERS : " + "NOTOK");
			 Mas.Home(driver);
	//	}

//	 }
	Mas.Home(driver);
		}catch(org.openqa.selenium.NoSuchElementException ex4)
		{

		}
	}


	@SuppressWarnings("rawtypes")
	public void A2(WebDriver driver, Cell cell,XSSFSheet worksheet ) {
try {
		 driver.findElement(By.xpath("//a[contains(text(),'A2. EWBs between Newly Registered Taxpayers')]")).click();
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
			 //get current date time with Date()
			 Date date = new Date();
			 // Now format the date
			 String date1= dateFormat.format(date);
			 //LocalDate date2=LocalDate.parse("2018-01-32");
			 LocalDate date2 = LocalDate.now().minusDays(30);
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
			 String date3= formatter.format(date2);
		       // System.out.println(date3);
			 driver.findElement(By.xpath("//input[@id='txt_todt']")).clear();
			 driver.findElement(By.xpath("//input[@id='txt_todt']")).sendKeys(date1);
			 driver.findElement(By.xpath("//input[@id='txt_fromdt']")).clear();
			 driver.findElement(By.xpath("//input[@id='txt_fromdt']")).sendKeys(date3);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Button1']")).click();
			List  rows1 = driver.findElements(By.xpath("/html/body/form/div[3]/main/div[3]/div[2]/div[1]/div/table/tbody/tr"));
			//System.out.println("No of rows are : " + rows1.size());
		 if (rows1.size()>=2)
		 {
			 cell = worksheet.getRow(2).getCell(1);
				cell.setCellValue("OK");
			 System.out.println("A2.EWBS BETWEEN NEWLY REGISTERED TAXPAYERS : " + "OK");
			 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_export_excel']")).click();
		 }else
		 {
			 cell = worksheet.getRow(2).getCell(1);
				cell.setCellValue("NOTOK");
			 System.out.println("A2.EWBS BETWEEN NEWLY REGISTERED TAXPAYERS : " + "NOTOK");
		 }

		 Mas.Home(driver);
}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}
	}

	@SuppressWarnings("rawtypes")
	public void A3(WebDriver driver, Cell cell,XSSFSheet worksheet ) {
		try {
		driver.findElement(By.xpath("//a[contains(text(),'A3. EWBs by Newly Enrolled Transporters')]")).click();
		DateFormat dateFormaty = new SimpleDateFormat("dd/MM/yyyy ");
		 //get current date time with Date()
		 Date datey = new Date();
		 // Now format the date
		 String date1y= dateFormaty.format(datey);

		 //LocalDate date2=LocalDate.parse("2018-01-32");
		 LocalDate date2y = LocalDate.now().minusDays(60);
		 DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		 String date3y= formattery.format(date2y);
	       // System.out.println(date3y);
		 driver.findElement(By.xpath("//input[@id='txt_todt']")).clear();
		 driver.findElement(By.xpath("//input[@id='txt_todt']")).sendKeys(date1y);
		 driver.findElement(By.xpath("//input[@id='txt_fromdt']")).clear();
		 driver.findElement(By.xpath("//input[@id='txt_fromdt']")).sendKeys(date3y);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Button1']")).click();

		List  rows2 = driver.findElements(By.xpath("/html/body/form/div[3]/main/div[3]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr"));

		//System.out.println("No of rows are : " + rows2.size());

	 if (rows2.size() >= 2)

	 { cell = worksheet.getRow(3).getCell(1);
		cell.setCellValue("OK");
		 System.out.println("A3.EWBS BY NEWLY ENROLLED TRANSPORTERS : "  + "OK");
		  driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_export_excel']")).click();

	 }else
	 { cell = worksheet.getRow(3).getCell(1);
		cell.setCellValue("NOTOK");
		 System.out.println("A3.EWBS BY NEWLY ENROLLED TRANSPORTERS : "  + "NOTOK");
	 }



          Mas.Home(driver);
		}catch(org.openqa.selenium.NoSuchElementException ex4)
		{

		}
	}

	@SuppressWarnings("rawtypes")
	public void A4(WebDriver driver, Cell cell,XSSFSheet worksheet ) {
		try {
		 driver.findElement(By.xpath("//a[contains(text(),'A4. Multiple registration on same PAN in all state')]")).click();
         driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Button1']")).click();
         List rows3 = driver.findElements(By.xpath("  /html/body/form/div[3]/main/div[3]/div[2]/div[1]/div/table/tbody/tr"));
         //System.out.println("No of rows are : " + rows3.size());
         if (rows3.size()>=2)
         {
        	 cell = worksheet.getRow(4).getCell(1);
     		cell.setCellValue("OK");
       	  System.out.println("A4.MULTIPLE REGISTRATION ON SAME PAN IN ALL STATES : " + "OK");
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_export_excel']")).click();

         }else
         {
        	 cell = worksheet.getRow(4).getCell(1);
     		cell.setCellValue("NOTOK");
       	  System.out.println("A4.MULTIPLE REGISTRATION ON SAME PAN IN ALL STATES : " + "NOTOK");
         }

         Mas.Home(driver);
		}catch(org.openqa.selenium.NoSuchElementException ex4)
		{

		}
	}

@SuppressWarnings("rawtypes")
public void A5(WebDriver driver, Cell cell,XSSFSheet worksheet ) {
	try {
	 driver.findElement(By.xpath("//a[contains(text(),'Multiple registration on same Mobile No. in o')]")).click();
     driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Button1']")).click();
     List rows4 =  driver.findElements(By.xpath("/html/body/form/div[3]/main/div[3]/div[2]/div[1]/div/table/tbody/tr"));
     //System.out.println("No of rows are : " + rows4.size());
     if (rows4.size()>=1)
     {
    	 cell = worksheet.getRow(5).getCell(1);
  		cell.setCellValue("OK");
   	  System.out.println("A5.MULTIPLE REGISTRATION ON SAME MOBILE NO. IN ONE STATE : " + "OK");
   	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_export_excel']")).click();
     }else
     {
    	 cell = worksheet.getRow(5).getCell(1);
  		cell.setCellValue("NOTOK");
   	  System.out.println("A5.MULTIPLE REGISTRATION ON SAME MOBILE NO. IN ONE STATE : " + "NOTOK");
     }
     Mas.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
}
@SuppressWarnings("rawtypes")
public void A6(WebDriver driver, Cell cell,XSSFSheet worksheet ) {
	try {
	driver.findElement(By.xpath("//a[contains(text(),'Taxpayers Registered & De-Registered with in ')]")).click();
    driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
    List rows5 = driver.findElements(By.xpath("//*[@id=\"grd_details\"]/tbody/tr"));

  //System.out.println("No of rows are : " + rows5.size());
    if (rows5.size()>=1)
    {
   	 cell = worksheet.getRow(6).getCell(1);
		cell.setCellValue("OK");
  	  System.out.println("A6.TAXPAYERS REGISTERED & DE-REGISTERED WITH IN 3 MONTHS : " + "OK");
      driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_export_excel']")).click();
    }else
    {
   	 cell = worksheet.getRow(6).getCell(1);
		cell.setCellValue("NOTOK");
  	  System.out.println("A6.TAXPAYERS REGISTERED & DE-REGISTERED WITH IN 3 MONTHS : " + "NOTOK");
    }
    Mas.Home(driver);
}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}

}
@SuppressWarnings("rawtypes")
public void A7(WebDriver driver, Cell cell,XSSFSheet worksheet  ) {
	try {
	driver.findElement(By.xpath("//a[contains(text(),'Taxpayers with abnormal growth in turnover in')]")).click();
    driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
    List rows6 = driver.findElements(By.xpath("/html/body/form/div[3]/main/div[3]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr"));
  //System.out.println("No of rows are : " + rows6.size());
    if (rows6.size()>=1)
    {
    	 cell = worksheet.getRow(7).getCell(1);
   		cell.setCellValue("OK");
  	  System.out.println("A7.TAX PAYERS WITH ABNORMAL GROWTH IN TURNOVER IN EWBS : " + "OK");
  	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_export_excel']")).click();
    }else
    {
    	 cell = worksheet.getRow(7).getCell(1);
   		cell.setCellValue("NOTOK");
  	  System.out.println("A7.TAX PAYERS WITH ABNORMAL GROWTH IN TURNOVER IN EWBS : " + "NOTOK");
    }
    Mas.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
}

}
