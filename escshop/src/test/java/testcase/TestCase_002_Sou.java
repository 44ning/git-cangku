package testcase;

import Page.PageSouSuo;
import Util.LogConfiguration;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_002_Sou extends BasicCase{
    @Test
    public static void choiceShopping() throws InterruptedException {
        LogConfiguration.initLog("TestCase_002_Sou");
        seleniumUtil.click(PageSouSuo.CHOICE_SHOPPING);
        seleniumUtil.click(PageSouSuo.PHONE_STYLE);
        Thread.sleep(2000);
        seleniumUtil.click(PageSouSuo.PHONE_SIZE);
        seleniumUtil.click(PageSouSuo.PHONE_COLOR);
        seleniumUtil.click(PageSouSuo.PHONE_CALLTIME);
        seleniumUtil.click(PageSouSuo.PHONE_DAIJI_TIME);
        seleniumUtil.click(PageSouSuo.RESULT_PHONE);
        logger.info("搜索成功");
    }
}
