package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForLoadingComplete(long timeToWait) {
        new WebDriverWait(driver, timeToWait).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));//wait for page loading
    }

    /**
     *
     * @param timeout
     * @param locator
     *  ждем пока не отобразится попап с товаром добавленным в корзину
     */
    public void waitForVisibilityOfElement(long timeout, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     *  неявное ожидание 30 сек
     */
    public void implicitWait(long timeout, TimeUnit timeUnit) {
        driver.manage().timeouts().implicitlyWait(timeout, timeUnit);
    }


}
