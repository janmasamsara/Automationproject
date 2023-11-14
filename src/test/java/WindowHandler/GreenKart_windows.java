package WindowHandler;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
public class GreenKart_windows 
{
	public static WebDriver driver=null;
	public static String offerpageproductname=null;
	public static String landingpageproductname=null;
	public static String parent_WindowId;
	
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.xpath("//div[@id=\"root\"]/div/header/div/div[2]/form/input"));
		search.sendKeys("tom");
		parent_WindowId=driver.getWindowHandle();
		System.out.println( parent_WindowId);
		Thread.sleep(5000);
		WebElement productname=driver.findElement(By.xpath("//h4[contains(text(),\"Tomato - 1 Kg\")]"));
		offerpageproductname=productname.getText().split("-")[0].trim();
		System.out.println(offerpageproductname);
		WebElement top_deals=driver.findElement(By.xpath("//a[contains(text(),\"Top Deals\")]"));
		top_deals.click();
		//method calling
		getwindows_code("tom");
		
		WebElement productname1=driver.findElement(By.xpath("//td[contains(text(),\"Tomato\")]"));
			landingpageproductname=productname1.getText();
			getScreenshot();
			System.out.println(landingpageproductname);
			//checking equal or not by using assertEquals
			Assert.assertEquals(offerpageproductname,landingpageproductname);
	}
	public static void getScreenshot() {
		// TODO Auto-generated method stub
		try
		{
			String filename=(new Date()).toString().replace(" ","_").replace(":","-").trim()+"png";
			String destinationFilePath=System.getProperty("user.dir")+File.separator +"Screenshot/"+filename;
			try
			{
				TakesScreenshot ts=(TakesScreenshot)driver;
				File source=ts.getScreenshotAs(OutputType.FILE);
				File destination=new File(destinationFilePath);
			FileUtils.copyFile(source, destination);
			}
			catch(Exception e) 
			{
				System.out.println("Exception while taking screenshot \" + e.getMessage()");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
			}
	}
	
	
	
	public static  void getwindows_code(String product_name)  {
		// TODO Auto-generated method stub
		Set<String> windowlists=driver.getWindowHandles();
		Iterator<String> itr=windowlists.iterator();
		while(itr.hasNext())
		{
			String child_WindowId=itr.next();
			if(!parent_WindowId.equalsIgnoreCase(child_WindowId))
			{  
				driver.switchTo().window(child_WindowId);
				
				WebElement searchelement=driver.findElement(By.xpath("//input[@id=\"search-field\"]"));
				searchelement.sendKeys(product_name);//product_name(tom) method calling
			}
			}
		
	}
}
	