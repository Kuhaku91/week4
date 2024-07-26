package com.juaracoding;

import com.juaracoding.Pages.CheckoutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCheckout {

    WebDriver driver;
    CheckoutPage checkoutPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        checkoutPage = new CheckoutPage(driver);
        // Log in and add product to cart before checking out
        checkoutPage.proceedToCheckout();
    }

    @Test
    public void testCheckout() {
        checkoutPage.proceedToCheckout();
        // Add assertions to verify checkout is successful
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
