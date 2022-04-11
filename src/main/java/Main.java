import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.spec.ECField;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Java\\Selenium_training\\src\\main\\resources\\geckodriver.exe");
        FirefoxDriver browser = new FirefoxDriver();
        browser.get("https://rk.suraim.com.mx/RKWebSite/Account/Login");
        WebElement coverImg = new WebDriverWait(browser, Duration.ofSeconds(10))
                .until(b -> browser.findElement(By.cssSelector("#PopUpInit > div:nth-child(1) > div:nth-child(1)")));
        System.out.println("is cover Image enabled? "+coverImg.isEnabled());

        WebElement backDiv = browser.findElement(By.cssSelector("#PopUpInit > div:nth-child(1)"));
        backDiv.click();
        WebElement email = browser.findElement(By.id("UserName"));
        email.sendKeys("");
        WebElement password = browser.findElement(By.xpath("//*[@id=\"Password\"]"));
        password.sendKeys("");
        WebElement login = browser.findElement(By.id("btnEntrar"));
        login.click();

    }
}
