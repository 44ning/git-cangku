package testcase;

import Page.PageLiuYan;
import Util.LogConfiguration;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_002_Message extends BasicCase{
    @Test
    public static void youKeLiuYan() throws InterruptedException {
        LogConfiguration.initLog("TestCase_002_Message");
        seleniumUtil.click(PageLiuYan.LIUYAN);
        Thread.sleep(3000);
        seleniumUtil.sendKeys(PageLiuYan.YOUKE_ENMAIL,"943279555@qq.com");
        seleniumUtil.sendKeys(PageLiuYan.ZHUTI,"啦啦啦啦");
        seleniumUtil.sendKeys(PageLiuYan.TEXT,"下次可以换一家了");
        Thread.sleep(2000);
        seleniumUtil.click(PageLiuYan.QUE_LIANYAN);
    }
}
