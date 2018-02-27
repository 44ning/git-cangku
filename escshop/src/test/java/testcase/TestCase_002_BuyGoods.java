package testcase;

import Page.PageGSMPhone;

import Page.PageUserCenter;
import PageHelper.PageAddressHelper;
import Util.LogConfiguration;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class TestCase_002_BuyGoods extends BasicCase{

    @Test
    public static void GSMPhone() throws InterruptedException {
        LogConfiguration.initLog("TestCase_002_BuyGoods");
        Thread.sleep(4000);
        seleniumUtil.click(PageGSMPhone.GSM_PHONE);
        seleniumUtil.click(PageGSMPhone.CHOICE_PHONE);
        Thread.sleep(2000);
        seleniumUtil.clear(PageGSMPhone.NUMBER_PHONE);
        seleniumUtil.sendKeys(PageGSMPhone.NUMBER_PHONE,"2");
        seleniumUtil.click(PageGSMPhone.SHOPCAR);
        Thread.sleep(5000);
        seleniumUtil.click(PageGSMPhone.JIESUAN_CENTER);
        Thread.sleep(5000);
        PageAddressHelper.addressAdd(seleniumUtil);
        seleniumUtil.click(PageGSMPhone.SEND_STYLE);
        Thread.sleep(2000);
        seleniumUtil.click(PageUserCenter.HANK);
        seleniumUtil.click(PageGSMPhone.TIJIAO_DINGDAN);

    }
}
