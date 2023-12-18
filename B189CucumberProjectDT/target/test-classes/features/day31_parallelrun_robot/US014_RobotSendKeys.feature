@US014
Feature: US014 Robot class reusable method kullanimi

  Scenario: TC01 verilen adrese dosya yüklemer
    Given kullanici "https://www.ilovepdf.com/compress_pdf" sayfasina gider
    When yuklenmek istenen dosyayi yukler
    Then dosyanin basariyla yuklendigini test eder
    And sayfayi kapatir