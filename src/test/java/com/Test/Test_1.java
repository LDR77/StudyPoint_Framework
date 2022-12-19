package com.Test;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Library;
import com.pages.LoginPom;

public class Test_1 extends BaseClass {

	LoginPom login;
	
	@Test
	public void verify_Loginpage() {
		
		login = PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_Sendkeys(login.getTxt_email(),excel.getStringData_Excel("Login",0,0));
		Library.custom_Sendkeys(login.getTxt_password(),excel.getStringData_Excel("Login",0,1));
		Library.custom_Click(login.getBtn_login());
		
		/*
		Library.Handle_Dropdown(null, null);
		
		Library.ScrollIntoElement(driver, null);
		
		Library.AlertHandle(driver).accept();
		Library.AlertHandle(driver).dismiss();
		String text = Library.AlertHandle(driver).getText();
		
		Library.MoveToElement_Click(driver, null);
		Library.RightClickOnElement(driver, null);
		
		String text1 = Library.get_Txt(null);
		
		Library.copyText_Keyboard(driver);
		*/
		
	
		
		/*
		login.getTxt_email().sendKeys("test@gmail.com");
		login.getTxt_password().sendKeys("abc@123");
		login.getBtn_login().click();
		*/
	
	}
	
}
