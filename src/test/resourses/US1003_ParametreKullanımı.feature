
Feature: US1003 Amazonda parametre olarak urun arama

  Scenario: TC07 Parametre olarak girilen urun aratabilme

    Given kullanıcı "amazonUrl" anasayfasina gider
    Then arama kutusuna "Cokokrem" yazip, ENTER tuşuna basar
    And arama sonuclarinin "Cokokrem" icerdigini test eder
    And 5 saniye bekler
    And sayfayi kapatir

    #step yazarken sayi kullanilirsa, otamatik olarak parametre kabul eder.