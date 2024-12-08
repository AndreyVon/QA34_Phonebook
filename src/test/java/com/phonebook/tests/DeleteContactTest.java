package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("ggipoel455@gmail.com").setPassword("Iamlovekedy21$"));
        clickOnLoginButton();
        clickOnAddLink();
        fillAddContactForm(new Contact()
                .setName("Andrei")
                .setLastName("Bubenshikov")
                .setPhone("8787667676767")
                .setEmail("ggipoel455@gmail.com")
                .setAddress("Tueva Kukueva 45")
                .setDescription("Obo mne"));
        clickOnSaveButton();

    }

    @Test
    public void deleteContactPositiveTest(){
        int sizeBefore = sizeOfContacts();
        click(By.cssSelector("[class='contact-item_card__2SOIM']"));
        click(By.xpath("//button[.='Remove']"));
        pause(1000);
        int sizeAfter = sizeOfContacts();
        Assert.assertEquals(sizeAfter, sizeBefore -1);
    }


}
