package Analytics;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class G_Vehicle_analytics {
		Masters Mastr = new Masters();

@SuppressWarnings({ "rawtypes", "unused" })
public void G1(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js)
{try {


	driver.findElement(By.xpath("//a[contains(text(),'G1. Incorrect(Non-existent) Vehicle Numbers in EWB')]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
	 List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr"));
		if(rows1.size()>=2)
			{
		String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[7]/a[1]")).getText();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[7]/a[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		//System.out.println("No of rows are : " + (rows.size()-1));
		 int a1 = Integer.parseInt(str);
		if (a1 == (rows.size()-1))
		{cell = worksheet.getRow(1).getCell(3);
		cell.setCellValue("OK");
			System.out.println("G1.Incorrect(Non-existent) Vehicle Numbers in EWB : " + "OK");
		}else
		{cell = worksheet.getRow(1).getCell(3);
		cell.setCellValue("NOTOK");
			System.out.println("G1.Incorrect(Non-existent) Vehicle Numbers in EWB : " + "NOTOK");
			driver.navigate().back();
			Mastr.Home(driver);
		}
			}else
		{
			cell = worksheet.getRow(1).getCell(3);
			cell.setCellValue("NOTOK");
				System.out.println("G1.Incorrect(Non-existent) Vehicle Numbers in EWB : " + "NOTOK");
				driver.navigate().back();
				Mastr.Home(driver);
		}
//		 WebElement G1 = driver.findElement(By.xpath("//a[@id='btnfinalclose']"));
//		 js.executeScript("arguments[0].click();", G1);
		driver.navigate().refresh();
Mastr.Home(driver);
}catch(Exception ex)
{

}

	}


@SuppressWarnings("rawtypes")
public void G2(WebDriver driver, Cell cell,XSSFSheet worksheet, JavascriptExecutor js) throws InterruptedException
{try
{
	driver.findElement(By.xpath("//a[contains(text(),'G2. Invalid(Non-goods carrier) Vehicles Types in E')]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
	 List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr"));
		if(rows1.size()>=2)
			{
	String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[7]/a[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[7]/a[1]")).click();
	List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	//System.out.println("No of rows are : " + (rows.size()-1));
	 int a1 = Integer.parseInt(str);
	if (a1 == (rows.size()-1))
	{cell = worksheet.getRow(2).getCell(3);
	cell.setCellValue("OK");
		System.out.println("G2.Invalid(Non-goods carrier) Vehicles Types in EWB    : " + "OK");
	}else
	{cell = worksheet.getRow(2).getCell(3);
	cell.setCellValue("NOTOK");
		System.out.println("G2.Invalid(Non-goods carrier) Vehicles Types in EWB    : " + "NOTOK");
		driver.navigate().back();
		Mastr.Home(driver);
	}
			}else
			{
				cell = worksheet.getRow(2).getCell(3);
				cell.setCellValue("NOTOK");
					System.out.println("G2.Invalid(Non-goods carrier) Vehicles Types in EWB    : " + "NOTOK");
					driver.navigate().back();
					Mastr.Home(driver);
			}

	Thread.sleep(2000);
//	 WebElement G2= driver.findElement(By.xpath("//a[@id='btnfinalclose']"));
//	 js.executeScript("arguments[0].click();", G2);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().back();
Mastr.Home(driver);
}catch(Exception ex)
{

}
	}

@SuppressWarnings("rawtypes")
public void G3(WebDriver driver, Cell cell,XSSFSheet worksheet,JavascriptExecutor js) throws InterruptedException
{

	try {
		driver.findElement(By.xpath("//a[contains(text(),'G3. Vehicles updated for ODC EWBs')]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	if(rows1.size()>=2)
		{
	String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
	List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
	//System.out.println("No of rows are : " + (rows.size()-1));
	 int a1 = Integer.parseInt(str);
	if (a1 == (rows.size()-1))
	{cell = worksheet.getRow(3).getCell(3);
	cell.setCellValue("OK");
		System.out.println("G3.Vehicles updated for ODC EWBs    : " + "OK");

	}else
	{cell = worksheet.getRow(3).getCell(3);
	cell.setCellValue("NOTOK");
		System.out.println("G3.Vehicles updated for ODC EWBs    : " + "NOTOK");
		WebElement G3 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
		 js.executeScript("arguments[0].click();", G3);
		 driver.navigate().back();
		Mastr.Home(driver);
	}
		}else
		{
			cell = worksheet.getRow(3).getCell(3);
			cell.setCellValue("NOTOK");
				System.out.println("G3.Vehicles updated for ODC EWBs    : " + "NOTOK");
				driver.navigate().back();
				Mastr.Home(driver);
		}

	Thread.sleep(2000);
	WebElement G3 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
	 js.executeScript("arguments[0].click();", G3);
	Thread.sleep(2000);
	driver.navigate().back();
	Mastr.Home(driver);
	}catch(Exception ex)
	{

	}

}

@SuppressWarnings("rawtypes")
public void G4(WebDriver driver, Cell cell,XSSFSheet worksheet,JavascriptExecutor js) throws InterruptedException
{try {
	driver.findElement(By.xpath("//a[contains(text(),'G4. Vehicle updated with multiple EWBs in one hour')]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	if(rows1.size()>=2)
		{
	String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
	List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
	//System.out.println("No of rows are : " + (rows.size()-1));
	 int a1 = Integer.parseInt(str);
	if (a1 == (rows.size()-1))
	{cell = worksheet.getRow(4).getCell(3);
	cell.setCellValue("OK");
		System.out.println("G4.Vehicle updated with multiple EWBs in one hour,but not CEWB : " + "OK");
		WebElement G4 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
	    js.executeScript("arguments[0].click();", G4);

	}else
	{cell = worksheet.getRow(4).getCell(3);
	cell.setCellValue("NOTOK");
		System.out.println("G4.Vehicle updated with multiple EWBs in one hour,but not CEWB : " + "NOTOK");
		  Thread.sleep(2000);
		WebElement G4 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
	    js.executeScript("arguments[0].click();", G4);
	    driver.navigate().back();
	    Mastr.Home(driver);

	}
		}else
		{
			cell = worksheet.getRow(4).getCell(3);
			cell.setCellValue("NOTOK");
				System.out.println("G4.Vehicle updated with multiple EWBs in one hour,but not CEWB : " + "NOTOK1");
				driver.navigate().back();
				Mastr.Home(driver);
		}
    Thread.sleep(2000);
	WebElement G4 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
    js.executeScript("arguments[0].click();", G4);
    driver.navigate().back();
	Mastr.Home(driver);

}catch(Exception ex)
{
	cell = worksheet.getRow(4).getCell(3);
	cell.setCellValue("NOTOK");
		System.out.println("G4.Vehicle updated with multiple EWBs in one hour,but not CEWB : " + "NOTOK");
}

}

@SuppressWarnings("rawtypes")
public void G5(WebDriver driver, Cell cell,XSSFSheet worksheet,JavascriptExecutor js) throws InterruptedException
{try {
	driver.findElement(By.xpath("//a[contains(text(),'G5. Vehicles penalized by officers')]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	if(rows1.size()>=1)
		{
	String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
	List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
	//System.out.println("No of rows are : " + (rows.size()-1));
	 int a1 = Integer.parseInt(str);
	if (a1 == (rows.size()-1))
	{cell = worksheet.getRow(5).getCell(3);
	cell.setCellValue("OK");
		System.out.println("G5. Vehicles penalized by officers : " + "OK");
		WebElement G5 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
		js.executeScript("arguments[0].click();", G5);
	}else
	{cell = worksheet.getRow(5).getCell(3);
	cell.setCellValue("NOTOK");
		System.out.println("G5. Vehicles penalized by officers : " + "NOTOK");
		WebElement G5 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
		js.executeScript("arguments[0].click();", G5);
		Mastr.Home(driver);
	}
		}else
		{
			cell = worksheet.getRow(5).getCell(3);
			cell.setCellValue("NOTOK");
				System.out.println("G5. Vehicles penalized by officers : " + "NOTOK");
				Mastr.Home(driver);
		}
	Thread.sleep(2000);
	WebElement G5 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
	js.executeScript("arguments[0].click();", G5);
	Thread.sleep(2000);
	driver.navigate().back();
	Mastr.Home(driver);
}catch(Exception ex)
{

}
}

@SuppressWarnings("rawtypes")
public void G6(WebDriver driver, Cell cell,XSSFSheet worksheet,JavascriptExecutor js) throws InterruptedException
{try {
	driver.findElement(By.xpath("//a[contains(text(),\"G6. Vehicles recorded as 'NO EWB'\")]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
	List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
	if(rows1.size()>=2)
		{
	String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
	List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
	//System.out.println("No of rows are : " + (rows.size()-1));
	 int a1 = Integer.parseInt(str);
	if (a1 == (rows.size()-1))
	{cell = worksheet.getRow(6).getCell(3);
	cell.setCellValue("OK");
		System.out.println("G6.Vehicles recorded as 'NO EWB' : " + "OK");
		WebElement G6  = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
		js.executeScript("arguments[0].click();", G6);
		Thread.sleep(1000);
	}else
	{cell = worksheet.getRow(6).getCell(3);
	cell.setCellValue("NOTOK");
		System.out.println("G6.Vehicles recorded as 'NO EWB' : " + "NOTOK");
		Mastr.Home(driver);
	}
		}else
		{
			cell = worksheet.getRow(6).getCell(3);
			cell.setCellValue("NOTOK");
				System.out.println("G6.Vehicles recorded as 'NO EWB' : " + "NOTOK");
				Mastr.Home(driver);
		}

	Thread.sleep(1000);
	WebElement G6  = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]"));
	js.executeScript("arguments[0].click();", G6);
	Thread.sleep(1000);
	driver.navigate().back();
	Mastr.Home(driver);
}catch(Exception ex)
{

}



}



}





