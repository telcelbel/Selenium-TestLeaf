package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name='firstName']")).sendKeys("Anshuman");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a[@class='linktext']")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		
		String company="TCS";
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(company);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
//		String company1=driver.findElement(By.id("viewLead_companyName_sp")).getText();
//		if(company.equals(company1))
		if(driver.findElement(By.xpath("//span[contains(text(),'TCS')]")).isDisplayed())
		{
			System.out.println("Company name is updated successfully");
		}
		else
		{
			System.out.println("Company name is not updated");
		}
		

	}

}
