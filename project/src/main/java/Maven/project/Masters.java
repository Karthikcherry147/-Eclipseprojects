package Maven.project;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

import io.netty.handler.timeout.TimeoutException;

public class Masters {

		public void Alert(WebDriver driver)
		{
			Alert alert =driver.switchTo().alert();
			alert.dismiss();
		}

		public void Scroll(WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2000)", "");
		}
		public WebDriver Refresh( WebDriver driver ) { // TODO Auto-generated method
			driver.navigate().refresh();
			  return driver;

		}
		public void Home(WebDriver driver) {
			 driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
			 }
		public void Exception ()
		{
			try
			{

			}catch (NoSuchWindowException e)
			{

			}catch(NoSuchFrameException e)
			{

			}catch(NoSuchElementException e)
			{

			}catch(NoAlertPresentException e)
			{

			}catch(InvalidSelectorException e)
			{

			}catch(TimeoutException e)
			{

			}catch(ElementNotInteractableException e)
			{

			}
		}
	}

