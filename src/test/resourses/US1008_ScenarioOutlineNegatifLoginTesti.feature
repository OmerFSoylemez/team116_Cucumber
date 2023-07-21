Feature: US1008 liste olarak verilen kullanıcılar ile negatif login testi

  Scenario Outline: TC14 Liste olarak verilen kullanicilar ile negatif login testi yapabilme

    Given kullanıcı "qdUrl" anasayfasina gider
    Then anasayfa login linkine click yapar
    And email kutusuna listeden "<kullaniciAdi>" yazar
    And password kutusuna listeden "<password>" yazar
    And 10 saniye bekler
    When login butonuna basar
    And basarili olarak giris yapilamadigini test eder
    Then sayfayi kapatir

    Examples:
    |kullaniciAdi|password|
    |selgun      |12345   |
    |aysegul     |34567   |
    |yusuf       |765432  |
    |sevda       |98765   |
    |murat       |5647309 |