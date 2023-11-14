package Screenshot;

import java.io.File;
import java.util.Date;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class screen {
public static WebDriver driver;
public static void main(String[] args)  {
			System.out.println("common code");
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement user_id=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
			user_id.sendKeys("Books");
			WebElement user_id1=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
			user_id1.sendKeys("Harrypotter");
			
			WebElement user_id2=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
			user_id2.click();	
			String file_name=(new Date()).toString().replace(" ","_").replace(":","-").trim()+".png";
			String destination_path=System.getProperty("user.dir")+File.separator+"Screenshot/"+file_name;
			System.out.println( destination_path);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File Destination=new File(destination_path);
			try
			{
				FileUtils.copyFile(source, Destination);
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
}
}