package com.qaprosoft.carina.demo.gui.laba.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.laba.components.NavBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@class='nav']")
    private NavBar navBar;

    @FindBy(id = "search_query_top")
    private ExtendedWebElement searchBar;

    @FindBy(xpath = "//button[@name='submit_search']")
    private ExtendedWebElement searchButton;

    public SearchPage searchItem(String item){
        searchBar.type(item);
        searchButton.click();
        return new SearchPage(driver);
    }



    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("index.php");
    }

    public NavBar getNavBar(){
        return navBar;
    }
}
