package helperClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

/**
 * This class opens the web-interface of c-meeting and logs an existing user into his account
 */
public class LoginExistingUser {
    static public void loginexistinguser(WebDriver driver) {
        driver.get("https://cmt1-test.c-meeting.com/web3/home.xhtml");
        driver.manage().window().setSize(new Dimension(1052, 801));
        driver.findElement(By.cssSelector("#login-dropdown > span")).click();
        driver.findElement(By.id("emailField")).sendKeys("dominik.markart@cefriel.com");
        driver.findElement(By.id("passwordField")).sendKeys("Cefriel123");
        driver.findElement(By.id("me-inv-login-box-but")).click();
        driver.close();
    }
}
