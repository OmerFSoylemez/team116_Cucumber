Feature: US1002 Kullanici Background kullanarak amazonda istediği aramalari yapar

    # Scenario'lardaki ortak başlangıç adımları için kullanılır

  Background:
    Given kullanıcı amazon sayfasina gider

  @smoke
  Scenario: TC04 Kullanici amazonda Nutella arayabilmeli
    Then arama kutusuna Nutella yazip, ENTER tuşuna basar
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir
  @smoke
  Scenario: TC05 Kullanici amazonda Samsung aratabilmeli
    Then arama kutusuna Samsung yazip, ENTER tuşuna basar
    And arama sonuclarinin Samsung icerdigini test eder
    And sayfayi kapatir

  Scenario: TC06 Kullanici amazonda Java aratabilme
    Then arama kutusuna Nutella yazip, ENTER tuşuna basar
    And arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir