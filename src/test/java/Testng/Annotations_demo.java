package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
public class Annotations_demo {
	WebDriver driver=null;
	ChromeOptions options;
	
@BeforeSuite(alwaysRun=true)
public void beforeSuite() 
{
	System.out.println("in beforesuite");
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
}
@BeforeTest(alwaysRun=true)
public void beforeTest()
{
	System.out.println("in before test");
	driver=new ChromeDriver(options);
}
@BeforeClass
public void beforeClass()
{
	System.out.println("in beforeclass");
	System.out.println("startup-creating DB connection");
	driver.get("http://www.demo.guru99.com/v4/index.php");
	driver.manage().window().maximize();
}
@BeforeMethod
public void beforeMethod()
{
	driver.manage().window().maximize();
	System.out.println("Before method started...");
}
//Testcase-1
@Test
public void loginTestCase(){
	System.out.println("in test case 1");
	WebElement Userid=driver.findElement(By.name("uid"));
	Userid.sendKeys("mngr531369");
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("YsybugE");
	WebElement btnlogin=driver.findElement(By.name("btnLogin"));
	btnlogin.click();
}
//Testcase-2
@Test
public void testcase2()
{
	System.out.println("in test case2 is under coding...");
}

@AfterMethod(alwaysRun=true)
public void afterMethod()
{
	System.out.println("in aftermethod");
	System.out.println("logging if the testcase is passed/failed/skipped...code in this section");
}
@AfterClass(alwaysRun=true)
public void afterClass()
{
	System.out.println("in afterclass");
	System.out.println("End-up -closing Db connection");
}

@AfterTest(alwaysRun=true)
public void afterTest() {
 System.out.println("in afterTest");
 System.out.println("we can close the webdriver here also if requires...");
}


@AfterSuite(alwaysRun=true)
public void afterSuite()
{
	System.out.println("in aftersuite");
	driver.close();
	
}
}

