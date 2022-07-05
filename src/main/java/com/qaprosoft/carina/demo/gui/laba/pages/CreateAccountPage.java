package com.qaprosoft.carina.demo.gui.laba.pages;

import com.qaprosoft.carina.core.foundation.utils.StringGenerator;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends AbstractPage {

    @FindBy(id = "customer_firstname")
    private ExtendedWebElement firstName;

    @FindBy(id = "customer_lastname")
    private ExtendedWebElement lastName;

    @FindBy(css = "#id_gender1")
    private ExtendedWebElement mrCheck;

    @FindBy(css = "#id_gender2")
    private ExtendedWebElement mrsCheck;

    @FindBy(xpath = "//input[@id = 'passwd']")
    private ExtendedWebElement password;

    @FindBy(xpath = "//*[@id='days']/option[5]")
    private ExtendedWebElement daysSelector;

    @FindBy(xpath = "//*[@id='months']/option[3]")
    private ExtendedWebElement monthsSelector;

    @FindBy(xpath = "//*[@id='years']/option[2]")
    private ExtendedWebElement yearsSelector;

    @FindBy(id = "firstname")
    private ExtendedWebElement addressFirstName;

    @FindBy(id = "lastname")
    private ExtendedWebElement addressLastName;

    @FindBy(css = "#company")
    private ExtendedWebElement company;

    @FindBy(css = "#address1")
    private ExtendedWebElement address;

    @FindBy(css = "#address2")
    private ExtendedWebElement address2;

    @FindBy(xpath = "//input[@id = 'city']")
    private ExtendedWebElement city;

    @FindBy(xpath = "//*[@id='id_state']/option[5]")
    private ExtendedWebElement stateSelector;

    @FindBy(xpath = "//input[@id = 'postcode']")
    private ExtendedWebElement zipCode;

    @FindBy(xpath = "//*[@id='id_country']/option[2]")
    private ExtendedWebElement countrySelector;

    @FindBy(id = "other")
    private ExtendedWebElement additionalInformation;

    @FindBy(id = "phone")
    private ExtendedWebElement homePhone;

    @FindBy(id = "phone_mobile")
    private ExtendedWebElement mobilePhone;

    @FindBy(xpath = "//input[@id = 'alias']")
    private ExtendedWebElement addressAlias;

    @FindBy(xpath = "//button[@id = 'submitAccount']")
    private ExtendedWebElement registerButton;

    public void checkMr(){
        mrCheck.click();
    }

    public void checkMrs(){
        mrsCheck.click();
    }

    public void fillRegisterForm(){
        firstName.type(StringGenerator.generateWord(10));
        lastName.type(StringGenerator.generateWord(10));
        password.type(StringGenerator.generateWord(8));
        daysSelector.click();
        monthsSelector.click();
        yearsSelector.click();
        addressFirstName.type(StringGenerator.generateWord(10));
        addressLastName.type(StringGenerator.generateWord(10));
        company.type(StringGenerator.generateWord(10));
        address.type(StringGenerator.generateWord(10));
        address2.type(StringGenerator.generateWord(10));
        city.type(StringGenerator.generateWord(10));
        stateSelector.click();
        zipCode.type(StringGenerator.generateNumeric(5));
        countrySelector.click();
        additionalInformation.type(StringGenerator.generateWord(10));
        homePhone.type(StringGenerator.generateNumeric(10));
        mobilePhone.type(StringGenerator.generateNumeric(10));
        addressAlias.type(StringGenerator.generateWord(10));
        registerButton.click();
    }






    public CreateAccountPage(WebDriver driver) {
        super(driver);
        setPageURL("index.php?controller=authentication&back=my-account#account-creation");
    }
}
