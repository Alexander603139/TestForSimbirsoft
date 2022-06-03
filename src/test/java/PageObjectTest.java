import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@DisplayName("тест с page object")
class PageObjectTest {

    private static WebDriver driver;
    private final CalculatorPage calculatorPage = new CalculatorPage();

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Common Files/Oracle/Java/javapath/chromedriver.exe");
        driver = new ChromeDriver();
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = false;
        Configuration.baseUrl = "https://www.google.com";
    }

    @AfterAll
    public static void teardown() {
        try {
            Thread.sleep(6_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    void testCalculator() {
        calculatorPage.open().searchGoogle();
        calculatorPage.inputSearchGoogle();
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        calculatorPage.pushButton1();
        calculatorPage.pushButtonMultiply();
        calculatorPage.pushButton2();
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        calculatorPage.pushButtonMinus();
        calculatorPage.pushButton3();
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        calculatorPage.pushButtonPlus();
        calculatorPage.pushButton1();
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        calculatorPage.pushButtonEquals();
        Assert.assertEquals("0", calculatorPage.readScreen());
    }

}
