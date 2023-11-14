package Mouseactions;
//mouse actions-3 types
/*1.mouseHover
 *2.mouseRight click
 *3.mouseDouble click*/

/*3 methods
 * 1.mouseHover-moveToElement()
 * 2.mouseRightclick-contextClick()
 *3.mouseDoubleclick-doubleClick()
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action {
	public static WebDriver driver=null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//mouse actions are present in Action class,we need to give access for the driver.so,we have written Actions(driver);
		//object creation
		Actions action=new Actions(driver);
		WebElement menulink=driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
		action.moveToElement(menulink).build().perform();
		WebElement sign_in=driver.findElement(By.xpath("//div[@id=\"nav-al-container\"]/div/div/a/span"));
		sign_in.click();
		
		
		}
}
	