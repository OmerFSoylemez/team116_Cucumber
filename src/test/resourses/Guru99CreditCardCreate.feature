Feature: Guru99 PaymentPage

  Scenario: Guru99 PaymentPage CreditCard Creator

    Given kullanıcı guru99 payment adresine gider
    Then kullanici sayfanın basliginin Payment icerdigini dogrular
    Then kullanici kredi karti uretme sayfasina gider
    Then üretilen kartin bilgilerini yazdirir
    And  sayfayi kapatir
