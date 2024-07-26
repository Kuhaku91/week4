package com.juaracoding;

import com.juaracoding.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        loginPage.login(username, password);
        // Add assertions here to validate successful login
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                {"standard_user", "secret_sauce"}
        };
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
