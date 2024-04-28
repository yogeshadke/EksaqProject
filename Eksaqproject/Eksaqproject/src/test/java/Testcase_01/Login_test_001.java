package Testcase_01;

import java.io.IOException;

import org.testng.annotations.*;
import org.testng.internal.BaseClassFinder;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Eksaq;



public class Login_test_001 extends BaseClass {
	String sfurl;
	

	@Test
	public void VerfysalesforceLogin() throws InterruptedException, IOException {

		Eksaq loginSF = new Eksaq(driver);
		loginSF.Eksaqlogin();

	}
}