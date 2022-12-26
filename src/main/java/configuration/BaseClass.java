package configuration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver;

    static {
        driver = DriverConfig.create(BROWSERS.CHROMEINCOGNITO);
    }
//Будет вызываться каждый раз перед выполнением команды
 //   @BeforeClass
//    public static void createDriver() {
 //       driver = DriverConfig.create(BROWSERS.CHROMEINCOGNITO);
 //   }
    //Будет вызываться каждый раз после выполнения команды
//    @AfterClass
   public static void after() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
           throw new RuntimeException(e);
        }
       driver.quit();
    }
}