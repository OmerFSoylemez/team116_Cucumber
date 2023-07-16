package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanıcı amazon sayfasina gider")
    public void kullanıcı_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("arama kutusuna Nutella yazip, ENTER tuşuna basar")
    public void arama_kutusuna_nutella_yazip_enter_tuşuna_basar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();

    }
    @Then("arama kutusuna Samsung yazip, ENTER tuşuna basar")
    public void aramaKutusunaSamsungYazipENTERTuşunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Samsung"+ Keys.ENTER);
    }
    @And("arama sonuclarinin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder() {
        String expectedIcerik = "Samsung";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }
    @Then("arama kutusuna Java yazip, ENTER tuşuna basar")
    public void aramaKutusunaJavaYazipENTERTuşunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String expectedIcerik = "Java";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }

    @Then("arama kutusuna {string} yazip, ENTER tuşuna basar")
    public void aramaKutusunaYazipENTERTuşunaBasar(String aranacakUrun) {
        amazonPage.aramaKutusu.sendKeys("aranacakUrun" + Keys.ENTER);
    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String arananIcerik) {
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(arananIcerik));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklemeSuresi){
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Given("kullanıcı {string} anasayfasina gider")
    public void kullanıcıAnasayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @When("ilk urunu tiklar")
    public void ilk_urunu_tiklar() {
        amazonPage.ilkUrunElementi.click();
    }
    @Then("urun isminde\"Nutella\" oldugunu test eder")
    public void urun_isminde_nutella_oldugunu_test_eder(String istenenIcerik) {
        Assert.assertTrue(amazonPage.ilkUrunIsimElementi.getText().contains(istenenIcerik));
    }
}
