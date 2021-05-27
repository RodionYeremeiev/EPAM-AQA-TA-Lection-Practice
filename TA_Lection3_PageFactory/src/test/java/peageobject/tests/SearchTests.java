package peageobject.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {
    public static final String SEARCH_KEYWORD = "iPhone 11";
    public static final String EXPECTED_SEARCH_QUERY = "query=iPhone";

    @Test(priority = 1)
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }


    @Test(priority = 2)
    public void checkElementsAmountOnSearchPage() {
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        getHomePage().implicitWait(30, TimeUnit.SECONDS);
        assertEquals(getSearchResultPage().countElements(), 12);//сравнили количество элементов актуальное с тем которое ожидаем
    }


    @Test(priority = 3)
    public void checkThatSearchResultsContainsSearchWord() {
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        for (WebElement webElement : getSearchResultPage().getSearchResultList()) { //прошлись циклом и проверили что каждый элемент листа содержит текс iPhone 11
            assertTrue(webElement.getText().contains(SEARCH_KEYWORD));
        }
    }

}
