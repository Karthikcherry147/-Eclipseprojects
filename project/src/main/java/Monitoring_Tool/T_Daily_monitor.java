package Monitoring_Tool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T_Daily_monitor {
	@SuppressWarnings("unused")
	public static <JSONParser> void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Montool\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(co);
		driver.get("https://dashboard.ewaybillgst.gov.in/montool/");
		System.out.println("Application opened");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		//Press key Ctrl+Shift+i
		robot.keyPress(KeyEvent.VK_F11);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("karthik");
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("abc123@@");
		driver.findElement(By.xpath("//input[@id='txtCaptchanew']")).sendKeys("MSAVK");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtotp']")).sendKeys("102020");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btncont']")).click();
		Thread.sleep(5000);
		T_daily_Montool_modules MON = new T_daily_Montool_modules();

int i = 0;
int a=0;
for(int j = i ; j<=5000;j++)
{
	for(int b=a; b<=j; b++)
	{
	MON.einvoice_mode_wise(driver);
	MON.einvoice2_mode_wise(driver);
	MON.einvoice_Zone_Wise(driver);
	MON.einvoice2_Zone_Wise(driver);
	MON.ewaybill_mode_wise(driver, js);
	MON.ewaybill_Zone_wise(driver, js);
	MON.GSTIN_details_Fr_CP(driver, js);
////	MON.Block_status_Fr_CP(driver, js);
	MON.Vahan_details(driver, js);
	MON.PAN_details(driver, js);
	MON.Fastag_date_Wise(driver, js);
	a=a+5;
	}
	MON.einvoice_log_error(driver, js);
	MON.ewaybil_log_error(driver, js);
	MON.Fastag(driver, js);
	MON.Master_tag(driver, js);
	MON.API_Response(driver, js);
	MON.Ewb_dex_Montly(driver, js);
	MON.Dex_daily_report(driver, js);
////	MON.building_Master_tag(driver, js);

		MON.Fastag_Dex_Summaryreport(driver, js);
		MON.EWb_dex_Monlty_report(driver, js);
		MON.Einv_Dex_report(driver, js);
		MON.Test_EWB_dex_API(driver, js);
		MON.Test_EINV_dex_API(driver, js);
		MON.Test_Fastag_API(driver, js);

	i++;
}
	}


}
