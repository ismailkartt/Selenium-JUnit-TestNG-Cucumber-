@US006

Feature: US006 Google Testi Scenario Outline

  Scenario Outline: TC01 Google sayfasinda arama kutusunda arac aratilir
    Given kullanici "https://www.google.com" sayfasina gider
    When google arama kutusunda "<araclar>" aratir
    Then sayfa basliginin "<araclar>" icerdigini test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
    | araclar |
    | honda |
    | ford |
    | toyota |
    | value |