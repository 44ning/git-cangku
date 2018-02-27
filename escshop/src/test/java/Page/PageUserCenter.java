package Page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class PageUserCenter {
    //用户中心
    public static final By USERCENTER = By.cssSelector("#ECS_MEMBERZONE > font > a:nth-child(2)");
    //用户信息
    public static final By USER_INFORMATION = By.cssSelector("body > div:nth-child(8) > div.AreaL > div > div > div > div > a:nth-child(2)");
    //旧密码
    public static final By OLD_PASSWORD = By.name("old_password");
    //新密码
    public static final By NEW_PASSWORD = By.name("new_password");
    //确认密码
    public static final By QUEREN_PASSWORD = By.name("comfirm_password");
    //确认修改
    public static final By QUEREN_WRITE = By.name("comfirm_password");
    //配送区域省份
    public static final By ADDRESS_PROVINCE = By.cssSelector("#selProvinces_0");
    public static final By PROVINCE = By.cssSelector("#selProvinces_0 > option:nth-child(2)");
    //配送区域城市
    public static final By ADDRESS_CITY = By.cssSelector("#selCities_0");
    public static final By CITY = By.cssSelector("#selCities_0 > option:nth-child(2)");
    //配送区
    public static final By ADDRESS_QUYU = By.cssSelector("#selDistricts_0 > option:nth-child(1)");
    public static final By QUYU = By.xpath("//*[@id=\"selDistricts_0\"]/option[2]");
    //收货人姓名
    public static final By SHOUHUO_NAME = By.xpath("//*[@id=\"consignee_0\"]");
    //收货人地址
    public static final By SHOUHUO_ADDRESS = By.name("address");
    //电话
    public static final By SHOUHUO_TELLPHONE = By.name("tel");
    //邮箱
    public static final By SHOUHUO_EMAIL = By.name("email");
    //新增收货地址
    public static final By  QUEREN_ADDRESS = By.xpath("//*[@id=\"theForm\"]/div/table/tbody/tr[6]/td/input[1]");
    //不打算登录，直接购买
    public static final By SHOPPING_GO = By.cssSelector("#loginForm > table > tbody > tr:nth-child(4) > td > div > input.bnt_blue_2");
    //银行转账
    public static final By HANK = By.cssSelector("#paymentTable > tbody > tr:nth-child(2) > td:nth-child(1) > input[type=\"radio\"]");

}
