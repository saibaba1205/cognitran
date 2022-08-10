package com.cognitran.pages;

import com.cognitran.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = ".button.button-black")
    WebElement acceptcookies;
    @CacheLookup
    @FindBy(xpath = "//header/div[1]/nav[1]/div[2]/ul[1]/div[1]/a[1]")
    WebElement careers;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Students & Graduates')]")
    WebElement studentandgraduates;

    @CacheLookup
    @FindBy(linkText = "Submit your CV")
    WebElement submityourcv;

    @CacheLookup
    @FindBy(css = "h3[class='display-5']")
    WebElement varifytext;


    public void acceptcookies() {
        mouseHoverToElementAndClick(acceptcookies);
    }

    public void mousehoveroncareers() {
        mouseHoverToElement(careers);
    }

    public void clickonstudentandgraduates() {
        clickOnElement(studentandgraduates);
    }

    public void clickonsubmityourcv() {
        clickOnElement(submityourcv);
    }

    public void verifytextcareer(String expected) {
        log.info("We are currently looking for:" + varifytext.toString());
        verifyElementText(varifytext, expected, "We are currently looking for:");
    }
}
