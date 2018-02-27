package Page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class PageRegister {
    //注册按钮
    public static final By ZHUCE = By.cssSelector("#ECS_MEMBERZONE > a:nth-child(3) > img");
    //用户名输入框
    public static final By NAME = By.id("username");
    //email输入框
    public static final By EMAIL = By.id("email");
    //密码输入框
    public static final By MIMA = By.id("password1");
    //确认密码输入框
    public static final By QUEMI = By.id("conform_password");
    //MSN输入框
    public static final By MSN_YOUXIANG = By.name("extend_field1");
    //QQ输入框
    public static final By QQ_SHURU = By.name("extend_field2");
    //办公电话输入框
    public static final By GONG_PHONE = By.name("extend_field3");
    //家庭电话输入框
    public static final By HOME_PHONE = By.name("extend_field4");
    //手机输入框
    public static final By MOBILE = By.name("extend_field5");
    //密码提示问题
    public static final By MIMA_TISHI = By.cssSelector("body > div.usBox > div > form > table > tbody > tr:nth-child(11) > td:nth-child(2) > select");
    //选择密码提示问题
    public static final By CHOICE_QUESTION = By.cssSelector("body > div.usBox > div > form > table > tbody > tr:nth-child(11) > td:nth-child(2) > select > option:nth-child(2)");
    //密码问题答案输入框
    public static final By MIMA_QUESTION = By.name("passwd_answer");
    //立即注册按钮
    public static final By LIJI_ZHUCE = By.name("Submit");

}
