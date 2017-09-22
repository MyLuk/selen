import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void terDown() {
        driver.quit();
    }

    @Test
    public void ShouldLoadYandex() {
        driver.navigate().to("https://yandex.ru");
    }

}
