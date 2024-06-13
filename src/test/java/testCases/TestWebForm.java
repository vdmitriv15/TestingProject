package testCases;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.WebFormEvents;
import utils.Constants;


public class TestWebForm extends BaseTest {

    @Test
    public void testSubmitButton() {
        driver.get(Constants.URL);

        WebFormEvents webFormEvents = new WebFormEvents(driver);

        webFormEvents.assertTitle();
        webFormEvents.clickSubmitButton(wait(20));

        webFormEvents.assertSubmitMessage();
    }
}
