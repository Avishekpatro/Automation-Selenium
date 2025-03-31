package qa.test;

import org.testng.annotations.Test;
import base.baseClass;
import pageEvents.HomepageEvents;
import pageEvents.LoginPageEvents;
import pageEvents.ProductpageEvents;
import pageObjects.LoginPageElements;
import utils.ElementFetch;


public class Testcase1 extends baseClass {

    ElementFetch element = new ElementFetch();
    HomepageEvents homeevents = new HomepageEvents();
    LoginPageEvents loginEvents = new LoginPageEvents();
    ProductpageEvents productpageEvents = new ProductpageEvents();
    LoginPageElements loginPageElements = new LoginPageElements();

@Test(enabled = false)
    public void run1(){
        homeevents.signInButton();
        loginEvents.wrongPwd(LoginPageElements.correct_phn,LoginPageElements.wrong_pwd);
        baseClass.driver.quit();
    }
@Test(enabled = false)
    public void run2(){

        homeevents.signInButton();
      //  loginEvents.verifyLoginPageLoaded();
        loginEvents.wrongUser(LoginPageElements.wrong_phn,LoginPageElements.correct_pwd);
        baseClass.driver.quit();
    }

    @Test(enabled = false)
    public void run3(){

        homeevents.signInButton();
        loginEvents.enterCreds(LoginPageElements.correct_phn,LoginPageElements.correct_pwd);

    }

    @Test
    public void addItem() throws InterruptedException {

         run3();
        homeevents.selectProduct();
        productpageEvents.findProduct();
        productpageEvents.AddtoCart();

    }
}
