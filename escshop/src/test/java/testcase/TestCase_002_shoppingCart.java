package testcase;

import Page.PageGSMPhone;
import PageHelper.PageLoginHelper;
import Util.LogConfiguration;
import Util.Util;
import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_002_shoppingCart extends BasicCase{
//    Util util = new Util();
//    @DataProvider(name = "testdata")
//    public Object[][] ExcelDataProvide(){
//        util.readExcel("./file/data.xls","login");
//        return util.ExcelDataProvider();
//    }
    @Test
//            (dataProvider = "testdata")
    public static void delete2() throws InterruptedException {
        LogConfiguration.initLog("TestCase_002_shoppingCart");
        PageLoginHelper.clickDenglu(seleniumUtil,"lili","ning10494");
        seleniumUtil.click(PageGSMPhone.GSM_PHONE);
        seleniumUtil.click(PageGSMPhone.CHOICE_PHONE);
        seleniumUtil.clear(PageGSMPhone.NUMBER_PHONE);
        seleniumUtil.sendKeys(PageGSMPhone.NUMBER_PHONE,"1");
        seleniumUtil.click(PageGSMPhone.SHOPCAR);
        Thread.sleep(3000);
        seleniumUtil.click(PageGSMPhone.DELETE1);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
    }
}
