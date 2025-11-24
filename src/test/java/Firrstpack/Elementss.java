package Firrstpack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elementss {
	public static void main(String[]args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement projecter =driver.findElement(By.xpath("//div[text()='Projector']"));
		projecter.click();
		WebElement best = driver.findElement(By.xpath("//a[starts-with(text(),'Egate K9 Pro-Max ')]"));
		File src = best.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Abdul_Basith\\projector_screenshot.png");
		 FileUtils.copyFile(src, des);
		 System.out.println("Screenshot saved successfully");
		 driver.quit();

		
		
	}

}
