package peageobject.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTest {
    public static final String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1";

    @Test(priority = 4)
    public void checkAddToCart() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnAppleStorePage();
        getAppleStorePage().clickOnIphoneButton();
        getIphonePage().waitForLoadingComplete(30);
        getIphonePage().clickOnAddToCartButton();

        getIphonePage().waitForVisibilityOfElement(30, getIphonePage().getAddToCartPopUp());

        getIphonePage().clickOnContinueShoppingButton();

        assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }
}
