 package Analytics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class N_GSTIN_Transporter_Ewaybill {
	Masters master = new Masters();
	ArrayList<String> check =new ArrayList<String>() ;
	 String flag;
	@SuppressWarnings({ "rawtypes", "unused" })
	public void  N1(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet) throws InterruptedException

	{
		try
		{
			boolean sucs=false;
			driver.findElement(By.xpath("//a[contains(text(),'N1.Taxpayer Profile')]")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtgstin']")).sendKeys("29AAACJ4323N1ZC");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
		      if (str.contains("29AAACJ4323N1ZC"))
		      {
		    	  sucs=true;
		      }else
		      {
		    	  sucs=false;
		      } check.add(String.valueOf(sucs));
		    System.out.println("29AAACJ4323N1ZC" +sucs);

			driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_out']")).click();
			master.Scroll(driver);
			String str2 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]")).getText();
			 if (str2.contains("April-2022"))
		      {
		    	  sucs=true;
		      }else
		      {
		    	  sucs=false;
		      }
			 check.add(String.valueOf(sucs));
			System.out.println("April-2022" +sucs);

			 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_out']")).click();
			Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_year']")));
			dropdown.selectByValue("2021-2022");
			String str3 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]")).getText();
			 if (str3.contains("April-2021"))
		      {
		    	  sucs=true;
		      }else
		      {
		    	  sucs=false;
		      }
			 check.add(String.valueOf(sucs));
			System.out.println("April-2021" + sucs);



			 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_out']")).click();
				Select dropdown1 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_year']")));
				dropdown1.selectByValue("2020-2021");
				String str4 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]")).getText();
				 if (str4.contains("April-2020"))
			      {
			    	  sucs=true;
			      }else
			      {
			    	  sucs=false;
			      }
				 check.add(String.valueOf(sucs));
				 System.out.println("April-2020" +sucs);
				 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_out']")).click();
					Select dropdown2 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_year']")));
					dropdown2.selectByValue("2019-2020");
					String str5 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]")).getText();
					 if (str5.contains("April-2019"))
				      {
				    	  sucs=true;
				      }else
				      {
				    	  sucs=false;
				      }
					 check.add(String.valueOf(sucs));
					 System.out.println("April-2019" + sucs);
					 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_out']")).click();
						Select dropdown3 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_year']")));
						dropdown3.selectByValue("2018-2019");
						String str6 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]")).getText();
						 if (str6.contains("April-2018"))
					      {
					    	  sucs=true;
					      }else
					      {
					    	  sucs=false;
					      }
						 check.add(String.valueOf(sucs));
						 System.out.println("April-2018" + sucs);



						// -----------------------------------------------//

						 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_in']")).click();
						 Select dropdown34 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_year']")));
							dropdown34.selectByValue("2022-2023");
							String str22 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]")).getText();
						//	System.out.println(str22);

							 if (str22.contains("April-2022"))
						      {
						    	  sucs=true;
						      }else
						      {
						    	  sucs=false;
						      }
							 check.add(String.valueOf(sucs));
							System.out.println("April-2022" + sucs);

							 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_in']")).click();
							Select dropdown21 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_year']")));
							dropdown21.selectByValue("2021-2022");
							String str33 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]")).getText();
							 if (str33.contains("April-2021"))
						      {
						    	  sucs=true;
						      }else
						      {
						    	  sucs=false;
						      }
							 check.add(String.valueOf(sucs));
							System.out.println("April-2021" + sucs);



							 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_in']")).click();
								Select dropdown11 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_year']")));
								dropdown11.selectByValue("2020-2021");
								String str44 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]")).getText();
								 if (str44.contains("April-2020"))
							      {
							    	  sucs=true;
							      }else
							      {
							    	  sucs=false;
							      }
								 check.add(String.valueOf(sucs));
								 System.out.println(sucs);
								 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_in']")).click();
									Select dropdown22 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_year']")));
									dropdown22.selectByValue("2019-2020");
									String str55 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]")).getText();
									 if (str55.contains("April-2019"))
								      {
								    	  sucs=true;
								      }else
								      {
								    	  sucs=false;
								      }
									 check.add(String.valueOf(sucs));
									 System.out.println(sucs);
									 driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_in']")).click();
										Select dropdown33 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_year']")));
										dropdown33.selectByValue("2018-2019");
										String str66 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]")).getText();
										 if (str66.contains("April-2018"))
									      {
									    	  sucs=true;
									      }else
									      {
									    	  sucs=false;
									      }
										 System.out.println(sucs);



		//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_cancel']")).click();
				String str1 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/a[1]")).getText();
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/a[1]")).click();
				List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				int a = Integer.parseInt(str1);
				if (a== (rows.size()-1))
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				 System.out.println("Cancel"+ sucs);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[5]/div[1]/div[1]/div[1]/button[1]")).click();
				Thread.sleep(2000);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_rej']")).click();
				String str222 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/a[1]")).getText();
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/a[1]")).click();
				List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				int a2 = Integer.parseInt(str222);
				if (a2== (rows1.size()-1))
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("Rej"+ sucs);
				Thread.sleep(2000);
				WebElement  w = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[5]/div[1]/div[1]/div[1]/button[1]"));
				js.executeScript("arguments[0].click();", w);
				Thread.sleep(2000);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_ext']")).click();
				List rows43 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));

				if (rows43.size()>=2)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("EXt"+ sucs);
				//-------------------------------------------------------------------------------------------
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_verf']")).click();
				Thread.sleep(2000);
				String strq = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/a[1]")).getText();
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/a[1]")).click();
				List rows111 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				int a211 = Integer.parseInt(strq);
				if (a211== (rows111.size()-1))
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("Verf"+ sucs);
				Thread.sleep(2000);
				WebElement  w1 = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[5]/div[1]/div[1]/div[1]/button[1]"));
				js.executeScript("arguments[0].click();", w1);
				Thread.sleep(2000);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_multveh']")).click();
				List rows12 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows12.size()>10)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("Mult veh"+ sucs);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_user']")).click();
				List rows122 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows122.size()>10)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("Users"+ sucs);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_odc']")).click();
				List rows1222 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows1222.size()>=10)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("ODC"+ sucs);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_parta']")).click();
				List rows127 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows127.size()>=10)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("Part A"+ sucs);

				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_outhsn']")).click();
				List rows18 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows18.size()>=10)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("OUT HSN"+ sucs);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_inhsn']")).click();
				List rows19 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows19.size()>=10)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("IN HSN"+ sucs);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_nonsupply']")).click();
				List rows14 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows14.size()>=10)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("NON supply"+ sucs);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_salestourp']")).click();
				List rows15 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows15.size()>=10)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("Sales URP"+ sucs);

				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_purfrmurp']")).click();
				List rows16 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rows16.size()>=10)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("pur URP"+ sucs);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkbtn_risk']")).click();
				Select dropdown23 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_year']")));
				dropdown23.selectByValue("2021-2022");
				String str28 = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).getText();
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
				List rows10 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr"));
				int a12 = Integer.parseInt(str28);
				if (a12== (rows10.size()-1))
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("Risk"+ sucs);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnback']")).click();
				Thread.sleep(2000);
				//-------------------------------------------------------------------------------------------
				driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_LinkButton4']")).click();
				Select dropdownq = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlfrommonth']")));
				dropdownq.selectByValue("12");
				Select dropdownw = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlfromyear']")));
				dropdownw.selectByValue("2022");
				Thread.sleep(3000);
				List rowsq = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
				if (rowsq.size()>=5)
				{
					sucs=true;
				}else
				{
					sucs=false;
				}
				check.add(String.valueOf(sucs));
				System.out.println("HSNWise OUT/In"+ sucs);


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
			cell = worksheet.getRow(3).getCell(5);
			 cell.setCellValue("OK");

			  System.out.println("N1.TAX PAYER PROFILE : " + "OK");
		}else
		{
			cell = worksheet.getRow(3).getCell(5);
			 cell.setCellValue("NOTOK");

			  System.out.println("N1.TAX PAYER PROFILE : " + "NOTOK");
		}
		master.Home(driver);
		}catch( org.openqa.selenium. ElementClickInterceptedException e)
		{
			cell = worksheet.getRow(3).getCell(5);
			 cell.setCellValue("NOTOK ex");

			  System.out.println("N1.TAX PAYER PROFILE : " + "NOTOK");
		}catch(org.openqa.selenium.NoSuchElementException e)
		{
			cell = worksheet.getRow(3).getCell(5);
			 cell.setCellValue("NOTOK");

			  System.out.println("N1.TAX PAYER PROFILE : " + "NOTOK ex");
		}

	}
	    // N2.View E-waybill
	//-------------------------------------------------------------------------------------------

	public void N2(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
	{
		try
		{
			WebElement x1 = driver.findElement(By.xpath("//a[contains(text(),'N2. View E-Waybill')]"));
			 js.executeScript("arguments[0].click();", x1);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_ebillno']")).sendKeys("171555876764");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
			String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[2]")).getText();
			if(str.contains("1715 5587 6764"))
			{cell = worksheet.getRow(4).getCell(5);
			 cell.setCellValue("OK");

				System.out.println("N2. View E-Waybill : "  + "OK");
				}else
				{cell = worksheet.getRow(4).getCell(5);
				 cell.setCellValue("NOTOK");

					System.out.println("N2. View E-Waybill : "  + "NOTOK");
			}
			master.Home(driver);

		}

		catch(org.openqa.selenium.NoSuchElementException e)
		{

		}
	}

	@SuppressWarnings("rawtypes")
	public void N3(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'N3.GSTIN based EWB Report')]")).click();
			driver.findElement(By.xpath("//input[@id='txt_gstin']")).sendKeys("29AAACJ4323N1ZC");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
			Thread.sleep(1000);
			Select dropdown = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_gstinstcode']")));
			dropdown.selectByValue("1");
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=10)
			{
				cell = worksheet.getRow(5).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("N3.GSTIN based EWB Report : "  + "OK");
			}else
			{
				cell = worksheet.getRow(5).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("N3.GSTIN based EWB Report : "  + "NOTOK");
			}
			master.Home(driver);

		}
	catch(org.openqa.selenium.NoSuchElementException e)
		{

		}
}

	@SuppressWarnings("rawtypes")
	public void N4(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet) throws InterruptedException
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'N4.Transporter ID / GSTIN based EWB Report')]")).click();
			Thread.sleep(1000);
			LocalDate date2y = LocalDate.now().minusDays(10);
			DateTimeFormatter formattery = DateTimeFormatter.ofPattern("dd/MM/YYYY");
			String date3y= formattery.format(date2y);
			  // System.out.println(date3y);
			driver.findElement(By.xpath("//input[@id='txtDateFrom']")).clear();
			driver.findElement(By.xpath("//input[@id='txtDateFrom']")).sendKeys(date3y);
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[4]/input[1]")).sendKeys("29AAAAK4465A1ZV");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
			driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
			List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
			if(rows.size()>=2)
			{
				cell = worksheet.getRow(6).getCell(5);
				 cell.setCellValue("OK");
				System.out.println("N4.Transporter ID / GSTIN based EWB Report : "  + "OK");
			}else
			{
				cell = worksheet.getRow(6).getCell(5);
				 cell.setCellValue("NOTOK");
				System.out.println("N4.Transporter ID / GSTIN based EWB Report : "  + "NOTOK");
			}
			master.Home(driver);
		}catch(org.openqa.selenium.NoSuchElementException e)
		{

		}

		}

		public void N5(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet) throws InterruptedException
		{
			try
			{
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[14]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("29AAACJ4323N1ZC");
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsearch']")).click();
				String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")).getText();
				if(str.contains("29AAACJ4323N1ZC"))
				{
					cell = worksheet.getRow(7).getCell(5);
					 cell.setCellValue("OK");
					System.out.println("N5.Search Tax Payer : "  + "OK");
				}else
				{
					cell = worksheet.getRow(7).getCell(5);
					 cell.setCellValue("NOTOK");
					System.out.println("N5.Search Tax Payer : "  + "NOTOK");
				}
				master.Home(driver);
			}catch(org.openqa.selenium.NoSuchElementException e)
			{

			}

			}

		public void N6(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
		{
			try
			{
				driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[14]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")).click();
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtpanel1gst']")).sendKeys("29AAACB0446L1Z0");
				driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsearch']")).click();
				String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")).getText();
				if(str.contains("29AAACB0446L1Z0"))
				{
					cell = worksheet.getRow(8).getCell(5);
					 cell.setCellValue("OK");
					System.out.println("N6.Search Transporter : "  + "OK");
				}else
				{
					cell = worksheet.getRow(8).getCell(5);
					 cell.setCellValue("NOTOK");
					System.out.println("N6.Search Transporter : "  + "NOTOK");
				}
				master.Home(driver);
			}catch(org.openqa.selenium.NoSuchElementException e)
			{

			}

			}


			public void N7(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet)
			{
				try
				{
					driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[14]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]")).click();
					driver.findElement(By.xpath("//input[@id='txt_hsn_sac']")).sendKeys("1001");
					driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
					String str = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")).getText();
					if(str.contains("1001"))
					{
						cell = worksheet.getRow(9).getCell(5);
						 cell.setCellValue("OK");
						System.out.println("N7.HSN Search : " + "OK");
					}else
					{
						cell = worksheet.getRow(9).getCell(5);
						 cell.setCellValue("NOTOK");
						System.out.println("N7.HSN Search : " + "NOTOK");
					}
					master.Home(driver);
				}catch(org.openqa.selenium.NoSuchElementException e)
				{

				}

				}




@SuppressWarnings({ "unused", "rawtypes" })
public void N8(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet) throws InterruptedException
{
	try
	{
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[14]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[1]/div[1]/input[1]")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if (rows.size()>=2)
		{

		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
		driver.findElement(By.xpath("//body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")).click();
		String str = driver.findElement(By.xpath("//td[contains(text(),'Trade Name')]")).getText();
		if(str.contains("Trade Name"))
		{
			cell = worksheet.getRow(10).getCell(5);
			 cell.setCellValue("OK");
			System.out.println("N8. Outlier Report : " + "OK");
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();

		//driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")).click();
			master.Home(driver);

		}else
		{
			cell = worksheet.getRow(10).getCell(5);
			 cell.setCellValue("NOTOK");
			System.out.println("N8. Outlier Report : " + "NOTOK");
			master.Home(driver);
		}
		}else
		{
			cell = worksheet.getRow(10).getCell(5);
			 cell.setCellValue("NOTOK");
			System.out.println("N8. Outlier Report : " + "NOTOK");
			master.Home(driver);
		}

		driver.get("https://mis.ewaybillgst.gov.in/analytics/N_Indivisual/OutlierRpt.aspx");
		master.Home(driver);

	}catch(org.openqa.selenium.NoSuchElementException e)
	{
System.out.println("test");
	}


}


@SuppressWarnings({ "unused", "rawtypes" })
public void N9(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet,Actions actions) throws InterruptedException
{
	try
	{
		boolean sucs=false;
		driver.get("https://mis.ewaybillgst.gov.in/analytics/Reports/BillShipTo.aspx?id=1");
	//	driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[14]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")).click();
		Select dropdown  = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlBillFrom']")));
		dropdown.selectByValue("Z1");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if (rows.size()>=2)
		{
			sucs = true;
		}else
		{
			sucs = false;
			master.Home(driver);
		}

		driver.navigate().refresh();
		Thread.sleep(2000);

		//-----***State Wise***------//
		Select dropdown1  = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlBillFrom']")));
		dropdown1.selectByValue("29");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if (rows1.size()>=2)
		{
			sucs = true;
		}else
		{
			sucs = false;
			master.Home(driver);
		}

		if (sucs== true)
		{
			cell = worksheet.getRow(11).getCell(5);
			 cell.setCellValue("OK");

			  System.out.println("N9. Ship-To Report : " + "OK");
		}else
		{
			cell = worksheet.getRow(11).getCell(5);
			 cell.setCellValue("NOTOK");

			  System.out.println("N9. Ship-To Report : " + "NOTOK");
		}
		master.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException e)
	{

	}

}
@SuppressWarnings({ "unused", "rawtypes" })
public void N10(WebDriver driver, JavascriptExecutor js,Cell cell,XSSFSheet worksheet,Actions actions) throws InterruptedException
{
	try
	{
		boolean sucs=false;
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[2]/div[2]/div[14]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")).click();
		Select dropdown  = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlBillFrom']")));
		dropdown.selectByValue("Z1");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if (rows.size()>=2)
		{
			sucs = true;
		}else
		{
			sucs = false;
			master.Home(driver);
		}

		driver.navigate().refresh();
		Thread.sleep(2000);

		//-----***State Wise***------//
		Select dropdown1  = new Select (driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlBillFrom']")));
		dropdown1.selectByValue("27");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnsbmt']")).click();
		List rows1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[3]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr"));
		if (rows1.size()>=2)
		{
			sucs = true;
		}else
		{
			sucs = false;
			master.Home(driver);
		}

		if (sucs== true)
		{
			cell = worksheet.getRow(12).getCell(5);
			 cell.setCellValue("OK");

			  System.out.println("N10.Dispatch Report : " + "OK");
		}else
		{
			cell = worksheet.getRow(12).getCell(5);
			 cell.setCellValue("NOTOK");

			  System.out.println("N10.Dispatch Report : " + "NOTOK");
		}
		master.Home(driver);
	}catch(org.openqa.selenium.NoSuchElementException e)
	{

	}

}

}


