package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.Guru99page;
import utilities.ConfigReader;
import utilities.Driver;

public class Guru99StepDefinition {

    Guru99page guru99page = new Guru99page();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanıcı guru99 Telecom anasayfaya gider.")
    public void kullanıcı_guru99_telecom_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("guru99Url1"));
    }
    @Then("sayfanın title inda Telecom icerdigini test eder")
    public void sayfanın_title_inda_telecom_icerdigini_test_eder() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedIcerik = "Telecom";
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
    }
    @Then("add customer sayfasına gider")
    public void add_customer_sayfasına_gider() {
        guru99page.AddCustomer.click();
        Driver.getDriver().switchTo().frame((guru99page.iframe));
        guru99page.reklamKapat.click();
        Driver.getDriver().switchTo().defaultContent();

    }
    @Then("formu doldurup submit butonuna basar")
    public void formu_doldurup_submit_butonuna_basar() {
        guru99page.done.click();
        guru99page.name.sendKeys(faker.name().firstName()+ Keys.TAB);
        guru99page.lastname.sendKeys(faker.name().lastName() + Keys.TAB);
        guru99page.email.sendKeys(faker.internet().emailAddress()+Keys.TAB);
        guru99page.adress.sendKeys(faker.address().firstName());
        guru99page.phonenumber.sendKeys("45632587821");
        guru99page.submit.click();
    }
    @Then("kaydin basarili oldugunu dogrular")
    public void kaydin_basarili_oldugunu_dogrular() {
        String actualVerify = guru99page.details.getText();
        String expectedString = "Account Details";
        Assert.assertTrue(actualVerify.contains(expectedString));

    }
    @Then("costumer id numarasini yazdirir")
    public void costumer_id_numarasini_yazdirir() {
        String customerIdNumber = guru99page.costumerID.getText();
        System.out.println("Customer ID :" + customerIdNumber);
    }

    @Given("kullanıcı guru{int} payment adresine gider")
    public void kullanıcıGuruPaymentAdresineGider(int arg0) {
    }


    @Then("kullanici kredi karti uretme sayfasina gider")
    public void kullaniciKrediKartiUretmeSayfasinaGider() {

    }

    @Then("kullanici sayfanın basliginin Payment icerdigini dogrular")
    public void kullaniciSayfanınBasligininPaymentIcerdiginiDogrular() {
    }

    @Then("üretilen kartin bilgilerini yazdirir")
    public void üretilenKartinBilgileriniYazdirir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String cardNumber =guru99page.cardNumber.getText();
        String cvv = guru99page;
        String exdate = guru99page;
        String limit = guru99page;

        System.out.println("\ Card Information\" + cardNumber + );

    }
}
