package webpages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class guruLoginpage {
@FindBy(how=How.XPATH,using="//input[@name='uid']")
public WebElement username;
@FindBy(how=How.XPATH,using="//input[@name='password']")
public WebElement userpwd;
@FindBy(how=How.XPATH,using="//input[@name=\'btnLogin\']")
public WebElement loginBtn;

}
