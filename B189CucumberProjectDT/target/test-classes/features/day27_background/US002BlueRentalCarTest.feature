@US002
Feature: US002 BlueRentalCar Test
  Scenario: TC01 Verilen email ve password ile login olunur
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And email ve password bilgileri ile login olur
    And sayfayi kapatir