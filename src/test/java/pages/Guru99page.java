package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guru99page {
    public Guru99page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[text()='Add Customer'])[1]")
    public WebElement AddCustomer;

    @FindBy(xpath = "//label[@for='done']")
    public WebElement done;

    @FindBy(xpath = "//label[text()='Customer name must not be blank']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='message']")
    public WebElement message;

    @FindBy(xpath="//*[@name='addr']")
    public WebElement adress;

    @FindBy(xpath = "//input[@id='telehoneno']")
    public WebElement phonenumber;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//h1")
    public WebElement details;

    @FindBy(xpath = "(//h3[1]")
    public WebElement costumerID;

    @FindBy(xpath = "//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']")
    public WebElement iframe;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement reklamKapat;

    @FindBy(xpath = "")
    public  WebElement cardCreate;

    @FindBy(xpath = "//h4[1]")
    public WebElement cardNumber;

    @FindBy(xpath = "//h4[2]")
    public WebElement cardNumber;

    @FindBy(xpath = "//h4[3]")
    public WebElement cardNumber;

    @FindBy(xpath = "//h4[4]")
    public WebElement cardNumber;




}