package com.company.hw.pages.elements;

import com.company.hw.pages.AbstractPage;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by orogozina on 3/13/15.
 */
public class PageCommentsTable {

    private String tableCssSelector = ".webgrid";
    private String tableXPathSelector = "//table[@class=\"webgrid\"]";
    private AbstractPage parent;
    private PageComment comment;
    private List<PageComment> commentList = new ArrayList<PageComment>();
    List<WebElement> webElementList;


    public PageCommentsTable(AbstractPage parent) {
        this.parent = parent;
        String webElementUrl = ".textcolumn";
        webElementList = new ArrayList<WebElement>();
        webElementList = parent.findElementsByCssSelector(webElementUrl);
        for (int i =1; i <= webElementList.size(); i++){
            commentList.add(new PageComment(parent, i));
        }

    }



    public void unCheckAllChecked() {
        List<WebElement> listCheckBoxes = getCommentCheckBoxesList();
        for (WebElement element1 : listCheckBoxes) {
            if (element1.isSelected()) {
                element1.click();
            } else {
                continue;
            }
        }
    }

    public Integer howManyCommentsAreCheckedNow() {
        Integer number = 0;
        List<WebElement> listCheckBoxes = getCommentCheckBoxesList();
        for (WebElement element1 : listCheckBoxes) {
            if (element1.isSelected()) {
                number++;
            } else {
                continue;
            }
        }
        return number;
    }

    public void checkComment (int index){
        commentList.get(index).getCheckBoxField().click();
    }

    private List<WebElement> getCommentCheckBoxesList() {
        List<WebElement> listCheckBoxes = new ArrayList<WebElement>();
        listCheckBoxes = parent.findElementsByXPathSelector("//*/td[@class=\"checkedcolumn\"]/input[1]");
        return listCheckBoxes;
    }

    public void checkAnyComment() {

        int random = new Random().nextInt(commentList.size());
        commentList.get(random).getCheckBoxField().click();
    }




}
