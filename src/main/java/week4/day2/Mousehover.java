package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions builder=new Actions(driver);
		Thread.sleep(5000);
		WebElement men=driver.findElement(By.xpath("(//li[@class='navlink lnHeight']/a/span)[1]"));
		
		builder.moveToElement(men).perform();
		
		
		driver.findElement(By.xpath("//div[@id='category6Data']//a/span[text()='Shirts']")).click();
		
		WebElement shirt=driver.findElement(By.xpath("(//picture/img[@class='product-image '])[1]"));
		
		builder.moveToElement(shirt).perform();
		
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc']/div)[1]")).click();
		

	}

}
