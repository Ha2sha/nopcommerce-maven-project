package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homepage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homepage.clickOnRegisterLink();
        String expectedText = "Register";
        String actualText=registerPage.getWelcomeText();
        Assert.assertEquals("Page Not Found", expectedText, actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homepage.clickOnRegisterLink();
        registerPage.clickOnFemaleRadioButton();
        registerPage.enterFirstName("Keshvi");
        registerPage.enterLastName("Patel");
        registerPage.enterDay("15");
        registerPage.enterMonth("May");
        registerPage.enterYear("2001");
        registerPage.enterEmailAddress("keshvi@gmail.com");
        registerPage.enterPassword("Keshvi223");
        registerPage.enterConfirmPassord("Keshvi223");
        registerPage.clickRegisterButton();
        String expectedResult="Your registration completed";
        String actualResult=registerPage.getSuccessfulRegistrationText();
        Assert.assertEquals("Registration not successful",expectedResult,actualResult);

    }

}
