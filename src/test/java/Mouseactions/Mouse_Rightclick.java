package Mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Rightclick {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement searchbox=driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
		searchbox.sendKeys("citibank");
		searchbox.sendKeys(Keys.ENTER);
		Actions action=new Actions(driver);
		WebElement search_link=driver.findElement(By.xpath("//div[@id=\"search\"]/div/div/div[1]/div/div/div/div/div/div/div/div/span/a/h3"));
		action.contextClick(search_link).build().perform();
	}

}
