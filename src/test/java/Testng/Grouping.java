package Testng;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Grouping {
	String message=".com";
	@Test(groups= {"smokecases"})
	public void testPrintMessage() {
		System.out.println("Inside testprintmessage");
		String message=".com";
		Assert.assertEquals(message,".com");
	}
	@Test(groups= {"smokecases"})
	public void testPrintMessage1() {
		System.out.println("Inside testprintmessage1");
		String message=".com";
		Assert.assertEquals(message,".com");
	}
	@Test(groups= {"groupchecktest"})
	public void testSalutaionMessage() {
		System.out.println("Inside testSalutaionMessage()");
		String message=".dcom";
		Assert.assertEquals(message,".com");
	}
	@Test(groups= {"functest"})
	public void testExitMessage() {
		System.out.println("Inside the testExitMessage()");
		String message="www."+"tutorialspoint"+".com";
		Assert.assertEquals(message,".com");
	}
	
	@Test(groups= {"Regression"})
	public void testGroup1() {
		System.out.println("testcase of testGroup1");
	}
	
	@Test(groups= {"Regression"})
	public void testGroup2() {
		System.out.println("testcase of testGroup2");
	}
	@Test(groups= {"Regression"})
	public void testGroup3() {
		System.out.println("testcase of testGroup3");
	}
	
	}
	
	

