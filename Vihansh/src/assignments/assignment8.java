package assignments;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment8 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing\\stuff for Selenium\\Browsers & Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			driver.findElement(By.id("autocomplete")).sendKeys(s);
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ui-menu-item']")));
		driver.findElement(By.xpath("(//div[@class='ui-menu-item-wrapper'])[2]")).click();
	}

}
