package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "ggipoel455@gmail.com");
        type(By.name("password"), "Iamlovekedy21$");
        click(By.cssSelector("[name='login']"));
        //gffgfgfgfgfg

    }
    @Test
    public void  addContactPositiveTest(){
        //click on Add link
        click(By.cssSelector("[href='/add']"));
        //enter name
        type(By.cssSelector("[placeholder='Name']"), "Andrei");
        //enter surname
        type(By.cssSelector("[placeholder='Last Name']"), "Bubenshikov");
        //enter phone
        type(By.cssSelector("[placeholder='Phone']"), "8787667676767");
        //enter email
        type(By.cssSelector("[placeholder='email']"), "ggipoel455@gmail.com");
        //enter address
        type(By.cssSelector("[placeholder='Address']"), " Tueva Kukueva 45");
        //enter description
        type(By.cssSelector("[placeholder='description']"), "Obo mne");
        //enter click in Save button
        // click(By.cssSelector("[xpath='1']"));
        // assert Contact is added by text
    }
}
