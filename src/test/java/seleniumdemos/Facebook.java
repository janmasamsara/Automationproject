package seleniumdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]"));
		//WebElement ele = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		ele.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement fname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		fname.sendKeys("samskruthi");
		WebElement lname = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lname.sendKeys("stories");
		WebElement mobile_no = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		mobile_no.sendKeys("9751111894");
		WebElement pwd = driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]"));
		pwd.sendKeys("Icecream@32");
		/*
		WebElement signup=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		signup.click();
		*/
	}

}
