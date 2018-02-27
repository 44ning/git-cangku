package testcase;

import Util.LogConfiguration;
import Util.SeleniumUtil;
import Util.Util;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Administrator on 2018/1/10/010.
 */
public class BasicCase {
    public static Logger logger = Logger.getLogger(BasicCase.class);
    public static WebDriver driver;
    public static SeleniumUtil seleniumUtil;
    @BeforeMethod
    public static void setUp(){
        LogConfiguration.initLog("setUp");
        String chromePath = "E:\\zidonghua\\chrome&driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        seleniumUtil = new SeleniumUtil();
        driver = seleniumUtil.getDriver("Chrome");
        seleniumUtil.get("http://127.0.0.1");
        Util.MaxWindow(driver);
    }
    @AfterMethod
    public static void tearDown(){
        driver.quit();
    }
}
