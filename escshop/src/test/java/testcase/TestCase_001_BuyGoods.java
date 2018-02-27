package testcase;

import Page.PageSpecialOffer;
import PageHelper.PageLoginHelper;
import Util.LogConfiguration;
import Util.Util;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_001_BuyGoods extends  BasicCase{
//    Util util = new Util();
//    @DataProvider(name = "testdata")
//    public Object[][] ExcelDataProvide(){
//        util.readExcel("./file/data.xls","login");
//        return util.ExcelDataProvider();
//    }
    @Test
//            (dataProvider = "testdata")
    public static void SpecialOffer() throws InterruptedException {
        LogConfiguration.initLog("TestCase_001_BuyGoods");
        PageLoginHelper.clickDenglu(seleniumUtil,"lili","ning10494");
        Thread.sleep(3000);
        seleniumUtil.click(PageSpecialOffer.CDMA_SHOUJI);
        seleniumUtil.click(PageSpecialOffer.CHOICE_CDMAPHONE2);
        seleniumUtil.click(PageSpecialOffer.SHOP_CAR2);
        Thread.sleep(3000);
        seleniumUtil.click(PageSpecialOffer.SHOP_CENTER);
        Thread.sleep(2000);
        seleniumUtil.click(PageSpecialOffer.SEND_STYLE);
        seleniumUtil.click(PageSpecialOffer.PAY_STYLE);
        seleniumUtil.click(PageSpecialOffer.TIJIAO_DINGDAN);
    }
}
