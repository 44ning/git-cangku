package Page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/1/10/010.
 */
public class PageLogin {
    //点击登录按钮
    public static final By LOGIN = By.xpath("//*[@id=\"ECS_MEMBERZONE\"]/a[1]/img");
    //用户名输入框
    public static final By USERNAME = By.name("username");
    //密码输入框
    public static final By PASSWORD = By.name("password");
    //立即登录按钮
    public static final By DENGLU = By.name("submit");

}
