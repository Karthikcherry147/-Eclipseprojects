package Ewaybill;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ewaybill_live {
	public static <JSONParser> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	    driver.get("https://ewaybillgst.gov.in/");
		System.out.println("Application opened");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		ewaybill_live_modules ewb = new ewaybill_live_modules();


		ewb.Taxpayer_search(driver);
		ewb.Transpoter_search(driver, js);
		ewb.Product_search(driver, js);
		ewb.Pincode_search(driver, js);
		ewb.Pin_Pin(driver, js);
		ewb.Update_blkSts_frm_CP(driver, js);
	//	ewb.Ewaybill_registration(driver, js);
	//	ewb.Enrolled_transpoter(driver, js);
		ewb.Forgot_Username(driver, js);
		ewb.Forgot_password(driver, js);
	//	ewb.Forgot_transid(driver, js); //Need to check //
	    ewb.ewb_login(driver, js);
		ewb.EWB_Generation(driver, js);
		ewb.update_partA(driver, js, actions);
		ewb.Update_transporter(driver, js, actions);
		ewb.Cancel(driver, js, actions);
		ewb.EWB_Generation1(driver, js);
		ewb.Cons_ewb_Gen(driver, js, actions);
		ewb.Rejectewaybill(driver, js, actions);
		ewb.Outward_Supplies(driver, js, actions);
		ewb.Inward_Supplies(driver, js, actions);
		ewb.Cons_ewb(driver, js, actions);
		ewb.Cancelled_reports(driver, js, actions);
		ewb.Rejected_ewb_by_me(driver, js, actions);
		ewb.Assigned_for_transporter(driver, js, actions);
		ewb.Pending_For_PartB(driver, js, actions);
		ewb.Doc_type_number(driver, js, actions);
		ewb.EWB_about_to_Expire(driver, js, actions);
		ewb.Monthwise_report(driver, js, actions);
		ewb.Generated_by_others(driver, js, actions);
		ewb.Rejected_by_others(driver, js, actions);
		ewb.Ass_to_me_for_transport(driver, js, actions);
		ewb.My_masters(driver, js, actions);
		ewb.EWB_masters(driver, js, actions);
		ewb.DateWise_report(driver, js, actions);
		ewb.Product_Master(driver, js, actions);
		ewb.Client_Master(driver, js, actions);
		ewb.Supplier_Master(driver, js, actions);
		ewb.Transporters_Master(driver, js, actions);
//	    ewb.Create_Subuser(driver, js, actions);
//		ewb.Update_Subuser(driver, js, actions);
//
//		ewb.SMS_Reg(driver, js, actions);
//		ewb.Andriod_Reg(driver, js, actions);
//		ewb.GSP_Reg(driver, js, actions);
//		ewb.API_Reg(driver, js, actions);
//		ewb.Common_enrolled(driver, js, actions);
//		ewb.Update_txp_TRN(driver, js);


























}
}

