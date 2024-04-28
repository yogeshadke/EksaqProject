package Testcase_01;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.Processtocheck;
import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Eksaq;


public class Makepayment_Testcase_003 extends BaseClass {
	String sfurl;
	

	@Test
	public void makepaymentcard() throws InterruptedException, IOException {

		Eksaq loginSF = new Eksaq(driver);
		loginSF.Eksaqlogin();
		Processtocheck processtocheck = new Processtocheck(driver);
		processtocheck.Processpayment();
	}
}