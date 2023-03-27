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
import static com.codeborne.selenide.Selenide.webdriver;
import static io.qameta.allure.Allure.attachment;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class AttachmentsSteps {

    @BeforeAll
    static void configuration() {
        Configuration.holdBrowserOpen = false;
    }

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int ISSUE = 80;

    @Test
    void testIssueSearchAttachments() {
        SelenideLogger.addListener("allure", new AllureSelenide());


        step("Открываем главную страницу", () -> {
            Selenide.open("https://github.com");
            attachment("Source", webdriver().driver().source()); // в отчете будет source страницы инфа примерно такая из чего состоит страничка:
            // </style>
            // <meta charset="utf-8">
            //  <link rel="dns-prefetch" href="https://github.githubassets.com">
        });

    }

    @Test
    void testIssueSearch2(){

        SelenideLogger.addListener("allure", new AllureSelenide()); // добавляется сценарий теста как в IDEA
        WebSteps steps = new WebSteps(); // объект класса WebSteps с его методами

        steps.openMainPage();
        steps.takeScreenshot();

    }

}
