package testcase;

import Page.PageSouSuo;
import Util.LogConfiguration;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/12/012.
 */
public class TestCase_003_Sou extends BasicCase{
    @Test
    public static void productInfromation(){
        LogConfiguration.initLog("TestCase_003_Sou");
        seleniumUtil.sendKeys(PageSouSuo.SOUSUO_TEXT,"黑色");
        seleniumUtil.click(PageSouSuo.CLICK_SOUSUO);
        logger.info("搜索成功");
    }
}
