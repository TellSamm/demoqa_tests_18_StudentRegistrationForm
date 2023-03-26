package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class AutomationPracticeFormWithCommentsTest {

    @BeforeAll
    static void openPracticeForm() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        System.out.println("Start Test!");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

    @Test
    void fillingForm() {
        $("#firstName").setValue("Semen");
        $("#lastName").setValue("Chernikov");
        $("#userEmail").setValue("chernikov.semen21@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9196742969");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("img/photo_2022.jpg");
        $("#currentAddress").setValue("boulvar Mittova d.3");
        $("#stateCity-wrapper").click();
        $("#react-select-3-option-0").click();
        $("#city").click();
        $("#react-select-4-option-0").click();
        $("#submit").click();
        $(".modal-dialog").should(appear);



    }

    @AfterEach
    void tableValidation() {
        $("div.modal-header").shouldHave(text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(text("Semen Chernikov"), text("chernikov.semen21@gmail.com"), text("Male"),
                text("9196742969"), text("30 May,1990"), text("English"), text("Sports"), text("photo_2022.jpg"),
                text("boulvar Mittova d.3"), text("NCR Delhi"));
//            $(".modal-body").shouldHave(text("chernikov.semen21@gmail.com"));
//            $(".modal-body").shouldHave(text("Male"));
//            $(".modal-body").shouldHave(text("9196742969"));
//            $(".modal-body").shouldHave(text("30 May,1990"));
//            $(".modal-body").shouldHave(text("English"));
//            $(".modal-body").shouldHave(text("Sports"));
//            $(".modal-body").shouldHave(text("photo_2022.jpg"));
//            $(".modal-body").shouldHave(text("Chuvashuya, Cheboksary, boulvar Mittova d.3"));
//            $(".modal-body").shouldHave(text("NCR Delhi"));

    }
}
