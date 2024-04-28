package Testcase_01;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.AddCourscetocart;
import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Eksaq;


public class Addtocart extends BaseClass {
	String sfurl;
	

	@Test
	public void addcart() throws InterruptedException, IOException {

		Eksaq loginSF = new Eksaq(driver);
		loginSF.Eksaqlogin();
		AddCourscetocart addtocart = new AddCourscetocart(driver);
		addtocart.AddToCartC();

	}
}