package pages;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            transfersByPhoneNumber = $$("[href='/sbp/']").findBy(text("Переводы по номеру телефона")),
            loanRepayment = $$("[href='/payment/credit/']").findBy(text("Оплата кредита")),
            paymentByMobile = $$("[href='/services/mobile/']").findBy(text("Оплата мобильными устройствами")),
            currencyTransfer = $$("[href='/single/swift/']").findBy(text("Переводы в иностранной валюте")),
            cardReplenishment =$$("[href='/payment/cards/']").findBy(text("Пополнение карт")),
            depositReplenishment = $$("[href='/payment/deposits/']").findBy(text("Пополнение вклада")),
            transferByRequisite = $$("[href='/single/transfers/']").findBy(text("Перевод по реквизитам")),
            checkResult = $(".sme-banner__title"),
            attention = $(".attention__heading"),
            attentionСlose = $(".attention__close");

    @Step("Открываем страницу платежей")
    public MainPage openPaymentPage(){
        open("/payment");
        if (attention.is(visible)){
            attentionСlose.click();}
        return this;
    }

    @Step("Нажимаем на кнопку Переводы по номеру телефона")
    public MainPage transfersByPhoneNumber(){
        transfersByPhoneNumber.click();
        return this;
    }

    @Step("Нажимаем на кнопку Оплата кредита")
    public MainPage loanRepayment(){
        loanRepayment.click();
        return this;
    }
    @Step("Нажимаем на кнопку Оплата мобильными устройствами")
    public MainPage paymentByMobile(){
        paymentByMobile.click();
        return this;
    }
    @Step("Нажимаем на кнопку Переводы в иностранной валюте")
    public MainPage currencyTransfer(){
        currencyTransfer.click();
        return this;
    }
    @Step("Нажимаем на кнопку Пополнение карт")
    public MainPage cardReplenishment(){
        cardReplenishment.click();
        return this;
    }
    @Step("Нажимаем на кнопку Пополнение вклада")
    public MainPage depositReplenishment(){
        depositReplenishment.click();
        return this;
    }
    @Step("Нажимаем на кнопку Перевод по реквизитам")
    public MainPage transferByRequisite(){
        transferByRequisite.click();
        return this;
    }
    @Step("Проверяем результат")
    public MainPage checkResult(String value){
        checkResult.shouldHave(text(value));
        return this;
    }

}
