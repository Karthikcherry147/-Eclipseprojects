package Analytics;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class E_RiskBasedAnalytics {
	Masters Mstrr = new Masters();

	@SuppressWarnings({ "rawtypes", "unused" })
	public void E1(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js)
	{try {
		driver.findElement(By.xpath("//a[contains(text(),'Tax Payer wise KRI')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsave']")).click();
		String Q1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).getText();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).click();
		List rows = driver.findElements(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_gvinfo\"]/tbody/tr"));

		//System.out.println("No of rows are : " + (rows.size()-1));
		 int a1 = Integer.parseInt(Q1);
		if (a1 == (rows.size()-1))
		{cell = worksheet.getRow(32).getCell(1);
		cell.setCellValue("OK");
			System.out.println("E1.Tax Payer wise KRI : " + "OK");

		}else
		{cell = worksheet.getRow(32).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("E1.Tax Payer wise KRI : " + "NOTOK");
		}Thread.sleep(2000);

		WebElement s1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[6]/div[1]/div[1]/div[1]/div[1]/button[1]"));
    	 js.executeScript("arguments[0].click();", s1);
    	 Thread.sleep(2000);
		 Mstrr.Home(driver);

	}catch(Exception ex4)
	{
        ex4.printStackTrace();
	}
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	public void E2(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js)
	{try {
		driver.findElement(By.xpath("//a[contains(text(),'Particular KRI')]")).click();

	Select dropdown  = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_kri']")));
	dropdown.selectByValue("CAN100");
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsave']")).click();
	String Q2 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]")).click();
	List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
	//System.out.println("No of rows are : " + (rows1.size()-1));
	 int a1 = Integer.parseInt(Q2);
	if (a1 == (rows1.size()-1))
	{cell = worksheet.getRow(33).getCell(1);
	cell.setCellValue("OK");
		System.out.println("E2. Particular KRI : " + "OK");
	}else
	{cell = worksheet.getRow(33).getCell(1);
	cell.setCellValue("NOTOK");
		System.out.println("E2. Particular KRI : " + "NOTOK");
	}Thread.sleep(1000);
	WebElement s3 = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnback']"));
	js.executeScript("arguments[0].click();", s3);
	Thread.sleep(1000);
	Mstrr.Home(driver);
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	{

	}
	}

	@SuppressWarnings("rawtypes")
	public void E3(WebDriver driver, Cell cell,XSSFSheet worksheet,JavascriptExecutor js) throws InterruptedException
	{try {
		driver.findElement(By.xpath("//a[contains(text(),' Particular GSTIN')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtgstin']")).sendKeys("29AAACJ4323N1ZC");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsrch']")).click();
		String Q3 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).getText();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
		List rows2 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		//System.out.println("No of rows are : " + (rows2.size()-1));
		 int a1 = Integer.parseInt(Q3);
		if (a1 == (rows2.size()-1))
		{cell = worksheet.getRow(34).getCell(1);
		cell.setCellValue("OK");
			System.out.println("E3. Particular GSTIN : " + "OK");
		}else
		{cell = worksheet.getRow(34).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("E3. Particular GSTIN : " + "NOTOK");
		}Thread.sleep(1000);
		WebElement s4 = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnback']"));
		js.executeScript("arguments[0].click();", s4);
		Thread.sleep(1000);
		Mstrr.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
	}
	@SuppressWarnings("rawtypes")
	public void E4(WebDriver driver, Cell cell,XSSFSheet worksheet,JavascriptExecutor js) throws InterruptedException
	{try {

		driver.findElement(By.xpath("//a[contains(text(),'Summary of KRI')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsave']")).click();
		String Q4 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).getText();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
		List rows3 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
		//System.out.println("No of rows are : " + (rows3.size()-1));
		 int a1 = Integer.parseInt(Q4);
		if (a1 == (rows3.size()-1))
		{cell = worksheet.getRow(35).getCell(1);
		cell.setCellValue("OK");
			System.out.println("E4. Summary of KRI : " + "OK");
		}else
		{cell = worksheet.getRow(35).getCell(1);
		cell.setCellValue("NOTOK");
			System.out.println("E4. Summary of KRI : " + "NOTOK");
		}Thread.sleep(1000);
		WebElement s2 = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnback']"));
		js.executeScript("arguments[0].click();", s2);
		Thread.sleep(1000);
		Mstrr.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
}
}
