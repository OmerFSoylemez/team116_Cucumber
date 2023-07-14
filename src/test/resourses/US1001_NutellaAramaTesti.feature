Feature: US1001_Nutella arama testi

        Scenario: TC01 Kullanici amazonda Nutella arayabilmeli
        Given kullanıcı amazon sayfasina gider
        Then arama kutusuna Nutella yazip, ENTER tuşuna basar
        And arama sonuclarinin Nutella icerdigini test eder
        And sayfayi kapatir

        Scenario: TC02 Kullanici amazonda Samsung aratabilmeli
        Given kullanıcı amazon sayfasina gider
        Then arama kutusuna Samsung yazip, ENTER tuşuna basar
        And arama sonuclarinin Samsung icerdigini test eder
        And sayfayi kapatir

        Scenario: TC03 Kullanici amazonda Java aratabilme
        Given kullanıcı Java sayfasina gider
        Then arama kutusuna Nutella yazip, ENTER tuşuna basar
        And arama sonuclarinin Java icerdigini test eder
        And sayfayi kapatir


