package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import pages.RegistrationPage;



public class TestBase {

    String userName = "Semen";
    String userLastName = "Chernikov";
    String userEmail = "chernikov.semen21@gmail.com";
    String userGenter = "Male";
    String userNumber = "9196742969";
    String userBirthDay_day = "30";
    String userBirthDay_month = "May";
    String userBirthDay_year = "1990";
    String userSubjects = "English";
    String userHobbies = "Sports";
    String userPictureLocation = "img/photo_2022.jpg";
    String userAddress = "boulvar Mittova d.3";
    String userState = "NCR";
    String userCity = "Delhi";
    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void openPracticeForm() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = false;
    }


}
