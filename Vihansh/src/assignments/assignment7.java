package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing\\stuff for Selenium\\Browsers & Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,650)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=300");
		System.out.println("Number of rows: "+driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		System.out.println("Number of columns: "+driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size());
		System.out.println("2nd Row data: "+driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());
	}

}
