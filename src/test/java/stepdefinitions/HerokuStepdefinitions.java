package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HerokuStepdefinitions {

    HerokuPage herokuPage = new HerokuPage();

    @When("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuPage.addButonu.click();
    }
    @When("Delete butonu gorununceye kadar bekler")
    public void delete_butonu_gorununceye_kadar_bekler() {
    // implicitly adımı yeterli olduğu için bu adıma kod yazılmadı.
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButonu.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuPage.deleteButonu.click();
    }
    @Then("Delete butonunun gorumediğini test eder")
    public void delete_butonunun_gorumediğini_test_eder() {
        //Assert.assertFalse(herokuPage.deleteButonu.isDisplayed());
        //element olmadığı için locate etmemiz mümkün değil
        //dolayısıyla da NoSuchElementException alıyoruz

        try {
            Assert.assertFalse(herokuPage.deleteButonu.isDisplayed());
        } catch (Exception e) {

            Assert.assertTrue(true);
            // catch blogu çalıştıysa,
            // delete butonu bulunamadi yani testimiz pass oldu demektir
            // 45. satirda yazdigimiz kod, sadece %100 passed olacak bir assertion'dir.


        }
    }
}
