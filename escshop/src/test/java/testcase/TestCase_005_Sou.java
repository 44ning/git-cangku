package testcase;

import Page.PageSouSuo;
import Util.LogConfiguration;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_005_Sou extends BasicCase{
    @Test
    public static void listSouSuo() throws InterruptedException {
        LogConfiguration.initLog("TestCase_005_Sou");
        seleniumUtil.click(PageSouSuo.PHONE_3GPHONE);
        seleniumUtil.click(PageSouSuo.PAIXU_PRICE);
        seleniumUtil.click(PageSouSuo.PAIXU_TIME);
        seleniumUtil.click(PageSouSuo.ORDER_BACK);
        seleniumUtil.click(PageSouSuo.PRDER_GO);
        Thread.sleep(3000);
        seleniumUtil.click(PageSouSuo.PRODUCT_GO);
        logger.info("搜索成功");
    }
}
