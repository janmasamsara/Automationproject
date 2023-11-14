package ExcelReadingData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//need to add dependencies in pom.xml for getting data through excelsheet
//org.apache.commons.io
//poi
//poi-ooxml
//poi-ooxml-schemas
//commons-io
public class Exceldata {
//global variables declaration
	public static HashMap<String,String> data;
	public static File src;
	public static FileInputStream fis;
	//xsl workbook to get data 
	public static XSSFSheet ExcelWSheet;
	public static XSSFWorkbook ExcelWBook;
	public static int row=0;
	public static int column=0;
	public static String key;
	public static String value;
	public static void main(String args[]) throws IOException
	{
		readData("./TestData/testdata.xslx","Sheet1","Guru");
		String userName=data.get("userName");
		System.out.println(userName);
		String password=data.get("Password");
		System.out.println(password);
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement username=driver.findElement(By.name("uid"));
		username.sendKeys(userName);
		WebElement Password=driver.findElement(By.xpath("//input[@name=\"uid\"]]"));
		Password.sendKeys(password);
		WebElement btnLogin=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();	
		
	}
	public static Map<String,String> readData(String path,String SheetName,String TestCaseName) throws IOException 
	{
		data=new HashMap<String,String>();
		src=new File(path);
		try
		{
			fis=new FileInputStream(src);
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		ExcelWBook=new XSSFWorkbook(fis);
	 ExcelWSheet=ExcelWBook.getSheet(SheetName);	
	 //rows,columns getting code interview
	 row=ExcelWSheet.getLastRowNum()-ExcelWSheet.getFirstRowNum();
	 column=ExcelWSheet.getRow(0).getLastCellNum();
	for(int i=1;i<=row;i++)
	{
		String Name= ExcelWSheet.getRow(i).getCell(0).getStringCellValue();
		if(Name.equals(TestCaseName))
		{
			for(int j=1;j<column;j++)
			{
				key=ExcelWSheet.getRow(0).getCell(j).getStringCellValue();
				value=ExcelWSheet.getRow(i).getCell(j).getStringCellValue();
				data.put(key,value);
			}
		}
		
	}
		
	 return data;
		
	}
		
	
	
}
