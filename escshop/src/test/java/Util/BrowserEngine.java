package Util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2018/1/10/010.
 */
public class BrowserEngine {
    public String browserName;
    public String stieUrl;
    public WebDriver driver;
    Properties p = new Properties();
    private Logger logger=Logger.getLogger(BrowserEngine.class);
    public void  initConfigDate(){
        try{
            InputStream in = new FileInputStream("./config.properties");
            p.load(in);
            browserName = p.getProperty("browserName");
            System.out.println(browserName);
            stieUrl = p.getProperty("URL");
            System.out.println(stieUrl);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public WebDriver getBrowser() {
        if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            logger.info("使用的浏览器是:firefox");
        } else if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","E:\\zidonghua\\chrome&driver\\chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("使用的浏览器是:chrome");
        }else if(browserName.equalsIgnoreCase("IE")){
            driver = new InternetExplorerDriver();
            logger.info("使用的浏览器是:IE");
        }
        driver.get(stieUrl);
        return driver;
    }
    public static void main(String[] args){
        LogConfiguration.initLog("BrowserEngine");
        BrowserEngine brow = new BrowserEngine();
        brow.initConfigDate();
        brow.getBrowser();
    }
}
