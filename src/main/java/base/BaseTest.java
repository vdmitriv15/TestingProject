package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Constants;

import java.time.Duration;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    protected void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod
    protected void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected WebDriverWait wait(int time) {return new WebDriverWait(driver, Duration.ofSeconds(time));}
}
