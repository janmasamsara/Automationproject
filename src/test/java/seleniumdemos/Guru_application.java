package seleniumdemos;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Guru_application 
{
public static void main(String[] args) 
{
		System.out.println("testing chrome browser");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//if we are using chrome browser,below chromeoptions are mandatory to write
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// one interface holding multiple child class[polymorphism].ex:driver=new FirefoxDriver();
		WebDriver driver = new ChromeDriver(options);
		//application url
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		//wait period 10 sec
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//userId 
		WebElement userId=driver.findElement(By.name("uid"));
		//WebElement userId=driver.findElement(By.xpath("//input[@name=\"uid\"]]"));
		userId.sendKeys("mngr531369");
		//password
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("YsybugE");
		//button
		WebElement btnLogin=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		btnLogin.click();
		/*reset button
		WebElement Reset=driver.findElement(By.xpath("//[@name=\"btnReset\"]"));
		Reset.click();*/
		
		
	}

}
