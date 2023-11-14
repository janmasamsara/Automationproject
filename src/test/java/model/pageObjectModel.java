package model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import webpages.guruLoginpage;

public class pageObjectModel {
	public static WebDriver driver;
	public static ChromeOptions options;
public static void main(String args[]){
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver = new ChromeDriver();
	 options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver.get("https://www.demo.guru99.com/v4/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//POM code,src/main/java file we are using 
	guruLoginpage webpages=PageFactory.initElements(driver,guruLoginpage.class);
	webpages.username.sendKeys("mngr531369");
	webpages.userpwd.sendKeys("YsybugE");
	webpages.loginBtn.click();
	
}
}

