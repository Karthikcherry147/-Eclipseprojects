package Einvoice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Einv_Web_modules {
	ArrayList<String> check =new ArrayList<String>() ;
	 String flag ;

	@SuppressWarnings("unused")
	public void taxpyer_search(WebDriver driver) throws InterruptedException
	{
		driver.get("https://einvoice1.gst.gov.in/Others/TaxpayerSearch");
		//driver.findElement(By.xpath("//header/div[@id='lower-header']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Tax Payer / GSTIN')]")).click();
		driver.findElement(By.xpath("//input[@id='txtGstin']")).sendKeys("29AAACJ4323N1ZC");
		driver.findElement(By.xpath("//input[@id='txtCaptchaCode']")).sendKeys("MSAVK");
                driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();

String str = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]")).getText();

if(str.contains("JSW STEEL LTD"))
{
	
	driver.findElement(By.xpath("//button[contains(text(),'Update from GST Common Portal')]")).click();
	Alert alert = driver.switchTo().alert();
	String alertMessage = driver.switchTo().alert().getText();
	alert.accept();
	Thread.sleep(2000);
	String alertMessage1 = driver.switchTo().alert().getText();
	alert.accept();
	
	if(alertMessage1.contains("Updated successfully"))
	{
		System.out.println("Taxpayer profile is Working");
	}else
	{
		System.out.println("Taxpayer profile is not Working ");
	}
}
else
{
	System.out.println("Taxpayer profile is not Working");
}

	}

	public void Einvoice_eligible_Status(WebDriver driver) throws InterruptedException
	{
		driver.get("https://einvoice1.gst.gov.in/Others/EinvEnabled");
		//driver.findElement(By.xpath("//header/div[@id='lower-header']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[contains(text(),'e-Invoice Status of Taxpayer')]")).click();
		driver.findElement(By.xpath("//input[@id='txtGstin']")).sendKeys("29AAACJ4323N1ZC");
		driver.findElement(By.xpath("//input[@id='txtCaptchaCode']")).sendKeys("MSAVK");
driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();
String str = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[4]")).getText();

if(str.contains("This taxpayer is enabled for e-Invoicing as his/her Aggregate Annual Turnover(AATO) is above Rs 500 Crores"))
{
	System.out.println("Einvoice Status is Working");

}
else
{
	System.out.println("Einvoice Status is not Working");
}


	}


	public void Verify_Signed_invoice(WebDriver driver,JavascriptExecutor js, String path) throws InterruptedException
	{
		driver.get("https://einvoice1.gst.gov.in/Others/VSignedInvoice");
		//driver.findElement(By.xpath("//header/div[@id='lower-header']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Verify Signed Invoice')]")).click();
		WebElement upload_file = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		js.executeScript("arguments[0].click();", upload_file);
		  upload_file.sendKeys(path);
		  driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

		  String str = driver.findElement(By.xpath("//p[contains(text(),'Digital Signature Certificate Details')]")).getText();

		  if(str.contains("Digital Signature Certificate"))
		  {
		  	System.out.println("Verify Signed JSON is working");

		  }
		  else
		  {
		  	System.out.println("Verify Signed JSON is not working");
		  }
	}

	public void Product_and_Services(WebDriver driver,JavascriptExecutor js) throws InterruptedException
	{

		driver.get("https://einvoice1.gst.gov.in/Others/Product");
		//driver.findElement(By.xpath("//header/div[@id='lower-header']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Products & Services')]")).click();
		driver.findElement(By.xpath("//input[@id='txtGstin']")).sendKeys("1001");
		driver.findElement(By.xpath("//input[@id='txtCaptchaCode']")).sendKeys("MSAVK");
		driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();
		String str = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
		if(str.contains("WHEAT AND MESLIN "))
		{
			System.out.println("Products & Services is working fine");
		}else
		{
			System.out.println("Products & Services is not working");
		}


	}

	@SuppressWarnings("unused")
	public void Master_Codes(WebDriver driver,JavascriptExecutor js) throws InterruptedException
	{

		boolean sucs=false;
		driver.get("https://einvoice1.gst.gov.in/Others/MasterCodes");
		//driver.findElement(By.xpath("//header/div[@id='lower-header']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Master Codes')]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/input[1]")).click();
	String str = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
	if(str.contains("JAMMU AND KASHMIR"))
	{
		sucs = true;
	}else
	{
		sucs=false;
	} check.add(String.valueOf(sucs));
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/input[2]")).click();
	Select dropdown = new Select (driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[5]/form[1]/div[1]/div[2]/select[1]")));
	dropdown.selectByValue("72");
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[5]/form[2]/div[1]/div[2]/input[1]")).sendKeys("MSAVK");
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[5]/form[2]/div[2]/div[1]/button[1]")).click();
	String str1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
	if(str1.contains("PIG IRON AND SPIEGELEISEN IN PIGS"))
	{
		sucs = true;
	}else
	{
		sucs=false;
	} check.add(String.valueOf(sucs));
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/input[3]")).click();
	String str2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
	if(str2.contains("Andorra"))
	{
		sucs = true;
	}else
	{
		sucs=false;
	} check.add(String.valueOf(sucs));

	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/input[4]")).click();
	String str3 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
	if(str3.contains("Alibag"))
	{
		sucs = true;
	}else
	{
		sucs=false;
	} check.add(String.valueOf(sucs));
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/input[5]")).click();
	String str4 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
	if(str4.contains("Bangladeshi taka"))
	{
		sucs = true;
	}else
	{
		sucs=false;
	} check.add(String.valueOf(sucs));
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/input[6]")).click();
	String str5 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[6]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
	if(str5.contains("BAGS"))
	{
		sucs = true;
	}else
	{
		sucs=false;
	} check.add(String.valueOf(sucs));
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/input[7]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[7]/form[1]/div[2]/div[2]/input[1]")).sendKeys("MSAVK");
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[7]/form[1]/div[3]/div[1]/button[1]")).click();
	String str6 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[7]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")).getText();
	if(str6.contains("0.000"))
	{
		sucs = true;
	}else
	{
		sucs=false;
	} check.add(String.valueOf(sucs));

	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[3]/div[1]/input[8]")).click();
	Select dropdown1 = new Select (driver.findElement(By.xpath("//select[@id='ddlStatelist']")));
	dropdown1.selectByValue("29");
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[8]/form[2]/div[1]/div[2]/input[1]")).sendKeys("MSAVK");
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/div[8]/form[2]/div[2]/div[1]/button[1]")).click();

	for(int i=0;i<check.size(); i++)
	{
		if(check.get(i)== "true")
		{
			flag="ok";
		}
		else
		{
			flag="notok";
			break;
		}
	};
if (flag=="ok")
{


  System.out.println("Master is working fine");
}else
{


  System.out.println("Master is not working");
}
	}
@SuppressWarnings("rawtypes")
public void GSP_ERP_List(WebDriver driver,JavascriptExecutor js) throws InterruptedException
{

	driver.get("https://einvoice1.gst.gov.in/Others/GSPSLIST");
	//driver.findElement(By.xpath("//header/div[@id='lower-header']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[contains(text(),'GST Suvidha Providers / ERPs')]")).click();
	List rows = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
	if (rows.size()>=5)
	{
		System.out.println("GSP_ERP list is working fine");

	}else
	{
		System.out.println("GSP_ERP list is not working");
	}
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
}


public void Pincode(WebDriver driver,JavascriptExecutor js) throws InterruptedException
{

	driver.get("https://einvoice1.gst.gov.in/Others/PincodeSearch");
	//driver.findElement(By.xpath("//header/div[@id='lower-header']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//a[contains(text(),'Pincode')]")).click();
	driver.findElement(By.xpath("//input[@id='txtGstin']")).sendKeys("560009");
	driver.findElement(By.xpath("//input[@id='txtCaptchaCode']")).sendKeys("MSAVK");
	driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();
	String str = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[1]")).getText();
	if(str.contains("560009"))
	{
		System.out.println("Pincode is working fine");
	}else
	{
		System.out.println("Pincode is not working");
	}
}

public void Pin_pin(WebDriver driver,JavascriptExecutor js) throws InterruptedException
{
	driver.get("https://einvoice1.gst.gov.in/Others/GetPinCodeDistance");
	//driver.findElement(By.xpath("//header/div[@id='lower-header']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[contains(text(),'Pin to Pin Distance')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='FromPincode']")).sendKeys("518001");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ToPincode']")).sendKeys("560009");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='txtCaptchaCode']")).sendKeys("MSAVK");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();
	String str = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[1]")).getText();
	if(str.contains("518001"))
	{
		System.out.println("Pin to Pin is working fine");
	}else
	{
		System.out.println("Pin to Pin is not working");
	}

}

public void einvocie_Registration(WebDriver driver,JavascriptExecutor js)throws InterruptedException
{

	driver.get("https://einvoice1.gst.gov.in/Others/GSTINsGeneratingIRN");
	//driver.findElement(By.xpath("//header/div[@id='lower-header']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Portal Login')]")).click();
	driver.findElement(By.xpath("//input[@id='txtGstin']")).sendKeys("01BZNPM9430M1KL");
    driver.findElement(By.xpath("//input[@id='txtCaptchaCode']")).sendKeys("MSAVK");
    driver.findElement(By.xpath("//button[@id='btngo']")).click();
    js.executeScript("window.scrollBy(0,2000)", "");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@id='btnSendOPT']")).click();
	Alert alert =driver.switchTo().alert();
	alert.dismiss();
	js.executeScript("window.scrollBy(0,2000)", "");
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("enter OTP");
	String OTP = scan.nextLine();
	driver.findElement(By.xpath("//input[@id='txtOtp']")).sendKeys(OTP);
	driver.findElement(By.xpath("//button[@id='btnVerifyOTP']")).click();
	Alert alert1 =driver.switchTo().alert();
	alert1.dismiss();
	driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("nictest_jk");
	driver.findElement(By.xpath("//input[@id='txtForgotPassword']")).sendKeys("Abc123@@");
	driver.findElement(By.xpath("//input[@id='txtConfirmPassword']")).sendKeys("Abc123@@");
	driver.findElement(By.xpath("//button[@id='btnSave']")).click();
	Alert alert2 =driver.switchTo().alert();
	alert2.dismiss();

}

public void einvocie_enable(WebDriver driver,JavascriptExecutor js)throws InterruptedException
{
	driver.findElement(By.xpath("//header/div[@id='lower-header']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
	Thread.sleep(2000);
	WebElement q1 = driver.findElement(By.xpath("//a[contains(text(),'e-Invoice Enablement')]"));
	js.executeScript("arguments[0].click();", q1);
	driver.findElement(By.xpath("//input[@id='txtGstin']")).sendKeys("01BZNPM9430M1KL");
	driver.findElement(By.xpath("//input[@id='txtCaptchaCode']")).sendKeys("MSAVK");
	driver.findElement(By.xpath("//button[@id='btngo']")).click();
	js.executeScript("window.scrollBy(0,2000)", "");
	driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/form[2]/div[10]/label[1]")).click();
	driver.findElement(By.xpath("//button[@id='btnSendOPT']")).click();
	Alert alert =driver.switchTo().alert();
	alert.dismiss();
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("enter OTP");
	String OTP = scan.nextLine();
	driver.findElement(By.xpath("//input[@id='txtOtp']")).sendKeys(OTP);
	driver.findElement(By.xpath("//button[@id='btnVerifyOTP']")).click();
	Alert alert1 =driver.switchTo().alert();
	alert1.dismiss();
	js.executeScript("window.scrollBy(0,4000)", "");
    Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='btnSave']")).click();
	Alert alert2 =driver.switchTo().alert();
	alert2.dismiss();

}

public void forgot_Username(WebDriver driver,JavascriptExecutor js) throws InterruptedException
{
	try
	{
		driver.get("https://einvoice1.gst.gov.in/Home/ForgotUserName");
		//driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(text(),'Forgot Username ?')]")).click();
		//driver.findElement(By.xpath("	https://einv-apisandbox.nic.in/einv_web_test/Home/ForgotUserName")).click();

		driver.findElement(By.xpath("//body/div[2]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("37BZNPM9430M1KL");
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/input[1]")).sendKeys("9014485523");
		driver.findElement(By.xpath("//input[@id='txtCaptchaCode']")).sendKeys("MSAVK");
		driver.findElement(By.xpath("//button[@id='btngo']")).click();
		Alert alert =driver.switchTo().alert();
		alert.dismiss();
		 Thread.sleep(2000);
	}catch(org.openqa.selenium.NoAlertPresentException e)
	{
		driver.findElement(By.xpath("//a[contains(text(),'Exit')]")).click();
	}

}

public void forgot_password(WebDriver driver,JavascriptExecutor js) throws InterruptedException
{
	try
	{

		driver.get("https://einvoice1.gst.gov.in/Home/ForgotUserPwd");
	//	driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//a[contains(text(),'Forgot Password ?')]")).click();

		//driver.findElement(By.xpath("	https://einv-apisandbox.nic.in/einv_web_test/Home/ForgotUserName")).click();
		driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("nictest2");
		driver.findElement(By.xpath("//input[@id='txtGstin']")).sendKeys("37BZNPM9430M1KL");
		driver.findElement(By.xpath("//input[@id='txtCaptchaCode']")).sendKeys("MSAVK");
		driver.findElement(By.xpath("//input[@id='txtRegMobile']")).sendKeys("9014485523");
		driver.findElement(By.xpath("//button[@id='btnSendOTP']")).click();
		Alert alert =driver.switchTo().alert();
		alert.dismiss();
		   Thread.sleep(2000);
		   @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("enter OTP");
			String OTP = scan.nextLine();
			driver.findElement(By.xpath("//input[@id='txtOtp']")).sendKeys(OTP);
		    driver.findElement(By.xpath("//button[@id='btnVerifyOTP']")).click();
			Alert alert1 =driver.switchTo().alert();
			alert1.dismiss();
			driver.findElement(By.xpath("//input[@id='txtForgotPassword']")).sendKeys("Abc123@@");
			driver.findElement(By.xpath("//input[@id='txtConfirmPassword']")).sendKeys("Abc123@@");
			driver.findElement(By.xpath("//button[@id='btnSave']")).click();
			Alert alert2 =driver.switchTo().alert();
			alert2.accept();

	}catch (org.openqa.selenium.NoSuchElementException e)
	{

	}catch(org.openqa.selenium.NoAlertPresentException e)
	{

	}


}

public void Login(String id, String pwd,String cap , WebDriver driver ) throws InterruptedException
		{
		  try
		  {
			  try
			  {
				  JavascriptExecutor js = (JavascriptExecutor) driver;
					WebElement e1 = driver.findElement(By.xpath("//button[@id='btnLogin']"));
					js.executeScript("arguments[0].click();", e1);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys(id);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys(pwd);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@id= 'CaptchaCode']")).sendKeys(cap);
					driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/button[1]")).click();
					String w1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/h4[1]")).getText();

					System.out.print(w1);
				if ( w1.contains("Dash Board"))
				{
					System.out.println("login Successfully");
				}else
				{

				}
			  }catch(Exception e)
			  {
				  Alert alert =driver.switchTo().alert();
					alert.accept();
					Thread.sleep(2000);
					 LocalDateTime myObj = LocalDateTime.now();
					    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyMMdd");
					    String formattedDate = myObj.format(myFormatObj);
								
					driver.findElement(By.id("txtOtp")).sendKeys(formattedDate);
					Thread.sleep(500);
					driver.findElement(By.id("btnVerifyOTP")).click();
			  }

			 
		  }catch(Exception e)
		  {
			  System.out.println("Login failed ");
			  
			  
			  
		  }

		Thread.sleep(1000);
		}


public void CreateJSON() throws FileNotFoundException, IOException, ParseException
{
	// Current date and time
			LocalDateTime myObj1 = LocalDateTime.now();
			DateTimeFormatter datetime = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			String presenttime = myObj1.format(datetime);


	          // Read the JSON file and update the Parameter //
			JSONParser parser = new JSONParser();
			JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\All Zones JSON\\e_Invoice_2020.json"));
			JSONObject person = null ;
			  for (Object o : a)
			  {
		        person = (JSONObject) o;
			   // System.out.println(" test " + person.toString());
			  }
			  JSONObject employeeObject = (JSONObject) person.get("DocDtls");
			  String firstName = (String) employeeObject.get("No");
	         // System.out.println(firstName);
			  String plainPayload = person.toJSONString();
			  plainPayload=plainPayload.replace(firstName,"N"+presenttime);
			 // System.out.println(plainPayload);
			  String jsonString = "["+plainPayload.toString()+"]";
			  FileWriter file = new FileWriter("C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\All Zones JSON\\e_Invoice_2020.json" );
			  file.write(jsonString);
			  file.close();

}

public void BulkIRN(String path , WebDriver driver) throws InterruptedException
	{
	  try
	  {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement e1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
			js.executeScript("arguments[0].click();", e1);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
			Thread.sleep(2000);
			WebElement upload_file = driver.findElement(By.xpath("//input[@id='JsonFile']"));
			  upload_file.sendKeys(path);
				Thread.sleep(2000);
			  driver.findElement(By.xpath("//input[@id='uploadBtn']")).click();
Thread.sleep(5000);

String str = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
if(str.contains("0"))
{
System.out.println("IRN Generates failed");

}else
{
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[2]")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[3]")).click();
System.out.println("IRN Generated Successfully");

}

}catch (org.openqa.selenium.NoSuchElementException e)
{
driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //
}
	  catch (org.openqa.selenium.UnhandledAlertException e)
	  {
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //
	  }
}

public void Ewaybill(String dist, WebDriver driver) throws InterruptedException
	{
	  try
	  {
		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/a[1]")).click();
		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[4]/div[2]/input[3]")).click();
		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[4]/div[5]/button[1]")).click();

		  List rows = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));

		  String rows1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[last()]/td[2]")).getText();

		//  System.out.println(rows1);

		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[4]/div[2]/input[2]")).click();
		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[4]/div[4]/input[1]")).sendKeys(rows1);
		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[4]/div[4]/button[1]")).click();

		  driver.findElement(By.xpath("//input[@id= 'valtranid']")).sendKeys( "37ARZPT4384Q1MT");
		  driver.findElement(By.xpath("//input[@id='valdis']")).sendKeys(dist);
		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[5]/div[3]/div[1]/input[1]")).click();
		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[5]/div[4]/div[1]")).click();
		  driver.findElement(By.xpath("//input[@id='vehNo']")).sendKeys("AP01HS1234");
		  driver.findElement(By.xpath("//input[@id='trandocnoval']")).sendKeys("12345");
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(5000);
		//  System.out.println("eWaybill generate Successfully"); //EWB Generate//

	  }catch (org.openqa.selenium.NoSuchElementException e)
	  {

		}
				  catch (org.openqa.selenium.UnhandledAlertException e)
				  {

				  }
	  catch (org.openqa.selenium.NoAlertPresentException e)
	  {

	  }

}
public void CopyIRNTest(WebDriver driver) throws InterruptedException
{
  try
  {
	    Actions actions = new Actions(driver);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//button[@id='btngo']")).click();
	    WebElement e12 =  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[10]"));
	    actions.moveToElement(e12).doubleClick().build().perform();
	    actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        Thread.sleep(1000);
  }catch(Exception e)
  {

  }

}
public void PasteCNLIRNTest(WebDriver driver, Actions actions ) throws InterruptedException
{
  try
  {
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/input[2]")).click();
		WebElement Q3 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[3]/div[3]/input[1]"));
		actions.moveToElement(Q3).click().build().perform();
		actions.keyDown(Keys.CONTROL);
	    actions.sendKeys("v");
	    actions.keyUp(Keys.CONTROL);
	    actions.build().perform();
		driver.findElement(By.xpath("//body/div[2]/div[2]/form[1]/div[1]/div[3]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/textarea[1]")).sendKeys("test");
		WebElement Q4 = driver.findElement(By.xpath("//button[@id='btnSubmit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Q4);
		//System.out.println("IRN Cancelled Successfully");
  }catch(Exception e)
  {

  }


}
	public void AlertTest(WebDriver driver)
	{
			Alert alert =driver.switchTo().alert();
			alert.dismiss();
	}

	 public void HomeButton( WebDriver driver)
		{
			  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click(); //Home button //
		}

	 public WebDriver Refresh( WebDriver driver ) { // TODO Auto-generated method
			driver.navigate().refresh();
			  return driver;
	 }

	 public void Quit(WebDriver driver) {
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[1]/i[1]")).click();
	 }
		public void Home_In(WebDriver driver) {
			 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
			 }
}
