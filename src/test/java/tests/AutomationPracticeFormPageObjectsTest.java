package tests;
import org.junit.jupiter.api.Test;



public class AutomationPracticeFormPageObjectsTest extends TestBase {
    String userFirstName = "Semen";
    String userLastName = "Chernikov";
    String userEmail = "chernikov.semen21@gmail.com";
    String userGender = "Male";
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

    @Test
    void fillingForm() {
        registrationPage.openPage()
                .bannerRemoval()
                .setFirstName(userFirstName)
                .setLastName(userLastName)
                .setEmail(userEmail)
                .clickUserGender(userGender)
                .setNumber(userNumber)
                .setBirthDate(userBirthDay_day, userBirthDay_month, userBirthDay_year)
                .setSubjects(userSubjects)
                .setHobbies(userHobbies)
                .fileUpload(userPictureLocation)
                .setUserAddress(userAddress)
                .getUserState(userState)
                .getUserCity(userCity)
                .submitForm();


        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Semen Chernikov")
                .verifyResult("Student Email", "chernikov.semen21@gmail.com")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "9196742969")
                .verifyResult("Date of Birth", "30 May,1990")
                .verifyResult("Subjects", "English")
                .verifyResult("Hobbies", "Sport")
                .verifyResult("Picture", "photo_2022.jpg")
                .verifyResult("Address", "boulvar Mittova d.3")
                .verifyResult("State and City", "NCR Delhi");

    }

}
