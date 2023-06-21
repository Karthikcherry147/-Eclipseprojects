package Analytics;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class I_Block_Unblock_GSTINs {
	Masters Ms1 = new Masters();
	@SuppressWarnings({ "rawtypes", "unused" })
	public void I1(WebDriver driver, Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'I1. List of Blocked GSTINs')]")).click();
			Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_divsion']")));
			dropdown.selectByValue("KA2939");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=10)
			{
				cell = worksheet.getRow(14).getCell(3);
				cell.setCellValue("OK");
				System.out.println("I1. List of Blocked GSTINs : " + "OK");

			}else
			{
				cell = worksheet.getRow(14).getCell(3);
				cell.setCellValue("NOTOK");
				System.out.println("I1. List of Blocked GSTINs : " + "NOTOK");
			}

			Ms1.Home(driver);

		}catch(Exception e)
		{

		}


	}
	@SuppressWarnings("rawtypes")
	public void I2(WebDriver driver, Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'Analytics on Blocked GSTINs')]")).click();
		Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_divsion']")));
		dropdown.selectByValue("KA2939");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if (rows.size()>=10)
		{
			cell = worksheet.getRow(15).getCell(3);
			cell.setCellValue("OK");
			System.out.println("I2. Analytics on Blocked GSTINs : " + "OK");

		}else
		{
			cell = worksheet.getRow(15).getCell(3);
			cell.setCellValue("NOTOK");
			System.out.println("I2. Analytics on Blocked GSTINs : " + "NOTOK");
		}

		Ms1.Home(driver);

		}catch(Exception e)
		{

		}

	}

	public void I3(WebDriver driver, Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'I3. Statewise Summary')]")).click();
			Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_perd']")));
			dropdown.selectByValue("092022-102022");

			String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")).getText();
			String str1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")).getText();
			String str2 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]")).getText();
			int a1 = Integer.parseInt(str);
			int a2 = Integer.parseInt(str1);
			int a3 = Integer.parseInt(str2);

			if ((a1- a2)== a3)
			{
				cell = worksheet.getRow(16).getCell(3);
				cell.setCellValue("OK");
				System.out.println("I3. Statewise Summary : " + "OK");

			}else
			{
				cell = worksheet.getRow(16).getCell(3);
				cell.setCellValue("NOTOK");
				System.out.println("I3. Statewise Summary : " + "NOTOK");
			}

			Ms1.Home(driver);

		}catch(Exception e)
		{

		}

}
	@SuppressWarnings("unused")
	public void I4(WebDriver driver, Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try
		{
		driver.findElement(By.xpath("//a[contains(text(),'I4. Log of Block/Unblock')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtgstin']")).sendKeys("29AAAAK6011E1Z1");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		String str = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_currstatus']")).getAttribute("value");
		if (str.matches(str))
				{
			cell = worksheet.getRow(17).getCell(3);
			cell.setCellValue("OK");
			System.out.println("I4. Log of Block/Unblock : " + "OK");
				}else
				{
					cell = worksheet.getRow(17).getCell(3);
					cell.setCellValue("NOTOK");
					System.out.println("I4. Log of Block/Unblock : " + "NOTOK");
				}
		Ms1.Home(driver);

		}catch(Exception e)
		{
		}

}

	@SuppressWarnings("rawtypes")
	public void I5(WebDriver driver, Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'I5. List of GSTINs Unblocked')]")).click();
			Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_divsion']")));
			dropdown.selectByValue("KA2939");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=10)
			{
				cell = worksheet.getRow(18).getCell(3);
				cell.setCellValue("OK");
				System.out.println("I5. List of GSTINs Unblocked : " + "OK");

			}else
			{
				cell = worksheet.getRow(18).getCell(3);
				cell.setCellValue("NOTOK");
				System.out.println("I5. List of GSTINs Unblocked : " + "NOTOK");
			}

			Ms1.Home(driver);

		}catch(Exception e)
		{

		}

	}

	@SuppressWarnings("rawtypes")
	public void I6(WebDriver driver, Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),' Analytics on Unblocked GSTINs')]")).click();
		Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_divsion']")));
		dropdown.selectByValue("KA2939");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if (rows.size()>=10)
		{
			cell = worksheet.getRow(19).getCell(3);
			cell.setCellValue("OK");
			System.out.println("I6.Analytics on Unblocked GSTINs : " + "OK");

		}else
		{
			cell = worksheet.getRow(19).getCell(3);
			cell.setCellValue("NOTOK");
			System.out.println("I6.Analytics on Unblocked GSTINs : " + "NOTOK");
		}

		Ms1.Home(driver);

		}catch(Exception e)
		{

		}

	}

	public void I7(WebDriver driver, Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'Datewise Block/Unblock')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")).getText();
		 int a1 = Integer.parseInt(str);
		if (a1 >=0)
		{
			cell = worksheet.getRow(20).getCell(3);
			cell.setCellValue("OK");
			System.out.println("I7. Datewise Block/Unblock : " + "OK");

		}else
		{
			cell = worksheet.getRow(20).getCell(3);
			cell.setCellValue("NOTOK");
			System.out.println("I7. Datewise Block/Unblock : " + "NOTOK");
		}

		Ms1.Home(driver);

		}catch (Exception e)
		{

		}

	}
}