package com.phonebook.tests;

import com.phonebook.models.Contact;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegisterForm(new User().setEmail("ggipoel455@gmail.com").setPassword("Iamlovekedy21$"));
        app.getUser().clickOnLoginButton();


    }

    @Test
    public void  addContactPositiveTest(){
        app.getContact().clickOnAddLink();
        app.getContact().fillAddContactForm(new Contact()
                .setName("Andrei")
                .setLastName("Bubenshikov")
                .setPhone("8787667676767")
                .setEmail("ggipoel455@gmail.com")
                .setAddress("Tueva Kukueva 45")
                .setDescription("Obo mne"));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactCreated("Andrei"));
    }

    @AfterMethod
    public void postCondition(){
        app.getContact().removeContact();
    }

}
