package Analytics;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class F_AnalyticsONHSN {
	Masters Mast = new Masters();
	@SuppressWarnings({ "rawtypes", "unused" })
	public void F1(WebDriver driver, Cell cell,XSSFSheet worksheet,JavascriptExecutor js)
	{try
	{
		driver.findElement(By.xpath("//a[contains(text(),'F1. HSN with cancellations')]")).click();
		Select dropdown = new Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[2]/select[1]")));
	    dropdown.selectByValue("72");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if(rows1.size()>=2)
		{


		String Str =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).getText();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[4]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		//System.out.println("No of rows are : " + (rows.size()-1));
		 int a1 = Integer.parseInt(Str);
			if (a1 == (rows.size() - 1)) {

				cell = worksheet.getRow(36).getCell(1);
				cell.setCellValue("OK");
				System.out.println("F1.HSN with cancellations : " + "OK");
			} else {
				cell = worksheet.getRow(36).getCell(1);
				cell.setCellValue("OK");
				System.out.println("F1.HSN with cancellations : " + "NOTOK");
				Mast.Home(driver);
			}
	}else
			{
				cell = worksheet.getRow(36).getCell(1);
				cell.setCellValue("OK");
				System.out.println("F1.HSN with cancellations : " + "NOTOK");
				Mast.Home(driver);
			}
	    WebElement F1 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_btn_cls']"));
	    js.executeScript("arguments[0].click();", F1);
		Mast.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException ex4)
	{

	}catch(org.openqa.selenium.ElementClickInterceptedException ex4)
	{

	}

	}

         @SuppressWarnings("rawtypes")
		public void F2(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js)
         {
        	 try
        	 {
        		 driver.findElement(By.xpath("//a[contains(text(),'F2. HSN with tax rates')]")).click();
            	 Select dropdown = new Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[2]/select[1]")));
         	    dropdown.selectByValue("72");
         		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
         		List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
        		if(rows1.size()>=2)
        		{


         		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[4]")).click();
         		//driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[4]")).click(); // double click//
         		String Str =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).getText();
        		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).click();
        		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[4]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
        		//System.out.println("No of rows are : " + (rows.size()-1));
        		 int a1 = Integer.parseInt(Str);
        		if (a1 == (rows.size()-1))
        		{cell = worksheet.getRow(37).getCell(1);
        		cell.setCellValue("OK");
        			System.out.println("F2.HSN with tax rates : " + "OK");
        		}else
        		{cell = worksheet.getRow(37).getCell(1);
        		cell.setCellValue("OK");
        			System.out.println("F2.HSN with tax rates : " + "NOTOK");
        			driver.navigate().back();
        			Mast.Home(driver);
        		}
        		}else
        		{
        			cell = worksheet.getRow(37).getCell(1);
            		cell.setCellValue("OK");
            			System.out.println("F2.HSN with tax rates : " + "NOTOK");
            			driver.navigate().back();
            			Mast.Home(driver);
        		}
        		 WebElement F2 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_LinkButton1']"));
        		 js.executeScript("arguments[0].click();", F2);

        		Mast.Home(driver);

        	 }catch(Exception e)
        	 {

        	 }

         }

         @SuppressWarnings("rawtypes")
		public void F3(WebDriver driver, Cell cell,XSSFSheet worksheet,JavascriptExecutor js)
         {try
         { driver.findElement(By.xpath("//a[contains(text(),'F3. HSN wise cancellations')]")).click();
    	 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
    	 List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
 		if(rows1.size()>=2)
 		{

    	String str2 =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).getText();
    	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")).click();
    	List rows =  driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[4]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
    	//System.out.println("No of rows are : " + (rows.size()-1));
		 int a1 = Integer.parseInt(str2);
		if (a1 == (rows.size()-1))
		{
			cell = worksheet.getRow(38).getCell(1);
		cell.setCellValue("OK");
			System.out.println("F3.HSN wise cancellations : " + "OK");
		}

		else
		{cell = worksheet.getRow(38).getCell(1);
		cell.setCellValue("OK");
			System.out.println("F3.HSN wise cancellations : " + "NOTOK");
			driver.navigate().back();
			Mast.Home(driver);
		}
 		}else
 		{
 			cell = worksheet.getRow(38).getCell(1);
 			cell.setCellValue("OK");
 				System.out.println("F3.HSN wise cancellations : " + "NOTOK");
 				driver.navigate().back();
 				Mast.Home(driver);
 		}
 		 WebElement F3 = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_LinkButton1']"));
 		js.executeScript("arguments[0].click();", F3);

		Mast.Home(driver);

         }catch(Exception e)
         {

         }


         }

         @SuppressWarnings("rawtypes")
		public void F4(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
         {try
         {
        	 driver.findElement(By.xpath("//a[contains(text(),'F4. HSN based Taxpayers')]")).click();
        	 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_hsn']")).sendKeys("1001");
        		Thread.sleep(1000);
        	 driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[5]/input[1]")).click();
        	 driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[5]/input[1]")).click();
        	 List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr"));
      		if(rows1.size()>=2)
      		{

        	 driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/a[1]")).click();
        	 String str4 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[5]/div[1]/div[1]/div[2]/table[2]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")).getText();
        	 if(str4.isBlank())
        	 {cell = worksheet.getRow(39).getCell(1);
     		cell.setCellValue("OK");
        			System.out.println("F4.HSN based Taxpayers : " + "NOTOK");
        			driver.navigate().back();
        			Mast.Home(driver);
        		}else
        		{cell = worksheet.getRow(39).getCell(1);
        		cell.setCellValue("OK");
        			System.out.println("F4.HSN based Taxpayers : " + "OK");
        		}
      		}else
      		{
      			cell = worksheet.getRow(39).getCell(1);
         		cell.setCellValue("OK");
            			System.out.println("F4.HSN based Taxpayers : " + "NOTOK");
            			driver.navigate().back();
            			Mast.Home(driver);
      		}
        	 WebElement F4 = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Button1']"));
        	 js.executeScript("arguments[0].click();", F4);
        	 Mast.Home(driver);

         }catch(Exception e)
         {

         }

        	 }






}