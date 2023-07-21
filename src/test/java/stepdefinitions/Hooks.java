package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
            Driver.closeDriver();
        }
    }











}
    /*
        Hooks class'i tum scenario'lar için çaılşacak
        @Before ... veya @After ... notasyonlarina sahip method'lari içerir.
        TestNg'deki TestBase class'lari gibidir

        Ancak TestNG'de TestBase class'ını ISTERSEK extends diyerek kullanabiliyorduk
        istemezsek kullanamıyorduk
        Cucumber yapisi gereği stepdefinitions package i altında
        @Before... veya @After... olursa
        her Scenario için çalışacaktir

        Bundan dolayi özel bir durum yoksa
        Hooks class'ini sadece screenshot için kullanacağız.
     */