package Analytics;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class K_Summary_Reports {

	Masters master = new Masters();
	@SuppressWarnings({ "unused", "rawtypes" })
	public void K1(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try {
			driver.findElement(By.xpath("//a[contains(text(),'K1. Outward Supplies')]")).click();
			Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_office']")));
			dropdown.selectByValue("KA002");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=2)
			{

//		String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]")).getText();
//		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();
//		Thread.sleep(2000);
//		String str1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")).getText();
//
//	    int a1 = Integer.parseInt(str);
//	    int a2 = Integer.parseInt(str1);
//
//	    if (a1 == a2)
//	    {
	    	 cell = worksheet.getRow(24).getCell(3);
				cell.setCellValue("OK");
	    	System.out.println("K1. Outward Supplies : " +"OK");
//	    }else
//	    {
//	    	 cell = worksheet.getRow(24).getCell(3);
//				cell.setCellValue("NOTOK");
//	    	System.out.println("K1. Outward Supplies : " + "NOTOK");
//	    	  master.Home(driver);
//	    }
			}else
	    {
				 cell = worksheet.getRow(24).getCell(3);
					cell.setCellValue("NOTOK");
		    	System.out.println("K1. Outward Supplies : " + "NOTOK");
		    	  master.Home(driver);
	    }
	    Thread.sleep(2000);
	    WebElement K1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/button[1]"));
	    js.executeScript("arguments[0].click();", K1);
	       Thread.sleep(2000);
	       master.Home(driver);

		}catch(Exception e)
		{

		}

	}
	@SuppressWarnings("rawtypes")
	public void K2(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try {
			driver.findElement(By.xpath("//a[contains(text(),'K2. Inward Supplies')]")).click();
			Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_office']")));
			dropdown.selectByValue("KA002");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=2)
			{
//			String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).getText();
//			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();
//			Thread.sleep(2000);
//			String str1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")).getText();
//
//		    int a1 = Integer.parseInt(str);
//		    int a2 = Integer.parseInt(str1);
//
//		    if (a1 == a2)
//		    {
		    	cell = worksheet.getRow(25).getCell(3);
				cell.setCellValue("OK");
		    	System.out.println("K2. Inward Supplies : " +"OK");
//		    }else
//		    {
//		    	cell = worksheet.getRow(25).getCell(3);
//				cell.setCellValue("NOTOK");
//		    	System.out.println("K2. Inward Supplies : " + "NOTOK");
//		    	  master.Home(driver);
//		    }
			}else
			{
				cell = worksheet.getRow(25).getCell(3);
				cell.setCellValue("NOTOK");
		    	System.out.println("K2. Inward Supplies : " + "NOTOK");
		    	  master.Home(driver);
			}

		    Thread.sleep(2000);
		       WebElement K2 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		       js.executeScript("arguments[0].click();", K2);
		       Thread.sleep(2000);
		       master.Home(driver);

		}catch(Exception e)
		{

		}


}
}