package com.juaracoding;

import com.juaracoding.Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAddToCart {

    WebDriver driver;
    ProductPage productPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        productPage = new ProductPage(driver);
        // Log in before adding to cart
        productPage.addToCart();
    }

    @Test
    public void testAddToCart() {
        productPage.addToCart();
        // Add assertions to verify product is added to the cart
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
