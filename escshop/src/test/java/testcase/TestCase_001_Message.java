package testcase;

import Page.PageLiuYan;
import PageHelper.PageLoginHelper;
import Util.Util;
import Util.LogConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_001_Message extends BasicCase{
//    Util util = new Util();
//    @DataProvider(name = "testdata")
//    public Object[][] ExcelDataProvide(){
//        util.readExcel("./file/data.xls","login");
//        return util.ExcelDataProvider();
//    }
    @Test
//            (dataProvider = "testdata")
    public static void jiFen() throws InterruptedException {
        LogConfiguration.initLog("TestCase_001_Integral");
        PageLoginHelper.clickDenglu(seleniumUtil,"lili","ning10494");
        seleniumUtil.click(PageLiuYan.LIUYAN);
        Thread.sleep(3000);
        seleniumUtil.sendKeys(PageLiuYan.ZHUTI,"啦啦啦啦");
        seleniumUtil.sendKeys(PageLiuYan.TEXT,"下次可以换一家了");
        Thread.sleep(2000);
        seleniumUtil.click(PageLiuYan.QUE_LIANYAN);
    }
}
