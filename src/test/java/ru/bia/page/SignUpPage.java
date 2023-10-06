package ru.bia.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {

    private WebDriver driver;
    private WebDriverWait wait;


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @FindBy(xpath = "//div[@class='css-0']//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//div[@class='css-0']//input[@name='password']")
    private WebElement password;

    @FindBy(css = "button[type='submit']")
    private WebElement submit;

    public void fillEmail(String emailText) {
        email.sendKeys(emailText);
    }

    public void fillPassword(String passwordText) {
        password.sendKeys(passwordText);
    }
    private By personalAccount = By.xpath("//div[@class='css-8atqhb']//p[@class='chakra-text css-1i80fgp']");
    public void submitButton() {
        submit.click();
    }
    public void checkAccount() {
        wait.until(ExpectedConditions.textToBe(personalAccount, "Выберите вашу роль"));

    }

    public void findErrorMessage(String expectedText) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(expectedText)));
    }
}
