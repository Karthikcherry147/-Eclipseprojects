package Analytics;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L_Analytics_On_Transporter {
	Masters master = new Masters();
	@SuppressWarnings({ "unused", "rawtypes" })
	public void L1(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException
	{ try {
		driver.findElement(By.xpath("//a[contains(text(),'L1. Transporters with Cancellations of EWBs')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows1.size()>=2)
			{
		String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).getText();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		System.out.println("No of rows are : " + (rows.size()-1));
	    int a1 = Integer.parseInt(str);
		if (a1== (rows.size()-1))
		{
			cell = worksheet.getRow(26).getCell(3);
			cell.setCellValue("OK");
			System.out.println("L1. Transporters with Cancellations of EWBs : " + "OK");
		}else
		{
			cell = worksheet.getRow(26).getCell(3);
			cell.setCellValue("NOTOK");
			System.out.println("L1. Transporters with Cancellations of EWBs : " + "NOTOK1");
			master.Home(driver);
	}
			}else
			{
				cell = worksheet.getRow(26).getCell(3);
				cell.setCellValue("NOTOK");
				System.out.println("L1. Transporters with Cancellations of EWBs : " + "NOTOK2");
				master.Home(driver);
			}

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		master.Home(driver);

	}catch(Exception e)
		{

		}

	}
		@SuppressWarnings("rawtypes")
		public void L2(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException
		{
			try {
				driver.findElement(By.xpath("//a[contains(text(),'L2. Transporters with Extensions of EWBs')]")).click();
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
				List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if(rows1.size()>=2)
					{
				String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).getText();
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).click();
				List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				System.out.println("No of rows are : " + (rows.size()-1));
			    int a1 = Integer.parseInt(str);
				if (a1== (rows.size()-1))
				{
					cell = worksheet.getRow(27).getCell(3);
					cell.setCellValue("OK");
					System.out.println("L2. Transporters with Extensions of EWBs : " + "OK");

				}else
				{
					cell = worksheet.getRow(27).getCell(3);
					cell.setCellValue("NOTOK");
					System.out.println("L2. Transporters with Extensions of EWBs : " + "NOTOK");
					WebElement qw = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
					js.executeScript("arguments[0].click();", qw);
					master.Home(driver);

			}
					}else
					{
						cell = worksheet.getRow(27).getCell(3);
						cell.setCellValue("NOTOK");
						System.out.println("L2. Transporters with Extensions of EWBs : " + "NOTOK");
						master.Home(driver);
					}
			Thread.sleep(2000);
				WebElement qw = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
				js.executeScript("arguments[0].click();", qw);
				Thread.sleep(2000);
				driver.navigate().back();
				master.Home(driver);

			}catch(Exception e)
			{


			}


		}
@SuppressWarnings("rawtypes")
public void L3(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException
{
	try {
		driver.findElement(By.xpath("//a[contains(text(),'L3. Transporters with Rejected EWBs')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows1.size()>=2)
			{
		String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).getText();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		System.out.println("No of rows are : " + (rows.size()-1));
		int a1 = Integer.parseInt(str);
		if (a1== (rows.size()-1))
		{
			cell = worksheet.getRow(28).getCell(3);
			cell.setCellValue("OK");
			System.out.println("L3. Transporters with Rejected EWBs : " + "OK");

		}else
		{
			cell = worksheet.getRow(28).getCell(3);
			cell.setCellValue("NOTOK");
			System.out.println("L3. Transporters with Rejected EWBs : " + "NOTOK");
			master.Home(driver);

		}
			}else
			{
				cell = worksheet.getRow(28).getCell(3);
				cell.setCellValue("NOTOK");
				System.out.println("L3. Transporters with Rejected EWBs : " + "NOTOK");
				master.Home(driver);
			}
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
		js.executeScript("arguments[0].click();", we);
		Thread.sleep(2000);
		driver.navigate().back();
		master.Home(driver);
	}catch(Exception e)
	{


	}

}

@SuppressWarnings("rawtypes")
public void L4(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException
{
	try
	{
		driver.findElement(By.xpath("//a[contains(text(),'L4. Transporters with EWBs using Multi-Vehicle opt')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows1.size()>=2)
			{
		String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).getText();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		System.out.println("No of rows are : " + (rows.size()-1));
		int a1 = Integer.parseInt(str);
		if (a1== (rows.size()-1))
		{
			cell = worksheet.getRow(29).getCell(3);
			cell.setCellValue("OK");
			System.out.println("L4. Transporters with EWBs using Multi-Vehicle option : " + "OK");
		}else
		{
			cell = worksheet.getRow(29).getCell(3);
			cell.setCellValue("NOTOK");
			System.out.println("L4. Transporters with EWBs using Multi-Vehicle option : " + "NOTOK");
			master.Home(driver);

		}
			}else
			{
				cell = worksheet.getRow(29).getCell(3);
				cell.setCellValue("NOTOK");
				System.out.println("L4. Transporters with EWBs using Multi-Vehicle option : " + "NOTOK");
				master.Home(driver);
			}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		master.Home(driver);

	}catch(Exception e)
	{


	}

}
}
