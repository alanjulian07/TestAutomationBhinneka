package pageObj;

import stepDefinition.Base;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class loginPage extends Base {

    By login_btn        = By.xpath("//span[contains(text(), 'Login')]//parent::button");
    By email_field      = By.xpath("//input[@id='email']");
    By selanjutnya_btn  = By.xpath("//button[@id='next']");
    By password_field   = By.xpath("//input[@id='password']");
    By masuk_btn        = By.xpath("//span[contains(text(), 'MASUK')]//parent::button");
    By email_exist      = By.className("account-type");

    public void verify_login_btn() {
        waitUntilElementIsVisible(login_btn, 15);
        driver.findElement(login_btn).isDisplayed();
        String text = driver.findElement(login_btn).getText();
        assertEquals(text, "Login");
    }

    public void click_login_btn() {
        waitUntilElementIsVisible(login_btn, 15);
        driver.findElement(login_btn).click();
    }

    public void verify_email_field() {
        waitUntilElementIsVisible(email_field, 15);
        driver.findElement(email_field).isDisplayed();
    }

    public String get_text_email() {
        waitUntilElementIsVisible(email_exist, 15);
        return driver.findElement(email_exist).getText();
    }

    public void click_email_field() {
        waitUntilElementIsVisible(email_field, 15);
        driver.findElement(email_field).click();
    }

    public void input_email(String email){driver.findElement(email_field).sendKeys(email);}


    public void click_selanjutnya_btn() {
        waitUntilElementIsVisible(selanjutnya_btn, 15);
        driver.findElement(selanjutnya_btn).click();
    }

    public void verify_password_field() {
        waitUntilElementIsVisible(password_field, 15);
        driver.findElement(password_field).isDisplayed();
    }

    public void click_password_field() {
        waitUntilElementIsVisible(password_field, 15);
        driver.findElement(password_field).click();
    }

    public void input_password(String pass){driver.findElement(password_field).sendKeys(pass);}

    public void verify_masuk_btn() {
        waitUntilElementIsVisible(masuk_btn, 15);
        driver.findElement(masuk_btn).isDisplayed();
        String text = driver.findElement(masuk_btn).getText();
        assertEquals(text, "MASUK");
    }

    public void click_masuk_btn() {
        waitUntilElementIsVisible(masuk_btn, 15);
        driver.findElement(masuk_btn).click();
    }


}
