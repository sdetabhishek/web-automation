import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterSorting {

	@Test

	public void filterSorting() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1118a\\Eclipse-Automation\\Automation\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		// PRODUCT BEFORE FILTER

		List<WebElement> priceBeforeFilter = driver.findElements(By.className("inventory_item_price"));

		List<Double> numericPriceBeforeFilter = new ArrayList<Double>();

		for (WebElement p : priceBeforeFilter) {

			numericPriceBeforeFilter.add(Double.valueOf(p.getText().replace("$", "")));

		}

		Collections.sort(numericPriceBeforeFilter);
		
		
		Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		dropdown.selectByVisibleText("Price (low to high)");
		
		
		List<WebElement> priceAfterFilter = driver.findElements(By.className("inventory_item_price"));

		List<Double> numericPriceAfterFilter = new ArrayList<Double>();

		for (WebElement q : priceAfterFilter) {

			numericPriceAfterFilter.add(Double.valueOf(q.getText().replace("$", "")));

		}
		
		
		Assert.assertEquals(numericPriceBeforeFilter, numericPriceAfterFilter);
		

	}
}