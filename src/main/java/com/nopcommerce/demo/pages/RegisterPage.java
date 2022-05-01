package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By welcomeText = By.tagName("h1");
    By maleRadioButton = By.xpath("//label[@for='gender-male']");
    By femaleRadioButton = By.xpath("//label[@for='gender-female']");
    By first_Name = By.id("FirstName");
    By last_Name = By.id("LastName");
    By day1 = By.name("DateOfBirthDay");
    By month1 = By.name("DateOfBirthMonth");
    By year1 = By.name("DateOfBirthYear");
    By email1 = By.xpath("//input[@type='email']");
    By password1 = By.xpath("//input[@id='Password']");
    By confirmPassword1 = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton=By.xpath("//button[@name='register-button']");
    By regText=By.cssSelector(".result");


    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
    public void clickOnMaleRadioButton(){
        clickOnElement(maleRadioButton);
    }
    public void clickOnFemaleRadioButton(){
        clickOnElement(femaleRadioButton);
    }
    public void enterFirstName(String firstName){
        sendTextToElement(first_Name,firstName);
    }
    public void enterLastName(String lastName){
        sendTextToElement(last_Name,lastName);
    }
    public void enterDay(String day){
        sendTextToElement(day1,day);
    }
    public void enterMonth(String month){
        sendTextToElement(month1,month);
    }
    public void enterYear(String year){
        sendTextToElement(year1,year);
    }
    public void enterEmailAddress(String email){
        sendTextToElement(email1,email);
    }
    public void enterPassword(String password){
        sendTextToElement(password1,password);
    }
    public void enterConfirmPassord(String confirmPassword){
        sendTextToElement(confirmPassword1,confirmPassword);
    }
    public void clickRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getSuccessfulRegistrationText(){
        return getTextFromElement(regText);
    }

}
