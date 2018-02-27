package testcase;

import Page.PageGSMPhone;
import PageHelper.PageLoginHelper;
import Util.LogConfiguration;
import Util.Util;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_001_shoppingCart extends BasicCase{
//    Util util = new Util();
//    @DataProvider(name = "testdata")
//    public Object[][] ExcelDataProvide(){
//        util.readExcel("./file/data.xls","login");
//        return util.ExcelDataProvider();
//    }
    @Test
//            (dataProvider = "testdata")
    public static void collectShop() throws InterruptedException {
        LogConfiguration.initLog("TestCase_001_shoppingCart");
        PageLoginHelper.clickDenglu(seleniumUtil,"lili","ning10494");
        Thread.sleep(3000);
        seleniumUtil.click(PageGSMPhone.GSM_PHONE);
        seleniumUtil.click(PageGSMPhone.CHOICE_PHONE);
        seleniumUtil.clear(PageGSMPhone.NUMBER_PHONE);
        seleniumUtil.sendKeys(PageGSMPhone.NUMBER_PHONE,"1");
        seleniumUtil.click(PageGSMPhone.SHOPCAR);
        Thread.sleep(2000);
        seleniumUtil.click(PageGSMPhone.COLLECT);
        Thread.sleep(2000);
        seleniumUtil.click(PageGSMPhone.COLLECT_SHOP);
        Thread.sleep(3000);
    }
}
