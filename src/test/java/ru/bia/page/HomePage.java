package ru.bia.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://tms.biacorp.ru/");
    }

    @FindBy(xpath = "//div[@class='css-wwfiyb']//button[@class='chakra-button css-vgoep3']")
    private WebElement signUpButton;
    public void getStarted() {
        signUpButton.click();

    }
}
