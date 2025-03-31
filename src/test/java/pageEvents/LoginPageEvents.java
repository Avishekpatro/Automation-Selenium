package pageEvents;

import base.baseClass;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

import java.util.concurrent.TimeUnit;

public class LoginPageEvents {

    ElementFetch element = new ElementFetch();
    public void verifyLoginPageLoaded(){

        Assert.assertTrue("Element Not found",element.getWebElements("XPATH", LoginPageElements.login).size()>0);

    }

    public void enterCreds(String username, String pwd){

        element.getWebElement("NAME",LoginPageElements.email).sendKeys(username);
        element.getWebElement("ID",LoginPageElements.login).click();

        baseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       WebElement element1 =  element.getWebElement("XPATH",LoginPageElements.pwd);
       if (element1.isDisplayed()){
           element1.sendKeys(pwd);
           element.getWebElement("XPATH",LoginPageElements.signup).click();

       }

    }

    public void wrongUser(String username, String pwd){

        element.getWebElement("NAME",LoginPageElements.email).sendKeys(username);
        element.getWebElement("ID",LoginPageElements.login).click();

        baseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement element1 =  element.getWebElement("XPATH",LoginPageElements.alert);
        if (element1.getText().startsWith("Incorrect")){
            System.out.println(element1.getText());
        }

    }

    public void wrongPwd(String username,String pwd){

        element.getWebElement("NAME",LoginPageElements.email).sendKeys(username);
        element.getWebElement("ID",LoginPageElements.login).click();

        baseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      element.getWebElement("XPATH",LoginPageElements.pwd).sendKeys(pwd);

        element.getWebElement("XPATH",LoginPageElements.signup).click();


        WebElement element2 = element.getWebElement("XPATH",LoginPageElements.alertpwd);
        if (element2.isDisplayed()){
            System.out.println(element2.getText());
        }
    }
}
