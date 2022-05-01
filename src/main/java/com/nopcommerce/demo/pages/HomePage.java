package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By computer = By.linkText("Computers");
    By electronics = By.linkText("Electronics");
    By apparel = By.linkText("Apparel");
    By digitalDownloads = By.linkText("Digital downloads");
    By books = By.linkText("Books");
    By jewelry = By.linkText("Jewelry");
    By giftcards = By.linkText("Gift Cards");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnComputers() {
        clickOnElement(computer);
    }

    public void clickOnElectronics() {
        clickOnElement(electronics);
    }

    public void clickOnApparel() {
        clickOnElement(apparel);
    }

    public void clickOnDigitalDownloads() {
        clickOnElement(digitalDownloads);
    }

    public void clickOnBooks() {
        clickOnElement(books);
    }

    public void clickOnJewelry() {
        clickOnElement(jewelry);
    }

    public void clickOnGiftCards() {
        clickOnElement(giftcards);
    }


}
