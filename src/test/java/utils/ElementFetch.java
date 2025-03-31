package utils;

import base.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementFetch {

    public WebElement getWebElement(String identifierType,String IdentifierValue){

        switch (identifierType){

            case"XPATH":
                return baseClass.driver.findElement(By.xpath(IdentifierValue));
            case"CSS":
                return baseClass.driver.findElement(By.cssSelector(IdentifierValue));
            case"ID":
                return baseClass.driver.findElement(By.id(IdentifierValue));
            case"NAME":
                return baseClass.driver.findElement(By.name(IdentifierValue));
            case"TAG":
                return baseClass.driver.findElement(By.tagName(IdentifierValue));
            case"CLASS":
                return baseClass.driver.findElement(By.className(IdentifierValue));

            default:
                return null;
        }
    }

    public List<WebElement> getWebElements(String identifierType, String IdentifierValue){

        switch (identifierType){

            case"XPATH":
                return baseClass.driver.findElements(By.xpath(IdentifierValue));
            case"CSS":
                return baseClass.driver.findElements(By.cssSelector(IdentifierValue));
            case"ID":
                return baseClass.driver.findElements(By.id(IdentifierValue));
            case"NAME":
                return baseClass.driver.findElements(By.name(IdentifierValue));
            case"TAG":
                return baseClass.driver.findElements(By.tagName(IdentifierValue));
            case"CLASS":
                return baseClass.driver.findElements(By.className(IdentifierValue));

            default:
                return null;
        }


    }
}
