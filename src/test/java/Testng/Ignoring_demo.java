package Testng;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Ignoring_demo {
String message = "Manisha"; 
	
@Test(enabled = true)
public void testDrintMessage() {
System.out.println("Inside testPrintMessage()");
message = "Ramya";//local variable preference
Assert.assertEquals(message, "Bharathi");
   }

@Test(enabled = false)
public void testNalutationMessage() {
System.out.println("Inside testSalutationMessage()");
message = "Hi!" + "Manisha";
Assert.assertEquals(message, "Hi..Manisha");
   }
@Test
public void testDLMessage() {
System.out.println("test Message with out using Enable=true anotation");
message = "Hi!" + "Bharathi";
Assert.assertEquals(message, "Hi!Bharathi");
   }

@Test
public void testA()
{
	System.out.println("Hi TestA method");
}
}










































































