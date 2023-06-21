package Analytics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CewbAnalytics {


	@SuppressWarnings({ "unused", "deprecation" })
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);

		driver.get("https://mis.ewaybillgst.gov.in/analytics/login.aspx");
		//driver.get("https://mis.ewaybillgst.gov.in/cewbreports_test/");
		System.out.println("Application opened");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Masters Mas = new Masters();
		A_TrendAnalysis A = new A_TrendAnalysis();
		B_Fast_Analytics B = new B_Fast_Analytics();
		C_AnalyticsTaxpayer1 C = new C_AnalyticsTaxpayer1();
		D_SupplyChain D= new D_SupplyChain();
		E_RiskBasedAnalytics E =  new E_RiskBasedAnalytics();
		F_AnalyticsONHSN F = new F_AnalyticsONHSN();
		G_Vehicle_analytics G = new G_Vehicle_analytics();
		H_Analytics_On_Ewaybill H = new H_Analytics_On_Ewaybill();
		I_Block_Unblock_GSTINs I = new I_Block_Unblock_GSTINs();
		J_Officers_Performance_Report J = new J_Officers_Performance_Report();
		K_Summary_Reports K = new K_Summary_Reports();
		L_Analytics_On_Transporter L = new L_Analytics_On_Transporter();
		M_Intelligence_Reports M = new M_Intelligence_Reports();
		N_GSTIN_Transporter_Ewaybill N = new N_GSTIN_Transporter_Ewaybill();
		O_Analytics_On_taxpayer2 O = new O_Analytics_On_taxpayer2();



		driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("ka_sunita");
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("Nic123@@");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter captcha");
//		String captcha = scan.nextLine();
		driver.findElement(By.xpath("//input[@id='txtCaptchanew']")).sendKeys("MSAVK");
		driver.findElement(By.xpath("//input[@id='btn_login']")).click();
		Mas.Alert(driver);
		driver.findElement(By.xpath("//input[@id='OtpTxt']")).sendKeys("102020");
		driver.findElement(By.xpath("//input[@id='btnsubmit']")).click();
		driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();

		FileInputStream fsIP = new FileInputStream(new File("E:\\WorkSpace\\Selenium\\Analytics.xlsx")); // Read the spreadsheet 	// that needs to be 	// updated

		XSSFWorkbook wb = new XSSFWorkbook(fsIP); // Access the workbook
		XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.
	//	XSSFFont font = wb.createFont();
		 CellStyle style = wb.createCellStyle();
		Cell cell = null; // declare a Cell object


A.A1(driver, cell, worksheet);
A.A2(driver, cell, worksheet);
A.A3(driver, cell, worksheet);
A.A4(driver, cell, worksheet);
A.A5(driver, cell, worksheet);
A.A6(driver, cell, worksheet);
A.A7(driver, cell, worksheet);

B.B1(driver, cell, worksheet,js);
B.B2(driver, cell, worksheet,js);
B.B3(driver, cell, worksheet,js);
B.B4(driver, cell, worksheet,js);
B.B5(driver, cell, worksheet,js);
B.B6(driver, cell, worksheet,js);
B.B7(driver, cell, worksheet,js);
B.B8(driver, cell, worksheet,js);
B.B9(driver, cell, worksheet,js);
B.B10(driver, cell, worksheet,js);

C.C1(driver, cell, worksheet);
C.C2(driver, cell, worksheet);
C.C3(driver, cell, worksheet);
C.C4(driver, cell, worksheet);
C.C5(driver, cell, worksheet);
C.C6(driver, cell, worksheet);
C.C7(driver, cell, worksheet);
C.C8(driver, cell, worksheet);
C.C9(driver, cell, worksheet);
C.C10(driver, cell, worksheet);

D.D1(driver, cell, worksheet);
D.D2(driver, cell, worksheet);

        E.E1(driver, cell, worksheet, js);
		E.E2(driver, cell, worksheet, js);
		E.E3(driver, cell, worksheet, js);
		E.E4(driver, cell, worksheet, js);


		F.F1(driver, cell, worksheet, js);
		F.F2(driver, cell, worksheet, js);
		F.F3(driver, cell, worksheet, js);
		F.F4(driver, cell, worksheet, js);

		G.G1(driver, cell, worksheet, js);
		G.G2(driver, cell, worksheet, js);
		G.G3(driver, cell, worksheet, js);
		G.G4(driver, cell, worksheet, js);
		G.G5(driver, cell, worksheet, js);
		G.G6(driver, cell, worksheet, js);

		H.H1(driver, cell, worksheet, js);
		H.H2(driver, cell, worksheet, js);
		H.H3(driver, cell, worksheet, js);
		H.H4(driver, cell, worksheet, js);
		H.H5(driver, cell, worksheet, js);
		H.H6(driver, cell, worksheet, js);
		H.H7(driver, cell, worksheet, js);

		I.I1(driver, cell, worksheet);
		I.I2(driver, cell, worksheet);
		I.I3(driver, cell, worksheet);
		I.I4(driver, cell, worksheet);
		I.I5(driver, cell, worksheet);
		I.I6(driver, cell, worksheet);
		I.I7(driver, cell, worksheet);


		J.J1(driver, cell, worksheet);
		J.J2(driver, js, cell, worksheet);
		J.J3(driver, js, cell, worksheet);

		K.K1(driver, js, cell, worksheet);
		K.K2(driver, js, cell, worksheet);

		L.L1(driver, js, cell, worksheet);
		L.L2(driver, js, cell, worksheet);
		L.L3(driver, js, cell, worksheet);
		L.L4(driver, js, cell, worksheet);

		M.M1(driver, js, cell, worksheet);
		M.M2(driver, js, cell, worksheet);
	    M.M3(driver, js, cell, worksheet);
		M.M4(driver, js, cell, worksheet);
		M.M5(driver, js, cell, worksheet);
		M.M6(driver, js, cell, worksheet);
		M.M7(driver, js, cell, worksheet);
		M.M8(driver, js, cell, worksheet);
		M.M9(driver, js, cell, worksheet);
		M.M10(driver, js, cell, worksheet);
		M.M11(driver, js, cell, worksheet);
		M.M12(driver, js, cell, worksheet);

		N.N1(driver, js, cell, worksheet);
		N.N2(driver, js, cell, worksheet);
	    N.N3(driver, js, cell, worksheet);
		N.N4(driver, js, cell, worksheet);
		N.N5(driver, js, cell, worksheet);
		N.N6(driver, js, cell, worksheet);
		N.N7(driver, js, cell, worksheet);
		N.N8(driver, js, cell, worksheet);
		N.N9(driver, js, cell, worksheet, actions);
		N.N10(driver, js, cell, worksheet, actions);

		O.O1(driver, js, cell, worksheet);
		O.O2(driver, js, cell, worksheet);
		O.O3(driver, js, cell, worksheet);
		O.O4(driver, js, cell, worksheet);
		O.O5(driver, js, cell, worksheet);
		O.O6(driver, js, cell, worksheet);
		O.O7(driver, js, cell, worksheet);
		O.O8(driver, js, cell, worksheet);
		O.O9(driver, js, cell, worksheet);
		O.O10(driver, js, cell, worksheet);
		O.O11(driver, js, cell, worksheet);



		  fsIP.close(); // Close the InputStream

			FileOutputStream output_file = new FileOutputStream(new File("E:\\WorkSpace\\Selenium\\Analytics.xlsx")); // Open FileOutputStream to
																								// write updates
			wb.write(output_file); // write changes

			output_file.close(); // close the stream

			wb.close();
			// prints the message on the console
			System.out.println("Excel file has been generated successfully.");


}
}