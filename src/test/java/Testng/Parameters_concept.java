package Testng;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parameters_concept 
{
	@Test
	@Parameters({"sUsername", "sPassword"})
	public void login(String sUsername,String sPassword)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		String userNameData=sUsername;
		System.out.println(userNameData);
		String passwordData=sPassword;
		System.out.println(passwordData);
		
		
		//Pageobjectmodel(POM)-->Page Factory using 
		
		WebElement userName=driver.findElement(By.xpath("//input[@name='uid']"));
		userName.sendKeys(userNameData);
		WebElement passwrd=driver.findElement(By.xpath("//input[@name='password']"));		
		passwrd.sendKeys(passwordData);
		WebElement btnLogin=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();
		
		
	}
}
