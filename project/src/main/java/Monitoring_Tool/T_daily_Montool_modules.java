package Monitoring_Tool;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class T_daily_Montool_modules {
	public void einvoice_mode_wise(WebDriver driver) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Einv_Modewise.aspx");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rbn_type_0']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}
	}
	public void einvoice2_mode_wise(WebDriver driver) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rbn_type_1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}
	}
	public void einvoice_Zone_Wise(WebDriver driver) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Einv_Zonewise.aspx");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rbn_type_0']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);

		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}
	}

	public void einvoice2_Zone_Wise(WebDriver driver) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rbn_type_1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);

		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}
	}
	public void ewaybill_mode_wise(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Ewb_Modewise.aspx");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);
//

		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}
	}
	public void ewaybill_Zone_wise(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get(("https://dashboard.ewaybillgst.gov.in/montool/Ewb_Zonewise.aspx"));
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_refresh']")).click();
			Thread.sleep(10000);
//
		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}
	}


	public void einvoice_log_error(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Einv_errorlist.aspx?id=LOG");
//			WebElement w1 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
//			js.executeScript("arguments[0].click();", w1);
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-10000)", "");
	Thread.sleep(5000);
		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}

	}

	public void ewaybil_log_error(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Einv_errorlist.aspx?id=EWB");
			driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
			WebElement w5 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
			js.executeScript("arguments[0].click();", w5);
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
		    js.executeScript("window.scrollBy(0,-10000)", "");
		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}

	}

	public void GSTIN_details_Fr_CP(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/gstin_dtls_cp.aspx");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_gstin']")).sendKeys("29AAACJ4323N1ZC");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			Thread.sleep(5000);
		}catch (org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}


	}
	public void Block_status_Fr_CP(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/blk_status_cp.aspx");
			driver.findElement(By.xpath("//input[@id='txt_gstin']")).sendKeys("29AAACJ4323N1ZC");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			Thread.sleep(5000);
		}catch (org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}


	}
	public void Vahan_details (WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Vahan.aspx");
			driver.findElement(By.xpath("//input[@id='txt_vehical_no']")).sendKeys("KA01HS1234");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			Thread.sleep(5000);
		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}


	}
	public void PAN_details (WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Pan_details.aspx");
			driver.findElement(By.xpath("//input[@id='txtPanNo']")).sendKeys("AAACJ4323N");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			Thread.sleep(5000);
		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			driver.navigate().back();
		}


	}

	public void Fastag(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/VehDatewiseRpt.aspx?id=2");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Button1']")).click();
			Thread.sleep(5000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}

	}


	public void Fastag_date_Wise(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Datewise.aspx");
			Select dropdown = new  Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")));
			dropdown.selectByValue("2");
			js.executeScript("window.scrollBy(0,5000)", "");
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}

	}


	public void API_Response(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_APIResponse.aspx");
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}

	}


	@SuppressWarnings("unused")
	public void Master_tag(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_rfid_report.aspx");
			LocalDate date2y = LocalDate.now().minusDays(3);
			DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd-MM-YYYY");
			String date3y= formattery.format(date2y);
			driver.findElement(By.xpath("//input[@id='txt_dt']")).sendKeys(date3y);

			LocalDate date = LocalDate.now().minusDays(1);
			DateTimeFormatter formattery1 = DateTimeFormatter.ofPattern("dd-MM-YYYY");
			String date3= formattery.format(date);
			driver.findElement(By.xpath("//input[@id='txt_to_dt']")).sendKeys(date3);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_grd']")).click();
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}


	}

	public void building_Master_tag(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_rfid_report.aspx");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]")).click();

		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}

	}

	public void Ewb_dex_Montly(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_dexfile.aspx?id=2");
			LocalDate date2y = LocalDate.now().minusDays(4);
			DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd-MM-YYYY");
			String date3y= formattery.format(date2y);
			  // System.out.println(date3y);
			driver.findElement(By.xpath("//input[@id='txt_dt']")).sendKeys(date3y);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_summary']")).click();
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}



	}


	public void Dex_daily_report(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/DailydexActivity.aspx");
			//LocalDate date2=LocalDate.parse("2018-01-32");
			LocalDate date2y = LocalDate.now().minusDays(0);
			DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd-MM-YYYY");
			String date3y= formattery.format(date2y);
			  // System.out.println(date3y);
			driver.findElement(By.xpath("//input[@id='txt_dt']")).sendKeys(date3y);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_grd']")).click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-2000)", "");
			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/i[1]")).click(); //Home//
			Thread.sleep(5000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}

	}

	public void Fastag_Dex_Summaryreport(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_dexfile.aspx?id=1");
			//LocalDate date2=LocalDate.parse("2018-01-32");
			LocalDate date2y = LocalDate.now().minusDays(1);
			DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd-MM-YYYY");
			String date3y= formattery.format(date2y);
			  // System.out.println(date3y);
			driver.findElement(By.xpath("//input[@id='txt_dt']")).sendKeys(date3y);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_summary']")).click();
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}

	}

	public void EWb_dex_Monlty_report(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_dex_monthly.aspx");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-2000)", "");
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}


	}

	public void Einv_Dex_report(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/DEXEinv_Report.aspx");
			LocalDate date2y = LocalDate.now().minusDays(7);
			DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd-MM-YYYY");
			String date3y= formattery.format(date2y);
			driver.findElement(By.xpath("//input[@id='txt_dt']")).sendKeys(date3y);

			LocalDate date = LocalDate.now().minusDays(1);
			DateTimeFormatter formattery1 = DateTimeFormatter.ofPattern("dd-MM-YYYY");
			String date3= formattery.format(date);
			driver.findElement(By.xpath("//input[@id='txt_to_dt']")).sendKeys(date3);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_grd']")).click();
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}

	}


	public void Test_EWB_dex_API(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_APIWork.aspx");
			LocalDate date2y = LocalDate.now().minusDays(4);
			DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
			String date3y= formattery.format(date2y);
			driver.findElement(By.xpath("//input[@id='txt_dt']")).sendKeys(date3y);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_summary']")).click();
			Thread.sleep(5000);


			Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_DropDownListslab']")));
			dropdown.selectByValue("PARTB");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_summary']")).click();
			Thread.sleep(5000);

			Select dropdown1 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_DropDownListslab']")));
			dropdown1.selectByValue("EWB03");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_summary']")).click();
			Thread.sleep(5000);

			Select dropdown2 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_DropDownListslab']")));
			dropdown2.selectByValue("EWBSV");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_summary']")).click();
			Thread.sleep(5000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}

	}

	public void Test_EINV_dex_API(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_EinvAPIWork.aspx");
			LocalDate date2y = LocalDate.now().minusDays(1);
			DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
			String date3y= formattery.format(date2y);
			driver.findElement(By.xpath("//input[@id='txt_dt']")).sendKeys(date3y);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_summary']")).click();
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}



	}

	public void Test_Fastag_API(WebDriver driver,JavascriptExecutor js ) throws InterruptedException
	{
		try
		{
			driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_FattagAPI.aspx");
			LocalDate date2y = LocalDate.now().minusDays(1);
			DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
			String date3y= formattery.format(date2y);
			driver.findElement(By.xpath("//input[@id='txt_dt']")).sendKeys(date3y);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_summary']")).click();
			Thread.sleep(10000);
		}catch(org.openqa.selenium.NoSuchElementException e )
		{
			driver.navigate().back();
		}



	}
}
