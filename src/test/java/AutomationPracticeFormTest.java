import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeFormTest {

    @BeforeAll
    static void openPracticeForm(){
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/automation-practice-form");
        System.out.println("Start Test!");
    }

    @Test
    void FillingForm(){
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


}
