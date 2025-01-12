package com.phonebook.fw;

import com.phonebook.models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactHelper extends BaseHelper {
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnSaveButton() {
        click(By.cssSelector("button:nth-child(7)"));
    }

    public void fillAddContactForm(Contact contact) {
        type(By.cssSelector("[placeholder='Name']"), contact.getName());
        type(By.cssSelector("[placeholder='Last Name']"), contact.getLastName());
        type(By.cssSelector("[placeholder='Phone']"), contact.getPhone());
        type(By.cssSelector("[placeholder='email']"), contact.getEmail());
        type(By.cssSelector("[placeholder='Address']"), contact.getAddress());
        type(By.cssSelector("[placeholder='description']"), contact.getDescription());
    }

    public void clickOnAddLink() {
        click(By.cssSelector("[href='/add']"));
    }

    public void removeContact() {
        click(By.cssSelector("[class='contact-page_leftdiv__yhyke']"));
        click(By.xpath("//button[.='Remove']"));
    }

    public boolean isContactCreated(String text) {
        List<WebElement> contacts = ApplicationManager.driver.findElements(By.cssSelector("h2"));
        for(WebElement element: contacts){
            if (element.getText().contains(text))
                return true;
        }
        return false;
    }

    public int sizeOfContacts() {
        if(isElementPresent(By.cssSelector("[class='contact-item_card__2SOIM']"))){
            return ApplicationManager.driver.findElements(By.cssSelector("[class='contact-item_card__2SOIM']")).size();
        }
        return 0;
    }
}
