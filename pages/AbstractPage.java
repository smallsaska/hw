package com.company.hw.pages;


import com.company.hw.MyDriver;
import com.company.hw.pages.elements.*;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by orogozina on 3/13/15.
 */

public abstract class AbstractPage {

    PageInputField pageInputField;
    PageListField pageListField;
    PageLinkField pageLinkField;
    PageSelectField pageSelectField;
    PageTableField pageTableField;
    PageTextField pageTextField;
    PageCommentsTable pageCommentsTable;
    MyDriver myDriver;

    public AbstractPage(MyDriver myDriver) {
        this.myDriver = myDriver;
    }

    public WebElement findElementByCssSelector(String cssSelector){
      return myDriver.findElementByCssSelector(cssSelector);
    }
    public List<WebElement> findElementsByCssSelector(String cssSelector){
        return myDriver.findElementsByCssSelector(cssSelector);
    }
    public List<WebElement> findElementsByXPathSelector(String xPathSelector){
        return myDriver.findElementsByXPathSelector(xPathSelector);
    }
    public WebElement findElementByXPathSelector(String xPathSelector){
        return myDriver.findElementByXPathSelector(xPathSelector);
    }
}

