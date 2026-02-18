package pages;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    @Step("Открываем страницу платежей")
    public MainPage openPaymentPage(){
        open("/payment");
        if ($(".attention__heading").is(visible)){
            $(".attention__close").click();}
        return this;

    }

    @Step("Нажимаем на кнопку Переводы по номеру телефона")
    public MainPage transfersByPhoneNumber(){
        $$("[href='/sbp/']").findBy(text("Переводы по номеру телефона")).click();
        return this;
    }
    @Step("Нажимаем на кнопку Оплата кредита")
    public MainPage loanRepayment(){
        $$("[href='/payment/credit/']").findBy(text("Оплата кредита")).click();
        return this;
    }
    @Step("Нажимаем на кнопку Оплата мобильными устройствами")
    public MainPage paymentByMobile(){
        $$("[href='/services/mobile/']").findBy(text("Оплата мобильными устройствами")).click();
        return this;
    }
    @Step("Нажимаем на кнопку Переводы в иностранной валюте")
    public MainPage currencyTransfer(){
        $$("[href='/single/swift/']").findBy(text("Переводы в иностранной валюте")).click();
        return this;
    }
    @Step("Нажимаем на кнопку Пополнение карт")
    public MainPage cardReplenishment(){
        $$("[href='/payment/cards/']").findBy(text("Пополнение карт")).click();
        return this;
    }
    @Step("Нажимаем на кнопку Пополнение вклада")
    public MainPage depositReplenishment(){
        $$("[href='/payment/deposits/']").findBy(text("Пополнение вклада")).click();
        return this;
    }
    @Step("Нажимаем на кнопку Перевод по реквизитам")
    public MainPage transferByRequisite(){
        $$("[href='/single/transfers/']").findBy(text("Перевод по реквизитам")).click();
        return this;
    }
    @Step("Проверяем результат")
    public MainPage checkResult(String value){
        $(".sme-banner__title").shouldHave(text(value));
        return this;
    }

}
