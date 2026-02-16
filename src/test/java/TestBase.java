import com.codeborne.selenide.Configuration;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @Story("Открываем сайт банка")
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://rencredit.ru";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
}
