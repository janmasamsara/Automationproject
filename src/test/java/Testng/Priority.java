package Testng;
import org.testng.annotations.Test;

public class Priority {
@Test(alwaysRun=true)
public void Login() {
	System.out.println("hi login");
}
@Test(priority=3)
public void TestCaseTwo() {
	System.out.println("Testcase two");
}
@Test(priority=2)
public void TestCaseThree() {
	System.out.println("Testcase Three");
}
@Test(priority=0)
public void TestCaseFour() {
	System.out.println("Testcase zero");
}
@Test(priority=1)
public void TestCaseFive() {
	System.out.println("Testcase Five");
}
@Test(priority=-2)
public void TestCaseSeven() {
	System.out.println("Testcase seven");
}
@Test(priority=-3)
public void TestCaseEight() {
	System.out.println("Testcase Eight");
}
@Test(priority=-4)
public void TestCase() {
	System.out.println("Admin Testcase");
}

}

