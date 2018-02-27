package testcase;

import Page.PageGSMPhone;
import Util.LogConfiguration;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_002_Comment extends BasicCase{
    @Test
    public static void youKePingJia() throws InterruptedException {
        LogConfiguration.initLog("TestCase_001_Comment");
        seleniumUtil.click(PageGSMPhone.GSM_PHONE);
        seleniumUtil.click(PageGSMPhone.CHOICE_PHONE);
        seleniumUtil.click(PageGSMPhone.PINGJIA_GRADE);
        seleniumUtil.sendKeys(PageGSMPhone.YOUKE_EMAIL,"943279555@qq.com");
        seleniumUtil.sendKeys(PageGSMPhone.PINGJIA_TEXT,"3G手机超越一切不可能");
        Thread.sleep(3000);
        seleniumUtil.click(PageGSMPhone.TIJAIO_PINGLUN);
    }
}
