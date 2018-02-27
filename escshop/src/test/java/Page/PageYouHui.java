package Page;

import org.openqa.selenium.By;


/**
 * Created by Administrator on 2018/1/11/011.
 */
public class PageYouHui {
    //优惠活动
    public static final By YOUHUI = By.cssSelector("#mainNav > a:nth-child(6)");
    //选取品牌
    public static final By PINPAI = By.cssSelector("body > div:nth-child(8) > table > tbody > tr:nth-child(4) > td:nth-child(2) > a > span > u");
    //诺基亚手机
    public static final By NUOJIYA = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(5) > div > div > div > div:nth-child(2) > a:nth-child(9)");
    //购买手机
    public static final By SHOP_NUOJIYA = By.cssSelector("#speDiv > center > a:nth-child(1)");
    //结算中心
    public static final By SHOP_CENTER3 = By.cssSelector("body > div:nth-child(8) > div:nth-child(3) > table > tbody > tr > td:nth-child(2) > a > img");
    //总价
    public static final By PRICE = By.cssSelector("#formCart > table:nth-child(1) > tbody > tr:nth-child(2) > td:nth-child(4)");

}
