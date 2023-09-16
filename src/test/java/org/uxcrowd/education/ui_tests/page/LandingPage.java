package org.uxcrowd.education.ui_tests.page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends AbstractPage{

    public static final By.ByXPath UX_TESTING_BUTTON = new By.ByXPath("//*[@id=\"top\"]/div[1]/div/div/div[1]/ul/li[1]/a");
    public static final By.ByXPath UX_TRANSCRIPT_BUTTON = new By.ByXPath("//*[@id=\"top\"]/div[1]/div/div/div[1]/ul/li[2]/a");
    public static final By.ByXPath UX_PRICE_BUTTON = new By.ByXPath("//*[@id=\"top\"]/div[1]/div/div/div[1]/ul/li[3]/a");
    public static final By.ByXPath UX_FAQ_BUTTON = new By.ByXPath("//*[@id=\"top\"]/div[1]/div/div/div[1]/ul/li[4]/a");
    public static final By.ByXPath UX_TESTING_SITE_BUTTON = new By.ByXPath("//*[@id=\"top\"]/div[1]/div/div/div[1]/ul/li[5]/a");

    @FindBy(css = "#header-lk-button")
    private WebElement headerLoginButton;

    @FindBy(css = "#login")
    private WebElement loginInput;

    @FindBy(css = "[name=password]")
    private WebElement passwordInput;

    @FindBy(css = "[ng-click=\"login()\"]")
    private WebElement submitBtn;

    public LandingPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @Step("Нажать кнопку 'Войти' в хедере")
    public void clickHeaderLoginButton(){
        headerLoginButton.click();
    }

    @Step("Заполнить поле ввода логина")
    public void fillLoginInput(String text){
        loginInput.clear();
        loginInput.sendKeys(text);
    }

    @Step("Заполнить поле ввода пароля")
    public void fillPasswordInput(String text){
        passwordInput.clear();
        passwordInput.sendKeys(text);
    }

    @Step("Нажать кнопку отправить")
    public void submitForm(){
        submitBtn.click();
    }

    @Step("Нажать на вкладку UX-тестирование")
    public void clickHeaderButton(String tabName){

        switch (tabName) {
            case "UX-тестирования" :
                driver.findElement(UX_TESTING_BUTTON).click();
                break;
            case "Транскрибация и разметка интервью" :
                driver.findElement(UX_TRANSCRIPT_BUTTON).click();
                break;
            case "Цены" :
                driver.findElement(UX_PRICE_BUTTON).click();
                break;
            case "FAQ" :
                driver.findElement(UX_FAQ_BUTTON).click();
                break;
            case "Хочу тестировать сайты" :
                driver.findElement(UX_TESTING_SITE_BUTTON).click();
                break;
        }
    }
}