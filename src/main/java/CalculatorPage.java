import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CalculatorPage {
    private final SelenideElement searchField = $(".gLFyf.gsfi");
    private final SelenideElement screen = $(byXpath("//*[@class='qv3Wpe']"));
    private final SelenideElement button1 = $(byXpath("//*[@class='XRsWPe AOvabd'][contains(text(),'1')]"));
    private final SelenideElement button2 = $(byXpath("//*[@class='XRsWPe AOvabd'][contains(text(),'2')]"));
    private final SelenideElement button3 = $(byXpath("//*[@class='XRsWPe AOvabd'][contains(text(),'3')]"));
    private final SelenideElement buttonPlus = $(byXpath("//*[@class='XRsWPe MEdqYd'][contains(text(),'+')]"));
    private final SelenideElement buttonMinus = $(byXpath("//*[@class='XRsWPe MEdqYd'][contains(text(),'−')]"));
    private final SelenideElement buttonMultiply = $(byXpath("//*[@class='XRsWPe MEdqYd'][contains(text(),'×')]"));
    private final SelenideElement buttonEquals = $(byXpath("//*[@class='XRsWPe UUhRt'][contains(text(),'=')]"));

    public void searchGoogle() {
        searchField.click();
    }
    public CalculatorPage inputSearchGoogle() {
        searchField.sendKeys("Калькулятор\n");
        return this;
    }
    public void pushButton1() {
        button1.click();
    }
    public void pushButton2() {
        button2.click();
    }
    public void pushButton3() {
        button3.click();
    }
    public void pushButtonPlus() {
        buttonPlus.click();
    }
    public void pushButtonMinus() {
        buttonMinus.click();
    }
    public void pushButtonMultiply() {
        buttonMultiply.click();
    }
    public void pushButtonEquals() {
        buttonEquals.click();
    }
    public String readScreen() {
        String numberOnScreen = screen.text();
        return numberOnScreen;
    }
    public CalculatorPage open() {
        Selenide.open("/");
        return this;
    }
}

