package JSON;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSON_update {


    public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Seleninum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  System.out.println("Application opened");
		  driver.manage().window().maximize();
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
        try{
            String verify, putData;
            File file = new File("C:\\Users\\DELL\\Desktop\\WorkSpace\\Selenium\\All Zones JSON\\e_Invoice.json");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Some text here for a reason");
            bw.flush();
            bw.close();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while( br.readLine() != null ){
                verify = br.readLine();
                if(verify != null){
                    putData = verify.replaceAll("here", "there");
                    bw.write(putData);
                }
            }
            br.close();


        }catch(IOException e){
        e.printStackTrace();
        }
    }

}

