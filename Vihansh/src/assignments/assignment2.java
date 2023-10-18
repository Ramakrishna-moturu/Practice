package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\stuff for Selenium\\Browsers & Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Rama Krishna Moturu");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("motururamakrishnaece@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("08kk1a0433@");
		driver.findElement(By.id("exampleCheck1")).click();
				
		Select objsel = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		
		objsel.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//label[@for='dateofBirth']//following-sibling::input")).sendKeys("18-06-1991");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
//		driver.quit();
	}

}
