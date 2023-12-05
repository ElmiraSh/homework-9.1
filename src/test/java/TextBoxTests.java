import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utils.UtilsFaker;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests extends TestBase{

    RegistrationWithPageObjects registrationWithPageObjects=new RegistrationWithPageObjects();
    UtilsFaker UtilsFaker=new UtilsFaker();
    @Test
    void fillFormTest() {

        String userName;
        registrationWithPageObjects.openBrowser()
                .hideFooter()
                .fixeban()
                .setFirstnameInput(UtilsFaker.userName)
                .setLastName(UtilsFaker.lastName)
                .setUserNumberInput(UtilsFaker.userNumber)
                .setUserEmailInput(UtilsFaker.userEmail)
                .setGender(UtilsFaker.userGender)
                .userhobbies(UtilsFaker.userHobbies)
                .setUserCurrentAddress(UtilsFaker.userCurrentAddress)
                .setDate(UtilsFaker.userDate,UtilsFaker.userMounth,UtilsFaker.userYear)
                .setUserChemistry(UtilsFaker.userSubjects)
                .setState(UtilsFaker.userState)
                .setCity(UtilsFaker.userCity)
                .setPicture("picture.jpg")
                .setClick();

        registrationWithPageObjects.checkResult("Student Name", UtilsFaker.userName+" "+UtilsFaker.lastName)
                .checkResult("Student Email", UtilsFaker.userEmail)
                .checkResult("Mobile", UtilsFaker.userNumber)
                .checkResult("Hobbies", UtilsFaker.userHobbies)
                .checkResult("Gender", UtilsFaker.userGender)
                .checkResult("Address", UtilsFaker.userCurrentAddress)
                .checkResult("Date of Birth",UtilsFaker.userDate+" "+UtilsFaker.userMounth+","+UtilsFaker.userYear)
                .checkResult("Picture", "picture.jpg");
    }

    }
