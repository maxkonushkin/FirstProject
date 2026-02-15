import org.junit.jupiter.api.Test;
import pages.MainPage;

public class WebTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    public void transfersByPhoneNumber() {
        mainPage.openPaymentPage();
        mainPage.transfersByPhoneNumber();
        mainPage.checkResult("Система быстрых платежей");

    }

    @Test
    public void loanRepayment() {
        mainPage.openPaymentPage();
        mainPage.loanRepayment();
        mainPage.checkResult("Оплата кредита");
    }

    @Test
    public void paymentByMobile() {
        mainPage.openPaymentPage();
        mainPage.paymentByMobile();
        mainPage.checkResult("Оплата смартфоном");
    }

    @Test
    public void currencyTransfer() {
        mainPage.openPaymentPage();
        mainPage.currencyTransfer();
        mainPage.checkResult("Переводы в иностранной валюте");
    }

    @Test
    public void cardReplenishment() {
        mainPage.openPaymentPage();
        mainPage.cardReplenishment();
        mainPage.checkResult("Пополнение карт");
    }

    @Test
    public void depositReplenishment() {
        mainPage.openPaymentPage();
        mainPage.depositReplenishment();
        mainPage.checkResult("Пополнение вкладов");
    }

    @Test
    public void transferByRequisite() {
        mainPage.openPaymentPage();
        mainPage.transferByRequisite();
        mainPage.checkResult("Переводы по реквизитам");
    }

}









