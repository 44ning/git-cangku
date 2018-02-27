package testcase;

import Page.PageUserCenter;
import PageHelper.PageLoginHelper;
import Util.Util;
import Util.LogConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_001_userCenter extends BasicCase{
//    Util util = new Util();
//    @DataProvider(name = "testdata")
//    public Object[][] ExcelDataProvide(){
//        util.readExcel("./file/data.xls","login");
//        return util.ExcelDataProvider();
//    }
    @Test
//            (dataProvider = "testdata")
    public static void userCenter() throws InterruptedException {
        LogConfiguration.initLog("TestCase_001_userCenter");
        PageLoginHelper.clickDenglu(seleniumUtil,"lili","ning10494");
        seleniumUtil.click(PageUserCenter.USERCENTER);
        seleniumUtil.click(PageUserCenter.USER_INFORMATION);
        Thread.sleep(2000);
        seleniumUtil.sendKeys(PageUserCenter.OLD_PASSWORD,"ning10494");
        seleniumUtil.sendKeys(PageUserCenter.NEW_PASSWORD,"123456");
        seleniumUtil.sendKeys(PageUserCenter.QUEREN_PASSWORD,"123456");
//        seleniumUtil.click(PageUserCenter.QUEREN_WRITE);
    }
}
