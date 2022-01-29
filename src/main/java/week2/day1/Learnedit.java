package week2.day1;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnedit {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Edit.html");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("email")).sendKeys("anshu.dash@gmail.com");
		 driver.findElement(By.id("email")).sendKeys(" dash",Keys.TAB);
		 

	}

}
