package Analytics;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C_AnalyticsTaxpayer1 {

	Masters Mstrs = new Masters();

	@SuppressWarnings("rawtypes")
	public void C1(WebDriver driver, Cell cell,XSSFSheet worksheet)
	{try {
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>=2)
		{
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/a[1]")).click();
		String z1= driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[5]/div[1]/div[1]/div[2]/table[2]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
		if (z1.isBlank())
		{
			cell = worksheet.getRow(18).getCell(1);
			cell.setCellValue("NOTOK");
			System.out.println("C1.WORKS CONTRACTORS : "+ "NOTOK");
		}else
		{
			cell = worksheet.getRow(18).getCell(1);
			cell.setCellValue("OK");
			System.out.println("C1.WORKS CONTRACTORS : "+ "OK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Button1']")).click();
		}
		}else
		{
			cell = worksheet.getRow(18).getCell(1);
			cell.setCellValue("NOTOK");
			System.out.println("C1.WORKS CONTRACTORS : "+ "NOTOK");
		}

		Mstrs.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
	}

	@SuppressWarnings("rawtypes")
	public void C2(WebDriver driver, Cell cell,XSSFSheet worksheet)
	{try {
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[4]/input[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>=2)
		{
		String z1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
		if (z1.isBlank())
		{

			cell = worksheet.getRow(19).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("C2.TAXPAYERS WITH ONLY EXPORTS AND NO INWARD SUPPLIES: " + "NOTOK");

		}else
		{cell = worksheet.getRow(19).getCell(1);
		cell.setCellValue("OK");
		}	System.out.println("C2.TAXPAYERS WITH ONLY EXPORTS AND NO INWARD SUPPLIES: " +" OK");
		}else
		{
			cell = worksheet.getRow(19).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("C2.TAXPAYERS WITH ONLY EXPORTS AND NO INWARD SUPPLIES: " + "NOTOK");
		}


		Mstrs.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
	}

	@SuppressWarnings("rawtypes")
	public void C3(WebDriver driver, Cell cell,XSSFSheet worksheet)
	{try {
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[4]/input[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>=2)
		{
		String z2 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
		if (z2.isBlank())
		{

			cell = worksheet.getRow(20).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("C3.TAXPAYERS LEVIED WITH PENALTY: "+ "NOTOK");
			Mstrs.Home(driver);

		}else
		{cell = worksheet.getRow(20).getCell(1);
		cell.setCellValue("OK");
			System.out.println("C3.TAXPAYERS LEVIED WITH PENALTY: " + "OK");
		}
		}else
		{
			cell = worksheet.getRow(20).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("C3.TAXPAYERS LEVIED WITH PENALTY: "+ "NOTOK");
				Mstrs.Home(driver);
		}

		Mstrs.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
	}

	@SuppressWarnings("rawtypes")
	public  void C4(WebDriver driver, Cell cell,XSSFSheet worksheet) {
try {
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/input[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>=2)
		{
		String z3 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
		if (z3.isBlank())
		{

			cell = worksheet.getRow(21).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("C4.TAX PAYERS WITH MORE THAN 4 HSN CHAPTERS IN EWBS : " + "NOTOK");
			Mstrs.Home(driver);

		}else
		{cell = worksheet.getRow(21).getCell(1);
		cell.setCellValue("OK");
			System.out.println("C4.TAX PAYERS WITH MORE THAN 4 HSN CHAPTERS IN EWBS : " + "OK");
		}
		}else
		{
			cell = worksheet.getRow(21).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("C4.TAX PAYERS WITH MORE THAN 4 HSN CHAPTERS IN EWBS : " + "NOTOK");
				Mstrs.Home(driver);
		}

		Mstrs.Home(driver);
}catch(org.openqa.selenium.NoSuchElementException ex4)
{

}
	}

	@SuppressWarnings("rawtypes")
	public void C5(WebDriver driver, Cell cell,XSSFSheet worksheet)
	{try {
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/input[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>=2)
		{
		String z4 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
		if (z4.isBlank())
		{

			cell = worksheet.getRow(22).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("C5.TAXPAYERS WITH MORE OUTWARD SUPPLIES FAR GREATER THAN INWARD SUPPLIES : " + " NOTOK");
			Mstrs.Home(driver);

		}else
		{cell = worksheet.getRow(22).getCell(1);
		cell.setCellValue("OK");
			System.out.println("C5.TAXPAYERS WITH MORE OUTWARD SUPPLIES FAR GREATER THAN INWARD SUPPLIES : " + "OK");
		}
		}else
		{
			cell = worksheet.getRow(22).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("C5.TAXPAYERS WITH MORE OUTWARD SUPPLIES FAR GREATER THAN INWARD SUPPLIES : " + " NOTOK");
				Mstrs.Home(driver);
		}

		Mstrs.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}

	}

	@SuppressWarnings("rawtypes")
	public void C6(WebDriver driver, Cell cell,XSSFSheet worksheet)
	{try {
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/input[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>=2)
		{
		String z5 =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
		if (z5.isBlank())
		{

			cell = worksheet.getRow(23).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("C6.TAXPAYERS WITH MORE INWARD SUPPLIES FAR GREATER THAN OUTWARD SUPPLIES : " + "NOTOK");
			Mstrs.Home(driver);

		}else
		{cell = worksheet.getRow(23).getCell(1);
		cell.setCellValue("OK");
			System.out.println("C6.TAXPAYERS WITH MORE INWARD SUPPLIES FAR GREATER THAN OUTWARD SUPPLIES :" + "OK");
		}
		}else
		{
			cell = worksheet.getRow(23).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("C6.TAXPAYERS WITH MORE INWARD SUPPLIES FAR GREATER THAN OUTWARD SUPPLIES : " + "NOTOK");
				Mstrs.Home(driver);
		}

		Mstrs.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}

	}

	@SuppressWarnings("rawtypes")
	public void C7(WebDriver driver, Cell cell,XSSFSheet worksheet)
	{try {
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/input[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>=2)
		{
		String z6 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
		if (z6.isBlank())
		{

			cell = worksheet.getRow(24).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("C7.COMPOSITION TAX PAYERS WITH TURNOVER MORE THAN RS. 1.5 CR. IN EWBS FOR THE YEAR : " + "NOTOK");
			Mstrs.Home(driver);

		}else
		{cell = worksheet.getRow(24).getCell(1);
		cell.setCellValue("OK");
			System.out.println("C7.COMPOSITION TAX PAYERS WITH TURNOVER MORE THAN RS. 1.5 CR. IN EWBS FOR THE YEAR : " + " OK");
		}
		}else
		{
			cell = worksheet.getRow(24).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("C7.COMPOSITION TAX PAYERS WITH TURNOVER MORE THAN RS. 1.5 CR. IN EWBS FOR THE YEAR : " + "NOTOK");
				Mstrs.Home(driver);
		}

		Mstrs.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
	}

	@SuppressWarnings("rawtypes")
	public void C8(WebDriver driver, Cell cell,XSSFSheet worksheet)
	{try {
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/input[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>=2)
		{
		String z7 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
		if (z7.isBlank())
		{
			cell = worksheet.getRow(25).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("C8.TAXPAYERS WITH HIGH CANCELLED EWB : " + "NOTOK");
			Mstrs.Home(driver);

		}else
		{cell = worksheet.getRow(25).getCell(1);
		cell.setCellValue("OK");
			System.out.println("C8.TAXPAYERS WITH HIGH CANCELLED EWB : " + "OK");
		}
		}else
		{
			cell = worksheet.getRow(25).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("C8.TAXPAYERS WITH HIGH CANCELLED EWB : " + "NOTOK");
				Mstrs.Home(driver);
		}

		Mstrs.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
	}

	@SuppressWarnings("rawtypes")
	public void C9(WebDriver driver, Cell cell,XSSFSheet worksheet)
	{try {
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/input[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows.size()>=2)
		{
		String z8 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
		if (z8.isBlank())
		{

			cell = worksheet.getRow(26).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("C9.TAXPAYERS WITH HIGH REJECTIONS OF EWB : " + "NOTOK");
			Mstrs.Home(driver);

		}else
		{cell = worksheet.getRow(26).getCell(1);
		cell.setCellValue("OK");
			System.out.println("C9.TAXPAYERS WITH HIGH REJECTIONS OF EWB : " + "OK");
		}
		}else
		{
			cell = worksheet.getRow(26).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("C9.TAXPAYERS WITH HIGH REJECTIONS OF EWB : " + "NOTOK");
				Mstrs.Home(driver);
		}

		Mstrs.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}

	}
	@SuppressWarnings("rawtypes")
	public void C10(WebDriver driver, Cell cell,XSSFSheet worksheet)
	{

		try
	{
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/input[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		System.out.println("No of rows : " + rows.size());
		if(rows.size()>=2)
		{
		String z9 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
			if (z9.isBlank())
			{

				cell = worksheet.getRow(27).getCell(1);
			cell.setCellValue("NOTOK");
				System.out.println("C10.TAXPAYERS (RECIPIENTS) WITH HIGH CANCELLED EWB : " + " NOTOK1");
				Mstrs.Home(driver);
			}
			else
			{cell = worksheet.getRow(27).getCell(1);
			cell.setCellValue("OK");
				System.out.println("C10.TAXPAYERS (RECIPIENTS) WITH HIGH CANCELLED EWB : " + " OK");

			}
		}else
		{
				cell = worksheet.getRow(27).getCell(1);
				cell.setCellValue("NOTOK");
					System.out.println("C10.TAXPAYERS (RECIPIENTS) WITH HIGH CANCELLED EWB : " + " NOTOK2");
					Mstrs.Home(driver);


		}

		Mstrs.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
	}
}
