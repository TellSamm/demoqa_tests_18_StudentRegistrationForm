import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormTest {

    @BeforeAll
    static void openPracticeForm(){
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        open("https://demoqa.com/automation-practice-form");
        System.out.println("Start Test!");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

    @Test
    void fillingForm(){
        $("#firstName").setValue("Semen");
        $("#lastName").setValue("Chernikov");
        $("#userEmail").setValue("chernikov.semen21@gmail.com");
        $("#gender-radio-1").sendKeys(" ");
        $("#userNumber").setValue("9196742969");
        $("#dateOfBirthInput").click();
        $(".react-datepicker-wrapper").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOptionByValue("4");
        $(".react-datepicker__year-select").selectOptionByValue("1990");
        $("div.react-datepicker__day[aria-label='Choose Saturday, May 26th, 1990']").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("label[for='hobbies-checkbox-1']").click();
        $("label[for='hobbies-checkbox-2']").click();
        $("label[for='hobbies-checkbox-3']").click();
        $("input.form-control-file").uploadFile(new File("src/test/resources/photo_2022-12-06_17-04-37.jpg"));
        $("#currentAddress").setValue("Chuvashuya, Cheboksary, boulvar Mittova d.3");
        $("div#state div.css-tlfecz-indicatorContainer").click();
        $("#react-select-3-option-0").click();
        $("#city").click();
        $("#react-select-4-option-0").click();
        $("#submit").click();

    }
    @AfterEach
    void tableValidation (){
            $("div.modal-header").shouldHave(text("Thanks for submitting the form"));
            $(".modal-body").shouldHave(text("Semen Chernikov"));
            $(".modal-body").shouldHave(text("chernikov.semen21@gmail.com"));
            $(".modal-body").shouldHave(text("Male"));
            $(".modal-body").shouldHave(text("9196742969"));
            $(".modal-body").shouldHave(text("26 May,1990"));
            $(".modal-body").shouldHave(text("English"));
            $(".modal-body").shouldHave(text("Sports, Reading, Music"));
            $(".modal-body").shouldHave(text("photo_2022-12-06_17-04-37.jpg"));
            $(".modal-body").shouldHave(text("Chuvashuya, Cheboksary, boulvar Mittova d.3"));
            $(".modal-body").shouldHave(text("NCR Delhi"));

    }

}
