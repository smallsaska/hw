package com.company.hw.pages.elements;

/**
 * Created by orogozina on 3/13/15.
 */
public class PageTextField extends PageAbstractElement{

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public void select() {

    }



    public String getText(){
        return getWebElement().getText();
    }
}
