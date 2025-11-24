package Firrstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("The Title of the Webpage is "+title);
		String current = driver.getCurrentUrl();
		System.out.println("The current url of the Webpage is "+current);
		WebElement mobile =driver.findElement(By.xpath("//span[contains(text(),'Mobiles & Tablets')]"));
		mobile.click();
		
	}
}
