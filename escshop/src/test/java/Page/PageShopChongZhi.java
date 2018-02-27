package Page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/1/10/010.
 */
public class PageShopChongZhi {
    //移动手机充值卡链接
    public static final By Ka_lianjie = By.cssSelector("#category_tree > dl:nth-child(3) > dd:nth-child(3) > a");
    //充值卡购买
    public static final By SHOP_KA = By.xpath("/html/body/div[7]/div[2]/div[3]/div/form/div/div/div[1]/a[3]");
    //结算中心
    public static final By SHOP_CENTER = By.cssSelector("body > div:nth-child(8) > div.flowBox > table > tbody > tr > td:nth-child(2) > a > img");
    //支付方式，余额支付
    public static final By PAYER = By.name("payment");
    //提交订单
    public static final By TIJIAO_DINGDAN = By.cssSelector("#theForm > div:nth-child(11) > div:nth-child(3) > input[type=\"image\"]:nth-child(1)");
    //退出充值卡登录
    public static final By QUIT_LOGIN = By.cssSelector("#ECS_MEMBERZONE > font > a:nth-child(3)");
}
