package pages;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    public MainPage openPaymentPage(){
        open("/payment");
        return this;
    }
    public MainPage transfersByPhoneNumber(){
        $("[href='/sbp/']").click();
        return this;
    }

    public MainPage loanRepayment(){
        $("[href='/payment/credit/']").click();
        return this;
    }

    public MainPage paymentByMobile(){
        $("[href='/services/mobile/']").click();
        return this;
    }

    public MainPage currencyTransfer(){
        $("[href='/single/swift/']").click();
        return this;
    }

    public MainPage cardReplenishment(){
        $("[href='/payment/cards/']").click();
        return this;
    }

    public MainPage depositReplenishment(){
        $(".tile__info").click();
        return this;
    }

    public MainPage transferByRequisite(){
        $(".tile__info").click();
        return this;
    }

    public MainPage checkResult(String value){
        $(".sme-banner__title").shouldHave(text(value));
        return this;
    }

}
