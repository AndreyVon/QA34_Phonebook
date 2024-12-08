package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("ggipoel455@gmail.com").setPassword("Iamlovekedy21$"));
        clickOnLoginButton();
        Assert.assertTrue(isSignOutButtonPresent());

    }
    @Test
    public void loginNegativeTestWithoutEmail(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setPassword("Iamlovekedy21$"));
        clickOnLoginButton();
        Assert.assertTrue(isAlertPresent());

    }

}
