import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import pages.MainPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Story("Проверяем работу кнопок на ЭФ Переводы")
public class WebTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка работы кнопки Переводы по номеру телефона")
    public void transfersByPhoneNumber() {
        mainPage.openPaymentPage();
        mainPage.transfersByPhoneNumber("Переводы по номеру телефона");
        mainPage.checkResult("Система быстрых платежей");
    }

    @Test
    @DisplayName("Проверка работы кнопки Оплата кредита")
    public void loanRepayment() {
        mainPage.openPaymentPage();
        mainPage.loanRepayment("Оплата кредита");
        mainPage.checkResult("Оплата кредита");
    }

    @Test
    @DisplayName("Проверка работы кнопки Оплата мобильными устройствами")
    public void paymentByMobile() {
        mainPage.openPaymentPage();
        mainPage.paymentByMobile("Оплата мобильными устройствами");
        mainPage.checkResult("Оплата смартфоном");
    }

    @Test
    @DisplayName("Проверка работы кнопки Переводы в иностранной валюте")
    public void currencyTransfer() {
        mainPage.openPaymentPage();
        mainPage.currencyTransfer("Переводы в иностранной валюте");
        mainPage.checkResult("Переводы в иностранной валюте");
    }

    @Test
    @DisplayName("Проверка работы кнопки Пополнение карт")
    public void cardReplenishment() {
        mainPage.openPaymentPage();
        mainPage.cardReplenishment("Пополнение карт");
        mainPage.checkResult("Пополнение карт");
    }

    @Test
    @DisplayName("Проверка работы кнопки Пополнение вклада")
    public void depositReplenishment() {
        mainPage.openPaymentPage();
        mainPage.depositReplenishment("Пополнение вклада");
        mainPage.checkResult("Пополнение вкладов");
    }

    @Test
    @DisplayName("Проверка работы кнопки Перевод по реквизитам")
    public void transferByRequisite() {
        mainPage.openPaymentPage();
        mainPage.transferByRequisite("Перевод по реквизитам");
        mainPage.checkResult("Переводы по реквизитам");
    }

    @CsvSource(value = {
            "Кредиты , Потребительские кредиты на любые цели",
            "Карты , Кредитные и дебетовые карты"
    })

    @DisplayName("Проверка кликабельности кнопок 'Кредиты' и 'Карты' верхнего тапбара, на ЭФ Платежи и переводы")
    @ParameterizedTest(name = "Для поискового запроса {0} должен отображать заголовок {1}")
    void searchResults(String searchQuery, String expectedText) {
        mainPage.openPaymentPageWithOutAttention();
        $(".site-header-new__body").$(byText(searchQuery)).click();
        $x("//span[contains(normalize-space(.), '" + expectedText + "')]").shouldBe(visible);
    }

    @CsvFileSource(resources = "/test_data/searchResultsShouldContainExpected.csv")
    @DisplayName("Проверка кликабельности кнопок 'Вклады' и 'Сервисы' верхнего тапбара, на ЭФ Платежи и переводы")
    @ParameterizedTest(name = "Для поискового запроса {0} должен отображать текст {1}")
    void searchResultsShouldContainExpected(String searchQuery, String expectedText) {
        mainPage.openPaymentPageWithOutAttention();
        $(".site-header-new__body").$(byText(searchQuery)).click();
        $x("//span[contains(normalize-space(.), '" + expectedText + "')]").shouldBe(visible);
    }

}









