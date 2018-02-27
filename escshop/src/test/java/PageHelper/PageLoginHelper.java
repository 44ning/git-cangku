package PageHelper;

import Page.PageLogin;
import Util.SeleniumUtil;

/**
 * Created by Administrator on 2018/1/12/012.
 */
public class PageLoginHelper {

    public static void clickDenglu(SeleniumUtil seleniumUtil, String username, String password){
        seleniumUtil.click(PageLogin.LOGIN);
        seleniumUtil.sendKeys(PageLogin.USERNAME,username);
        seleniumUtil.sendKeys(PageLogin.PASSWORD,password);
        seleniumUtil.click(PageLogin.DENGLU);
    }
}
