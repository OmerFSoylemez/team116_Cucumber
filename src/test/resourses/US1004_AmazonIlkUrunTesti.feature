Feature: US1004 Amazonda listeden ilk urunun dogru oldugunu test eder

  Scenario: TC08 ilk urun ismi arattirdigimiz kelimeyi icermeli

    Given kullanıcı "amazonUrl" anasayfasina gider
      Then arama kutusuna "Nutella" yazip, ENTER tuşuna basar
      When ilk urunu tiklar
      Then urun isminde"Nutella" oldugunu test eder
      And sayfayi kapatir