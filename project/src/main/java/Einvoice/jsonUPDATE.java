package Einvoice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class jsonUPDATE {

	@SuppressWarnings({ "unused", "deprecation", "unchecked", "resource" })
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ParseException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		System.out.println("Application opened");
		driver.get("https://einvoice1.gst.gov.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement e1 = driver.findElement(By.xpath("//button[@id='btnLogin']"));
		js.executeScript("arguments[0].click();", e1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("nictest2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("Abc123@@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id= 'CaptchaCode']")).sendKeys("MSAVK");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/button[1]")).click();
		driver.navigate().refresh();



		// Current date and time
		LocalDateTime myObj1 = LocalDateTime.now();
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String presenttime = myObj1.format(datetime);


          // Read the JSON file and update the Parameter //
		JSONParser parser = new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader("C:/Users/DELL/Desktop/WorkSpace/Selenium/e_Invoice_ewb1.JSON"));
		JSONObject person = null ;
		  for (Object o : a)
		  {
	        person = (JSONObject) o;
		 //   System.out.println(" test " + person.toString());
		  }
		  JSONObject employeeObject = (JSONObject) person.get("DocDtls");
		  String firstName = (String) employeeObject.get("No");
         // System.out.println(firstName);
		  String plainPayload = person.toJSONString();
		  plainPayload=plainPayload.replace(firstName,presenttime);
		  String jsonString = "["+plainPayload.toString()+"]";

		  FileReader reader= new FileReader("C:/Users/DELL/Desktop/WorkSpace/Selenium/e_Invoice_ewb1.JSON");
		  BufferedReader bufferedReader = new BufferedReader(reader);
		  String line;
		  FileWriter file = new FileWriter("C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\All Zones JSON\\inv1.json" );
		  while ((line = bufferedReader.readLine()) != null) { //
			  jsonString =line.toString();

			  System.out.println("tst" + line);

			 a.add(line);



			  file.write("tst" + line);
		  }
		//  System.out.println(line);

		//  System.out.println(jsonString);


	      FileWriter file1 = new FileWriter("C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\All Zones JSON\\inv1.json" );

	      file.write("tst" + line);
		  file.close();






//		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		  WebElement e11 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
//		  js.executeScript("arguments[0].click();", e11);
//		  Thread.sleep(1000);
//		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
//		  Thread.sleep(1000);
//		  WebElement upload_file = driver.findElement(By.xpath("//input[@id='JsonFile']"));
//		    upload_file.sendKeys("C:/Users/DELL/Desktop/WorkSpace/Selenium/e_Invoice_ewb1.JSON");
//		  	Thread.sleep(1000);
//		    driver.findElement(By.xpath("//input[@id='uploadBtn']")).click();

		  }

	}












	//}



