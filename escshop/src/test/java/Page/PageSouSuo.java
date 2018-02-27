package Page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/1/11/011.
 */
public class PageSouSuo {
    //所有分类
    public static final By ALL_CLASS = By.id("category");
    //选择商品信息
    public static final By PRODUCT_INFROMATION = By.cssSelector("#category > option:nth-child(14)");
    //搜索输入框
    public static final By SOUSUO_TEXT = By.id("keyword");
    //搜索按钮
    public static final By CLICK_SOUSUO = By.name("imageField");
    //选购中心
    public static final By CHOICE_SHOPPING = By.cssSelector("#topNav > a:nth-child(2)");
    //手机制式
    public static final By PHONE_STYLE = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(3) > td > a:nth-child(2)");
    //颜色
    public static final By PHONE_COLOR = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(3) > td > a");
    //情景模式
    public static final By PHONE_QINGJING = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(7) > td > a");
    //中文输入法
    public static final By PHONE_CHINESE = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(9) > td > a");
    //屏幕大小
    public static final By PHONE_SIZE = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(11) > td > a:nth-child(1)");
    //上市日期
    public static final By PHONE_DATA = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(3) > td > a");
    //外观样式
    public static final By PHONE_WAIGUAN = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(15) > td > a:nth-child(1)");
    //理论待机时间
    public static final By PHONE_DAIJI_TIME = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(3) > td > a");
    //理论通话时间
    public static final By PHONE_CALLTIME = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(3) > td > a");
    //配件
    public static final By PHONE_PARTS = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(21) > td > a:nth-child(1)");
    //存储卡方式
    public static final By PHONE_SAVESTYLE = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(23) > td > a:nth-child(1)");
    //内存容量
    public static final By PHONE_MEMORY = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(25) > td > a:nth-child(1)");
    //屏幕分别率
    public static final By PHONE_SCREEN = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(26) > td > strong");
    //操作系统
    public static final By PHONE_SYSTEM = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(26) > td > strong");
    //中文短消息
    public static final By PHONE_CHINESE_INFORMATION = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(26) > td > strong");
    //k-java
    public static final By PHONE_JAVA = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(1) > div > div > table > tbody > tr:nth-child(26) > td > strong");
    //符合条件的手机
    public static final By RESULT_PHONE = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(3) > div > div > div > a:nth-child(1) > img");
    //高级搜索
    public static final By TOP_SOUSUO = By.cssSelector("#searchForm > a");
    //搜索关键字
    public static final By SOUSUO_GUANJIANZI = By.id("keywords");
    //分类
    public static final By SOUSUO_FENLEI = By.id("select");
    //双模手机
    public static final By SOUSUO_STYLE = By.cssSelector("#select > option:nth-child(9)");
    //选择手机品牌
    public static final By SOUSUO_PINGPAI = By.id("brand");
    //手机品牌
    public static final By CLICK_PINGPAI = By.cssSelector("#brand > option:nth-child(4)");
    //价格最低
    public static final By MIN_PRICE = By.id("min_price");
    //价格最高
    public static final By MAX_PRICE2 = By.id("max_price");
    //立即搜索按钮
    public static final By LIJI_SOUSUO = By.cssSelector("#advancedSearchForm > table > tbody > tr:nth-child(7) > td > input.bnt_blue_1");
    //3G手机
    public static final By PHONE_3GPHONE = By.cssSelector("#category_tree > dl:nth-child(1) > dd:nth-child(4) > a");
    //按照上架时间排序
    public static final By PAIXU_TIME = By.name("sort");
    //按照时间价格排序
    public static final By PAIXU_PRICE = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(5) > div > h3 > form > select:nth-child(4) > option:nth-child(2)");
    //倒序
    public static final By ORDER_BACK = By.name("order");
    //正序
    public static final By PRDER_GO = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(5) > div > h3 > form > select:nth-child(5) > option:nth-child(2)");
    //GO按钮
    public static final By PRODUCT_GO = By.cssSelector("body > div:nth-child(8) > div.AreaR > div:nth-child(5) > div > h3 > form > input[type=\"image\"]:nth-child(6)");
//    //诺基亚搜索框
//    public static final By NUOJIYA_SOUSUO = By.cssSelector("#keyword");


}
