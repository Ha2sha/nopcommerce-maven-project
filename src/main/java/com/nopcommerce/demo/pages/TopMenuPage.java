package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    By computerText=By.linkText("Computers");
    By electronicsText=By.linkText("Electronics");
    By apparelText=By.linkText("Apparel");
    By digitalDownloadsText=By.linkText("Digital downloads");
    By booksText=By.linkText("Books");
    By jewelryText=By.linkText("Jewelry");
    By giftCardsText=By.linkText("Gift Cards");

    public String getComputersText(){
        return getTextFromElement(computerText);
    }
    public String getElectronicsText(){
        return getTextFromElement(electronicsText);
    }
    public String getApparelText(){
        return getTextFromElement(apparelText);
    }
    public String getDigitalDownloadsText(){
        return getTextFromElement(digitalDownloadsText);
    }
    public String getBooksText(){
        return getTextFromElement(booksText);
    }public String getJewelryText(){
        return getTextFromElement(jewelryText);
    }
    public String getGiftCardsText(){
        return getTextFromElement(giftCardsText);
    }


}
