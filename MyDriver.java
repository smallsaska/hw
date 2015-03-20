package com.company.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by orogozina on 3/13/15.
 */
public class MyDriver {

    private WebDriver driver;
    private String baseUrl = "http://comments.azurewebsites.net/";

    public MyDriver() {
        driver = new FirefoxDriver();
        driver.get(baseUrl);
    }

    public void close(){
        driver.close();
    }

    public WebElement findElementByCssSelector(String cssSelector){
        return driver.findElement(By.cssSelector(cssSelector));
    }
    public WebElement findElementByXPathSelector(String xPathSelector){
        return driver.findElement(By.xpath(xPathSelector));
    }
    public List<WebElement> findElementsByXPathSelector(String xPathSelector){
        return driver.findElements(By.xpath(xPathSelector));
    }
    public List<WebElement> findElementsByCssSelector(String cssSelector) {
        return driver.findElements(By.cssSelector(cssSelector));
    }

}

