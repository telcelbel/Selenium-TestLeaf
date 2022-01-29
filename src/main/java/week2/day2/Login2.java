package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {
	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Capgemini");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Anshuman");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Dash");
		 
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 
		 
		 System.out.println("Lead created");
}
}

