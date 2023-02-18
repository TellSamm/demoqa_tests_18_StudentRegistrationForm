import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeFormTest {

    @Test
    void FillingForm(){
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Semen");
        $("#lastName").setValue("Chernikov");
        $("#userEmail").setValue("chernikov.semen21@gmail.com");
        $("#gender-radio-1").sendKeys(" ");
        $("#userNumber").setValue("9196742969");
        //$("#dateOfBirthInput").setValue("26 May 1990");
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbies-checkbox-1").setValue(" ");
        $("input.form-control-file").uploadFile(new File("src/test/resources/photo_2022-12-06_17-04-37.jpg"));
        $("#currentAddress").setValue("429620, Чувашия. Чувашская Республика, р-н. Красноармейский, с. Красноармейское, ул. Новая, д. 6");
        $("#state").selectOptionByValue("NCR");
        $("#city").selectOptionByValue("Delhi");
        $("#submit").click();
    }
}
