package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class AllureTestRepeat {

    @BeforeAll
    static void configuration() {
        Configuration.holdBrowserOpen = true;
    }

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int ISSUE = 80;

    @Test
    void testIssueSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide()); // добавляется сценарий теста как в IDEA
        // + в build.gradle добавили сначало зависимость "io.qameta.allure:allure-selenide:2.13.6"

        //добавляем лямбда через форму step("что-то там", () -> {какие-то шаги - наш код})
        step("Открываем главную страницу", () -> {
            Selenide.open("https://github.com");
        });

        step("ищем репозиторий для теста на github" + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").pressEnter();
        });

        step("Кликаем по ссылке репозитория ", () -> {
            $(linkText("eroshenkoam/allure-example")).click(); //linkText("eroshenkoam/allure-example") текс ссылки
        });
        step("Открываем таб Issues", () -> {
            $("#issues-tab").click();
        });

        step("Проверяем наличие Issue c номером " + ISSUE, () -> {
            $(withText("#" + ISSUE)).should(Condition.exist);
        });
        //withText Найти элемент, СОДЕРЖАЩИЙ заданный текст (в виде подстроки). Этот метод игнорирует разницу между пробелом и Этот метод игнорирует несколько пробелов.

    }
}
