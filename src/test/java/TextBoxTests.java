import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests extends TestBase{

    RegistrationWithPageObjects registrationWithPageObjects=new RegistrationWithPageObjects();
    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        registrationWithPageObjects.setFirstnameInput("Elmira")
                .setLastName("Shaykhattarova")
                .setUserNumberInput("8906123456")
                .setUserEmailInput("elmirailgizovna@gmail.com")
                .setGender("Other")
                .userhobbies("Reading")
                .setUserCurrentAddress("Tatarstan,Kazan")
                .setDate("15", "July", "1998")
                .setUserChemistry("Chemistry")
                .setState("NCR")
                .setCity("Noida")
                .setPicture("picture.jpg")
                .setClick("");

    }
}