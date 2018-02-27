package testcase;

import Page.PageSouSuo;
import Util.LogConfiguration;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_004_Sou extends BasicCase{
    @Test
    public static void topSouSuo() throws InterruptedException {
        LogConfiguration.initLog("TestCase_004_Sou");
        seleniumUtil.click(PageSouSuo.TOP_SOUSUO);
        seleniumUtil.sendKeys(PageSouSuo.SOUSUO_GUANJIANZI,"26万色TFT彩色屏幕");
        seleniumUtil.click(PageSouSuo.SOUSUO_FENLEI);
        seleniumUtil.click(PageSouSuo.SOUSUO_STYLE);
        seleniumUtil.click(PageSouSuo.SOUSUO_PINGPAI);
        seleniumUtil.click(PageSouSuo.CLICK_PINGPAI);
        seleniumUtil.sendKeys(PageSouSuo.MIN_PRICE,"1000");
        seleniumUtil.sendKeys(PageSouSuo.MAX_PRICE2,"3000");
        Thread.sleep(3000);
        seleniumUtil.click(PageSouSuo.LIJI_SOUSUO);
        logger.info("搜索成功");
    }
}
