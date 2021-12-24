package pageObj;

import org.openqa.selenium.By;
import stepDefinition.Base;

public class categoryPage extends Base {

    By merek         = By.xpath("//span[contains(text(), 'SONY')]//parent::label");
    By lokasi        = By.xpath("//span[contains(text(), 'Depok')]//parent::label");

    public void filter_merek_checkbox() {
        waitUntilElementIsVisible(merek, 15);
        driver.findElement(merek).isDisplayed();
        String text = driver.findElement(merek).getText();
    }

    public void filter_lokasi_checkbox() {
        waitUntilElementIsVisible(lokasi, 15);
        driver.findElement(lokasi).isDisplayed();
        String text = driver.findElement(lokasi).getText();
    }

    public void click_merek_checkbox() {
        waitUntilElementIsVisible(merek, 15);
        driver.findElement(merek).click();
    }
    public void click_lokasi_checkbox() {
        waitUntilElementIsVisible(lokasi, 15);
        driver.findElement(lokasi).click();
    }

}
