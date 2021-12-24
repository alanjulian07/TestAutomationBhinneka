package pageObj;

import stepDefinition.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

public class homePage extends Base {

    By cari_produk              = By.xpath("//input[@id='searchProduct']");
    By produk_header            = By.xpath("//div[@class='css-1j819fl e1epldgx0']");
    By search_btn               = By.name("search");
    By product_1                = By.xpath("//div[@class='css-1pthsci']");
    By prod_1                   = By.xpath("//*[@id='__next']/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div/a");
    By plus_btn                 = By.xpath("//i[@name='plus']");
    By keranjang_btn            = By.xpath("//span[contains(text(), 'Tambah ke')]//parent::span");
    By lanjut_keranjang_btn     = By.xpath("//span[contains(text(),'Lanjut ke Keranjang')]");
    By hapus_btn                = By.xpath("//body/div[@id='__next']/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]");
    By hapus_semua_btn          = By.xpath("//body/div[@id='__next']/div/div/div/div/div/div/button[2]");
    By kembali_belanja_btn      = By.xpath("//span[contains(text(), 'Kembali Belanja')]//parent::button");
    By kembali_berbelanja_btn   = By.xpath("//span[contains(text(), 'Kembali Berbelanja')]//parent::button");
    By prod_flash_1             = By.xpath("/html/body/div/div[3]/div[3]/div[3]/div/div/div[2]/div/div/div[1]/a/img");
    By prod_flash_2             = By.xpath("/html/body/div/div[3]/div[3]/div[3]/div/div/div[2]/div/div/div[2]/a/div[2]/div[1]/p");
    By label_prod_flash1        = By.xpath("/html/body/div/div[3]/div[2]/div[2]/div[2]/div/h1");
    By label_prod_flash2        = By.xpath("/html/body/div/div[3]/div[2]/div[2]/div[2]/div/h1");
    By label_prod1_keranjang    = By.xpath("/html/body/div/div[3]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[2]/div[1]/h4");
    By label_prod2_keranjang    = By.xpath("/html/body/div/div[3]/div[2]/div[3]/div[1]/div[2]/div/div[2]/div[2]/div[1]/h4");



    public void open_bhinneka_website(String url) {
        driver.get(url);
    }

    public void verify_cari_produk() {
        waitUntilElementIsVisible(cari_produk, 15);
        driver.findElement(cari_produk).isDisplayed();
    }

    public void input_cari_produk(String produk) {
        waitUntilElementIsVisible(cari_produk, 15);
        driver.findElement(cari_produk).sendKeys(produk);
    }

    public void enter_search_btn() {
        waitUntilElementIsVisible(search_btn, 15);
        driver.findElement(cari_produk).sendKeys(Keys.ENTER);
    }

    public void verify_produk_header(String produk) {
        waitUntilElementIsVisible(produk_header, 15);
        driver.findElement(produk_header).isDisplayed();
        String text = driver.findElement(produk_header).getText();
        assertEquals(text, produk);
    }

    public void click_product_1() {
        waitUntilElementIsVisible(product_1, 15);
        driver.findElement(product_1).click();
    }

    public void click_plus_btn() {
        waitUntilElementIsVisible(plus_btn, 15);
        driver.findElement(plus_btn).click();
    }

    public void click_keranjang_btn() {
        waitUntilElementIsVisible(keranjang_btn, 15);
        driver.findElement(keranjang_btn).click();
    }

    public void click_lanjut_keranjang_btn() {
        waitUntilElementIsVisible(lanjut_keranjang_btn, 15);
        driver.findElement(lanjut_keranjang_btn).click();
    }

    public void click_hapus_btn() {
        waitUntilElementIsVisible(hapus_btn, 15);
        driver.findElement(hapus_btn).click();
    }

    public void click_hapus_semua_btn() {
        waitUntilElementIsVisible(hapus_semua_btn, 15);
        driver.findElement(hapus_semua_btn).click();
    }

    public void click_kembali_belanja_btn() {
        waitUntilElementIsVisible(kembali_belanja_btn, 15);
        driver.findElement(kembali_belanja_btn).click();
    }

    public void click_kembali_berbelanja_btn() {
        waitUntilElementIsVisible(kembali_berbelanja_btn, 15);
        driver.findElement(kembali_berbelanja_btn).isDisplayed();
        driver.findElement(kembali_berbelanja_btn).click();
    }

    public void click_prod_flash_1(){
        waitUntilElementIsVisible(prod_flash_1, 15);
        driver.findElement(prod_flash_1).click();
    }

    public String verify_prod_flash_1(){
        waitUntilElementIsVisible(label_prod_flash1, 15);
        return driver.findElement(label_prod_flash1).getText();
    }

    public void click_prod_flash_2(){
        waitUntilElementIsVisible(prod_flash_2, 15);
        driver.findElement(prod_flash_2).click();
    }

    public String verify_prod_flash_2(){
        waitUntilElementIsVisible(label_prod_flash2, 15);
        return driver.findElement(label_prod_flash2).getText();
    }

    public String verify_flash_prod_ker1(){
        waitUntilElementIsVisible(label_prod1_keranjang, 15);
        return driver.findElement(label_prod1_keranjang).getText();
    }

    public String verify_flash_prod_ker2(){
        waitUntilElementIsVisible(label_prod2_keranjang, 15);
        return driver.findElement(label_prod2_keranjang).getText();
    }

}
