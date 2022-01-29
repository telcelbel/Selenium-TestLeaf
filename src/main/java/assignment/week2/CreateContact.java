package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Anshuman");
		 driver.findElement(By.id("lastNameField")).sendKeys("Dash");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nitin");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Dash");
		 driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Software");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("I am a Software Engineer");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("anshu.dash@gmail.com");
		 
		 WebElement element=driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		 Select select=new Select(element);
		 select.selectByVisibleText("New York");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("I work for an MNC");
		 
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 
	}

}
