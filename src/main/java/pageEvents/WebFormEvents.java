package pageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageEvents.baseEvents.BaseEvents;
import pageObjects.WebFormElements;

public class WebFormEvents extends BaseEvents {

    public WebFormEvents(WebDriver driver) {
        super(driver);
    }

    public void assertTitle() {
        assertTitle (WebFormElements.TITLE);
    }

    public void clickSubmitButton(WebDriverWait wait) {
        clickOnElementWithWait(wait, WebFormElements.SUBMIT_BUTTON);
    }

    public void assertSubmitMessage() {
        assertText("Received!", WebFormElements.CONFIRM_MESSAGE);
    }
}
