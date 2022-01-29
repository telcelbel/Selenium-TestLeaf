package week4.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-nitifications");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("ms");
		from.sendKeys(Keys.TAB);

		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("mdu");
		to.sendKeys(Keys.TAB);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		List<WebElement> Litrainname = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
		Set<String> Settrainname=new LinkedHashSet<String>();
		for (WebElement trainname1 : Litrainname) {

			Settrainname.add(trainname1.getText());
		

		}
		
		int listsize=Litrainname.size();
		System.out.println(listsize);

		

		int setsize=Settrainname.size();
		System.out.println(setsize);
		int duplicatetrainsize=listsize-setsize;

		System.out.println("duplicatetrainsize:" + duplicatetrainsize);
		
		System.out.println(Settrainname);

		
		


	}

}
