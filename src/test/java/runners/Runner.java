package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(

            plugin = "html:target/cucumber-report.html",
            features = "src/test/resources",
            glue = "stepdefinitions",
            tags = "@wip",

            dryRun = true

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

     */
