package pageEvents;

import base.baseClass;

import org.openqa.selenium.WebElement;
import pageObjects.ProductPageElements;
import utils.ElementFetch;

import java.util.*;

public class ProductpageEvents {

    ElementFetch element = new ElementFetch();

    public void AddtoCart() throws InterruptedException {


       Set<String> tabs = baseClass.driver.getWindowHandles();
       ArrayList arrayList = new ArrayList(tabs);
       baseClass.driver.switchTo().window(arrayList.get(1).toString());

        Thread.sleep(3000);
        element.getWebElement("XPATH", ProductPageElements.add_to_cart).click();
        Thread.sleep(2000);
        baseClass.driver.close();
        baseClass.driver.switchTo().window(arrayList.get(0).toString());
        Thread.sleep(2000);
        element.getWebElement("ID", "nav-cart").click();
        Thread.sleep(2000);
        element.getWebElement("XPATH", ProductPageElements.add_more_to_cart).click();
        Thread.sleep(2000);
        element.getWebElement("XPATH", ProductPageElements.remove_from_cart).click();
        Thread.sleep(2000);
        element.getWebElement("XPATH",ProductPageElements.proceed_to_checkout).click();

    }


    public void findProduct(){
       List<WebElement> element1 = element.getWebElements("CSS",ProductPageElements.products);
        Map<WebElement,Integer> elementIntegerMap = new HashMap<>();
       for (int i=0;i<element1.size();i++){
           elementIntegerMap.put(element1.get(i),Integer.parseInt(element1.get(i).getText().replaceAll(",","")));
       }
       List<Map.Entry<WebElement,Integer>> list = new ArrayList<>(elementIntegerMap.entrySet());
       list.sort(Map.Entry.comparingByValue());
       list.get(0).getKey().click();
    }
}
