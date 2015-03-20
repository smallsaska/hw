package com.company.hw.pages.elements;

import com.company.hw.pages.AbstractPage;

/**
 * Created by orogozina on 3/16/15.
 */
public class PageDialog extends PageAbstractElement{

    private AbstractPage parent;

    private String text = null;
    private PageButtonField okButton = new PageButtonField();
    private PageButtonField cancelButton = new PageButtonField();

    public PageDialog(AbstractPage parent) {
        this.parent = parent;
        this.setWebElement(parent.findElementByCssSelector(".ui-dialog"));
        okButton.setWebElement(parent.findElementByXPathSelector("//*/button/span[text()=\"Ok\"]"));
 //       cancelButton.setWebElement(parent.findElementByCssSelector(""));
        text = parent.findElementByXPathSelector(".//*[@id='msgText']").getText();
    }

    public void submitDialog (){
        okButton.click();
    }

    public void rejectDialog(){
        cancelButton.click();
    }

    public  boolean isDisplayed(){
        return this.getWebElement().isDisplayed();
    }

    public String getText(){
        return text;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public void select() {

    }

}
