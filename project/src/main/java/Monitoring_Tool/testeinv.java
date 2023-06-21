package Monitoring_Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testeinv {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://einvoice1.gst.gov.in/");
			System.out.println("Application opened");
			driver.manage().window().maximize();
			WebElement e1 = driver.findElement(By.xpath("//button[@id='btnLogin']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", e1);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("nictest2");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("Abc123@@");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id= 'CaptchaCode']")).sendKeys("MSAVK");
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/button[1]")).click();
			driver.navigate().refresh();


			WebElement e11 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
			js.executeScript("arguments[0].click();", e11);
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
			Thread.sleep(1000);
			WebElement upload_file = driver.findElement(By.xpath("//input[@id='JsonFile']"));
			  upload_file.sendKeys("C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice.json");
				Thread.sleep(1000);
			  driver.findElement(By.xpath("//input[@id='uploadBtn']")).click();
			  String str = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
			  if(str.contains("0"))
			  {
			  	System.out.println("IRN Generates failed");
			  	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //

			  }else
			  {
			  	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
			  	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[2]")).click();
			  	  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[3]")).click();
			  	  System.out.println("IRN Generated Successfully");
			  	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //


			  	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/a[1]")).click();
				  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[9]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
				  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[4]/div[2]/input[3]")).click();
				  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[4]/div[5]/button[1]")).click();
				  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/button[1]")).click();
				  driver.findElement(By.xpath("//input[@id= 'valtranid']")).sendKeys( "29BZNPM9430M1ZH");
				  driver.findElement(By.xpath("//input[@id='valdis']")).sendKeys("0");
				  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[5]/div[3]/div[1]/input[1]")).click();
				  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[5]/div[4]/div[1]")).click();
				  driver.findElement(By.xpath("//input[@id='vehNo']")).sendKeys("AP01HS1234");
				  driver.findElement(By.xpath("//input[@id='trandocnoval']")).sendKeys("12345");
				  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
				  Thread.sleep(5000);
				  System.out.println("eWaybill generate Successfully"); //EWB Generate//

					driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //


					WebElement e12 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
					js.executeScript("arguments[0].click();", e12);
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
					Thread.sleep(1000);
					WebElement upload_file1 = driver.findElement(By.xpath("//input[@id='JsonFile']"));
					  upload_file.sendKeys("C:/Users/DELL/Desktop/WorkSpace/Selenium/All Zones JSON/e_Invoice_ewb.json");
						Thread.sleep(1000);
					  driver.findElement(By.xpath("//input[@id='uploadBtn']")).click();

					  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //

					  Actions actions = new Actions(driver);
						driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
						driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
						driver.findElement(By.xpath("//button[@id='btngo']")).click();
					    WebElement e123 =  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[10]"));
					    actions.moveToElement(e123).doubleClick().build().perform();
					    actions.keyDown(Keys.CONTROL);
			            actions.sendKeys("c");
			            actions.keyUp(Keys.CONTROL);
			            actions.build().perform();
			            Thread.sleep(1000);

			      	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //


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
						js.executeScript("arguments[0].click();", Q4);

						  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click(); //Home button //

			  }



			  }

    }
