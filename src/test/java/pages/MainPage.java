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
    @Step("Нажимаем на кнопку Перевод по номеру телефона")
    public MainPage transfersByPhoneNumber(){
        $("[href='/sbp/']").click();
        return this;
    }
    @Step("Нажимаем на кнопку 2")
    public MainPage loanRepayment(){
        $("[href='/payment/credit/']").click();
        return this;
    }
    @Step("Нажимаем на кнопку 3")
    public MainPage paymentByMobile(){
        $("[href='/services/mobile/']").click();
        return this;
    }
    @Step("Нажимаем на кнопку 4")
    public MainPage currencyTransfer(){
        $("[href='/single/swift/']").click();
        return this;
    }
    @Step("Нажимаем на кнопку 5")
    public MainPage cardReplenishment(){
        $("[href='/payment/cards/']").click();
        return this;
    }
    @Step("Нажимаем на кнопку 6")
    public MainPage depositReplenishment(){
        $(".tile__info").click();
        return this;
    }
    @Step("Нажимаем на кнопку 7")
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
