import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTests {

    @Test
    public void fillFormTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rencredit.ru/");
    }

}









