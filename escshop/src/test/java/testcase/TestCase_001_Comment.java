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
public class TestCase_001_Comment extends BasicCase{
//    Util util = new Util();
//    @DataProvider(name = "testdata1")
//    public Object[][] ExcelDataProvide(){
//        util.readExcel("./file/data.xls","login");
//        return util.ExcelDataProvider();
//    }
    @Test
//            (dataProvider = "testdata1")
    public static void pingJia() throws InterruptedException {
        LogConfiguration.initLog("TestCase_001_Comment");
        PageLoginHelper.clickDenglu(seleniumUtil,"lili","ning10494");
        seleniumUtil.click(PageGSMPhone.GSM_PHONE);
        seleniumUtil.click(PageGSMPhone.CHOICE_PHONE);
        seleniumUtil.click(PageGSMPhone.PINGJIA_GRADE);
        seleniumUtil.sendKeys(PageGSMPhone.PINGJIA_TEXT,"3G手机超越一切不可能");
        Thread.sleep(3000);
        seleniumUtil.click(PageGSMPhone.TIJAIO_PINGLUN);
    }
}
