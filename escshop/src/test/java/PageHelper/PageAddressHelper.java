package PageHelper;

import Page.PageUserCenter;
import Util.SeleniumUtil;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/12/012.
 */
public class PageAddressHelper{
    public static void addressAdd(SeleniumUtil seleniumUtil) throws InterruptedException {
        seleniumUtil.click(PageUserCenter.SHOPPING_GO);
        seleniumUtil.click(PageUserCenter.ADDRESS_PROVINCE);
        seleniumUtil.click(PageUserCenter.PROVINCE);
        seleniumUtil.click(PageUserCenter.ADDRESS_CITY);
        seleniumUtil.click(PageUserCenter.CITY);
        Thread.sleep(3000);
        seleniumUtil.click(PageUserCenter.ADDRESS_QUYU);
        Thread.sleep(3000);
        seleniumUtil.click(PageUserCenter.QUYU);
        Thread.sleep(3000);
        seleniumUtil.sendKeys(PageUserCenter.SHOUHUO_NAME,"哪吒");
        seleniumUtil.sendKeys(PageUserCenter.SHOUHUO_ADDRESS,"天下第一家");
        seleniumUtil.sendKeys(PageUserCenter.SHOUHUO_EMAIL,"66666@qq.com");
        seleniumUtil.sendKeys(PageUserCenter.SHOUHUO_TELLPHONE,"12333445566");
        Thread.sleep(3000);
        seleniumUtil.click(PageUserCenter.QUEREN_ADDRESS);
    }

}
