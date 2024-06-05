package pageObjects;

import org.openqa.selenium.By;

public interface WebFormElements {

    String TITLE = "Web form";
    By WEB_FORM_TEXT = By.xpath("//h1[contains(text(),'Web form')]");
    By SUBMIT_BUTTON = By.xpath("//button[contains(text(),'Submit')]");
    By CONFIRM_MESSAGE = By.id("message");

}
