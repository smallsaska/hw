package com.company.hw.pages.elements;

import com.company.hw.pages.AbstractPage;

/**
 * Created by orogozina on 3/13/15.
 */
public class PageComment extends PageAbstractElement{
    private AbstractPage parent;

    public PageComment(AbstractPage parent) {
        this.parent=parent;
    }

    public PageComment(AbstractPage parent,int index) {
        checkBoxField.setWebElement(parent.findElementByXPathSelector("//*/tr[" + index + "]/td[@class=\"checkedcolumn\"]/input[1]"));
        number.setWebElement(parent.findElementByXPathSelector("//*/tr[" + index + "]/td[@class=\"numbercolumn\"]"));
        commentText.setWebElement(parent.findElementByXPathSelector("//*/tr["+index+"]/td[@class=\"textcolumn\"]"));
        isActive.setWebElement(parent.findElementByXPathSelector("//*/tr["+index+"]/td[@class=\"inactivecolumn\"]"));
        categories.setWebElement(parent.findElementByXPathSelector("//*/tr["+index+"]/td[@class=\"categorycolumn\"]"));

    }

    private PageCheckBoxField checkBoxField =new PageCheckBoxField();
    private PageTextField number = new PageTextField();
    private PageTextField commentText = new PageTextField();
    private PageTextField isActive = new PageTextField();
    private PageTextField categories = new PageTextField();

    public PageCheckBoxField getCheckBoxField() {
        return checkBoxField;
    }

    public PageTextField getNumber() {
        return number;
    }

    public PageTextField getCommentText() {
        return commentText;
    }

    public PageTextField getIsActive() {
        return isActive;
    }

    public PageTextField getCategories() {
        return categories;
    }

    @Override
    public boolean isSelected() {
        return checkBoxField.isSelected();
    }

    @Override
    public void select() {
        checkBoxField.select();

    }
}
