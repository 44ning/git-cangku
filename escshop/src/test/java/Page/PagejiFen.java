package Page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class PagejiFen {
    //积分商城
    public static final By JIFEN = By.cssSelector("#mainNav > a:nth-child(9)");
    //选择手机
    public static final By CHOICE_PHONEJIFEN = By.cssSelector("body > div:nth-child(8) > div.AreaR > div.box > div > form > div > div > div:nth-child(1) > a > img");
    //立刻兑换
    public static final By DUIHUAN = By.cssSelector("#ECS_FORMBUY > ul > li:nth-child(7) > input.bnt_blue_1");
    //配送地址
    public static final By SEND_ADDRESS = By.name("Submit");
    //
}
