package PageObject;




import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Wrapper.ClickButton;
import Wrapper.SendKeys;




public class Login {
	private static final String SHEET_NAME = "LoginSF1";
	WebDriver ldriver;

	public Login(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	@FindBy(xpath = "//div[@class='elementor-widget-wrap']//a[contains(text(),'Login')]")
	WebElement Loginbtn;
	
	@FindBy(xpath = "//input[@name='wdm_username']")
	WebElement Ekemail;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Ekpassword;
	@FindBy(xpath = "//input[@name='wdm_login']")
	WebElement EKsubmit;

	public void Eksaqlogin() throws InterruptedException, IOException {

	
		String Eksaqurl = "https://uat.eksaqonline.com ";
		String EKusername = "testorguat1@mailinator.com ";
		String EKpassword = "Abcd@123";
        
		ldriver.get(Eksaqurl);
		ClickButton.clickon(Loginbtn);
		SendKeys.sendKeysToElement(Ekemail, EKusername);
		SendKeys.sendKeysToElement(Ekpassword, EKpassword);
		//String actualuser = Ekemail.getAttribute("value");
        //String expecteduser = EKusername;
       // Asert.assertEquals(actualuser, expecteduser, "Verify username");
		//SendKeys.sendKeysToElement(Ekpassword, EKpassword);
		//String actualpassword = sfpassword.getAttribute("value");;
        //String expectedpassword = password;
        //Asert.assertEquals(actualpassword, expectedpassword, "Verify password");
		ClickButton.clickon(EKsubmit);
		

	}

}
