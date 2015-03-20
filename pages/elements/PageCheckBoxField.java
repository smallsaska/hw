package com.company.hw.pages.elements;

/**
 * Created by orogozina on 3/13/15.
 */
public class PageCheckBoxField extends PageAbstractElement{

    @Override
    public boolean isSelected(){
        return getWebElement().isSelected();
    }

    @Override
    public void select() {
        getWebElement().click();
    }

}
