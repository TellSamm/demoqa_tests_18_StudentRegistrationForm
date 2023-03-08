package tests;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;
import java.util.Locale;


public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker(new Locale("en-US"));
    @BeforeAll
    static void openPracticeForm() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }


}
