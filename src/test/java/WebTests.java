import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Story("Проверяем работу кнопок на ЭФ Переводы")
public class WebTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка работы кнопки Переводы по номеру телефона")
    public void transfersByPhoneNumber() {
        mainPage.openPaymentPage();
        mainPage.transfersByPhoneNumber();
        mainPage.checkResult("Система быстрых платежей");

    }

    @Test
    @DisplayName("Проверка работы кнопки Оплата кредита")
    public void loanRepayment() {
        mainPage.openPaymentPage();
        mainPage.loanRepayment();
        mainPage.checkResult("Оплата кредита");
    }

    @Test
    @DisplayName("Проверка работы кнопки Оплата мобильными устройствами")
    public void paymentByMobile() {
        mainPage.openPaymentPage();
        mainPage.paymentByMobile();
        mainPage.checkResult("Оплата смартфоном");
    }

    @Test
    @DisplayName("Проверка работы кнопки Переводы в иностранной валюте")
    public void currencyTransfer() {
        mainPage.openPaymentPage();
        mainPage.currencyTransfer();
        mainPage.checkResult("Переводы в иностранной валюте");
    }

    @Test
    @DisplayName("Проверка работы кнопки Пополнение карт")
    public void cardReplenishment() {
        mainPage.openPaymentPage();
        mainPage.cardReplenishment();
        mainPage.checkResult("Пополнение карт");
    }

    @Test
    @DisplayName("Проверка работы кнопки Пополнение вклада")
    public void depositReplenishment() {
        mainPage.openPaymentPage();
        mainPage.depositReplenishment();
        mainPage.checkResult("Пополнение вкладов");
    }

    @Test
    @DisplayName("Проверка работы кнопки Перевод по реквизитам")
    public void transferByRequisite() {
        mainPage.openPaymentPage();
        mainPage.transferByRequisite();
        mainPage.checkResult("Переводы по реквизитам");
    }

}









