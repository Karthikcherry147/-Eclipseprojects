package Analytics;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H_Analytics_On_Ewaybill {

	Masters Ms = new Masters();
	@SuppressWarnings({ "rawtypes" })
	public void H1(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException {
		try
		{

			driver.findElement(By.xpath("//a[contains(text(),'H1. EWBs cancelled for distance of 100 KMs after 2')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			 List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if(rows1.size()>=2)
					{
			String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).getText();
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		//	System.out.println("No of rows are : " + (rows.size()-1));
			 int a1 = Integer.parseInt(str);
			if (a1 == (rows.size()-1))
			{cell = worksheet.getRow(7).getCell(3);
			cell.setCellValue("OK");
				System.out.println("H1.EWBS CANCELLED FOR DISTANCE OF 100 KMS AFTER 2 HOURS OF GENERATION : " + "OK");
			}else
			{

				cell = worksheet.getRow(7).getCell(3);
			cell.setCellValue("NOTOK");
				System.out.println("H1.EWBS CANCELLED FOR DISTANCE OF 100 KMS AFTER 2 HOURS OF GENERATION : " + "NOTOK");
				driver.navigate().back();
				Ms.Home(driver);
			}
					}else
					{
						cell = worksheet.getRow(7).getCell(3);
						cell.setCellValue("NOTOK");
							System.out.println("H1.EWBS CANCELLED FOR DISTANCE OF 100 KMS AFTER 2 HOURS OF GENERATION : " + "NOTOK");
							driver.navigate().back();
							Ms.Home(driver);
					}
			Thread.sleep(1000);
			WebElement H1 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_LinkButton1']"));
			js.executeScript("arguments[0].click();", H1);

			Ms.Home(driver);

		}catch(Exception e)
		{

		}

	}

	@SuppressWarnings("rawtypes")
	public void H2(WebDriver driver, Cell cell,XSSFSheet worksheet,JavascriptExecutor js) throws InterruptedException
	{ try
	{driver.findElement(By.xpath("//a[contains(text(),'EWBs cancelled for distance of 200 KMs after ')]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	if(rows1.size()>=2)
		{
	String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();
	List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	//System.out.println("No of rows are : " + (rows.size()-1));
	 int a1 = Integer.parseInt(str);
	if (a1 == (rows.size()-1))
	{cell = worksheet.getRow(8).getCell(3);
	cell.setCellValue("OK");
		System.out.println("H2.EWBS CANCELLED FOR DISTANCE OF 200 KMS AFTER 4 HOURS OF GENERATION : " + "OK");
	}else
	{cell = worksheet.getRow(8).getCell(3);
	cell.setCellValue("NOTOK");

		System.out.println("H2.EWBS CANCELLED FOR DISTANCE OF 200 KMS AFTER 4 HOURS OF GENERATION : " + "NOTOK");
		driver.navigate().back();
		Ms.Home(driver);
	}
		}else
		{
			cell = worksheet.getRow(8).getCell(3);
			cell.setCellValue("NOTOK");
				System.out.println("H2.EWBS CANCELLED FOR DISTANCE OF 200 KMS AFTER 4 HOURS OF GENERATION : " + "NOTOK");
				driver.navigate().back();
				Ms.Home(driver);
		}

	Thread.sleep(1000);
	WebElement H2 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_LinkButton1']"));
	js.executeScript("arguments[0].click();", H2);
	Ms.Home(driver);

	}catch(Exception e)
	{

	}

	}
	@SuppressWarnings("rawtypes")
	public void H3(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'H3. EWBs cancelled during the last hour of cancell')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows1.size()>=2)
				{
			String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).getText();
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			//System.out.println("No of rows are : " + (rows.size()-1));
			 int a1 = Integer.parseInt(str);
			if (a1 == (rows.size()-1))
			{cell = worksheet.getRow(9).getCell(3);
			cell.setCellValue("OK");
				System.out.println("H3.EWBs cancelled during the last hour of cancellation time : " + "OK");
			}else
			{cell = worksheet.getRow(9).getCell(3);
			cell.setCellValue("NOTOK");
				System.out.println("H3.EWBs cancelled during the last hour of cancellation time : " + "NOTOK");
				driver.navigate().back();
				Ms.Home(driver);
			}
				}else
				{
					cell = worksheet.getRow(9).getCell(3);
					cell.setCellValue("NOTOK");
						System.out.println("H3.EWBs cancelled during the last hour of cancellation time : " + "NOTOK");
						driver.navigate().back();
						Ms.Home(driver);
				}
			Thread.sleep(1000);
			WebElement H3 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_LinkButton1']"));
			js.executeScript("arguments[0].click();", H3);
			Ms.Home(driver);

		}catch (Exception e)
		{

		}

	}
	@SuppressWarnings("rawtypes")
	public void H4(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'H4. EWBs updated with Part-B after verification')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows1.size()>=2)
				{
			String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).getText();
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			//System.out.println("No of rows are : " + (rows.size()-1));
			 int a1 = Integer.parseInt(str);
			if (a1 == (rows.size()-1))
			{cell = worksheet.getRow(10).getCell(3);
			cell.setCellValue("OK");
				System.out.println("H4. EWBs updated with Part-B after verification : " + "OK");
			}else
			{cell = worksheet.getRow(10).getCell(3);
			cell.setCellValue("NOTOK");
				System.out.println("H4. EWBs updated with Part-B after verification : " + "NOTOK");
				driver.navigate().back();
				Ms.Home(driver);
			}
				}else
				{
					cell = worksheet.getRow(10).getCell(3);
					cell.setCellValue("NOTOK");
						System.out.println("H4.EWBs cancelled during the last hour of cancellation time : " + "NOTOK");
						driver.navigate().back();
						Ms.Home(driver);
				}
			Thread.sleep(1000);
			WebElement H4  = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_LinkButton1']"));
			js.executeScript("arguments[0].click();", H4);
			Ms.Home(driver);

		}catch(Exception e)
		{

		}

	}
	@SuppressWarnings("rawtypes")
	public void H5(WebDriver driver, Cell cell,XSSFSheet worksheet,JavascriptExecutor js) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'H5. EWBs Generated by citizens')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows1.size()>=2)
				{
			String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).getText();
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			//System.out.println("No of rows are : " + (rows.size()-1));
			 int a1 = Integer.parseInt(str);
			if (a1 == (rows.size()-1))
			{cell = worksheet.getRow(11).getCell(3);
			cell.setCellValue("OK");
				System.out.println("H5.EWBS GENERATED BY CITIZENS : " + "OK");
			}else
			{
				cell = worksheet.getRow(11).getCell(3);
				cell.setCellValue("NOTOK");
				System.out.println("H5.EWBS GENERATED BY CITIZENS : " + "NOTOK");
				driver.navigate().back();
				Ms.Home(driver);
			}
				}else
				{
					cell = worksheet.getRow(11).getCell(3);
					cell.setCellValue("NOTOK");
					System.out.println("H5.EWBS GENERATED BY CITIZENS : " + "NOTOK");
					driver.navigate().back();
					Ms.Home(driver);
				}

			Thread.sleep(1000);
			WebElement H5 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_LinkButton1']"));
			js.executeScript("arguments[0].click();", H5);
			Ms.Home(driver);

		}catch(Exception e) {

		}

	}
	@SuppressWarnings("rawtypes")
	public void H6(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),' Multiple EWBs with same Invoice No.')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows1.size()>=2)
				{
			String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]")).getText();
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/a[1]")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			//System.out.println("No of rows are : " + (rows.size()-1));
			 int a1 = Integer.parseInt(str);
			 //System.out.println(a1);
			 int a2 = rows.size()-1;
			 //System.out.println(a2);
			 int a3 = a1*2;
			 //System.out.println(a3);
			if (a2 == a3)
			{
				cell = worksheet.getRow(12).getCell(3);
				cell.setCellValue("OK");
				System.out.println("H6.MULTIPLE EWBS WITH SAME INVOICE NO. : " + "OK");
			}else
			{
				cell = worksheet.getRow(12).getCell(3);
				cell.setCellValue("NOTOK");
				System.out.println("H6.MULTIPLE EWBS WITH SAME INVOICE NO. : " + "NOTOK");
				driver.navigate().back();
				Ms.Home(driver);
			}
				}else
				{
					cell = worksheet.getRow(12).getCell(3);
					cell.setCellValue("NOTOK");
					System.out.println("H6.MULTIPLE EWBS WITH SAME INVOICE NO. : " + "NOTOK");
					driver.navigate().back();
					Ms.Home(driver);
				}
			Thread.sleep(1000);
			WebElement H6 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_LinkButton1']"));
			js.executeScript("arguments[0].click();", H6);
			Ms.Home(driver);

		}catch(Exception e)
		{

		}

	}
	@SuppressWarnings("rawtypes")
	public void H7(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
	{  try
	{
		driver.findElement(By.xpath("//a[contains(text(),'EWBs between URP & URP & assess. value more t')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows1.size()>=2)
			{
		String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).getText();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		//System.out.println("No of rows are : " + (rows.size()-1));
		 int a1 = Integer.parseInt(str);
		if (a1 == (rows.size()-1))
		{
			cell = worksheet.getRow(13).getCell(3);
			cell.setCellValue("OK");
			System.out.println("H7.EWBS BETWEEN URP & URP & ASSESSABLE VALUE MORE THAN RS 5 LAKH : " + "OK");
		}else
		{
			cell = worksheet.getRow(13).getCell(3);
			cell.setCellValue("NOTOK");
			System.out.println("H7.EWBS BETWEEN URP & URP & ASSESSABLE VALUE MORE THAN RS 5 LAKH : " + "NOTOK");
			driver.navigate().back();
			Ms.Home(driver);
		}
			}else
			{
				cell = worksheet.getRow(13).getCell(3);
				cell.setCellValue("NOTOK");
				System.out.println("H7.EWBS BETWEEN URP & URP & ASSESSABLE VALUE MORE THAN RS 5 LAKH : " + "NOTOK");
				driver.navigate().back();
				Ms.Home(driver);
			}

		Thread.sleep(1000);
		WebElement H7 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_LinkButton1']"));
		js.executeScript("arguments[0].click();", H7);
		Ms.Home(driver);

	}catch(Exception e)
	{

	}

	}
}
