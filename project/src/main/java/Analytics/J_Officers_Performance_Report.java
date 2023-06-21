package Analytics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class J_Officers_Performance_Report {
	Masters Ms2 = new Masters();
    private static final DecimalFormat df = new DecimalFormat("0.00");


	@SuppressWarnings({ "rawtypes", "unused" })
	public void J1(WebDriver driver, Cell cell,XSSFSheet worksheet)
	{
		try
		{
			Ms2.Scroll(driver);
			driver.findElement(By.xpath("//a[contains(text(),'J1.Performance Report')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			String str1 =driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")).getText();
			String str4 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[6]")).getText();
			String str7 =driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[9]")).getText();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_gvdetails_ctl04_lnkbtn']")).click();
			Ms2.Scroll(driver);
	        boolean sucs=false;
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[2]/table[1]/tbody[1]/tr"));
					 int integerValue;
		      int sumValue=0;
		      for(int i=1;i<=rows.size();i++)
		      {
		          //Here enter your Xpath value for the table.
		          WebElement todaysValue= driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[2]/table[1]/tbody[1]/tr["+i+"]/td[3]"));
		          String tableValue=todaysValue.getText();
		          integerValue=Integer.parseInt(tableValue);
		          sumValue=sumValue+integerValue;
		      }
		     // System.out.println("Total Sum : "+sumValue);
		      int a1 = Integer.parseInt(str1);
		      //System.out.println(a1);
		      if (a1== sumValue)
		      {
		    	  sucs=true;
		    	  //System.out.println("OK");
		      }else
		      {
		    	  sucs=false;
		    	  //System.out.println("NOTOK");
		      }
		    //  System.out.println(sucs);
	//--------------------------------------------------------------------------------------------------------------------------------------------------
		      List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[2]/table[1]/tbody[1]/tr"));
				 int integerValue1;
	   int sumValue1=0;
	   for(int i=1;i<=rows.size();i++)
	   {
	       //Here enter your Xpath value for the table.
	       WebElement todaysValue= driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[2]/table[1]/tbody[1]/tr["+i+"]/td[6]"));
	       String tableValue=todaysValue.getText();
	       integerValue1=Integer.parseInt(tableValue);
	       sumValue1=sumValue1+integerValue1;
	   }
	 //  System.out.println("Total Sum : "+sumValue1);
	   int a2 = Integer.parseInt(str4);
	 //  System.out.println(a2);
	   if (a2== sumValue1)
	   {
	 	  sucs=true;
	 	  //System.out.println("OK");
	   }else
	   {
	 	  sucs=false;
	 	  //System.out.println("NOTOK");
	   }
	 //  System.out.println(sucs);
	//  -----------------------------------------------------------------------------------------------------------------------------------------
	   List rows2 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[2]/table[1]/tbody[1]/tr"));
		 Double integerValue2,abc;
		 Double sumValue2 = 0.00;
		 BigDecimal bd = null;
	for(int i=1;i<=rows2.size();i++)
	{
	//Here enter your Xpath value for the table.
	WebElement todaysValue= driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[2]/table[1]/tbody[1]/tr["+i+"]/td[9]"));
	String tableValue=todaysValue.getText();
	integerValue2=Double.valueOf(tableValue);

	sumValue2=sumValue2+integerValue2;
	 bd = new BigDecimal(sumValue2);

	}

	//System.out.println("Total Sum 123 : "+bd);
	BigDecimal a3 = new BigDecimal(str7);
	BigDecimal nm=a3;
	//System.out.println("A "+nm);

	//BigDecimal nm1=bd;
	String nm2 =bd+".00";
	BigDecimal bb=new BigDecimal(nm2);
	//System.out.println("B "+nm2);
	//System.out.println("c "+bb);
	if (nm.compareTo(bb)==0)//  b1.compareTo(b2)
	{
	sucs=true;
	//System.out.println("OK");
	}else
	{
	sucs=false;
	//System.out.println("NOTOK");
	}
	//System.out.println(sucs);

	   if (sucs==true)
	   {
		   cell = worksheet.getRow(21).getCell(3);
			cell.setCellValue("OK");

	 	  System.out.println("J1.Performance Report : " + "OK");
	   }else
	   {
		   cell = worksheet.getRow(21).getCell(3);
			cell.setCellValue("NOTOK");

	 	  System.out.println("J1.Performance Report : " + "NOTOK");
	   }
	   Ms2.Home(driver);


		}catch(Exception e)
		{

		}

	}

//***	J2.PERFORMANCE REPORT(TEP) ***//
	@SuppressWarnings({ "rawtypes", "unused", "deprecation" })
	public void J2(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet)
	{
		try {
			Ms2.Scroll(driver);
			driver.findElement(By.xpath("//a[contains(text(),'J2.Performance Report(TEP)')]")).click();
		Select dropdown = new Select( driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[2]/div[2]/select[1]")));
		dropdown.selectByValue("4");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			//Thread.sleep(1000);
			String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")).getText();
			//Thread.sleep(1000);
			String str1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]")).getText();
			//Thread.sleep(2000);
			WebElement w1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]"));
			js.executeScript("arguments[0].click();", w1);
			//Thread.sleep(2000);
			Ms2.Scroll(driver);
			Select dropdown1 = new Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]")));
			dropdown1.selectByValue("100");
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[4]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[4]")).click();
			 boolean sucs=false;
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			//System.out.println("No of rows are : " + rows.size());
			//System.out.println(str);

						 int integerValue;
			      int sumValue=0;
			      for(int i=1;i<=rows.size();i++)
			      {
			          //Here enter your Xpath value for the table.
			          WebElement todaysValue= driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[4]"));
			          String tableValue=todaysValue.getText();
			          integerValue=Integer.parseInt(tableValue);
			          sumValue=sumValue+integerValue;
			      }
			     // System.out.println(sumValue);
			      int a1 = Integer.parseInt(str);
			      if (a1== sumValue)
			      {
			    	  sucs=true;
			      }else
			      {
			    	  sucs=false;
			      }
			     // System.out.println(sucs);



		@SuppressWarnings("rawtypes")
		List rows2 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		 Double integerValue2,abc;
		 Double sumValue2 = 0.00;
		 BigDecimal bd = null;
	for(int i=1;i<=rows2.size();i++)
	{
	//Here enter your Xpath value for the table.
	WebElement todaysValue= driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[6]"));
	String tableValue=todaysValue.getText();
	integerValue2=Double.valueOf(tableValue);

	sumValue2=sumValue2+integerValue2;
	 bd = new BigDecimal(sumValue2);

	}

	System.out.println("Total Sum 123 : "+bd);
	BigDecimal a3 = new BigDecimal(str1);
	BigDecimal nm=a3;
	System.out.println("A "+nm);

	//BigDecimal nm1=bd;
	//String nm2 =bd+".00";

	df.setRoundingMode(RoundingMode.HALF_DOWN); /// Down example 31.2569 answer 31.25 || up roundoff 31.26
	String bb=df.format(bd);
	BigDecimal ccd=new BigDecimal(bb);



	//System.out.println("B "+nm2);
	//System.out.println("B "+ccd);
	if (nm.compareTo(ccd)==0)
	//  b1.compareTo(b2)
	{
	sucs=true;
	//System.out.println("OK");
	}else
	{
	sucs=false;
	//System.out.println("NOTOK");
	}
	//System.out.println(sucs);

	   if (sucs==true)
	   {
		   cell = worksheet.getRow(22).getCell(3);
			cell.setCellValue("OK");
	 	  System.out.println("J2.Performance Report(TEP) : " + "OK");
	   }else
	   {
		   cell = worksheet.getRow(22).getCell(3);
			cell.setCellValue("NOTOK");
	 	  System.out.println("J2.Performance Report(TEP) : " + "NOTOK");
	   }	   Ms2.Home(driver);

		}catch(Exception e)
		{

		}


	}



	@SuppressWarnings({ "unused", "rawtypes" })
	public void J3(WebDriver driver, JavascriptExecutor js,  Cell cell,XSSFSheet worksheet)
	{
		try
		{Ms2.Scroll(driver);
		driver.findElement(By.xpath("//a[contains(text(),'Usage of Reports by Officers')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		 boolean sucs=false;
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			//System.out.println("No of rows are : " + rows.size());
			if (rows.size()==10)
			{
				 cell = worksheet.getRow(23).getCell(3);
					cell.setCellValue("OK");
				System.out.println("J3. Usage of Reports by Officers : " + "OK");
			}else
			{
				 cell = worksheet.getRow(23).getCell(3);
					cell.setCellValue("NOTOK");
				System.out.println("J3. Usage of Reports by Officers : " + "NOTOK");
			}	   Ms2.Home(driver);


		}catch(Exception e)
		{

		}



	}

}
