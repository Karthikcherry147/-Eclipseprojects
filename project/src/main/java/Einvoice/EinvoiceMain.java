package Einvoice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;



public class EinvoiceMain {
	@SuppressWarnings({ "unused", "deprecation" })
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException, ParseException {
		 String baseUrl = "https://einvoice1.gst.gov.in/";
		String driverPath = "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe";

		Einvoice_modules e = new Einvoice_modules();
		WebDriver driver =e.beforeTest(driverPath, baseUrl);
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);


try
{
	boolean z1=Zones("1","nictest2","Abc123@@","MSAVK","C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\All Zones JSON\\e_Invoice_2020.json","C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\All Zones JSON\\e_Invoice_2020.json",driver,actions, "Zone1");

if(z1 == true)
{
	System.out.println("ZONE 1 is working fine");
}else
{
	System.out.println("ZONE 1 is not working ");
}
}
catch (org.openqa.selenium.NoSuchElementException ex1) {

}


try
{
	boolean z2 =Zones("2","nictest27","Abc123@@","MSAVK","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_02.json","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_ewb_02.json",driver,actions,  "Zone2");
	if(z2 == true)
	{
		System.out.println("ZONE 2 is working fine");
	}else
	{
		System.out.println("ZONE 2 is not working ");
	}

}

catch (org.openqa.selenium.NoSuchElementException ex2) {

}

try
{
	boolean z3=Zones("3","nictest_hr","Abc123@@","MSAVK","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_03.json","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_ewb_03.json",driver,actions,  "Zone3");
	if(z3 == true)
	{
		System.out.println("ZONE 3 is working fine");
	}else
	{
		System.out.println("ZONE 3 is not working ");
	}
}
catch (org.openqa.selenium.NoSuchElementException ex3) {

}

try
{
	boolean z4=Zones("4","nictest_up","Abc123@@","MSAVK","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_04.json","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_ewb_04.json",driver,actions, "Zone4");
	if(z4 == true)
	{
		System.out.println("ZONE 4 is working fine");
	}else
	{
		System.out.println("ZONE 4 is not working ");
	}

}
catch (org.openqa.selenium.NoSuchElementException ex4) {

}

try
{
	boolean z5=Zones("5","nickar32","Abc123@@","MSAVK","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_05.json","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_ewb_05.json",driver,actions,"Zone5");

	if(z5 == true)
	{
		System.out.println("ZONE 5 is working fine");
	}else
	{
		System.out.println("ZONE 5 is not working ");
	}}

catch (org.openqa.selenium.NoSuchElementException ex5) {

}

try
{
boolean z6=Zones("6","nictest_mp","Abc123@@","MSAVK","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_06.json","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_ewb_06.json",driver,actions, "Zone6");
if(z6 == true)
{
	System.out.println("ZONE 6 is working fine");
}else
{
	System.out.println("ZONE 6 is not working ");
}
}
catch (org.openqa.selenium.NoSuchElementException ex6) {

}

try
{
boolean z7=Zones("7","nictest_rj","Abc123@@","MSAVK","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_07.json","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_ewb_07.json",driver,actions, "Zone7");
if(z7 == true)
{
	System.out.println("ZONE 7 is working fine");
}else
{
	System.out.println("ZONE 7 is not working ");
}
}
catch (org.openqa.selenium.NoSuchElementException ex7) {

}
try
{
boolean z8=Zones("8","nictest_wb","Abc123@@","MSAVK","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_08.json","C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_ewb_08.json",driver,actions, "Zone8");
if(z8 == true)
{
	System.out.println("ZONE 8 is working fine");
}else
{
	System.out.println("ZONE 8 is not working ");
}
}
catch (org.openqa.selenium.NoSuchElementException ex8) {

}
	}



	public static boolean Zones(String id,String user,String pswd,String cap, String path1,String path2, WebDriver driver,Actions actions, String Zone ) throws InterruptedException, FileNotFoundException, IOException, ParseException
	{

		boolean Success =  false;
		Einvoice_modules e = new Einvoice_modules();
		e.Login(user,pswd,cap,driver, Zone);
		e.Refresh(driver);
		e.CreateJSON(path1);
		e.BulkIRNTest(path1, driver);
	    e.HomeButtonTest(driver);
		e.EwaybillTest("0", driver);
		e.AlertTest(driver);
		e.HomeButtonTest(driver);
		Thread.sleep(5000);
		e.CreateJSON(path1);
		e.BulkIRN(path1, driver);
		e.HomeButtonTest(driver);
	//	e.CopyIRNTest(driver);
	//	e.HomeButtonTest(driver);
		e.PasteCNLIRNTest(driver, actions);
		e.LogOutTest(driver);

		 String flag = null;
		for(int i=0;i<e.check.size(); i++)
			{
				if(e.check.get(i)== "true")
				{
					flag="ok";
				}
				else
				{
					flag="notok";
					break;
				}
			};
		if(flag == "ok")
		{
			Success =  true;
		}else
		{
			Success =  false;
		}

		return Success;


	}

}
