package com.company.hw.pages;

import com.company.hw.MyDriver;
import com.company.hw.pages.elements.PageCommentsTable;
import com.company.hw.pages.elements.PageLinkField;

/**
 * Created by orogozina on 3/13/15.
 */
public class IndexPage extends AbstractPage {

    private MyDriver myDriver;


    PageCommentsTable pageCommentsTable = new PageCommentsTable(this);
    PageLinkField pageLinkField = new PageLinkField();
    
    public IndexPage(MyDriver myDriver) {
        super(myDriver);
    }

    public PageCommentsTable getPageCommentsTable() {
        return pageCommentsTable;
    }


    public PageLinkField getPageLinkField() {
        return pageLinkField;
    }
}
