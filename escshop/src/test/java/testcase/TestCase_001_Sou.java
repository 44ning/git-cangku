package testcase;

import Page.PageSouSuo;
import Util.LogConfiguration;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_001_Sou extends BasicCase{
    @Test
    public static void souSuo() throws InterruptedException {
        LogConfiguration.initLog("TestCase_001_Sou");
        Logger.getLogger(TestCase_001_Sou.class);
        seleniumUtil.click(PageSouSuo.ALL_CLASS);
        seleniumUtil.click(PageSouSuo.PRODUCT_INFROMATION);
        seleniumUtil.sendKeys(PageSouSuo.SOUSUO_TEXT,"诺基亚");
        seleniumUtil.click(PageSouSuo.CLICK_SOUSUO);
        Thread.sleep(2000);
        seleniumUtil.click(PageSouSuo.CLICK_SOUSUO);
        logger.info("搜索成功");
    }
}
