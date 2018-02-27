package Util;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/1/10/010.
 */
public class SeleniumUtil {
    private  static Logger logger = Logger.getLogger(SeleniumUtil.class);
    //加载驱动
    WebDriver driver ;
    public WebDriver getDriver(String driverType){
        if ("Chrome".equals(driverType)){
            driver = new ChromeDriver();
            logger.info("加载驱动");
        }else {
            logger.error("不识别的浏览器");
        }
        return driver;
    }

    //打开网址
    public void get(String url){
        driver.get(url);
        logger.info("打开的网址是："+url);
    }

    //识别一组元素
    public WebElement findElement(By by){
        WebElement webelement = null;
        try{
            webelement = driver.findElement(by);

            logger.info("查找到相应元素"+webelement.getTagName());

            return webelement;
        }
        catch (NoSuchContextException e){
            Util.takeScreenShot(driver,"找不到元素");
            logger.error("找不到元素");

        }
        return webelement;
    }

    //输入内容
    public void sendKeys(By by,String txt){
        WebElement element = findElement(by);
        element.sendKeys(txt);
        logger.info("在元素中"+getLocatorByElement(element, ">")+"上输入内容"+txt);
    }
    //点击
    public void click(By by){
        WebElement element = findElement(by);
        element.click();
        logger.info("对元素上进行"+getLocatorByElement(element, ">") +"点击");
    }

    //根据元素来获取此元素的定位值

    public String getLocatorByElement(WebElement element, String expectText) {
        String text = element.toString();
        String expect = null;
        try {
            expect = text.substring(text.indexOf(expectText) + 1, text.length() - 1);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("failed to find the string [" + expectText + "]");
        }
        return expect;
    }



    //获取元素上内容
    public String gettext(By by){
        WebElement element = findElement(by);
        String text = element.getText();
        logger.info("获取元素内容，内容是："+text);
        return text;
    }
    //清空内容
    public void clear(By by){
        WebElement element = findElement(by);
        element.clear();
        logger.info("清空元素："+getLocatorByElement(element, ">")+"上的内容");
    }
}
