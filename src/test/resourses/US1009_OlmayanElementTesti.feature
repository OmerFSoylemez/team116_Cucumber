Feature: US1009 kullanici olmayan bir web elementi test eder
@heroku
  Scenario: TC15 olmayan butonu test edebilme

      Given kullanıcı "heroqaurl" anasayfasina gider
      When Add Element butonuna basar
      And  Delete butonu gorununceye kadar bekler
      Then Delete butonunun gorunur oldugunu test eder
      And Delete butonuna basarak butonu siler
      And Delete butonunun gorumediğini test eder
      Then sayfayi kapatir

