package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing\\stuff for Selenium\\Browsers & Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Multiple Windows']")).click();
		
		driver.findElement(By.xpath("//a[.='Click Here']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String pw = it.next();
		String cw = it.next();
		driver.switchTo().window(cw);
		System.out.println(driver.findElement(By.xpath("//h3[.='New Window']")).getText());
		driver.switchTo().window(pw);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
	}

}
