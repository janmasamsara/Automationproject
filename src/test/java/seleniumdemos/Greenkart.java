package seleniumdemos;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart 
{
	public static WebDriver driver=null;
	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 driver.manage().window().maximize();
			//Implicit wait period 10 sec
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Relative xpath
		 WebElement search=driver.findElement(By.xpath("//input[@type=\"search\"]"));
		search.sendKeys("ber");
		//wait period 3000=3secs
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//product count(common),it gives more than one count so we are using list to store,and findElements
		//absolute xpath
		List<WebElement> product_count=driver.findElements(By.xpath("/html/body/div/div/div[1]/div/div"));
		int count=product_count.size();
		System.out.println("total product count: "+count);
	//add to cart button common for all products
		//dynamic xpath
		List<WebElement> addcartbtn=driver.findElements(By.xpath("//button[contains(text(),\"ADD TO CART\")]"));
		for(WebElement we:addcartbtn)
		{
			we.click();
		}
		//cart button ,Relative xpath
		WebElement cart_btn=driver.findElement(By.xpath("//img[@alt=\"Cart\"]"));
		cart_btn.click();
		
//proceed to checkout button,Dynamic xpath

WebElement proceed_chkout=driver.findElement(By.xpath("//button[contains(text(),\"PROCEED TO CHECKOUT\")]"));
//explicit wait-to wait for an single element
WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.elementToBeClickable(proceed_chkout)).click();
//implicit wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//promo textbox to enter test-data
WebElement promo_txtbox=driver.findElement(By.xpath("//input[@class=\"promoCode\"]"));
promo_txtbox.sendKeys("rahulshettyacademy");
//Apply Button,Relative xpath
WebElement apply_btn=driver.findElement(By.xpath("//button[@class=\"promoBtn\"]"));
apply_btn.click();	
WebElement success_msg=driver.findElement(By.xpath("//span[contains(text(),\"Code applied \")]"));
//explicit wait
WebDriverWait wait_success= new WebDriverWait(driver,30);
wait_success.until(ExpectedConditions.elementToBeClickable(success_msg));
String message=success_msg.getText();
System.out.println(message);




}

		
	}

	











