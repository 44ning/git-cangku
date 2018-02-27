package Page;

import org.openqa.selenium.By;
import testcase.BasicCase;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class PageGSMPhone {
    //CDMA手机
    public static final By GSM_PHONE = By.xpath("//*[@id=\"mainNav\"]/a[2]");
    //选择手机
    public static final By CHOICE_PHONE = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(5) > div > form > div > div > div:nth-child(2) > a:nth-child(1) > img");
    //选择手机购买数量
    public static final By NUMBER_PHONE = By.id("number");
    //加入购物车
    public static final By SHOPCAR = By.cssSelector("#ECS_FORMBUY > ul > li:nth-child(9) > a:nth-child(1) > img");
    //结算中心
    public static final By JIESUAN_CENTER = By.cssSelector("body > div:nth-child(8) > div:nth-child(3) > table > tbody > tr > td:nth-child(2) > a > img");
    //配送方式
    public static final By SEND_STYLE = By.name("shipping");
    //支付方式
    public static final By PAY_STYLE = By.xpath("//*[@id=\"paymentTable\"]/tbody/tr[3]/td[1]/input");
    //提交订单
    public static final By TIJIAO_DINGDAN = By.cssSelector("#theForm > div:nth-child(16) > div:nth-child(3) > input[type=\"image\"]:nth-child(1)");
    //我的收藏
    public static final By COLLECT = By.cssSelector("body > div:nth-child(8) > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > a");
    //收藏购买
    public static final By COLLECT_SHOP = By.cssSelector("#speDiv > center > a:nth-child(1)");
    //清空购物车
    public static final By CLEAR_SHOPCAR = By.cssSelector("#formCart > table:nth-child(2) > tbody > tr > td:nth-child(2) > input:nth-child(1)");
    //删除订单
    public static final By DELETE1 = By.cssSelector("#formCart > table:nth-child(1) > tbody > tr:nth-child(2) > td:nth-child(7) > a:nth-child(1)");
    //更新购物车
    public static final By GENGXIN = By.name("submit");
    //手机评价等级
    public static final By PINGJIA_GRADE = By.name("comment_rank");
    //评价内容输入框
    public static final By PINGJIA_TEXT = By.name("content");
    //提交评论按钮
    public static final By TIJAIO_PINGLUN = By.cssSelector("#commentForm > table > tbody > tr:nth-child(5) > td > input");
    //游客邮箱
    public static final By YOUKE_EMAIL = By.id("email");
}
