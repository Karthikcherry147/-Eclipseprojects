package Analytics;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class D_SupplyChain {
	Masters Mst = new Masters();
	public void D1(WebDriver driver, Cell cell,XSSFSheet worksheet) throws InterruptedException
	{try {
	 driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtGstin']")).sendKeys("29AAACJ4323N1ZC");
	 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	 String w1 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_tvwItemst1']")).getText();
	 if (w1.isBlank())
	 {cell = worksheet.getRow(28).getCell(1);
		cell.setCellValue("NOTOK");
	     System.out.println("D1.TAX PAYER OUTWARD SUPPLY CHAIN : " + "NOTOK");
	 }else
	 {cell = worksheet.getRow(28).getCell(1);
		cell.setCellValue("OK");
		 System.out.println("D1.TAX PAYER OUTWARD SUPPLY CHAIN : " + "OK");
	 }
	 Mst.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
	}


	public void D2(WebDriver driver, Cell cell,XSSFSheet worksheet) throws InterruptedException
	{try {
		driver.findElement(By.xpath("//a[contains(text(),'D2. Tax Payer Inward Supply Chain')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtGstin']")).sendKeys("29AAACJ4323N1ZC");
		 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		 String w1 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_tvwItemst1']")).getText();
		 if (w1.isBlank())
		 {cell = worksheet.getRow(29).getCell(1);
			cell.setCellValue("NOTOK");
		     System.out.println("D2.TAX PAYER INWARD SUPPLY CHAIN : " + "NOTOK");
		 }else
		 {cell = worksheet.getRow(29).getCell(1);
			cell.setCellValue("OK");
			 System.out.println("D2.TAX PAYER INWARD SUPPLY CHAIN : " + "OK");
		 }
		 Mst.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}
	}


}
