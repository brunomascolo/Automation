package com.qaprosoft.carina.demo.gui.laba.pages;

import com.qaprosoft.carina.core.foundation.utils.StringGenerator;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"id_contact\"]/option[2]")
    private ExtendedWebElement subjectHeading;

    @FindBy(id = "email")
    private ExtendedWebElement email;

    @FindBy(css = "#id_order")
    private ExtendedWebElement orderReference;

    @FindBy(id = "message")
    private ExtendedWebElement message;

    @FindBy(xpath = "//button[@id='submitMessage']")
    private ExtendedWebElement sendButton;

    @FindBy(css = ".alert")
    private ExtendedWebElement confirmationMessage;

    public void fillContactForm(){
        subjectHeading.click();
        email.type(StringGenerator.generateEmail());
        orderReference.type(StringGenerator.generateNumeric(10));
        message.type(StringGenerator.generateWord(100));
        sendButton.click();
    }

    public boolean isMessageSent(){
        return confirmationMessage.isElementPresent();
    }

    public ContactUsPage(WebDriver driver) {
        super(driver);
        setPageURL("index.php?controller=contact");
    }
}
