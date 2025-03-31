package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomepageElements;
import utils.ElementFetch;
import base.baseClass;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class HomepageEvents {

    ElementFetch element = new ElementFetch();
    public void signInButton(){

        element.getWebElement("ID", HomepageElements.login).click();


    }

    public void selectProduct(){
       WebElement element1 = element.getWebElement("XPATH",HomepageElements.item_search);
       element1.sendKeys("iphone 15");

       baseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      element.getWebElement("ID",HomepageElements.item).click();




//        JavascriptExecutor executor = (JavascriptExecutor) baseClass.driver;
//        executor.executeScript("arguments[0].scrollIntoView();",element1 );
//        element1.click();
    }
}
