package seleniumdemos;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Orangehrm 
{
	public static WebDriver driver=null;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(options);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
		//wait period 10 sec
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement name=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		 name.sendKeys("Admin");
		 WebElement pwd=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		 pwd.sendKeys("admin123");
		 WebElement button=driver.findElement(By.xpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		 button.click();
		 WebElement module=driver.findElement(By.xpath ("//div[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
		 module.click();
		 WebElement modulenavigation=driver.findElement(By.xpath ("//a[contains(text(),\"Add Employee\")]"));
		 modulenavigation.click();
		 //Add Employee details
		 WebElement fullname=driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
		 fullname.sendKeys("Samskruthi");
		 WebElement lname=driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
		 lname.sendKeys("Kalavakur");
		 WebElement mname=driver.findElement(By.xpath("//input[@name=\"middleName\"]"));
		 mname.sendKeys("J");
		 WebElement b1=driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
		 b1.click();
		//contact details
		 WebElement b=driver.findElement(By.xpath("//a[contains(text(),\"Contact Details\")]"));
		 b.click();
		 WebElement addr1=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"));
		 addr1.sendKeys("v.k.r");
		 WebElement addr2=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"));
		 addr2.sendKeys("8-4-1A");
		WebElement addr3=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input"));
		 addr3.sendKeys("nellore");
		 WebElement addr4=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input"));
		 addr4.sendKeys("AP");
		 WebElement addr5=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input"));
		addr5.sendKeys("524137");
		 WebElement addr6=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input"));
		 addr6.sendKeys("93912345161");
		 WebElement addr7=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input"));
		 addr7.sendKeys("Icecream23@gmail.com");
		 WebElement addr8=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"));
		 addr8.click();
		 //emergency contact
		 WebElement c1=driver.findElement(By.xpath("//a[contains(text(), \"Emergency Contacts\")]"));
		 c1.click();
		WebElement c2= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button"));
		c2.click();		
		WebElement c3= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"));
		c3.sendKeys("swecha");
		WebElement c4= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"));
		c4.sendKeys("mother");
		WebElement c5= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input"));
		c5.sendKeys("8612730612");
		WebElement c6= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]"));
		c6.click();		
		WebElement c7= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/div[2]/div/div/div[7]/div/button[1]"));
		c7.click();
		WebElement c8= driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[1]"));
		c8.click();
		//dependents
		WebElement c9= driver.findElement(By.xpath("//a[contains(text(),\"Dependents\")]"));
		c9.click();
		//dependents,select is mandatory
		/*
		WebElement c10= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button"));
		c10.click();
		WebElement c11= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"));
		c11.sendKeys("swetha");
		WebElement c13= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]"));
		c13.click();
		*/
		
		/*	 WebElement pdetails=driver.findElement(By.xpath("//a[contains(text(),\"Personal Details\")]"));
		 pdetails.click();
		 
		 
		 WebElement b2=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
		 b2.sendKeys("Rajan");
		 
		 /*
		 WebElement b5=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button"));
		 b5.click();
		 */
		 /* ssn number
		 WebElement b3=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]"));
		 b3.sendKeys("1078900");
		 WebElement b4=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input"));
		 b4.sendKeys("1a");
		*/
		 //Immigration
		WebElement immigration= driver.findElement(By.xpath("//a[contains(text(),\"Immigration\")]"));
		immigration.click();
		WebElement immigration1= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button"));
		immigration1.click();
		WebElement immigration2= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input"));
		immigration2.sendKeys("CCHP J856");
		WebElement immigration3= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]"));
		immigration3.click();
		//Job
		WebElement jb= driver.findElement(By.xpath("//a[contains(text(),\"Job\")]"));
		jb.click();
		WebElement jb1= driver.findElement(By.xpath(" /html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button"));
		jb1.click();
		//salary
		WebElement sal= driver.findElement(By.xpath("//a[contains(text(),\"Salary\")]"));
		sal.click();
		
		
		
		//Exemptions
		WebElement e1= driver.findElement(By.xpath("//a[contains(text(),\"Tax Exemptions\")]"));
		e1.click();
		
		/*
		WebElement e2= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"));
		e2.sendKeys("5");
		WebElement e3= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input"));
		e3.sendKeys("8");
		WebElement e4= driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button"));
		e4.click();
		}
		*/
		
		//reports
		WebElement r= driver.findElement(By.xpath("//a[contains(text(),\"Report-to\")]"));
		r.click();
		
		//qualification
		WebElement q= driver.findElement(By.xpath("//a[contains(text(),\"Qualifications\")]"));
		q.click();
		
		//memberships
		WebElement m= driver.findElement(By.xpath("//a[contains(text(),\"Memberships\")]"));
		m.click();
		

}
}