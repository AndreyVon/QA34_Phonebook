package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest(){
        //click on Login Link
        click(By.cssSelector("[href='/login']"));
        // enter email
        type(By.name("email"), "ggipoel455@gmail.com");
        //enter password
        type(By.name("password"), "Iamlovekedy21$");
        //click on Login button
        click(By.cssSelector("[name='login']"));
        //assert Sign out button is present
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));

    }
}
