package allure;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class AllureTestRepeat {


    @Test
    void testIssueSearch(){
        SelenideLogger.addListener("allure", new AllureSelenide()); // добавляется сценарий теста как в IDEA
        // + в build.gradle добавили сначало зависимость "io.qameta.allure:allure-selenide:2.13.6"

        Selenide.open("https://github.com");
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("eroshenkoam/allure-example");
        $(".header-search-input").pressEnter();

        $(linkText("eroshenkoam/allure-example")).click(); //linkText("eroshenkoam/allure-example") текс ссылки
        $("#issues-tab").click();
        $(withText("#80")).should(Condition.exist); //withText Найти элемент, СОДЕРЖАЩИЙ заданный текст (в виде подстроки). Этот метод игнорирует разницу между пробелом и Этот метод игнорирует несколько пробелов.
    }
}
