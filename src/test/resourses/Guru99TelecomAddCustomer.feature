Feature: Guru99 Telecom Project
@wip
  Scenario: Guru99 Telecom Project Add Customer

    Given kullanıcı guru99 Telecom anasayfaya gider.
    Then sayfanın title inda Telecom icerdigini test eder
    And add customer sayfasına gider
    And formu doldurup submit butonuna basar
    And kaydin basarili oldugunu dogrular
    And costumer id numarasini yazdirir
    And sayfayi kapatir
