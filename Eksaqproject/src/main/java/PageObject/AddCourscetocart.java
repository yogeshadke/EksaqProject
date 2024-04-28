package PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Wrapper.ClickButton;
import Wrapper.SendKeys;

public class AddCourscetocart {
	private static final String SHEET_NAME = "LoginSF1";
	WebDriver ldriver;

	public AddCourscetocart(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
   
     @FindBy(xpath = "//div[@class='main-menu  menu-border']//a[contains(text(),'Courses')]")
 	WebElement clicckoncoursce;
   
     @FindBy(xpath = "//div[@class='information customwidgetpd']//input[@name='height_option']")
  	WebElement Enterstdno;
  
     @FindBy(xpath = "//div[@class='information customwidgetpd']//input[@name='width_option']")
   	WebElement Enterteacherno;
  
     @FindBy(xpath = "//button[@name='add-to-cart']")
    	WebElement addtocart;
      
     @FindBy(xpath = "//div[@class='elementor-widget-wrap']//div[@class='cart']")
 	WebElement clickoncart;
     
     @FindBy(xpath = "//div[@class='cart-bottom']//a[contains(text(),'Checkout')])[2]")
  	WebElement clickoncheckout;
	

	public void AddToCartC() throws InterruptedException, IOException {

      
		ClickButton.clickon(clicckoncoursce);
		SendKeys.sendKeysToElement(Enterstdno, "1");
		SendKeys.sendKeysToElement(Enterteacherno, "1");
		ClickButton.clickon(addtocart);
		ClickButton.clickon(clickoncart);
		ClickButton.clickon(clickoncheckout);
}
	}