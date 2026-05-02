package pages;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement checkResult = $(".sme-banner__title"),
            attention = $(".attention__box"),
            attentionСlose = $(".attention__button");

    ElementsCollection transfersByPhoneNumber = $$("[href='/sbp/']"),
            loanRepayment = $$("[href='/payment/credit/']"),
            paymentByMobile = $$("[href='/services/mobile/']"),
            currencyTransfer = $$("[href='/single/swift/']"),
            cardReplenishment = $$("[href='/payment/cards/']"),
            depositReplenishment = $$("[href='/payment/deposits/']"),
            transferByRequisite = $$("[href='/single/transfers/']");

    @Step("Открываем страницу платежей")
    public MainPage openPaymentPage(){
        open("/payment");
        if (attention.is(visible)){
            attentionСlose.click();}
        return this;
    }

    @Step("Нажимаем на кнопку Переводы по номеру телефона")
    public MainPage transfersByPhoneNumber(String value){
        transfersByPhoneNumber.findBy(text(value)).click();
        return this;
    }

    @Step("Нажимаем на кнопку Оплата кредита")
    public MainPage loanRepayment(String value){
        loanRepayment.findBy(text(value)).click();
        return this;
    }
    @Step("Нажимаем на кнопку Оплата мобильными устройствами")
    public MainPage paymentByMobile(String value){
        paymentByMobile.findBy(text(value)).click();
        return this;
    }
    @Step("Нажимаем на кнопку Переводы в иностранной валюте")
    public MainPage currencyTransfer(String value){
        currencyTransfer.findBy(text(value)).click();
        return this;
    }
    @Step("Нажимаем на кнопку Пополнение карт")
    public MainPage cardReplenishment(String value){
        cardReplenishment.findBy(text(value)).click();
        return this;
    }
    @Step("Нажимаем на кнопку Пополнение вклада")
    public MainPage depositReplenishment(String value){
        depositReplenishment.findBy(text(value)).click();
        return this;
    }
    @Step("Нажимаем на кнопку Перевод по реквизитам")
    public MainPage transferByRequisite(String value){
        transferByRequisite.findBy(text(value)).click();
        return this;
    }
    @Step("Проверяем результат")
    public MainPage checkResult(String value){
        checkResult.shouldHave(text(value));
        return this;
    }

}
