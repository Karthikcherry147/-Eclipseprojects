package Einvoice;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mapi_einvocie {
	@SuppressWarnings("unused")
	public static <JSONParser> void main(String[] args) throws InterruptedException, FileNotFoundException, IOException, ParseException {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		//driver.manage().deleteAllCookies();
		driver.get("https://mapi.einvoice1.gst.gov.in/einvoice_web");

		System.out.println("Application opened");
		driver.manage().window().maximize();
		Mapi_einvoice_modules einv = new Mapi_einvoice_modules();
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

//		//einv.HomeButton(driver);
//				einv.taxpyer_search(driver);
//				//einv.HomeButton(driver);
//				einv.Einvoice_eligible_Status(driver);
//				//einv.HomeButton(driver);
//		        einv.Verify_Signed_invoice(driver, js, "C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/eInv_112316398914408.JSON");
//		    	//einv.HomeButton(driver);
//		        einv.Master_Codes(driver, js);
//		       // einv.HomeButton(driver);
//
//		        einv.GSP_ERP_List(driver, js);
//		        einv.Pincode(driver, js);
//		       // einv.HomeButton(driver);
//		        einv.Pin_pin(driver, js);
//		       // einv.HomeButton(driver);
//
//////				einv.einvocie_enable(driver, js);
//////		        einv.einvocie_Registration(driver, js);
//		        einv.forgot_Username(driver, js);
//		        einv.forgot_password(driver, js);

		        einv.Login("nictest2", "Abc123@@", "MSAVK", driver);
		        einv.Refresh(driver);
		        einv.CreateJSON();
		        einv.BulkIRN("C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\All Zones JSON\\e_Invoice_2020.json", driver);
		        einv.Home_In(driver);
		        einv.Ewaybill("0", driver);
		        einv.AlertTest(driver);
		      // Thread.sleep(10000);
		        einv.Home_In(driver);
		      //  Thread.sleep(10000);
		        einv.CreateJSON();
		       // Thread.sleep(10000);
		        einv.BulkIRN("C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\All Zones JSON\\e_Invoice_2020.json", driver);
		        einv.Home_In(driver);
		        einv.CopyIRNTest(driver);
		        einv.Home_In(driver);
		        einv.PasteCNLIRNTest(driver, actions);
		        einv.Quit(driver);







	}


}
