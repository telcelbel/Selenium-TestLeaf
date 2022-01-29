package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case3 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anshuman");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dash");
		 WebElement element=driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select select=new Select(element);
		 select.selectByVisibleText("Direct Mail");
		 WebElement element1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select select1=new Select(element1);
		 select1.selectByIndex(2);
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nitin");
		 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Dash");
		 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/11/1996");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Consultant");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5000000");
		 
		 WebElement element2=driver.findElement(By.id("createLeadForm_currencyUomId"));
		 Select select2=new Select(element2);
		 select2.selectByValue("INR");
		 
		 WebElement element3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select select3=new Select(element3);
		 select3.selectByVisibleText("Sole Proprietorship");
		 
		 WebElement element4=driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select select4=new Select(element4);
		 select4.selectByVisibleText("Computer Software");
		 
		 driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
		 driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("ET12373832");
		 driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("test");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("It's a SoftWare Company");
		 driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("It's a Prifitable Company");
		 //Contact Information
		 driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("78121");
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("08016287181");
		 driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("221774");
		 driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("It Service");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anshu@gmail.com");
		 driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.anshu.com");
		 //	Primary Address
		 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ram");
		 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Shyam");
		 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Test Address1");
		 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Test Address2");
		 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("BBSR");
		 
		 WebElement element5=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		 Select select5=new Select(element5);
		 select5.selectByValue("IND");
		 
		 Thread.sleep(3000);
		 
		 WebElement element7=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select select7=new Select(element7);
		 select7.selectByVisibleText("ORISSA");
		 
		 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("751024");
		 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("751024");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 String title2 = driver.getTitle();
		 System.out.println(title2);
		 
		 


	}

}
