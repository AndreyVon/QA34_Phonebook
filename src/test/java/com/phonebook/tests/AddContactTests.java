package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("ggipoel455@gmail.com").setPassword("Iamlovekedy21$"));
        clickOnLoginButton();


    }

    @Test
    public void  addContactPositiveTest(){
        clickOnAddLink();
        fillAddContactForm(new Contact()
                .setName("Andrei")
                .setLastName("Bubenshikov")
                .setPhone("8787667676767")
                .setEmail("ggipoel455@gmail.com")
                .setAddress("Tueva Kukueva 45")
                .setDescription("Obo mne"));
        clickOnSaveButton();
        Assert.assertTrue(isContactCreated("Andrei"));
    }

    @AfterMethod
    public void postCondition(){
        removeContact();
    }

}
