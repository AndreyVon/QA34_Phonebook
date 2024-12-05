package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTests extends  TestBase{
    @Test(enabled = false)
    public void createNewAccountPositiveTest(){
        Random random = new Random();
        int i = random.nextInt(1000) + 1000;
        //click on Login Link
        click(By.cssSelector("[href='/login']"));
        // enter email
        type(By.name("email"), "ggipoel455" + i + "@gmail.com");
        //enter password
        type(By.name("password"), "Iamlovekedy21$");
        // click on Registration button
        click(By.cssSelector("[name='registration']"));
        //asser Sign Out button is present
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));


    }

    @Test
    public void createNewAccountWithExistedEmailNegativeTest(){
        //click on Login Link
        click(By.cssSelector("[href='/login']"));
        // enter email
        type(By.name("email"), "ggipoel455@gmail.com");
        //enter password
        type(By.name("password"), "Iamlovekedy21$");
        // click on Registration button
        click(By.cssSelector("[name='registration']"));
        //asser allert is present
        Assert.assertTrue(isAlertPresent());



    }


}
