package Screenshot;
// Add dependency commons-io in pom.xml
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_screenshot {
	public static WebDriver driver;

	public static void main(String[] args)
	{
		System.out.println("common code");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement user_id=driver.findElement(By.xpath("//input[@name=\"uid\"]"));
		user_id.sendKeys("mngr533047");
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("sAsYrug");
		WebElement login_btn=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		login_btn.click();
		//screenshot logic-------------------------------------------------------------
		//import java.util.Date; 
		//.png format takes kb(size)
		//if we take .jpg extension it takes size in mb(more).Date is converting to string,so we written toString()
		//Date current system Date it will return
		//trim()-->it removes spaces from both the ends
		String fileName=(new Date()).toString().replace(" ","_").replace(":","-").trim()+".png";
		//new Date()-->it returns Mon Oct 16 17:19:42 IST 2023.png 
		//screenshot is folder name
		String destinationfilepath=System.getProperty("user.dir")+File.separator+"Screenshot/"+fileName;
	System.out.println(destinationfilepath);
		//giving driver,control to TakesScreenshot class 
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File(destinationfilepath);
	try
	{
		//copying source(screenshot),moving to destination.like copy and paste
		FileUtils.copyFile(source, destination);
	}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}		
}
