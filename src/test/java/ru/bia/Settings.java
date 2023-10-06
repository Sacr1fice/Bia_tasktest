package ru.bia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
    public ChromeDriver driver;

    @BeforeAll
    static void setupAll() {

    WebDriverManager.chromedriver().setup();
}

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterEach
    void teardown() {

        driver.quit();
    }

}
