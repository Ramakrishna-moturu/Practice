package flight_booking;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Launching_Browser {
	public static void main(String[] args) throws InterruptedException {
	
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));
		List<WebElement> ops = driver.findElements(By.className("ui-menu-item"));
		for(WebElement op:ops)
		{
			if(op.getText().equalsIgnoreCase("India"))
			{
				op.click();
				break;
			}
		}
		
		WebElement Drpd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(Drpd);
		dropdown.selectByVisibleText("AED");
		dropdown.selectByIndex(1);
		driver.findElement(By.id("divpaxinfo")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hrefIncAdt")));
		int count=1;
		while(count<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			count++;
		}
		//btnclosepaxoption
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@value='VTZ']")));
		driver.findElement(By.xpath("//a[@value='VTZ']")).click();
		//(//a[@value='BLR'])[2]
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@value='BLR'])[2]")));
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();	
		}else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class*='ui-state-highlight'")));
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight'")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class*='ui-state-highlight'")));
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight'")).click();
		driver.findElement(By.cssSelector("input[name*='btn_FindFlights'")).click();
		

	}

}
