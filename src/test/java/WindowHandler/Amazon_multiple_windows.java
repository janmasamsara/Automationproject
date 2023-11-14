package WindowHandler;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_multiple_windows {
	
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search_box=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search_box.sendKeys("laptop");
		Thread.sleep(5000);
		WebElement search_bag=driver.findElement(By.xpath("//div[@id=\"nav-flyout-searchAjax\"]/div[2]/div/div[1]/div[3]/div/div"));
		System.out.println(search_bag.getText());
		if(search_bag.getText().contains("laptop bag"))
		{
			search_bag.click();
		}
		Thread.sleep(5000);
		WebElement product_selection=driver.findElement(By.xpath("//div[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a"));
		product_selection.click();
		//window handling
		//getWindowHandle()-when ever selenium launches a window it assigns a unique id to every window
		String parent_window=driver.getWindowHandle();
		System.out.println("Parent window id: "+parent_window);
		/*multiple window id's-getWindowHandles()
		 * when multiple windows are opened by webdriver when we want to capture all their id's we can use this methods.
		 */
		//set->ids not allow duplicate(values),datatype
		Set<String> windowslist=driver.getWindowHandles();
		//System.out.println("multiple windows id's: "+windowslist);
		Iterator<String> itr=windowslist.iterator(); //id's 2 
	
		while(itr.hasNext()) //it checks whether next element is present or not,if present it will go inside the loop
		{
			String child_window=itr.next(); //itr.next()->it will print the elements id
			System.out.println(child_window);
			if(!parent_window.equalsIgnoreCase(child_window)) //1st iteration both window id's are equal it will come out of the if-condition
			{
				//switch to child window
				driver.switchTo().window(child_window);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			WebElement addcart_btn=	driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
			 addcart_btn.click();
			WebElement proceed_checkout =	driver.findElement(By.xpath("//form[@id=\"sw-ptc-form\"]/span"));
			proceed_checkout.click();		
			WebElement phoneno=driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
			 phoneno.sendKeys("9491746789");
			 
			}
		}
		
		
}
}