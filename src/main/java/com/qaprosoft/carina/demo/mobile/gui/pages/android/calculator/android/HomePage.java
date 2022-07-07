package com.qaprosoft.carina.demo.mobile.gui.pages.android.calculator.android;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage implements IMobileUtils {

    @FindBy(id = "com.google.android.apps.nexuslauncher:id/date")
    private ExtendedWebElement dateWidget;

    @FindBy(id = "com.google.android.apps.nexuslauncher:id/search_container_hotseat")
    private ExtendedWebElement searchBar;

    public boolean isPageOpened(){
        return dateWidget.isElementPresent();
    }

    public LaunchpadPage openLaunchpad(){
        searchBar.click(); //use this way because with swipe had some troubles with the long press, instead of opening the launchpad it opens de widgets settings
        return new LaunchpadPage(getDriver());
    }


    public HomePage(WebDriver driver) {
        super(driver);
    }
}
