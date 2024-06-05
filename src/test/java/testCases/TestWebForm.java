package testCases;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageEvents.WebFormEvents;
import utils.Constants;

import java.time.Duration;

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
