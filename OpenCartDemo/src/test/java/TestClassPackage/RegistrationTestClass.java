package TestClassPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassPackage.BaseClass;
import PageObjectClass.HomePageObjectClass;
import PageObjectClass.RegistrationPageObjectClass;

public class RegistrationTestClass extends BaseClass {
	
	@Test
	public void registration() {
		HomePageObjectClass hp=new HomePageObjectClass(driver);
		hp.clickDropDown();
		hp.clickRegistrationOption();
		
		RegistrationPageObjectClass rp=new RegistrationPageObjectClass(driver);
		rp.setFName("Ria");
		rp.setLName("Rai");
		rp.setEmail("ria4@test.com");
		rp.setTelephone("1234567678");
		rp.setPassword("test123@");
		rp.setConfirmPwd("test123@");
		rp.clickCheckBox();
		rp.clickCOntinueBtn();
		String msg=rp.getSuccessMsg();
		System.out.println("Success Message: "+msg);
		Assert.assertEquals(msg, "Your Account Has Been Created!");
	}
}
