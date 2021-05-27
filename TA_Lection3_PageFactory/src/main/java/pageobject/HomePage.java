package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class HomePage extends BasePage {
    public static final String SEARCH_INPUT = "//input[@id='input_search']";
    public static final String PRODUCT_CATALOGUE_BUTTON = "//span[@class='sidebar-item']";
    public static final String APPLE_STORE_BUTTON = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]";
    public static final String AMOUNT_OF_PRODUCTS_IN_CART = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyWord(final String keyWord) {
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyWord, Keys.ENTER);
    }

    /**
     * каталог товаров
     */
    public void clickOnProductCatalogButton() {
        driver.findElement(xpath(PRODUCT_CATALOGUE_BUTTON)).click();
    }

    /**
     * Apple Store
     */
    public void clickOnAppleStorePage() {
        driver.findElement(xpath(APPLE_STORE_BUTTON)).click();
    }

    /**
     * получили 1 которая в корзине (один продукт)
     */
    public String getTextOfAmountProductsInCart() {
        return driver.findElement(xpath(AMOUNT_OF_PRODUCTS_IN_CART)).getText();
    }


}
