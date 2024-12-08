package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends  TestBase{
    @Test(enabled = false)
    public void createNewAccountPositiveTest(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("ggipoel455@gmail.com").setPassword("Iamlovekedy21$"));
        clickOnRegistrationButton();
        Assert.assertTrue(isSignOutButtonPresent());


    }

    @Test
    public void createNewAccountWithExistedEmailNegativeTest(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("ggipoel455@gmail.com").setPassword("Iamlovekedy21$"));
        clickOnRegistrationButton();
        Assert.assertTrue(isAlertPresent());

    }


}
