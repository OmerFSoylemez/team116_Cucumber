Feature: Amazonda toplu olarak verilen kelimeleri aratır

  Scenario Outline: TC13 Kullanici listedeki tüm ürünler için testi tekrarlayabilmeli

    Given kullanıcı "amazonUrl" anasayfasina gider
    Then arama kutusuna <aranacakKelime> yazip, ENTER tuşuna basar
    And arama sonuclarinin <aranacakKelime> icerdigini test eder
    Then sayfayi kapatir

    Examples:
    |aranacakKelime|
    |Nutella|
    |Java|
    |Samsung|
    |Cannes|
    |Nederland|
