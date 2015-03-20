package com.company.hw;

/**
 * Created by orogozina on 3/12/15.
 */

import com.company.hw.pages.IndexPage;
import com.company.hw.pages.elements.PageDialog;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Hw extends BaseTest{


//Selenide
    @Test
    public void userCanCreateandSaveComment() {
        String commentText = "Saska comment";
        String categoryName = "";
        int categoryId = 3;
        String xPathSelectorCategory = "//*[@id='alvailablecategories']/div[" + categoryId + "]";
        String xPathSelectorNewComment = "//*[@class=\"textcolumn\"][text()=\"" + commentText + "\"]";
        MyDriver myDriver = new MyDriver();
        $(By.cssSelector(".buttonAsLink.navigationButton[onclick=\"RedirectToNewComment()\"]")).click();
        $(By.cssSelector("#Text")).setValue(commentText);
        categoryName = $(By.xpath(xPathSelectorCategory + "/span")).getText();
        $(By.xpath(xPathSelectorCategory + "/input")).click();
        $(By.cssSelector(".actionbutton[name=CurSelect]")).click();
        $(By.cssSelector(".buttonAsLink[onclick=\"SaveAction(1)\"]")).click();
        $(By.xpath(".//*[@id='SelectedCateg']/option[text()='" + categoryName + "']")).click();
        $(By.cssSelector("#applybutton")).click();
        assertTrue("Comment is not created", CommentsOnSelenide.findCommentByText(commentText).exists());
        CommentsOnSelenide.deleteNewComment(commentText);
        assertFalse("Comment is not deleted", CommentsOnSelenide.findCommentByText(commentText).exists());
    }

    @Test
    public void verifyAlertNoSelectedCommentDuplication() {
        IndexPage indexPage = new IndexPage(getMyDriver());
        indexPage.getPageCommentsTable().unCheckAllChecked();
        //todo
        indexPage.findElementByCssSelector(".buttonAsLink.navigationButton[onclick=\"DuplicateCmd('Duplicate')\"]").click();
        PageDialog dialog = new PageDialog(indexPage);
        assertTrue("Dialog is not up",dialog.isDisplayed());
        assertTrue("Text is not correct", dialog.getText().equals("Please select one comment"));
        dialog.submitDialog();
        assertFalse("Dialog is not closed after Ok", dialog.isDisplayed());
    }
}
