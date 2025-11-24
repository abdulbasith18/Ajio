package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class Dynamic {

	    public static void main(String[] args) {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
	        driver.manage().window().maximize();

	        // Get all rows from the table body
	        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tbody//tr"));

	        System.out.println("Countries using Euro currency:");

	        for (WebElement row : rows) {
	            List<WebElement> cells = row.findElements(By.tagName("td"));
	            if (cells.size() >= 3) {
	                String currency = cells.get(2).getText().trim();
	                if (currency.equalsIgnoreCase("Euro")) {
	                    String country = cells.get(0).getText().trim();
	                    System.out.println("- " +country);
	                }
	            }
	        }

	      
	    }
	}


