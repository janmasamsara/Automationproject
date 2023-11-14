package seleniumdemos;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
public static WebDriver driver=null;
public static void main(String[] args) throws InterruptedException 
{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
				//java wait
				Thread.sleep(2000);	
				driver.manage().window().maximize();
				WebElement create_new_account = driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]"));
				create_new_account.click();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
				firstname.sendKeys("samskruthi");
				WebElement surname = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
				surname.sendKeys("stories");
				WebElement mobile_no = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
				mobile_no.sendKeys("9751111894");
				WebElement password = driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]"));
				password.sendKeys("Icecream@32");
				//Drop down-DATE OF BIRTH- 3 methods
				//selectByIndex(),selectByValue(),selectVisibleText()
				//we can use any method,for understanding we used three differentmethods for Dateofbirth
				WebElement daylist=driver.findElement(By.xpath("//select[@id=\"day\"]"));
				//daylist-webelement,25-data to select,days-label name in the application
				selectVisibleText(daylist,"25","days");//create method 
				WebElement monthlist=driver.findElement(By.xpath("//select[@id=\"month\"]"));
				selectByIndex(monthlist,8,"month");
				WebElement yearlist=driver.findElement(By.xpath("//select[@id=\"year\"]"));
				selectByValue(yearlist,"2000","year");
				///html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label
				WebElement genderfemale=driver.findElement(By.xpath("//label[contains(text(),\"Female\")]"));
				//click is a method for Checkbox
				click(genderfemale,"Female");
				WebElement signup=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
				signup.click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
public static void click(WebElement genderfemale, String string) {
	// TODO Auto-generated method stub
	try {
		if(genderfemale.isDisplayed()||genderfemale.isEnabled()) {
			genderfemale.click();
		}
	}
	catch(Exception e) {
		Assert.fail("Element is not displayed at this point of time"+e.getMessage());
	}
	
	
}
//element stored variable(yearlist),data to send(string),field/label name(string2)
public static void selectByValue(WebElement yearlist, String string, String string2) {
	// TODO Auto-generated method stub
	try {
			if(yearlist.isDisplayed())
			{
				new Select(yearlist).selectByValue(string2);
		}
	}
	catch(Exception e) {
		Assert.fail("unable to select value at this point of time"+e.getMessage());
	}
	
	
}
public static void selectByIndex(WebElement monthlist, int i, String string) {
	// TODO Auto-generated method stub
	try {
		if(monthlist.isDisplayed()) {
			new Select(monthlist).selectByIndex(i);
		}
	}
	catch(Exception e) {
		Assert.fail("unable to select value at this point of time"+e.getMessage());
	}
	
	
}
public static void selectVisibleText(WebElement daylist, String string, String string2) {
	// TODO Auto-generated method stub
	try {
		if(daylist.isDisplayed()) {
			new Select(daylist).selectByVisibleText(string);
		}
	}
	catch(Exception e) {
		Assert.fail("unable to select value at this point of time"+e.getMessage());
	}
	
	
}
			
			}
	


