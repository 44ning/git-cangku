package Page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class PageLiuYan {
    //留言板
    public static final By LIUYAN = By.cssSelector("#mainNav > a:nth-child(10)");
    //主题输入框
    public static final By ZHUTI = By.name("msg_title");
    //留言内容
    public static final By TEXT = By.name("msg_content");
    //我要留言按钮
    public static final By QUE_LIANYAN = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(6) > div > div > form > table > tbody > tr:nth-child(6) > td:nth-child(2) > input.bnt_blue_1");
    //游客邮箱
    public static final By YOUKE_ENMAIL = By.name("user_email");
}
