package assignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooksignup {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.linkText("Create New Account")).click();
		 driver.findElement(By.name("firstname")).sendKeys("Anshuman");
		 driver.findElement(By.name("lastname")).sendKeys("Dash");
		 driver.findElement(By.name("reg_email__")).sendKeys("anshu.dash@gmail.com");
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("anshu.dash@gmail.com");
		 driver.findElement(By.id("password_step_input")).sendKeys("qwerty123");
		 
		 WebElement element=driver.findElement(By.xpath("//select[@id='day']"));
		 Select select=new Select(element);
		 select.selectByValue("8");
		 
		 WebElement element1=driver.findElement(By.name("birthday_month"));
		 Select select1=new Select(element1);
		 select1.selectByVisibleText("Nov");
		 
		 WebElement element2=driver.findElement(By.id("year"));
		 Select select2=new Select(element2);
		 select2.selectByVisibleText("1996");
		 
		 driver.findElement(By.xpath("//label[text()='Male']")).click();
		 
		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		 
		 String title = driver.getTitle();
		 System.out.println(title);	 
		 
	}

}
