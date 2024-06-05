package pageEvents.baseEvents;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public abstract class BaseEvents {

    private final WebDriver driver;

    public BaseEvents(WebDriver driver) {
        this.driver = driver;
    }

    protected void waitUntilClickable(@NotNull WebDriverWait wait, By element) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));
    }

    protected void clickOnElementWithWait(@NotNull WebDriverWait wait, By element) {
        waitUntilClickable(wait, element);
        driver.findElement(element).click();
    }

    protected void clickOnElement(By element) {
        driver.findElement(element).click();
    }

    protected void assertTitle(String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    protected void assertText(String text, By element) {
        Assert.assertEquals(text, driver.findElement(element).getText());
    }
}
