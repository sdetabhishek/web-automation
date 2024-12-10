package launcher;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProduct {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1118a\\Eclipse-Automation\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Product under 100");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> products_prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for (WebElement prices : products_prices) {
			
			String price_value = prices.getText();
			
			 System.out.println(price_value);
				
				
			}
			
		}
		
		                                  
		
		

	}


