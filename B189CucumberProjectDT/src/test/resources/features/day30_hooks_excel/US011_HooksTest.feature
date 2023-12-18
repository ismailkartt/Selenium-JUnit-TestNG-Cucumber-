@US011
Feature: US011 Google Testi hooks

  Scenario: TC01 Google sayfasinda arama kutusunda arac aratilir
    Given kullanici "https://google.com" sayfasina gider
    When google arama kutusunda "ford" aratir
    Then sayfa basliginin "ford" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir

  @honda
  Scenario: TC02 Google sayfasinda arama kutusunda arac aratilir
    Given kullanici "https://google.com" sayfasina gider
    When google arama kutusunda "honda" aratir
    Then sayfa basliginin "hondaaa" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir

  @toyota
  Scenario: TC03 Google sayfasinda arama kutusunda arac aratilir
    Given kullanici "https://google.com" sayfasina gider
    When google arama kutusunda "toyota" aratir
    Then sayfa basliginin "toyota" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir