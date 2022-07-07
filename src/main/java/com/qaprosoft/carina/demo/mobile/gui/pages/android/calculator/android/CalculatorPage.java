package com.qaprosoft.carina.demo.mobile.gui.pages.android.calculator.android;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends AbstractPage implements IMobileUtils {

    @FindBy(id = "com.google.android.calculator:id/digit_7")
    private ExtendedWebElement number7;

    @FindBy(id = "com.google.android.calculator:id/digit_3")
    private ExtendedWebElement number3;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    private ExtendedWebElement plusSign;

    @FindBy(id = "com.google.android.calculator:id/eq")
    private ExtendedWebElement equalsSign;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    private ExtendedWebElement finalResult;



    public void makeAdittion(){
        number3.click();
        plusSign.click();
        number7.click();
        equalsSign.click();
    }

    public int getResult(){
        int result = Integer.parseInt(finalResult.getText());
        return result;
    }



    public CalculatorPage(WebDriver driver) {
        super(driver);
    }
}
