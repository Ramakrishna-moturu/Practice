package assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing\\stuff for Selenium\\Browsers & Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//label/input[@type='checkbox'])[2]")).click();
		String st="";
		List<WebElement> boxes = driver.findElements(By.xpath("//label/input[@type='checkbox']"));

		for(int i=1;i<=boxes.size(); i++) {
			if(boxes.get(i-1).isSelected())
			{
		     st += driver.findElement(By.xpath("(//label/input[@type='checkbox']//parent::label)["+ i +"]")).getText();
			}
		}
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(st);
		
		driver.findElement(By.id("name")).sendKeys(st);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText().split(" ")[1].trim().split(",")[0]);
		driver.switchTo().alert().accept();
	}

}
