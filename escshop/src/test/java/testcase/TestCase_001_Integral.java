package testcase;

import Page.PageGSMPhone;
import Page.PagejiFen;
import PageHelper.PageLoginHelper;
import Util.Util;
import Util.LogConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_001_Integral extends BasicCase{
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
        seleniumUtil.click(PagejiFen.JIFEN);
        Thread.sleep(3000);
        seleniumUtil.click(PagejiFen.CHOICE_PHONEJIFEN);
        Thread.sleep(3000);
        seleniumUtil.click(PagejiFen.DUIHUAN);
        seleniumUtil.click(PagejiFen.SEND_ADDRESS);
        seleniumUtil.click(PageGSMPhone.SEND_STYLE);
        seleniumUtil.click(PageGSMPhone.PAY_STYLE);
        seleniumUtil.click(PageGSMPhone.TIJIAO_DINGDAN);
    }
}
