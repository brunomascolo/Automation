package com.qaprosoft.carina.demo.gui.laba.pages;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.StringGenerator;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {

    @FindBy(xpath = "//input[@id = 'email']")
    private ExtendedWebElement emailSignIn;

    @FindBy(xpath = "//input[@id = 'passwd']")
    private ExtendedWebElement passwordSignIn;

    @FindBy(xpath = "//button[@id = 'SubmitLogin']")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//input[@id = 'email_create']")
    private ExtendedWebElement emailSignUp;

    @FindBy(xpath = "//button[@id = 'SubmitCreate']")
    private ExtendedWebElement createAccountButton;


    public SignInPage(WebDriver driver) {
        super(driver);
        setPageURL("index.php?controller=authentication&back=my-account");
    }

    public void loadEmail(String email){
        emailSignIn.type(email);
    }

    public void loadPassword(String password){
        passwordSignIn.type(password);
    }

    public void loadCredentials(){
        loadEmail(R.TESTDATA.get("signin_email"));
        loadPassword(R.TESTDATA.get("signin_password"));
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void registerEmail(String email){
        emailSignUp.type(email);
    }

    public CreateAccountPage clickCreateAccountButton(){
        emailSignUp.type(StringGenerator.generateEmail());
        createAccountButton.click();
        return new CreateAccountPage(driver);
    }
}
