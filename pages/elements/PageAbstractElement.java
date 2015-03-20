package com.company.hw.pages.elements;

import org.openqa.selenium.WebElement;

/**
 * Created by orogozina on 3/13/15.
 */
public abstract class PageAbstractElement {
    private WebElement webElement;


    public String getText(){
        return ("This element has no text");
    };

    public void setWebElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public void click (){

        webElement.click();
    }
    public abstract boolean isSelected();

    protected WebElement getWebElement(){return webElement;}

    public abstract void select();



}
