package tests;

import org.junit.jupiter.api.Test;


public class AutomationPracticeFormPageObjectsTest extends TestBase {

    @Test
    void fillingForm() {
        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(userLastName)
                .setEmail(userEmail)
                .clickUserGender(userGenter)
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
