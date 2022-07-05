package com.qaprosoft.carina.demo.gui.laba.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.laba.pages.ContactUsPage;
import com.qaprosoft.carina.demo.gui.laba.pages.SignInPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavBar extends AbstractUIObject {

    @FindBy(xpath = "//div[@class='header_user_info']/a")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//div[@id='contact-link']/a")
    private ExtendedWebElement contactUsButton;

    @FindBy(xpath = "//div[@class='header_user_info']/a[@class='account']")
    private ExtendedWebElement accountUserButton;


    public NavBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SignInPage clickSignInButton(){
        signInButton.click();
        return new SignInPage(driver);
    }

    public ContactUsPage clickContactUsButton(){
        contactUsButton.click();
        return new ContactUsPage(driver);
    }

    public boolean userSignedIn(){
        return accountUserButton.isElementPresent(3);
    }
}
