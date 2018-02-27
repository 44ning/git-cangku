package testcase;

import Page.PageRegister;
import Util.LogConfiguration;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/10/010.
 */
public class TestCase_001_register extends BasicCase{

    @Test
    public static void register() throws InterruptedException {
        LogConfiguration.initLog("TestCase_001_register");
        logger.info("开始注册");
        seleniumUtil.click(PageRegister.ZHUCE);
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageRegister.NAME,"yiyi");
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageRegister.EMAIL,"943279555@qq.com");
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageRegister.MIMA,"ning10494");
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageRegister.QUEMI,"ning10494");
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageRegister.MSN_YOUXIANG,"943279555@qq.com");
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageRegister.QQ_SHURU,"943279555");
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageRegister.GONG_PHONE,"15702665600");
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageRegister.HOME_PHONE,"15702665600");
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageRegister.MOBILE,"15702665600");
        Thread.sleep(2000);
        seleniumUtil.click(PageRegister.MIMA_TISHI);
        Thread.sleep(2000);
        seleniumUtil.click(PageRegister.CHOICE_QUESTION);
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageRegister.MIMA_QUESTION,"0929");
        Thread.sleep(2000);
//        seleniumUtil.click(PageRegister.LIJI_ZHUCE);
//        logger.info("注册成功");


    }

}
