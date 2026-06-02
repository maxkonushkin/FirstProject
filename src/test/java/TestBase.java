import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;


import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @Story("Открываем сайт банка")
    @BeforeAll
    static void setupEnvironment() {
        String browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browserSize = browserSize;
        Configuration.pageLoadStrategy = "eager";
        String remoteUrl = System.getProperty("remoteUrl");
        Configuration.remote = remoteUrl;
        String baseUrl = System.getProperty("baseUrl", "https://rencredit.ru/");
        Configuration.baseUrl = baseUrl;
        String browser = System.getProperty("browser", "chrome");
        Configuration.browser = browser;
        String browserVersion = System.getProperty("browserVersion");
        Configuration.browserVersion = browserVersion;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
