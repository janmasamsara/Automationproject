package seleniumdemos;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Amazon 
{
	public static WebDriver driver=null;
	//throws interruptedexception by adding Thread.sleep(java wait)
	public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//wait period 10 sec,implicit wait to load all the webelements
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search_box=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search_box.sendKeys("laptop");
		//Thread.sleep(3000);
		//nWebElement search_bag=driver.findElement(By.xpath("//div[@id=\"nav-flyout-searchAjax\"]/div[2]/div/div[1]/div[3]/div/div"));
		WebElement search_bag=driver.findElement(By.xpath("//div[@id=\"nav-flyout-searchAjax\"]/div[2]/div/div[1]/div[3]/div/div"));
		//to just print the webelement we selected
		System.out.println(search_bag.getText());
		search_bag.click();
		/*
		//wait period-to wait the driver for 3 seconds 
		Thread.sleep(3000);
		WebElement product_select=driver.findElement(By.xpath("//span[@data-version-id=\"v3vtwxgppca0z12v18v51zrqona\"]/a/div/img"));
		product_select.click();
		Thread.sleep(3000);
				
				
*/
	}
}
