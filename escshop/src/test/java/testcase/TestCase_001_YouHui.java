package testcase;

import Page.PageYouHui;
import PageHelper.PageLoginHelper;
import Util.Util;
import Util.LogConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_001_YouHui extends BasicCase{
//    Util util = new Util();
//    @DataProvider(name = "testdata")
//    public Object[][] ExcelDataProvide(){
//        util.readExcel("./file/data.xls","login");
//        return util.ExcelDataProvider();
//    }
    @Test
//            (dataProvider = "testdata")
    public static void youHui() throws InterruptedException {
        LogConfiguration.initLog("TestCase_001_YouHui");
        PageLoginHelper.clickDenglu(seleniumUtil,"lili","ning10494");
        seleniumUtil.click(PageYouHui.YOUHUI);
        seleniumUtil.click(PageYouHui.PINPAI);
        seleniumUtil.click(PageYouHui.NUOJIYA);
        Thread.sleep(5000);
        seleniumUtil.click(PageYouHui.SHOP_NUOJIYA);
        Thread.sleep(3000);
        if (seleniumUtil.equals(PageYouHui.PRICE)==seleniumUtil.equals(PageYouHui.PRICE)){
            seleniumUtil.click(PageYouHui.SHOP_CENTER3);
        }else {
            System.out.println("价格与折扣价不符");
        }
    }

}
