package Practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing\\stuff for Selenium\\Browsers & Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer1stcol = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		System.out.println(footer1stcol.findElements(By.tagName("a")).size());

		List<WebElement> fcolLinks = footer1stcol.findElements(By.tagName("a"));

		for (WebElement link : fcolLinks) {
			String ks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			link.sendKeys(ks);
		}

		Set<String> ws = driver.getWindowHandles();
		Iterator<String> tabs = ws.iterator();

		while (tabs.hasNext()) {
			driver.switchTo().window(tabs.next());
			System.out.println(driver.getTitle());
		}

	}

}
