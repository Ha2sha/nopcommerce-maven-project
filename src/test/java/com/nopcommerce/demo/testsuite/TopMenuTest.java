package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homepage = new HomePage();
    TopMenuPage topmenupage = new TopMenuPage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homepage.clickOnComputers();
        String expectedTabText = "Computers";
        String actualTabText = topmenupage.getComputersText();
        Assert.assertEquals("Page not Found", expectedTabText, actualTabText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        homepage.clickOnElectronics();
        String expectedTabText = "Electronics";
        String actualTabText = topmenupage.getElectronicsText();
        Assert.assertEquals("Page not Found", expectedTabText, actualTabText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        homepage.clickOnApparel();
        String expectedTabText = "Apparel";
        String actualTabText = topmenupage.getApparelText();
        Assert.assertEquals("Page not Found", expectedTabText, actualTabText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        homepage.clickOnDigitalDownloads();
        String expectedTabText = "Digital downloads";
        String actualTabText = topmenupage.getDigitalDownloadsText();
        Assert.assertEquals("Page not Found", expectedTabText, actualTabText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        homepage.clickOnBooks();
        String expectedTabText = "Books";
        String actualTabText = topmenupage.getBooksText();
        Assert.assertEquals("Page not Found", expectedTabText, actualTabText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homepage.clickOnJewelry();
        String expectedTabText = "Jewelry";
        String actualTabText = topmenupage.getJewelryText();
        Assert.assertEquals("Page not Found", expectedTabText, actualTabText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homepage.clickOnGiftCards();
        String expectedTabText = "Gift Cards";
        String actualTabText = topmenupage.getGiftCardsText();
        Assert.assertEquals("Page not Found", expectedTabText, actualTabText);
    }

}
