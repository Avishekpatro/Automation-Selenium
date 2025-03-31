package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import utils.Constants;

import java.util.concurrent.TimeUnit;

public class baseClass {

    public static WebDriver driver;

    @BeforeMethod
    public void setupDriver(){

        System.setProperty(Constants.driverName,Constants.driver);

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(Constants.url);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
