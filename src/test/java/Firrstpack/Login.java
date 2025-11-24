package Firrstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;










public class Login {
	public static void main(String[]args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("996524667");
		username.click();
		
		
	}

}
