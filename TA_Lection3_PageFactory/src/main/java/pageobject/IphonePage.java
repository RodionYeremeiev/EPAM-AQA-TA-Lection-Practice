package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.xpath;

public class IphonePage extends BasePage{
    public static final String ADD_TO_CART_BUTTON = "//a[@class='prod-cart__buy']";
    public static final String CONTINUE_SHOPPING_BUTTON = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]";
    public static final String ADD_TO_CART_POPUP = "js_cart";

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    /**
     * add to cart iphone
     */
    public void clickOnAddToCartButton(){
        driver.findElements(xpath(ADD_TO_CART_BUTTON)).get(0).click();
    }

    public void clickOnContinueShoppingButton(){
        driver.findElement(xpath(CONTINUE_SHOPPING_BUTTON)).click();//продолжить покупки
    }

    public By getAddToCartPopUp(){
        return By.id(ADD_TO_CART_POPUP);
    }
}
