package Monitoring_Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Building_master {
	public static <JSONParser> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://dashboard.ewaybillgst.gov.in/montool/");
		System.out.println("Application opened");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("karthik");
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("abc123@@");
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter captcha");
//		String captcha = scan.nextLine();
		driver.findElement(By.xpath("//input[@id='txtCaptchanew']")).sendKeys("MSAVK");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtotp']")).sendKeys("102020");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btncont']")).click();
		Thread.sleep(2000);


		driver.get("https://dashboard.ewaybillgst.gov.in/montool/Rpt_rfid_report.aspx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]")).click();
        driver.quit();








	}

}
