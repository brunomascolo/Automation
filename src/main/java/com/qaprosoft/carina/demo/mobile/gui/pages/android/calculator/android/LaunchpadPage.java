package com.qaprosoft.carina.demo.mobile.gui.pages.android.calculator.android;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LaunchpadPage extends AbstractPage implements IMobileUtils {
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Calculator']")
    private ExtendedWebElement calculatorApp;

    public boolean isPageOpened(){
        return calculatorApp.isElementPresent();
    }

    public CalculatorPage openCalculator(){
        calculatorApp.click();
        return new CalculatorPage(getDriver());
    }

    public LaunchpadPage(WebDriver driver) {
        super(driver);
    }
}
