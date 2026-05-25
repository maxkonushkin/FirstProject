package loginTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginTests extends TestBase {

    MainPage mainPage = new MainPage();

    @CsvSource(value = {
            "Кредиты , Оформить кредит",
            "Карты , Выбрать карту",
            "Вклады , Открыть вклад"
    })
    @DisplayName("Проверка кликабельности кнопки Кредиты, на ЭФ Платежи и переводы")
    @ParameterizedTest(name = "Для поискового запроса {0} должен отображать заголовок {1}")
    void searchResults(String searchQuery, String expectedText) {
        mainPage.openPaymentPage();
        $(".site-header-new__body").$(byText(searchQuery)).click();
        $(".section-panel__button-wrapper").shouldHave(text(expectedText));
    }

}
