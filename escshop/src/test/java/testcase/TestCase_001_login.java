package testcase;

import PageHelper.PageLoginHelper;
import Util.LogConfiguration;
import Util.Util;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/10/010.
 */
public class TestCase_001_login extends BasicCase{
    Util util = new Util();
    @DataProvider(name = "testdata")
    public Object[][] ExcelDataProvide(){
        util.readExcel("./file/data.xls","login");
        return util.ExcelDataProvider();
    }
    @Test(dataProvider = "testdata")
    public static void login(String username,String password) {
        LogConfiguration.initLog("TestCase_001_login");
        PageLoginHelper.clickDenglu(seleniumUtil,username,password);
    }
}
