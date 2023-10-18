package FirstPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Testing\\stuff for Selenium\\Browsers & Drivers\\chromedriver-win6429-08\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://courses.thetestingacademy.com/");
		Driver.findElement(By.linkText("ALL COURSES")).click();
		
	}
	public void testmethod() {
		System.out.println("From Firstclass of PKG1");
	}

}
