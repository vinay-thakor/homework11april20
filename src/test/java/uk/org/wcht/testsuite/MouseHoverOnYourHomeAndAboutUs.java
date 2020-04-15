package uk.org.wcht.testsuite;

import org.testng.annotations.Test;
import uk.org.wcht.loadProperty.LoadProperty;
import uk.org.wcht.page.HomePage;
import uk.org.wcht.testbase.TestBase;

public class MouseHoverOnYourHomeAndAboutUs extends TestBase {
    //create object of HomePage to get the property of the class
    HomePage homePage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();

    @Test(groups = {"Smoke","Sanity","Regression"})
    //create a method to action on it, it will mouse hover your home
    public void mouseHovOnYourHome() {
        homePage.mouseHoverOnYour();
        homePage.clickOnaboutUS();
    }
}