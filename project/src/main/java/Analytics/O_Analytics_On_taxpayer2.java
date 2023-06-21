package Analytics;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class O_Analytics_On_taxpayer2 {
	Masters master = new Masters();
	@SuppressWarnings({ "rawtypes", "unused" })
	public void O1(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O1. Newly registered tax payers with high Turnover')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(13).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O1. Newly registered tax payers with high Turnover in EWBs : " + "OK");
			}else
			{
				cell = worksheet.getRow(13).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("O1. Newly registered tax payers with high Turnover in EWBs : " + "NOTOK");
			}
			master.Home(driver);

		}catch(Exception ex)
		{

		}

		}
	@SuppressWarnings("rawtypes")
	public void O2(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O2. Taxpayers with Cancellations of EWBs')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(14).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O2. Taxpayers with Cancellations of EWBs : " + "OK");
			}else
			{
				cell = worksheet.getRow(14).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O2. Taxpayers with Cancellations of EWBs : " + "NOTOK");
			}
			master.Home(driver);
		}catch(Exception ex)
		{

		}

		}

	@SuppressWarnings("rawtypes")
	public void O3(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O3. Taxpayers with Extensions of EWBs')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(15).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O3. Taxpayers with Extensions of EWBs    : " + "OK");
			}else
			{
				cell = worksheet.getRow(15).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("O3. Taxpayers with Extensions of EWBs    : " + "NOTOK");
			}
			master.Home(driver);
		}catch(Exception ex)
		{

		}

		}


	@SuppressWarnings("rawtypes")
	public void O4(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O4. Taxpayers with EWBs of Non-sale Outward supply')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{cell = worksheet.getRow(16).getCell(5);
			 cell.setCellValue("OK");
				System.out.println("O4. Taxpayers with EWBs of Non-sale Outward supply : " + "OK");
			}else
			{cell = worksheet.getRow(16).getCell(5);
			 cell.setCellValue("OK");
				System.out.println("O4. Taxpayers with EWBs of Non-sale Outward supply : " + "NOTOK");
			}
			master.Home(driver);
		}catch(Exception ex)
		{

		}

		}

	@SuppressWarnings("rawtypes")
	public void O5(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O5. Taxpayers with Rejected EWBs')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(17).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O5. Taxpayers with Rejected EWBs : " + "OK");
			}else
			{
				cell = worksheet.getRow(17).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("O5. Taxpayers with Rejected EWBs : " + "NOTOK");
			}
			master.Home(driver);
		}catch(Exception ex)
		{

		}

		}

	@SuppressWarnings("rawtypes")
	public void O6(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O6.Taxpayers with Bill-To->Ship To EWBs')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(18).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O6.Taxpayers with Bill-To->Ship To EWBs : " + "OK");
			}else
			{
				cell = worksheet.getRow(18).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("O6.Taxpayers with Bill-To->Ship To EWBs : " + "NOTOK");
			}
			master.Home(driver);
		}catch(Exception ex)
		{

		}

		}

	@SuppressWarnings("rawtypes")
	public void O7(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O7. Taxpayers with EWBs with Multi-Vehicle')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(19).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O7. Taxpayers with EWBs with Multi-Vehicle : " + "OK");
			}else
			{
				cell = worksheet.getRow(19).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("O7. Taxpayers with EWBs with Multi-Vehicle : " + "NOTOK");
			}
			master.Home(driver);
		}catch(Exception ex)
		{

		}

		}

	@SuppressWarnings("rawtypes")
	public void O8(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O8. Taxpayers with EWBs Part-A Generation')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(20).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O8. Taxpayers with EWBs Part-A Generation : " + "OK");
			}else
			{
				cell = worksheet.getRow(20).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("O8. Taxpayers with EWBs Part-A Generation : " + "NOTOK");
			}
			master.Home(driver);
		}catch(Exception ex)
		{

		}

		}
	@SuppressWarnings("rawtypes")
	public void O9(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O9. Taxpayers with Sales to URP')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(21).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O8. Taxpayers with EWBs Part-A Generation : " + "OK");
			}else
			{
				cell = worksheet.getRow(21).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("O8. Taxpayers with EWBs Part-A Generation : " + "NOTOK");
			}
			master.Home(driver);
		}catch(Exception ex)
		{

		}

		}

	@SuppressWarnings("rawtypes")
	public void O10(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O10. Taxpayers with Purchases from URP')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(22).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O10. Taxpayers with Purchases from URP  : " + "OK");
			}else
			{
				cell = worksheet.getRow(22).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("O10. Taxpayers with Purchases from URP  : " + "NOTOK");
			}
			master.Home(driver);
		}catch(Exception ex)
		{

		}

		}

	@SuppressWarnings("rawtypes")
	public void O11(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'O11. Taxpayers rejecting high number of EWB')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(23).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("O11. Taxpayers rejecting high number of EWB : " + "OK");
			}else
			{
				cell = worksheet.getRow(23).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("O11. Taxpayers rejecting high number of EWB : " + "NOTOK");
			}
			master.Home(driver);
		}catch(Exception ex)
		{

		}

		}
	}


