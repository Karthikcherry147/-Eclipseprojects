package Ewaybill;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ewaybill_live_modules {

		ArrayList<String> check = new ArrayList<String>();
		String flag;

		@SuppressWarnings({ "rawtypes", "unused" })

		public void Taxpayer_search(WebDriver driver) {
			WebElement e0 = driver.findElement(By.xpath("//a[@href ='Others/TaxPayerSearch.aspx']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", e0);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtSearchGSTIN']")).sendKeys("29AAACJ4323N1ZC");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
			String Str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
			if (Str.contains("JSW STEEL LIMITED"))
			{
				System.out.println("Taxpayer search is Working fine");
			} else {
				System.out.println("Taxpayer search is not Working ");
			}
			driver.findElement(
					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]")).click();
		}

		public void Transpoter_search(WebDriver driver, JavascriptExecutor js) {
			WebElement e4 = driver.findElement(By.xpath("//a[@href ='Others/TransportersSearch.aspx']"));
			js.executeScript("arguments[0].click();", e4);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtSearchGSTIN']"))
					.sendKeys("37BZNPM9430M1ZK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
			String Str = driver
					.findElement(
							By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]"))
					.getText();
			if (Str.contains("manglore")) {
				System.out.println("Transpoter search is Working fine");
			} else {
				System.out.println("Transpoter search is not Working ");
			}
			driver.findElement(
					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]")).click();
		}

		public void Product_search(WebDriver driver, JavascriptExecutor js) {
			driver.findElement(
					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]")).click();
			WebElement e5 = driver.findElement(By.xpath("//a[@href ='Others/ProductSearch.aspx']"));
			js.executeScript("arguments[0].click();", e5);
			driver.findElement(By.xpath("//input[@id='txt_hsn_sac']")).sendKeys("1001");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			String Str = driver
					.findElement(By.xpath(
							"/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]"))
					.getText();
			if (Str.contains("WHEAT AND MESLIN - Durum wheat")) {
				System.out.println("Product search is Working fine");
			} else {
				System.out.println("Product search is not  Working");
			}
			driver.findElement(
					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]")).click();
		}

		@SuppressWarnings("unused")
		public void Pincode_search(WebDriver driver, JavascriptExecutor js) {
			driver.findElement(
					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]")).click();
			WebElement e6 = driver.findElement(By.xpath("//a[@href ='Others/PincodeSearch.aspx']"));
			js.executeScript("arguments[0].click();", e6);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtSearchPin']")).sendKeys("560037");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
			String Str = driver
					.findElement(By.xpath(
							"/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]"))
					.getText();

			if (Str.contains("KARNATAKA")) {
				System.out.println("pincode search is  Working fine");
			} else {
				System.out.println("pincode search is not Working ");
			}
			driver.findElement(
					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]")).click();
		}

		public void Pin_Pin(WebDriver driver, JavascriptExecutor js) {
			driver.findElement(
					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]")).click();
			WebElement e7 = driver.findElement(By.xpath("//a[@href ='Others/P2PDistance.aspx']"));
			js.executeScript("arguments[0].click();", e7);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtFromPincode']")).sendKeys("518001");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtToPincode']")).sendKeys("560037");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
			String Str = driver
					.findElement(
							By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]"))
					.getText();
			if (Str.contains("Approximate Distance Between The Pincodes 518001 and 560037 is 368 Kms")) {
				System.out.println("PIN to PIN search is Working fine");
			} else {
				System.out.println("PIN to PIN search is not Working ");
			}
			driver.findElement(
					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]")).click();
		}

		public void Update_blkSts_frm_CP(WebDriver driver, JavascriptExecutor js) {
			driver.findElement(
					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]")).click();
			WebElement e8 = driver.findElement(By.xpath("//a[@href ='Others/GstnIsBlock.aspx']"));
			js.executeScript("arguments[0].click();", e8);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtSearchGSTIN']"))
					.sendKeys("29AAACJ4323N1ZC");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnGo']")).click();
			String Str = driver
					.findElement(
							By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]"))
					.getText();
			if (Str.contains("JSW STEEL LTD")) {
				System.out.println("GSTIN Block Status is  Working fine");
			} else {
				System.out.println("GSTIN Block Status is not Working");
			}
		}

		public void Ewaybill_registration(WebDriver driver, JavascriptExecutor js) throws InterruptedException {
			try
			{
				driver.findElement(
						By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[5]/a[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By
						.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]"))
						.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_gstin']")).sendKeys("01BZNPM9430M1KL");
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']")).sendKeys("MSAVK");
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
				js.executeScript("window.scrollBy(0,2000)", "");
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_otp']")).click();
				Alert alert = driver.switchTo().alert();
				alert.dismiss();
				driver.findElement(By.xpath("//input[@id='txt_OTP']")).sendKeys("230203");
				driver.findElement(By.xpath("//input[@id='btn_ver_otp']")).click();
				Alert alert1 = driver.switchTo().alert();
				alert1.dismiss();
				driver.findElement(By.xpath("//input[@id='txt_uname']")).sendKeys("nictest_jk");
				driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("Abc123@@");
				driver.findElement(By.xpath("//input[@id='txt_pwd1']")).sendKeys("Abc123@@");
				driver.findElement(By.xpath("//input[@id='btn_submit']")).click();
				Alert alert2 = driver.switchTo().alert();
				alert2.dismiss();
			}catch(org.openqa.selenium.UnhandledAlertException e)
			{

			}


		}

		@SuppressWarnings("unused")
		public void Enrolled_transpoter(WebDriver driver, JavascriptExecutor js) throws InterruptedException {
			boolean sucs = false;
			driver.findElement(
					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[5]/a[1]")).click();
			Thread.sleep(2000);
			WebElement w1 = driver.findElement(By.xpath(
					"/html[1]/body[1]/form[1]/div[3]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]"));
			js.executeScript("arguments[0].click();", w1);
			Thread.sleep(2000);
			Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='ddlState']")));
			dropdown.selectByValue("9");
			driver.findElement(By.xpath("//input[@id='txtLegalName']")).sendKeys("manglore");
			driver.findElement(By.xpath("//input[@id='txtTradeName']")).sendKeys("NIC TEST");
			driver.findElement(By.xpath("//input[@id='txtPanNo']")).sendKeys("BZNPM9430M");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@id='btnPanValidate']")).click();

			// Switching to Alert
			Alert alert = driver.switchTo().alert();

			// Capturing alert message.
			String alertMessage = driver.switchTo().alert().getText();
			alert.accept();

			// Displaying alert message
			// System.out.println(alertMessage);
			Thread.sleep(5000);

			if (alertMessage.contains("Your PAN details are validated")) {
				sucs = true;
			} else {
				sucs = false;
			}
			check.add(String.valueOf(sucs));

			driver.findElement(By.xpath("//input[@id='chklistBusinessNature_3']")).click();
			Select dropdown1 = new Select(driver.findElement(By.xpath("	//select[@id='ddlConstitution']")));
			dropdown1.selectByValue("OTH");
			Thread.sleep(1000);
			WebElement e4 = driver.findElement(By.xpath("//input[@id='txtPPBBuildingno']"));
			js.executeScript("arguments[0].value= '12';", e4);
			WebElement e5 = driver.findElement(By.xpath("//input[@id='txtPPBFloorno']"));
			js.executeScript("arguments[0].value= '12';", e5);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='txtPPBPremisesBuild']")).sendKeys("test nic");
			driver.findElement(By.xpath("//input[@id='txtPPBRoad_Street']")).sendKeys("test nic");
			driver.findElement(By.xpath("//input[@id='txtPPBCityTownVill']")).sendKeys("test nic");
			driver.findElement(By.xpath("//input[@id='txtPPBTaluk']")).sendKeys("test nic");
			driver.findElement(By.xpath("//input[@id='txtPPBDistrict']")).sendKeys("test nic");
			driver.findElement(By.xpath("//input[@id='txtPPBPincode']")).sendKeys("234567");
			driver.findElement(By.xpath("//input[@id='txtNameProp_MainPerson']")).sendKeys("test nic");
			driver.findElement(By.xpath("//input[@id='txtMobileProp_MainPerson']")).sendKeys("9014485523");
			driver.findElement(By.xpath("//input[@id='btnNoAadharSendOTP']")).click();
			Alert alert5 = driver.switchTo().alert();
			alert5.accept();
	//****//Change the OTP while running the application//
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("enter OTP");
			String OTP = scan.nextLine();
			driver.findElement(By.xpath("//input[@id='txtMobileVeriProp_MainPerson']")).sendKeys(OTP);
//		driver.findElement(By.xpath("//input[@id='txtMobileVeriProp_MainPerson']")).sendKeys("230203");
			driver.findElement(By.xpath("//input[@id='btnNoAadharVerifyOTP']")).click();

			Alert alert6 = driver.switchTo().alert();
			String alertMessage1 = driver.switchTo().alert().getText();
			alert6.accept();
			// System.out.println(alertMessage1);
			Thread.sleep(5000);
			if (alertMessage1.contains("OTP verified")) {
				sucs = true;
			} else {
				sucs = false;
			}
			check.add(String.valueOf(sucs));

			driver.findElement(By.xpath("//input[@id='txtUserid']")).sendKeys("nic_rj9379");
			driver.findElement(By.xpath("//input[@id='btnChkUserId']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("Abc123@@");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='txt_pwd1']")).sendKeys("Abc123@@");
			js.executeScript("window.scrollBy(0,2000)", "");
			driver.findElement(By.xpath("//input[@id='chkVerification']")).click();
			@SuppressWarnings("resource")
			Scanner scan1 = new Scanner(System.in);
			System.out.println("enter captcha");
			String captcha = scan.nextLine();
			driver.findElement(By.xpath("//input[@id='txtCaptcha']")).sendKeys(captcha);
//		driver.findElement(By.xpath("//input[@id='txtCaptcha']")).sendKeys("MSAVK");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='btnsbmt']")).click();
			Alert alert7 = driver.switchTo().alert();
			String alertMessage2 = driver.switchTo().alert().getText();
			alert6.accept();
			// System.out.println(alertMessage2);
			Thread.sleep(5000);

			if (alertMessage2.contains("Details saved successfully")) {
				sucs = true;
			} else {
				sucs = false;
			}
			check.add(String.valueOf(sucs));

			for (int i = 0; i < check.size(); i++) {
				if (check.get(i) == "true") {
					flag = "ok";
				} else {
					flag = "notok";
					break;
				}
			}
			;
			if (flag == "ok") {

				System.out.println("Enrolled transporter is working fine");
			} else {

				System.out.println("Enrolled transporter is not working ");
			}
		}

		public void Forgot_Username(WebDriver driver, JavascriptExecutor js) {
			// Forgot password//
		
			driver.get("https://ewaybillgst.gov.in/Account/ForgotCredentials.aspx");
//			WebElement e1 = driver.findElement(By.xpath("//a[contains(text(),'Forgot Credentials ?')]"));
//			js.executeScript("arguments[0].click();", e1);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_forgotcredentials_0']")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtGSTIN']")).sendKeys("37BZNPM9430M1KL");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtMobilenoUN']")).sendKeys("9014485523");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnFUsername']")).click();
			Alert alert = driver.switchTo().alert();
			String alertMessage = driver.switchTo().alert().getText();
			alert.accept();

			if (alertMessage.contains("We have sent your Username to your mobile number and mailid.")) {
				System.out.println("Forgot Username is working fine");
			} else {
				System.out.println("Forgot Username is not working");
			}
		}

		@SuppressWarnings("unused")
		public void Forgot_password(WebDriver driver, JavascriptExecutor js) throws InterruptedException {
			boolean sucs = false;
	
			driver.get("https://ewaybillgst.gov.in/Account/ForgotCredentials.aspx");
//			WebElement e2 = driver.findElement(By.xpath("//a[contains(text(),'Forgot Credentials ?')]"));
//			js.executeScript("arguments[0].click();", e2);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_forgotcredentials_1']")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtUserid']")).sendKeys("nictest2");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtGstnPwd']")).sendKeys("37BZNPM9430M1KL");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtCaptchaFPWD']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtMobileno']")).sendKeys("9014485523");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_otp']")).click();
			Alert alert = driver.switchTo().alert();
			String alertMessage = driver.switchTo().alert().getText();
			alert.accept();
			Alert alert11 = driver.switchTo().alert();
			alert11.accept();
			System.out.println(alertMessage);
			if (alertMessage.contains("OTP has been sent to your Registered Mail Id, Please check and enter")) {
				sucs = true;
			} else {
				sucs = false;
			}
			check.add(String.valueOf(sucs));
	//Change OTP here//
			  LocalDateTime myObj = LocalDateTime.now();
			    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyMMdd");
			    String formattedDate = myObj.format(myFormatObj);
			    System.out.println(formattedDate);

			driver.findElement(By.xpath("//input[@id='txt_OTP']")).sendKeys(formattedDate);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='btn_ver_otp']")).click();

			Alert alert2 = driver.switchTo().alert();
			String alertMessage1 = driver.switchTo().alert().getText();
			alert2.accept();
			System.out.println(alertMessage1);
			if (alertMessage1.contains("OTP verified successfully")) {
				sucs = true;
			} else {
				sucs = false;
			}
			check.add(String.valueOf(sucs));
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[7]/div[1]/input[1]")).sendKeys("Abc123@@");
			driver.findElement(By.xpath("//input[@id='txt_pwd1']")).sendKeys("Abc123@@");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnpwsubmit']")).click();
			Alert alert4 = driver.switchTo().alert();
			String alertMessage2 = driver.switchTo().alert().getText();
			alert4.accept();
			System.out.println(alertMessage2);
			if (alertMessage2.contains("Successfully updated New password")) {
				sucs = true;
			} else {
				sucs = false;
			}
			check.add(String.valueOf(sucs));
			for (int i = 0; i < check.size(); i++) {
				if (check.get(i) == "true") {
					flag = "ok";
				} else {
					flag = "notok";
					break;
				}
			}
			;
			if (flag == "ok") {

				System.out.println("Forgot Password is working fine");
			} else {

				System.out.println("Enrolled transporter is not working ");
			}

			// Successfully updated New password

		}

		public void Forgot_transid(WebDriver driver, JavascriptExecutor js) {
		
		try
		{
			boolean sucs = false;
			driver.get("https://ewaybillgst.gov.in/Account/ForgotCredentials.aspx");
//			driver.findElement(
//					By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[7]/a[1]")).click();
//			WebElement e3 = driver.findElement(By.xpath("//a[contains(text(),'Forgot Credentials ?')]"));
//			js.executeScript("arguments[0].click();", e3);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_forgotcredentials_2']")).click();
			Select dropdown = new Select(driver.findElement(By.xpath(
					"/html[1]/body[1]/form[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")));
			dropdown.selectByValue("37");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtPanNo']")).sendKeys("BZNPM9430M");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtfgCaptcha']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnfgSendOTP']")).click();
			Alert alert4 = driver.switchTo().alert();
			String alertMessage = driver.switchTo().alert().getText();
			alert4.accept();
//				System.out.println(alertMessage);

			if (alertMessage.contains("OTP has been sent to your mobile no  and mail Id  , Please check")) {
				sucs = true;
			} else {
				sucs = false;
			}
			check.add(String.valueOf(sucs));
	//Change OTP here//
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("enter OTP");
			String OTP = scan.nextLine();
			driver.findElement(By.xpath("//input[@id='txtOTP']")).sendKeys(OTP);
			// driver.findElement(By.xpath("//input[@id='txtOTP']")).sendKeys("230206");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_add']")).click();
			String Str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
			if (Str.contains("29BZNPM9430M1ZH")) {
				sucs = true;
			} else {
				sucs = false;
			}
			check.add(String.valueOf(sucs));
			for (int i = 0; i < check.size(); i++) {
				if (check.get(i) == "true") {
					flag = "ok";
				} else {
					flag = "notok";
					break;
				}
			}
			;
			if (flag == "ok") {

				System.out.println("Forgot transid is working fine");
			} else {

				System.out.println("Forgot transid is not working");
			}
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
		}catch(Exception e )
		{
			
		}

		}

		public void ewb_login(WebDriver driver, JavascriptExecutor js) throws InterruptedException {
			  driver.get("https://ewaybillgst.gov.in/login.aspx");
			//driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[7]/a[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("nictest2");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("Abc123@@");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='txtCaptcha']")).sendKeys("MSAVK");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[9]/div[1]/div[1]/div[1]/button[1]")).click();
			System.out.println("Login succesfully");

		}

		public void EWB_Generation(WebDriver driver, JavascriptExecutor js) throws InterruptedException {
			WebElement e13 = driver
					.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
			js.executeScript("arguments[0].click();", e13);
			WebElement e14 = driver.findElement(
					By.xpath("//body/form[@id='aspnetForm']/div[3]/nav[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
			js.executeScript("arguments[0].click();", e14);
	//Change doc no.//
		    LocalDateTime myObj = LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHH:mm:ss");
		    String formattedDate = myObj.format(myFormatObj);
			driver.findElement(By.xpath("//input[@id='txtDocNo']")).sendKeys("GT" +formattedDate);
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtToGSTIN']")).sendKeys("03BZNPM9430M1KL");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='txtProductName_1']")).sendKeys("TEST PRODUCT NAME");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='txt_Description_1']")).sendKeys("TEST PRODUCT DESCRPTION");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='txt_HSN_1']")).sendKeys("1001");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='txt_TRC_1']")).sendKeys("1");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTransid']")).sendKeys("37BZNPM9430M1ZK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtVehicleNo']")).sendKeys("AP01HS1234");
			WebElement e15 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[11]/button[2]"));
			js.executeScript("arguments[0].click();", e15);
			Alert alert2 = driver.switchTo().alert();
			alert2.accept();
			Alert alert3 = driver.switchTo().alert();
			alert3.accept();
			Thread.sleep(1000);
			Alert alert4 = driver.switchTo().alert();
			alert4.accept();
			Thread.sleep(1000);
			// System.out.println("Ewaybill generated");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,2000)", "");
			WebElement e18 = driver.findElement(By.xpath(
					"/html[1]/body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[20]/td[1]/div[1]/div[58]"));
			js.executeScript("arguments[0].click();", e18);

			String Str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[19]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]")).getText();
			//System.out.println(Str);

			if (Str.contains("37BZNPM9430M1KL")) {
				System.out.println("ewaybill Generation is working fine");
			} else {
				System.out.println("ewaybill Generation is not working ");
			}

			Actions actions = new Actions(driver);
			actions.moveToElement(e18).doubleClick().build().perform();
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("c");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Exit')]")).click();
		}

		public void EWB_Generation1(WebDriver driver, JavascriptExecutor js) throws InterruptedException {
			WebElement e13 = driver
					.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
			js.executeScript("arguments[0].click();", e13);
			WebElement e14 = driver.findElement(
					By.xpath("//body/form[@id='aspnetForm']/div[3]/nav[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
			js.executeScript("arguments[0].click();", e14);
	//Change doc no.//
		    LocalDateTime myObj1 = LocalDateTime.now();
		    DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("ddMMyyyyHH:mm:ss");
		    String formattedDate1 = myObj1.format(myFormatObj1);
			driver.findElement(By.xpath("//input[@id='txtDocNo']")).sendKeys("GT" +formattedDate1);
			driver.findElement(By.xpath("//input[@id='txtDocNo']")).sendKeys("G");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtToGSTIN']")).sendKeys("03BZNPM9430M1KL");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='txtProductName_1']")).sendKeys("TEST PRODUCT NAME");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='txt_Description_1']")).sendKeys("TEST PRODUCT DESCRPTION");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='txt_HSN_1']")).sendKeys("1001");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='txt_TRC_1']")).sendKeys("1");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTransid']")).sendKeys("37BZNPM9430M1ZK");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtVehicleNo']")).sendKeys("AP01HS1234");
			WebElement e15 = driver
					.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[11]/button[2]"));
			js.executeScript("arguments[0].click();", e15);
			Alert alert2 = driver.switchTo().alert();
			alert2.accept();
			Alert alert3 = driver.switchTo().alert();
			alert3.accept();
			Thread.sleep(1000);
			Alert alert4 = driver.switchTo().alert();
			alert4.accept();
			Thread.sleep(1000);
			// System.out.println("Ewaybill generated");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,2000)", "");
			WebElement e18 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[20]/td[1]/div[1]/div[58]"));
			js.executeScript("arguments[0].click();", e18);

			String Str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[19]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]")).getText();
			//System.out.println(Str);

			if (Str.contains("37BZNPM9430M1KL")) {
				System.out.println("ewaybill Generation is working fine");
			} else {
				System.out.println("ewaybill Generation is not working ");
			}

			Actions actions = new Actions(driver);
			actions.moveToElement(e18).doubleClick().build().perform();
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("c");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Exit')]")).click();
		}

		@SuppressWarnings({ "rawtypes", "unused" })
		public void update_partA(WebDriver driver, JavascriptExecutor js, Actions actions) {
			WebElement e13 = driver
					.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
			js.executeScript("arguments[0].click();", e13);
			WebElement e17 = driver.findElement(By.xpath("//a[contains(text(),'Update Part B/Vehicle')]"));
			js.executeScript("arguments[0].click();", e17);
			WebElement Q3 = driver
					.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/input[1]"));
			actions.moveToElement(Q3).click().build().perform();
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("v");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Btn_go']")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_veh_no']")).sendKeys("AP01HS1234");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_from_place']")).sendKeys("Kurnool");
			Select dropdown = new Select(driver.findElement(By.xpath(
					"/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[5]/td[2]/select[1]")));
			dropdown.selectByValue("3");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_remarks']")).sendKeys("21123");
			driver.findElement(By.xpath("//input[@id='btn_submit']")).click();

			String Str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[19]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]")).getText();
			//System.out.println(Str);

			if (Str.contains("37BZNPM9430M1KL")) {
				System.out.println("ewaybill part B Updation   is working fine");
			} else {
				System.out.println("ewaybill part B Updation is not working ");
			}
			js.executeScript("window.scrollBy(0,2000)", "");

			js.executeScript("window.scrollBy(0,2000)", "");
			driver.findElement(By.xpath("//a[contains(text(),'Exit')]")).click();
			//System.out.println("EWB Part B Updated");

		}

		@SuppressWarnings("unused")
		public void Update_transporter(WebDriver driver, JavascriptExecutor js, Actions actions)
				throws InterruptedException {

			try
			{
				WebElement e19 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e19);
				WebElement e20 = driver.findElement(By.xpath("//a[contains(text(),'Update EWB Transporter')]"));
				js.executeScript("arguments[0].click();", e20);
				WebElement Q8 = driver.findElement(
						By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
				actions.moveToElement(Q8).click().build().perform();
				actions.keyDown(Keys.CONTROL);
				actions.sendKeys("v");
				actions.keyUp(Keys.CONTROL);
				actions.build().perform();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Btn_go']")).click();
				js.executeScript("window.scrollBy(0,2000)", "");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTransid']")).sendKeys("37BZNPM9430M1ZK");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
				js.executeScript("window.scrollBy(0,2000)", "");
				driver.findElement(By.xpath("//a[contains(text(),'Exit')]")).click();

//		   	String trans = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[17]/td[2]/span[1]")).getText();
		//
//		   	if(trans.contains("37BZNPM9430M1ZK"))
//		   	{
//		   		System.out.println("OK");
//		   	}else
//		   	{
//					System.out.println("NOTOK");
//				}

			// Your Old Transporter ID and New Transporter ID are Same..

	}catch(org.openqa.selenium.ElementClickInterceptedException ex1)
			{

			}
		}

		@SuppressWarnings("unused")
		public void Cancel(WebDriver driver, JavascriptExecutor js, Actions actions) {
			WebElement e21 = driver
					.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
			js.executeScript("arguments[0].click();", e21);
			WebElement e22 = driver.findElement(
					By.xpath("//body/form[@id='aspnetForm']/div[3]/nav[1]/div[1]/ul[1]/li[1]/ul[1]/li[9]/a[1]"));
			js.executeScript("arguments[0].click();", e22);
			WebElement Q90 = driver.findElement(
					By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
			actions.moveToElement(Q90).click().build().perform();
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("v");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Btn_go']")).click();
			js.executeScript("window.scrollBy(0,2000)", "");
			Select dropdown1 = new Select(driver.findElement(By.xpath(
					"/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")));
			dropdown1.selectByValue("4");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_remarks']")).sendKeys("Test NIC ");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_cancel']")).click();
			Alert alert = driver.switchTo().alert();
			String alertMessage = driver.switchTo().alert().getText();
			alert.accept();
			if (alertMessage.contains("e-Way bill Cancelled Successfully!!")) {
				System.out.println("EWaybill Cancelled is working fine");
			} else {
				System.out.println("EWaybill Cancelled is not working ");
			}
			js.executeScript("window.scrollBy(0,2000)", "");
			driver.findElement(By.xpath("//tbody/tr[3]/td[1]/a[1]")).click();
			// e-Way bill Cancelled Successfully!!
		}

		public void Rejectewaybill(WebDriver driver, JavascriptExecutor js, Actions actions) {
			try {
				WebElement e21 = driver
						.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[3]/a[1]"));
				js.executeScript("arguments[0].click();", e21);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
				driver.findElement(By.xpath(
						"/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[5]/div[1]/table[2]/tbody[1]/tr[2]/td[1]/span[1]/input[1]"))
						.click();
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_button_status']")).click();

				Alert alert = driver.switchTo().alert();
				String alertMessage = driver.switchTo().alert().getText();
				alert.accept();

				if (alertMessage.contains("No of EWB Rejected By You :1")) {
					System.out.println("Ewaybill rejection is working fine");
				} else {
					System.out.println("Ewaybill rejection is not working");
				}
			} catch (org.openqa.selenium.NoSuchElementException e) {

				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]"))
						.click();

			} catch (org.openqa.selenium.UnhandledAlertException e) {
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]"))
						.click();
			} catch (org.openqa.selenium.NoAlertPresentException e) {
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]"))
						.click(); // Home//
			}
		}

		@SuppressWarnings("rawtypes")
		public void Outward_Supplies(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException, org.openqa.selenium.UnhandledAlertException {
			try {
				WebElement e21 = driver
						.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e21);
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(2000);
				// Outwards Supplies
				driver.findElement(
						By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
						.click();
				LocalDate date2y = LocalDate.now().minusDays(5);
				DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
				String date3y = formattery.format(date2y);
				// System.out.println(date3y);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).clear();
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date3y);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();

				String text = null;

				try
				{
					Alert alert = driver.switchTo().alert();
					text = driver.switchTo().alert().getText();
					alert.accept();
					System.out.println("Outward Supplies"+ " " +text);

				}catch(Exception e)
				{
					List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));

					if (rows.size() >= 1)
					{
						System.out.println("Outward Supplies is working fine");
					} else
					{

						System.out.println("Outward Supplies is working fine");
					}
				}
			}catch (Exception e)
			{
	System.out.println(e.getMessage());

			}

		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//

		}

		@SuppressWarnings("rawtypes")
		public void Inward_Supplies(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException {

			try {
				WebElement e22 = driver
						.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e22);
				Thread.sleep(2000);
				driver.findElement(
						By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"))
						.click();
				Thread.sleep(2000);
				// Inwards Supplies
				driver.findElement(
						By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[2]/a[1]"))
						.click();
				LocalDate date2y = LocalDate.now().minusDays(0);
				DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
				String date3y = formattery.format(date2y);
				// System.out.println(date3y);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).clear();
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date3y);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();

				String text = null;
				try
				{
					Alert alert = driver.switchTo().alert();
					text = driver.switchTo().alert().getText();
					alert.accept();
					System.out.println("Inwards Supplies"+ " " +text);
				}catch (Exception e)
				{
					List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
					if (rows.size() >=1) {
						System.out.println("Inwards Supplies is working fine");
					} else {
						System.out.println("Inwards Supplies is not working ");
					}
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}


				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]"))
				.click(); // Home//



		}

		@SuppressWarnings("rawtypes")
		public void Cons_ewb(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException

		{

			try {
				WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e22);
				Thread.sleep(3000);
				WebElement e23 = driver.findElement(
						By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e23);
				Thread.sleep(3000);
				// Cons.ewb
				WebElement e24 = driver.findElement(
						By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[3]/a[1]"));
				js.executeScript("arguments[0].click();", e24);
				LocalDate date2y = LocalDate.now().minusDays(5);
				DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
				String date3y = formattery.format(date2y);
				// System.out.println(date3y);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date3y);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();

				String text = null;
				try
				{
					Alert alert = driver.switchTo().alert();
					text = driver.switchTo().alert().getText();
					alert.accept();
					System.out.println("CONS.EWB"+ "  " +text);
				}catch(Exception e)
				{
					List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
					if (rows.size() >= 1) {
						System.out.println("CONS.EWB is working fine");
					} else {
						System.out.println("CONS.EWB is not working ");
					}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}


				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//

		}

		@SuppressWarnings({ "rawtypes", "unused" })
		public void Cancelled_reports(WebDriver driver, JavascriptExecutor js, Actions actions)
				throws InterruptedException {

			try {
				WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e22);
				Thread.sleep(3000);
				WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e23);
				Thread.sleep(1000);
				// Cancelled e-waybill
				WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[4]/a[1]"));
				js.executeScript("arguments[0].click();", e24);
				LocalDate date4y = LocalDate.now().minusDays(5);
				DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
				String date5y = formattery.format(date4y);
				//System.out.println(date5y);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).clear();
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date5y);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
				Thread.sleep(1000);


				String text = null;

				try
				{
					Alert alert = driver.switchTo().alert();
					text = driver.switchTo().alert().getText();
					alert.accept();
					System.out.println(text);

				}catch(Exception e)
				{
					List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
					if (rows.size()>=1) {
						System.out.println("Cancelled ewaybill  is working fine");
					} else {

					}
				}

			} catch (Exception e) {

			}


				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//



		}

		@SuppressWarnings("rawtypes")
		public void Rejected_ewb_by_me(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
		{
			try {
				WebElement e22 = driver
						.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e22);
				Thread.sleep(3000);
				WebElement e23 = driver.findElement(
						By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e23);
				Thread.sleep(1000);
				// Rejected_ewb_by_me
				WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[5]/a[1]"));
				js.executeScript("arguments[0].click();", e24);
				LocalDate date4y = LocalDate.now().minusDays(5);
				DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
				String date5y = formattery.format(date4y);
				//System.out.println(date5y);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).clear();
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date5y);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
				Thread.sleep(1000);

				String text = null;

				try
				{
					Alert alert = driver.switchTo().alert();
					text = driver.switchTo().alert().getText();
					alert.accept();
					System.out.println(text);
				}catch (Exception e)
				{
					List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
					if (rows.size()>=1) {
						System.out.println("Rejected_ewb_by_me is working fine");
					} else {
						System.out.println("Rejected_ewb_by_me is not working ");
					}
				}

			} catch (Exception e) {

			}

				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//

		}


		public void Assigned_for_transporter(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
		{
			try {
				WebElement e22 = driver
						.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e22);
				Thread.sleep(3000);
				WebElement e23 = driver.findElement(
						By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e23);
				Thread.sleep(1000);
				// Assigned for transporter
				WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[6]/a[1]"));
				js.executeScript("arguments[0].click();", e24);
				LocalDate date4y = LocalDate.now().minusDays(5);
				DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
				String date5y = formattery.format(date4y);
				//System.out.println(date5y);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).clear();
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date5y);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
				Thread.sleep(1000);

				String text = null;
				try
				{
					Alert alert = driver.switchTo().alert();
					text = driver.switchTo().alert().getText();
					alert.accept();
					System.out.println(text);
				}catch (Exception e)
				{
					List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
					if (rows.size()>=1) {
						System.out.println("Assigned for transporter is working fine");
					} else {
						System.out.println("Assigned for transporter is not working ");
					}
				}


			} catch (Exception e) {

			}


				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//


		}

		@SuppressWarnings("rawtypes")
		public void Pending_For_PartB(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
		{
			try {
				WebElement e22 = driver
						.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e22);
				Thread.sleep(3000);
				WebElement e23 = driver.findElement(
						By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"));
				js.executeScript("arguments[0].click();", e23);
				Thread.sleep(1000);
				// pending for partB
				WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[7]/a[1]"));
				js.executeScript("arguments[0].click();", e24);
				LocalDate date4y = LocalDate.now().minusDays(5);
				DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
				String date5y = formattery.format(date4y);
				//System.out.println(date5y);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).clear();
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date5y);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
				Thread.sleep(1000);

				String text = null;

				try
				{
					Alert alert = driver.switchTo().alert();
					text = driver.switchTo().alert().getText();
					alert.accept();
					System.out.println(text);

				}catch (Exception e)
				{
					List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
					if (rows.size()>=1) {
						System.out.println("pending for partB is working fine");
					} else {
						System.out.println("pending for partB is not working ");
					}
				}


			} catch (Exception e) {

			}


				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//


		}

		@SuppressWarnings("rawtypes")
		public void Doc_type_number(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
		{
			try
			{

			WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
			js.executeScript("arguments[0].click();", e22);
			Thread.sleep(3000);
			WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"));
			js.executeScript("arguments[0].click();", e23);
			Thread.sleep(1000);
			WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[8]/a[1]"));

			js.executeScript("arguments[0].click();", e24);
	        //Doc. type & number
			Select dropdown = new Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/select[1]")));
			dropdown.selectByValue("INV");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("234234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Button1']")).click();

			String text = null;

			try
			{
				Alert alert = driver.switchTo().alert();
				text = driver.switchTo().alert().getText();
				alert.accept();
				System.out.println("Doc. type & number" + "  " +text);

			}catch (Exception e)
			{
				List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows.size()>=1) {
					System.out.println("Doc. type & number is working fine");
				} else {
					System.out.println("Doc. type & number is not working ");
				}
			}


		} catch (Exception e) {

		}


			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//



		}

		@SuppressWarnings("rawtypes")
		public void EWB_about_to_Expire(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
		{
			try
			{
			WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
			js.executeScript("arguments[0].click();", e22);
			Thread.sleep(3000);
			WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"));
			js.executeScript("arguments[0].click();", e23);
			Thread.sleep(1000);
			WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[9]/a[1]"));
			js.executeScript("arguments[0].click();", e24);
			Thread.sleep(1000);
	//EWB_about_to_Expire
			String text = null;

			try
			{
				Alert alert = driver.switchTo().alert();
				text = driver.switchTo().alert().getText();
				alert.accept();
				System.out.println("EWB about to Expire" + "  " +text);

			}catch (Exception e)
			{
				List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows.size()>=1) {
					System.out.println("EWB about to Expire is working fine");
				} else {
					System.out.println("EWB about to Expire is not working ");
				}
			}

		} catch (Exception e)
		{

		}
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//

		}


	@SuppressWarnings({ "rawtypes", "unused" })
	public void Monthwise_report(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{try
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
		WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[10]/a[1]"));
		js.executeScript("arguments[0].click();", e24);
		Thread.sleep(1000);
		String text = null;

		try
		{
			Alert alert = driver.switchTo().alert();
			text = driver.switchTo().alert().getText();
			alert.accept();
			System.out.println("MonthWise Report" + "  " +text);

		}catch (Exception e)
		{
	String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]")).getText();

	if(str.contains("Total Count"))
	{
		System.out.println("OK");
	}else
	{
		System.out.println("NOTOK");
	}

		}
	}catch(Exception e)
	{

	}
	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	@SuppressWarnings("rawtypes")
	public void Generated_by_others(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
		WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
		js.executeScript("arguments[0].click();", e24);
		LocalDate date4y = LocalDate.now().minusDays(5);
		DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String date5y = formattery.format(date4y);
		//System.out.println(date5y);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).clear();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date5y);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
		Thread.sleep(1000);
		String text = null;
		try
		{
			Alert alert = driver.switchTo().alert();
			text = driver.switchTo().alert().getText();
			alert.accept();
			System.out.println(text);
		}catch (Exception e)
		{
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=1) {
				System.out.println("Generated by others is working fine");
			} else {
				System.out.println("Generated by others  is not working ");
			}
		}
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	@SuppressWarnings("rawtypes")
	public void Rejected_by_others(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
		WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
		js.executeScript("arguments[0].click();", e24);
		LocalDate date4y = LocalDate.now().minusDays(5);
		DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String date5y = formattery.format(date4y);
		//System.out.println(date5y);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).clear();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date5y);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
		Thread.sleep(1000);
		String text = null;
		try
		{
			Alert alert = driver.switchTo().alert();
			text = driver.switchTo().alert().getText();
			alert.accept();
			System.out.println("Rejected by others"+ " " +text);
		}catch (Exception e)
		{
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=1) {
				System.out.println("Rejected by others is working fine");
			} else {
				System.out.println("Rejected by others  is not working ");
			}
		}
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	@SuppressWarnings("rawtypes")
	public void Ass_to_me_for_transport(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
		WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[2]/ul[1]/li[3]/a[1]"));
		js.executeScript("arguments[0].click();", e24);
		Select dropdown = new Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]")));
		dropdown.selectByValue("1");
		LocalDate date4y = LocalDate.now().minusDays(5);
		DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String date5y = formattery.format(date4y);
		//System.out.println(date5y);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).clear();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date5y);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
		Thread.sleep(1000);
		String text = null;
		try
		{
			Alert alert = driver.switchTo().alert();
			text = driver.switchTo().alert().getText();
			alert.accept();
			System.out.println("Ass. to me for transport"+ " " +text);
		}catch (Exception e)
		{
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=1) {
				System.out.println("Ass. to me for transport is working fine");
			} else {
				System.out.println("Ass. to me for transport is not working ");
			}
		}
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	@SuppressWarnings("rawtypes")
	public void My_masters(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[3]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
		WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
		js.executeScript("arguments[0].click();", e24);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
		String text = null;
		try
		{
			Alert alert = driver.switchTo().alert();
			text = driver.switchTo().alert().getText();
			alert.accept();
			System.out.println("My Masters"+ " " +text);
		}catch (Exception e)
		{
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=1) {
				System.out.println("My Masters is working fine");
			} else {
				System.out.println("My Masters is not working ");
			}
		}
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	@SuppressWarnings("rawtypes")
	public void EWB_masters(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[3]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
		WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[3]/ul[1]/li[2]/a[1]"));
		js.executeScript("arguments[0].click();", e24);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
		String text = null;
		try
		{
			Alert alert = driver.switchTo().alert();
			text = driver.switchTo().alert().getText();
			alert.accept();
			System.out.println(text);
		}catch (Exception e)
		{
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=1) {
				System.out.println("EWB Masters is working fine");
			} else {
				System.out.println("EWB Masters is not working ");
			}
		}
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	public void DateWise_report(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[4]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
		WebElement e24 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[4]/ul[1]/li[1]/a[1]"));
		js.executeScript("arguments[0].click();", e24);
		LocalDate date4y = LocalDate.now().minusDays(5);
		DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String date5y = formattery.format(date4y);
		//System.out.println(date5y);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).clear();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']")).sendKeys(date5y);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
		Thread.sleep(1000);

		String text = null;

		try
		{
			Alert alert = driver.switchTo().alert();
			text = driver.switchTo().alert().getText();
			alert.accept();
			System.out.println(text);

		}catch (Exception e)
		{
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=1) {
				System.out.println("Generated by me  is working fine");
			} else {
				System.out.println("Generated by me is not working ");
			}
	}
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	public void Product_Master(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_product_name']")).sendKeys("wheat");
	 Select dropdown = new Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/select[1]")));
	 dropdown.selectByValue("BAG");
	 driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]")).sendKeys("Wheat");
	 driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]")).sendKeys("1001");
	 Select dropdown1 = new Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[9]/td[1]/div[1]/div[1]/select[1]")));
	 dropdown1.selectByValue("0.500");
	 Select dropdown2 = new Select (driver.findElement(By.xpath("//html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[9]/td[1]/div[1]/div[3]/select[1]")));
	 dropdown2.selectByValue("1.000");
	 Select dropdown3 = new Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[9]/td[1]/div[1]/div[4]/select[1]")));
	 dropdown3.selectByValue("400.000");
	 driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnSubmit']")).click();


		String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]")).getText();

		System.out.println(text);

		if(text.contains("Product Added Successfully.."))
		{
			System.out.println("Product  Master is working fine");
		}else
		{
			System.out.println("Product Master is working fine");
		}
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	@SuppressWarnings("rawtypes")
	public void Client_Master(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
		String text = null;

		try
		{
			Alert alert = driver.switchTo().alert();
			text = driver.switchTo().alert().getText();
			alert.accept();
			System.out.println(text);

		}catch (Exception e)
		{
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=1) {
				System.out.println("Client Master is working fine");
			} else {
				System.out.println("Client Master is not working ");
			}
		}
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	public void Supplier_Master(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
		String text = null;

		try
		{
			Alert alert = driver.switchTo().alert();
			text = driver.switchTo().alert().getText();
			alert.accept();
			System.out.println(text);

		}catch (Exception e)
		{
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=1) {
				System.out.println("Supplier Master is working fine");
			} else {
				System.out.println("Supplier Master is not working ");
			}
		}
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	@SuppressWarnings("rawtypes")
	public void Transporters_Master(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]"));
		js.executeScript("arguments[0].click();", e22);
		Thread.sleep(3000);
		WebElement e23 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[5]/ul[1]/li[4]/a[1]"));
		js.executeScript("arguments[0].click();", e23);
		Thread.sleep(1000);
		String text = null;

		try
		{
			Alert alert = driver.switchTo().alert();
			text = driver.switchTo().alert().getText();
			alert.accept();
			System.out.println(text);

		}catch (Exception e)
		{
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if (rows.size()>=1) {
				System.out.println("Transporter Master is working fine");
			} else {
				System.out.println("Transporter Master is not working ");
			}
		}
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
	}

	@SuppressWarnings("resource")
	public void Create_Subuser(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		try
		{
			WebElement e22 = driver.findElement(By.xpath("//span[contains(text(),'User Management')]"));
			js.executeScript("arguments[0].click();", e22);
			WebElement e23 = driver.findElement(By.xpath("//a[contains(text(),'Create Sub-User')]"));
			js.executeScript("arguments[0].click();", e23);
			Alert alert = driver.switchTo().alert();
			   String alertMessage= driver.switchTo().alert().getText();
			alert.accept();
			if(alertMessage.contains("We have sent subuser OTP to your registered mobile number and mailid."))
			{
				System.out.println("create sub user OTP Sent succussfully ");

			}else
			{
				System.out.println(alertMessage);
			}
			Scanner scan = new Scanner(System.in);
			System.out.println("enter create subuser OTP");
			String captcha4 = scan.nextLine();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtOTP']")).sendKeys(captcha4);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnValidate']")).click();
			Thread.sleep(2000);
//			String alertText=null;
//			 String alertResult=null;
//			try {
//				Alert alert1 =driver.switchTo().alert();
//				 alertText = alert1.getText();
//				 if(alertText.contains("Incorrect OTP !!"))
//					{
//						System.out.println(alertText);
//						alert1.accept();
//						System.out.println("please Re-enter valid otp");
//						Thread.sleep(2000);
//						System.out.println("enter create subuser OTP");
//						String captc = scan.nextLine();
//						driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtOTP']")).sendKeys(captc);
//						Thread.sleep(2000);
//						driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnValidate']")).click();
//						Thread.sleep(2000);
//						alertResult="ok";
//						System.out.println(alertResult);
//					}
//				 else
//				 {
//					 alertResult="notok";
//					 System.out.println(alertResult);
//				 }
//			}
//			catch(Exception e)
//			{
//				 alertResult="ok";
//				 System.out.println(alertResult);
//			}
//			if(alertResult=="ok")
//			{
//				alertResult= driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]")).getText();
//				 if(alertResult.contains("Login ID"))
//				{
//					System.out.println("create sub user OTP verified succussfully ");
//				}
//				else
//				 {
//					System.out.println("create sub user OTP failed");
//				 }
//			}
//			else
//			{
//			  System.out.println("create sub user OTP failed ");
//			}
			   LocalDateTime myObj = LocalDateTime.now();
			    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ss");
			    String formattedDate = myObj.format(myFormatObj);

			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).sendKeys("KL" +formattedDate );
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnChkUserId']")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtUser']")).sendKeys("karthik");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDesignation']")).sendKeys("tester");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtMobileno']")).sendKeys("9014485523");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtMail']")).sendKeys("test@gmail.com");
			js.executeScript("window.scrollBy(0,2000)", "");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_add']")).click();

			Alert alert1 = driver.switchTo().alert();
			   String alertMessage1= driver.switchTo().alert().getText();
			alert1.accept();
			if(alertMessage1.contains("We have sent subuser OTP to your registered mobile number and mailid."))
			{
				System.out.println("Account created Successfully");

			}else
			{
				System.out.println("Sub user creation is not working");
			}
		}catch( org.openqa.selenium.NoAlertPresentException e)
		{

		}


	}

	public void Update_Subuser(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
	{
		WebElement e22 = driver.findElement(By.xpath("//span[contains(text(),'User Management')]"));
		js.executeScript("arguments[0].click();", e22);
		WebElement e23 = driver.findElement(By.xpath("//a[contains(text(),'Update Sub-User')]"));
		js.executeScript("arguments[0].click();", e23);
		Alert alert1 = driver.switchTo().alert();
		   String alertMessage1= driver.switchTo().alert().getText();
		alert1.accept();
		if(alertMessage1.contains("We have sent subuser OTP to your registered mobile number and mailid."))
		{
			System.out.println("update sub user OTP Sent succussfully ");

		}else
		{
			System.out.println("Error sending while OTP");
		}
		////
		//driver.switchTo().alert().accept();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter update user mang OTP");
		String captcha1 = scan1.nextLine();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtOTP']")).sendKeys(captcha1);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnValidate']")).click();
		Thread.sleep(2000);

		String Update = null;
		try
		{
			 Alert alert5 = driver.switchTo().alert();
		     Update = driver.switchTo().alert().getText();
			alert5.accept();
			System.out.println(Update);

		}catch (Exception e)
		{

			Update = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")).getText();

		}


		if (Update.contains("Login ID"))
		{
			System.out.println("update sub user OTP verified succussfully ");
		}else
		{
			if(Update.contains("Update"))
			{

				System.out.println("update sub user OTP is not verified  ");
			}
		}

		Select dropdown = new Select (driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")));
		dropdown.selectByValue("nictest2#nic2");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtMobileno']")).clear();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtMobileno']")).sendKeys("9014485523");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_Update']")).click();


		String text = null;


		try
		{
			 Alert alert5 = driver.switchTo().alert();
		     text = driver.switchTo().alert().getText();
			alert5.accept();
			System.out.println(text);
		}catch(Exception e)
		{

		}

		if(text.contains("Updated Successfully"))
		{
			System.out.println("OK");
		}else
		{
			System.out.println("NOTOK");
		}


		//Updated Successfully
	}
		public void SMS_Reg(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
		{
			driver.findElement(By.xpath("//button[contains(text(),'Okay')]")).click();
			driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/nav[1]/div[1]/ul[1]/li[7]/a[1]/i[2]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'For SMS')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_sendotpbtn']")).click();

			Scanner scan1 = new Scanner(System.in);
			System.out.println("enter SMS REG OTP");
			String captcha1 = scan1.nextLine();
			driver.findElement(By.xpath("//input[@id='txtotp']")).sendKeys(captcha1);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnverifyotp']")).click();
			Thread.sleep(2000);

			String SMS = null;
			try
			{
				 Alert alert1 = driver.switchTo().alert();
				 SMS = driver.switchTo().alert().getText();
				alert1.accept();
				System.out.println(SMS);

			}catch (Exception e)
			{
				SMS = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]")).getText();

			}


			if (SMS.contains("OTP Verified !!"))
			{
				System.out.println("SMS OTP verified succussfully ");
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/button[1]/span[1]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
			}else
			{


					System.out.println("SMS OTP is not verified  ");

			}
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//

		}

		public void Andriod_Reg(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();

			//driver.findElement(By.xpath("//button[contains(text(),'Okay')]")).click();
			driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/nav[1]/div[1]/ul[1]/li[7]/a[1]/i[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'For Mobile')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_sendotpbtn']")).click();

			Scanner scan2 = new Scanner(System.in);
			System.out.println("enter Mobile REG OTP");
			String captcha2 = scan2.nextLine();
			driver.findElement(By.xpath("//input[@id='txtotp']")).sendKeys(captcha2);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnverifyotp']")).click();
			Thread.sleep(2000);

			String Andriod = null;
			try
			{
				 Alert alert2 = driver.switchTo().alert();
				 Andriod = driver.switchTo().alert().getText();
				alert2.accept();
				System.out.println(Andriod);

			}catch (Exception e)
			{
				Andriod = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]")).getText();

			}


			if (Andriod.contains("IMEI Number"))
			{
				System.out.println("Mobile OTP verified succussfully ");
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
			}else
			{


					System.out.println("Mobile OTP is not verified  ");

			}
		}
		public void GSP_Reg(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
		{
			driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'For GSP')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_sendotpbtn']")).click();

			Scanner scan3 = new Scanner(System.in);
			System.out.println("enter GSP REG OTP");
			String captcha3 = scan3.nextLine();
			driver.findElement(By.xpath("//input[@id='txtotp']")).sendKeys(captcha3);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnverifyotp']")).click();
			Thread.sleep(2000);

			String GSP = null;
			try
			{
				 Alert alert2 = driver.switchTo().alert();
				 GSP = driver.switchTo().alert().getText();
				alert2.accept();
				System.out.println(GSP);

			}catch (Exception e)
			{
				GSP = driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceHolder1_lblgvtitle']")).getText();

			}


			if (GSP.contains("List of GSP/ERP Registered"))
			{
				System.out.println("GSP OTP verified succussfully ");
			}else
			{

					System.out.println("GSP OTP is not verified  ");

			}
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
		}


		@SuppressWarnings("resource")
		public void API_Reg(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'For API')]")).click();
			driver.findElement(By.xpath("//input[@id='sendotpbtn']")).click();
			Scanner scan4 = new Scanner(System.in);
			System.out.println("enter OTP");
			String API_OTP = scan4.nextLine();
			driver.findElement(By.xpath("//input[@id='txtotp']")).sendKeys(API_OTP);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnverifyotp']")).click();
			Thread.sleep(2000);

			String API = null;
			try
			{
				 Alert alert4 = driver.switchTo().alert();
				 API = driver.switchTo().alert().getText();
				alert4.accept();
				System.out.println(API);

			}catch (Exception e)
			{
				API = driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceHolder1_lblgvtitle']")).getText();

			}

			if (API.contains("List of API Registered"))
			{
				System.out.println("API OTP verified succussfully ");
			}else
			{

					System.out.println("API OTP is not verified  ");

			}
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
		}

		@SuppressWarnings("resource")
		public void Common_enrolled(WebDriver driver, JavascriptExecutor js, Actions actions) throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'CommonEnrolment')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnok']")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_otp']")).click();
			Alert alert1 = driver.switchTo().alert();
			   String alertMessage= driver.switchTo().alert().getText();
			alert1.accept();
			if(alertMessage.contains("OTP has been sent to your mobile no and mail Id, Please check and enter"))
			{
				System.out.println("Common enrolled OTP Sent succussfully ");

			}else
			{
				System.out.println(alertMessage);
			}
			Scanner scan2 = new Scanner(System.in);
			System.out.println("enter OTP");
			String CED_OTP = scan2.nextLine();
			driver.findElement(By.xpath("//input[@id='txt_OTPSMS']")).sendKeys(CED_OTP);
			driver.findElement(By.xpath("//input[@id='btn_ver_otpsms']")).click();
			Alert alert2 = driver.switchTo().alert();
			   String alertMessage1= driver.switchTo().alert().getText();
			alert2.accept();
			if(alertMessage1.contains("OTP has been sent to your mobile no and mail Id, Please check and enter"))
			{
				System.out.println("SMS OTP verified successfully");

			}else
			{
				System.out.println(alertMessage1);
			}

			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
		}

		@SuppressWarnings("resource")
		public void Update_txp_TRN(WebDriver driver, JavascriptExecutor js)
		{
			driver.findElement(By.xpath("//a[contains(text(),'As Transporter/Tax Payer')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_sendotpbtn']")).click();
			Scanner scan2 = new Scanner(System.in);
			System.out.println("enter OTP");
			String CED_OTP = scan2.nextLine();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtotp']")).sendKeys(CED_OTP);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnverifyotp']")).click();
			String text = null;

			try
			{
				Alert alert = driver.switchTo().alert();
				text = driver.switchTo().alert().getText();
				alert.accept();
				System.out.println(text);
			}catch (Exception e)
			{
				text = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")).getText();
				if (text.contains("Do you want to register as a transporter, so that you can generate e-way bill for your clients ?"))
				{
					System.out.println("Update txp TRN is working fine");
				} else {
					System.out.println("Update txp TRN is not working ");
				}
			}

		}
		public void TWO_Factor_Authentication(WebDriver driver, JavascriptExecutor js)
		{
	driver.findElement(By.xpath("//span[contains(text(),'2Factor Authentication')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Registration')]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnSandesReg']")).click();
	driver.findElement(By.xpath("//input[@id='btn_ver_otpsms']")).click();
	Alert alert = driver.switchTo().alert();
	   String alertMessage= driver.switchTo().alert().getText();
	alert.accept();
	if(alertMessage.contains("OTP sent.."))
	{
		System.out.println("SMS OTP verified successfully");

	}else
	{
		System.out.println(alertMessage);
	}
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_OtpTxt']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_BtnSubmit']")).click();
	Alert alert2 = driver.switchTo().alert();
	String alertMessage1= driver.switchTo().alert().getText();
	alert2.accept();
	if(alertMessage1.contains("Successfully Registered for 2 Factor Authentication"))
	{
		System.out.println("SMS OTP verified successfully");

	}else
	{
		System.out.println(alertMessage1);
	}
		}

		public void Cons_ewb_Gen(WebDriver driver, JavascriptExecutor js,Actions actions) throws InterruptedException
		{
			Thread.sleep(2000);
			WebElement e26 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[9]/div[1]/div[1]/div[1]/button[1]"));
			js.executeScript("arguments[0].click();", e26);
			driver.findElement(By.xpath("//span[contains(text(),'Consolidated EWB')]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/nav[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
			driver.findElement(By.xpath("//input[@id='txt_fromplc']")).sendKeys("Kurnool");
			driver.findElement(By.xpath("//input[@id='txt_vhicl']")).sendKeys("AP01hs1234");
			WebElement Q3 = driver.findElement(By.xpath("//input[@id='txt_ewbno']"));
			actions.moveToElement(Q3).click().build().perform();
			actions.keyDown(Keys.CONTROL);
		    actions.sendKeys("v");
		    actions.keyUp(Keys.CONTROL);
		    actions.build().perform();
		    driver.findElement(By.xpath("//input[@id='txt_ewbno']")).sendKeys(Keys.TAB);
		    Thread.sleep(2000);
	    	WebElement e22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[8]"));
	    	js.executeScript("arguments[0].click();", e22);
	    	Thread.sleep(3000);
	    	WebElement e23 = driver.findElement(By.xpath("//tbody/tr[3]/td[8]/span[1]/button[1]/i[1]"));
	    	js.executeScript("arguments[0].click();", e23);
			driver.findElement(By.xpath("//button[@id='btnsbmt']")).click();
			Thread.sleep(3000);
		    WebElement e12 =  driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]"));
		    actions.moveToElement(e12).doubleClick().build().perform();
		    actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("c");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	    	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); // Home//
		}




		private Alert findElement(By xpath) {
			// TODO Auto-generated method stub
			return null;
		}

	}


