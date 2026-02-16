package pages;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    @Step("Открываем страницу платежей")
    public MainPage openPaymentPage(){
        open("/payment");
        return this;
    }
    @Step("Нажимаем на кнопку Переводы по номеру телефона")
    public MainPage transfersByPhoneNumber(){
        $("[href='/sbp/']").click();
        return this;
    }
    @Step("Нажимаем на кнопку Оплата кредита")
    public MainPage loanRepayment(){
        $("[href='/payment/credit/']").click();
        return this;
    }
    @Step("Нажимаем на кнопку Оплата мобильными устройствами")
    public MainPage paymentByMobile(){
        $("[href='/services/mobile/']").click();
        return this;
    }
    @Step("Нажимаем на кнопку Переводы в иностранной валюте")
    public MainPage currencyTransfer(){
        $("[href='/single/swift/']").click();
        return this;
    }
    @Step("Нажимаем на кнопку Пополнение карт")
    public MainPage cardReplenishment(){
        $("[href='/payment/cards/']").click();
        return this;
    }
    @Step("Нажимаем на кнопку Пополнение вклада")
    public MainPage depositReplenishment(){
        $(".tile__info").click();
        return this;
    }
    @Step("Нажимаем на кнопку Перевод по реквизитам")
    public MainPage transferByRequisite(){
        $(".tile__info").click();
        return this;
    }
    @Step("Проверяем результат")
    public MainPage checkResult(String value){
        $(".sme-banner__title").shouldHave(text(value));
        return this;
    }

}
