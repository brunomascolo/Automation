package com.qaprosoft.carina.demo.gui.laba.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage {

    @FindBy (xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']")
    private ExtendedWebElement result;

    @FindBy(xpath = "//span[contains(., 'Add to cart')]")
    private ExtendedWebElement addToCartButton;

    @FindBy(xpath = "//h2[contains(., 'Product successfully added to your shopping cart')]")
    private ExtendedWebElement productAddedToCart;

    public boolean isSearchCorrect(){
        return result.isElementPresent();
    }

    public void addToCart(){
        result.hover();
        addToCartButton.click();
    }

    public boolean isItemAddedToCart(){
        return productAddedToCart.isElementPresent();
    }

    public SearchPage(WebDriver driver) {
        super(driver);
    }
}
