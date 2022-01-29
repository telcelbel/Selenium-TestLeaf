package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-nitifications");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		
		Set<String> windowhandler=driver.getWindowHandles();
		List<String> handels=new ArrayList<String>(windowhandler);
		
		driver.switchTo().window(handels.get(1));
		
		String Windowhandel=driver.getTitle();
		
		System.out.println(Windowhandel);
		driver.switchTo().window(handels.get(0));
		driver.close();
		
		System.out.println("Parent window closed");
		
		


	}

}
