package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead2 extends BaseClass{
		@Test(dataProvider="sendData")
		public void createleads(String company,String firstname,String lastname) {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName1")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
		
		
}
	
	@DataProvider
	public String[][] sendData() {
		String data[][]=new String[2][3];
		
		data[0][0]="TestLeaf";
		data[0][1]="Hari";
		data[0][2]="R";
		
		data[1][0]="TestLeaf";
		data[1][1]="Anshuman";
		data[1][2]="D";
		
		return data;


	}
}






