package ru.bia.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import ru.bia.Settings;
import ru.bia.page.HomePage;
import ru.bia.page.SignUpPage;


public class SignUpTest extends Settings {

    @Test
    void shouldSignUp() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.open();

        homePage.getStarted();

        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);

        signUpPage.fillEmail("test-user@mail.ru");
        signUpPage.fillPassword("testqwerty123");
        signUpPage.submitButton();
        signUpPage.checkAccount();


    }

    @Test
    void shouldSignUpFail() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.open();

        homePage.getStarted();

        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);

        signUpPage.fillEmail("user@mail.ru");
        signUpPage.fillPassword("testqwerty123");
        signUpPage.submitButton();
        signUpPage.findErrorMessage("Invalid email or password");
    }
}
