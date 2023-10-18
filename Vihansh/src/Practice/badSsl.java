package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class badSsl {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
	option.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing\\stuff for Selenium\\Browsers & Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();

	}

}
