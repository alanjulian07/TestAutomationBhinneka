@Regress
Feature: Test Case fitur Tambah Produk Bhinneka.com

  @Positive
  Scenario: tambah produk ke keranjang dari hasil pencarian
    Given user membuka website "https://www.bhinneka.com/"
    And user login dengan email "alanjulian07@gmail.com" dan password "@Alan123"
    When user cari produk "xiaomi"
    And user masukkan produk ke keranjang
    And user tambah produk

  @Positive
  Scenario: tambah produk ke keranjang dari daftar kategori
    Given user membuka website "https://www.bhinneka.com/"
    And user login dengan email "alanjulian07@gmail.com" dan password "@Alan123"
    When user cari produk "sony"
    And user pilih filter aktif

  @Positive
  Scenario: tambah produk ke keranjang dari flash sale
    Given user membuka website "https://www.bhinneka.com/"
    And user login dengan email "alanjulian07@gmail.com" dan password "@Alan123"
    And user pilih dua produk flash sale
    Then produk ditambah ke keranjang


