#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.

#  Eger featur file da kullanacagimiz scenario larda ortak adimlar var ise
#  Feature keywordunden sonra Background keywordu ile ortak adimlari belirtebiliriz
#  @BeforeMethod mantigi ile calisir
@US003
Feature: US003 Amazon testi

  Background:
    Given kullanici amazon sayfasina gider

  @iphone @samsung
  Scenario: TC01 arama kutusunda iphone aratilir
    When arama kutusunda iphone aratir
    And sayfayi kapatir

  @samsung
  Scenario: TC02 arama kutusunda samsung aratilir
    When arama kutusunda samsung aratir
    And sayfayi kapatir

  @nokia
  Scenario: TC03 arama kutusunda nokia aratilir
    When arama kutusunda nokia aratir
    And sayfayi kapatir