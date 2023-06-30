package Einvoice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Einvoice_modules {
	ArrayList<String> check =new ArrayList<String>() ;


	 boolean sucs=false;

	@Test

	public void AlertTest(WebDriver driver)
	{try
	{
		boolean condition = true;
		if(condition)
		{
			Alert alert =driver.switchTo().alert();
			alert.dismiss();
		}else
		{
			driver.findElement(By.xpath("//a[contains(text(),'Exit')]")).click();
		}


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
	public void CreateJSON(String path1 ) throws FileNotFoundException, IOException, ParseException
	{
	
		// Current date and time
		//System.out.println(path1);
				LocalDateTime myObj1 = LocalDateTime.now();
				DateTimeFormatter datetime = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
				String presenttime = myObj1.format(datetime);


		          // Read the JSON file and update the Parameter //
				JSONParser parser = new JSONParser();
				JSONArray a = (JSONArray) parser.parse(new FileReader(path1));
				JSONObject person = null ;
				  for (Object o : a)
				  {
			        person = (JSONObject) o;
				//    System.out.println(" test " + person.toString());
				  }
				  JSONObject employeeObject = (JSONObject) person.get("DocDtls");
				  String firstName = (String) employeeObject.get("No");
		        //  System.out.println(firstName);
				  String plainPayload = person.toJSONString();
				  plainPayload=plainPayload.replace(firstName,"N"+presenttime);
				 // System.out.println(plainPayload);
				  String jsonString = "["+plainPayload.toString()+"]";
				  FileWriter file = new FileWriter(path1);
				  file.write(jsonString);
				  file.close();

	}

	  public void BulkIRNTest(String path , WebDriver driver) throws InterruptedException
		{
		  try
		  {

			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  
				WebElement e1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
				js.executeScript("arguments[0].click();", e1);
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
				Thread.sleep(1000);
				WebElement upload_file = driver.findElement(By.xpath("//input[@id='JsonFile']"));
				  upload_file.sendKeys(path);
					Thread.sleep(1000);
				  driver.findElement(By.xpath("//input[@id='uploadBtn']")).click();
Thread.sleep(5000);

String str = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
if(str.contains("0"))
{
	sucs=false;
	System.out.println("IRN Generates failed");

}else
{

	sucs=true;
	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[2]")).click();
	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[3]")).click();
	  System.out.println("IRN Generated Successfully");
//	    Actions actions = new Actions(driver);
//	  WebElement e12 =  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[8]"));
//	    actions.moveToElement(e12).doubleClick().build().perform();
//	    actions.keyDown(Keys.CONTROL);
//        actions.sendKeys("c");
//        actions.keyUp(Keys.CONTROL);
//        actions.build().perform();
//        Thread.sleep(1000);


}check.add(String.valueOf(sucs));

}catch (org.openqa.selenium.NoSuchElementException e)
{
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //
}
		  catch (org.openqa.selenium.UnhandledAlertException e)
		  {
			  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //
		  }
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
	sucs=false;
	System.out.println("IRN Generates failed");

}else
{
	sucs=true;

	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[3]")).click();
	  Thread.sleep(2000);
	  System.out.println("IRN Generated Successfully");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,2000)", "");
	  WebElement e12 =  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[8]"));
	  Actions actions = new Actions(driver); 
	  actions.moveToElement(e12).doubleClick().build().perform();
	    actions.keyDown(Keys.CONTROL);
      actions.sendKeys("c");
      actions.keyUp(Keys.CONTROL);
      actions.build().perform();
      Thread.sleep(1000);
      

}check.add(String.valueOf(sucs));

}catch (org.openqa.selenium.NoSuchElementException e)
{
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //
}
		  catch (org.openqa.selenium.UnhandledAlertException e)
		  {
			  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //
		  }
}

	  public void CopyIRNTest(WebDriver driver) throws InterruptedException
		{
		  try
		  {
			    Actions actions = new Actions(driver);
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
			    Thread.sleep(2000);
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



	  public void EwaybillTest(String dist, WebDriver driver) throws InterruptedException
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


	  public void HomeButtonTest( WebDriver driver)
		{
			  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //
		}


	  public void LogOutTest(WebDriver driver)
		{
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[1]/i[1]")).click();

		}



	  public void Login(String id, String pwd,String cap , WebDriver driver , String Zone ) throws InterruptedException
		{
		  try
		  {
			  boolean sucs=false;
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

				//System.out.print(w1);
			if ( w1.contains("Dash Board"))
			{
				System.out.println(Zone + "  login Successfully");
				 sucs=true;
			}else
			{
				  sucs=false;
			}check.add(String.valueOf(sucs));
		  }catch(Exception e)
		  {
			  System.out.println("Login failed ");
		  }

		Thread.sleep(1000);

	//	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]")).click();
	//	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		  Thread.sleep(1000);
	//	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
	//	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
		}



	  @SuppressWarnings("unused")
	public void PasteCNLIRNTest(WebDriver driver, Actions actions ) throws InterruptedException
		{
		  try
		  {
//			  boolean sucs=false;
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
				String abc = null;
			try
				{
				abc = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/h3[1]/span[1]")).getText();
				//System.out.println(abc);
				}
				catch(Exception e)
				{

				abc= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]")).getText();
				//System.out.println(abc);
				}
					if(abc.contains("BZNPM9430M"))
					{

						driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/textarea[1]")).sendKeys("test");
						WebElement Q4 = driver.findElement(By.xpath("//button[@id='btnSubmit']"));
						Thread.sleep(2000);
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("arguments[0].click();", Q4);
						String Cancel = null;
						try
						{
							Cancel = driver.findElement(By.cssSelector("#btnDownload")).getText();
							System.out.println(Cancel);
							if(Cancel.contains("Download Response Json"))
							{
								System.out.println("IRN Cancellation is working fine");
								sucs=true;
							}
							else
							{
								driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
								System.out.println("IRN Cancellation is not working");
								sucs=false;
							}
						}catch(Exception e)
						{
							Cancel = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]")).getText();
						}
			
			}
					else
			{

				if(abc.contains("Error Details"))
				{

					System.out.println("IRN Cancellation is not working");
					sucs=false;
				}

			}check.add(String.valueOf(sucs));

		  }

				catch(Exception e)
		  {

		  }


		}




  @BeforeTest
  public WebDriver beforeTest(String driverPath, String baseUrl ) {

	  System.setProperty("webdriver.chrome.driver", driverPath);
	  ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
	  driver.get(baseUrl);
	  System.out.println("Application opened");
	  driver.manage().window().maximize();
	  return driver;
  }



	@Test
	 public WebDriver Refresh( WebDriver driver ) { // TODO Auto-generated method
		driver.navigate().refresh();
		  return driver;

	}


}
