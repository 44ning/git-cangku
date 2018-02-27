package testcase;

import Page.PageGSMPhone;
import PageHelper.PageLoginHelper;
import Util.Util;
import Util.LogConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_004_shoppingCar extends BasicCase{
//    Util util = new Util();
//    @DataProvider(name = "testdata")
//    public Object[][] ExcelDataProvide(){
//        util.readExcel("./file/data.xls","login");
//        return util.ExcelDataProvider();
//    }
    @Test
//            (dataProvider = "testdata")
    public static void gengXin() throws InterruptedException {
        LogConfiguration.initLog("TestCase_004_shoppingCar");
        PageLoginHelper.clickDenglu(seleniumUtil,"lili","ning10494");
        seleniumUtil.click(PageGSMPhone.GSM_PHONE);
        seleniumUtil.click(PageGSMPhone.CHOICE_PHONE);
        seleniumUtil.click(PageGSMPhone.SHOPCAR);
        Thread.sleep(3000);
        seleniumUtil.click(PageGSMPhone.GENGXIN);
    }
}
