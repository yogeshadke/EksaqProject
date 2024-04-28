package PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Wrapper.ClickButton;
import Wrapper.SendKeys;

public class Processtocheck {
	
	WebDriver ldriver;

	public Processtocheck(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	
	@FindBy(xpath = "//button[contains(text(),'Place order')]")
 	WebElement clicckonPlaceorder;
	 
	 @FindBy(xpath = "//input[@placeholder='Enter card number']")
	 	WebElement Entercarddetails;
	
	 @FindBy(xpath = "//input[@name='cvv2']")
	 	WebElement Entercardcvv;
	  
	    @FindBy(xpath = "//input[@name='cname2']")
	 	WebElement Entercardholdername;
	  
	    @FindBy(xpath = "//button[contains(text(),'Make Payment')]")
	 	WebElement Makepayment;
    
	

	public void Processpayment() throws InterruptedException, IOException {

      
		ClickButton.clickon(clicckonPlaceorder);
		SendKeys.sendKeysToElement(Entercarddetails, "1234567891012131");
		SendKeys.sendKeysToElement(Entercardcvv, "123");
		SendKeys.sendKeysToElement(Entercardholdername, "Yogesh Adke");
		ClickButton.clickon(Makepayment);
		
}
	}