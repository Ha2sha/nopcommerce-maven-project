package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage=loginPage.getWelcomeText();
        Assert.assertEquals("Login Page not displayed",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailID("keshvi@gmail.com");
        loginPage.enterPassword("Keshvi223");
        loginPage.clickOnLoginButton();
        String expectedLogoutText="Log out";
        String actualLogoutText=loginPage.getLogOutText();
        Assert.assertEquals("Text Not Found", expectedLogoutText,actualLogoutText);
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailID("test@gmail.com");
        loginPage.enterPassword("abc123");
        loginPage.clickOnLoginButton();

        String expectedErrorMsg="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMsg=loginPage.getErrorMessage();

        Assert.assertEquals("Error not displayed",expectedErrorMsg, actualErrorMsg);
    }

}
