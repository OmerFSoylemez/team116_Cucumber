package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(

            plugin = {"html:target/cucumber-report.html",
                      "json:target/json-repots/cucumber.json",
                      "junit:target/xml-report/cucumber.xml"
                     },
            features = "src/test/resourses",
            glue = "stepdefinitions",
            tags = "@wip",

            dryRun = false

    )
    public class Runner {

}
    /*
        Runner class'i bos bir class'dir
        Runner class'ının bize sağladığı işlev
        Sahip olduğu iki notasyon sayesindedir

        dryRun = true yaptigimizda
        var olan adimlari calistirmadan
        sadece eksik adimlari bulur ve onlarla ilgili step definition ları bize verir.

        EGER eksik adimlari yoksa
        bu durumu raporlamak için Test PASSED işaretlenir.



        features = "src/test/resourses",
        glue = "stepdefinitions",

        bu iki klasör birbiriyle ilişiklendirildiği için
        bu klasörlerin altındaki tüm file lar ve class lar ilişiklidir.
        Cucumber da file ve class ları birebir eşleştirmek yerine tümünü eşleştirir.

        Eger siz spesifik olarak 1 feature'i
        belirlediğiniz 1 stepdefinition class i ile çaılşmasını isterseniz
        Runner class ında bu eşleşmeyi yapabilirsiniz.



     */
