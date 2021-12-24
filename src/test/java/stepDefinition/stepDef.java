package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import pageObj.homePage;
import pageObj.loginPage;
import pageObj.categoryPage;

import static org.junit.Assert.assertEquals;

public class stepDef {
    homePage home = new homePage();
    loginPage login = new loginPage();
    categoryPage kat = new categoryPage();


    @Given("user membuka website {string}")
    public void user_membuka_website(String url) {
        home.open_bhinneka_website(url);
    }

    @When("user cari produk {string}")
    public void user_cari_produk(String produk){
        home.verify_cari_produk();
        home.input_cari_produk(produk);
        home.enter_search_btn();
        home.verify_produk_header(produk);
    }

    @Then("produk ditambah ke keranjang")
    public void produk_ditambah_ke_keranjang(){
        home.click_keranjang_btn();
        home.click_lanjut_keranjang_btn();
        assertEquals(home.verify_prod_flash_1(), home.verify_flash_prod_ker1());
        assertEquals(home.verify_prod_flash_2(), home.verify_flash_prod_ker2());

    }

    @And("user masukkan produk ke keranjang")
    public void user_masukkan_produk_ke_keranjang(){
        home.click_product_1();
        home.click_keranjang_btn();
        home.click_lanjut_keranjang_btn();
    }


    @And("user login dengan email {string} dan password {string}")
    public void user_login_dengan_email_dan_password(String email, String password){
        login.verify_login_btn();
        login.click_login_btn();
        login.verify_email_field();
        login.click_email_field();
        login.input_email(email);
        login.click_selanjutnya_btn();
        assertEquals(email, login.get_text_email());
        login.verify_password_field();
        login.click_password_field();
        login.input_password(password);
        login.verify_masuk_btn();
        login.click_masuk_btn();

    }

    @And("user tambah produk")
    public void user_tambah_produk(){
        home.click_plus_btn();
        home.click_hapus_btn();
        home.click_hapus_semua_btn();
        home.click_kembali_belanja_btn();
    }

    @And("user pilih filter aktif")
    public void user_pilih_filter_aktif(){
        kat.filter_merek_checkbox();
        kat.click_merek_checkbox();
        kat.filter_lokasi_checkbox();
        kat.click_lokasi_checkbox();
    }

    @And("user pilih dua produk flash sale")
    public void user_pilih_dua_produk_flash_sale(){
        home.click_prod_flash_1();
        home.verify_prod_flash_1();
        home.click_keranjang_btn();
        home.click_kembali_berbelanja_btn();
        home.open_bhinneka_website("https://www.bhinneka.com/");
        home.click_prod_flash_2();
        home.verify_prod_flash_2();
    }
}
