package uk.org.wcht.page;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {
    // get web element path store in By
    By yourHome = By.className("header__nav-area-title");
    By aboutUs = By.linkText("About us");


    //for action create method to use it
    public void mouseHoverOnYour() {
        waitUntilPresenceOfElementLocated(yourHome,30);
        mouseHoverToElement(yourHome);
    }


    public void clickOnaboutUS(){
        waitUntilPresenceOfElementLocated(aboutUs,30);
        mouseHoverToElementAndClick(aboutUs);
    }
}