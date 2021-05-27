package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class SearchResultPage extends BasePage {
    public static final String SEARCH_RESULTS_PRODUCTS_LIST = "//div[@class='prod-cart__descr']";

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    /**
     * собрали элементы поиска в лист;
     *
     * @return Returns a List<WebElement> of element found
     */
    public List<WebElement> getSearchResultList() {
        return driver.findElements(xpath(SEARCH_RESULTS_PRODUCTS_LIST));
    }

    /**
     * @return узнали количество элементов в листе
     */
    public int countElements() {
        return getSearchResultList().size();
    }

}
