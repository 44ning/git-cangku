package Page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class PageSpecialOffer {
    //点击CDMA手机
    public static final By CDMA_SHOUJI = By.xpath("//*[@id=\"category_tree\"]/dl[1]/dd[1]/a");
    //选择手机
    public static final By CHOICE_CDMAPHONE2 = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(5) > div > form > div > div > div > a:nth-child(1) > img");
    //加入购物车
    public static final By SHOP_CAR2 = By.cssSelector("#ECS_FORMBUY > ul > li:nth-child(8) > a:nth-child(1) > img");
    //结算中心
    public static final By SHOP_CENTER = By.xpath("/html/body/div[7]/div[1]/table/tbody/tr/td[2]/a/img");
    //快递方式
    public static final By SEND_STYLE = By.name("shipping");
    //支付方式
    public static final By PAY_STYLE  = By.cssSelector("#paymentTable > tbody > tr:nth-child(3) > td:nth-child(1) > input[type=\"radio\"]");
    //提交订单
    public static final By TIJIAO_DINGDAN = By.cssSelector("#theForm > div:nth-child(16) > div:nth-child(3) > input[type=\"image\"]:nth-child(1)");
    //
}
