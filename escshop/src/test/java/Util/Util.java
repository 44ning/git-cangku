package Util;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/1/10/010.
 */
public class Util {
    public static int rows;
    public static int columns;
    public static List list = new ArrayList();

    //切换窗口
    public static void switchTheWeb(WebDriver driver) {
        List<String> handles = new ArrayList(driver.getWindowHandles());
        String handle = handles.get(handles.size() - 1);
        driver.switchTo().window(handle);

    }
    //浏览器最大化
    public static void MaxWindow(WebDriver driver){
        driver.manage().window().maximize();
    }
    //读取Excel表格
    public static void readExcel(String filePath,String sheetName){
        try{
            InputStream in = new FileInputStream(filePath);
            Workbook workbook = Workbook.getWorkbook(in);
            Sheet sheet = workbook.getSheet(sheetName);
            rows = sheet.getRows();
            columns = sheet.getColumns();
            for (int i=0;i<sheet.getRows();i++){
                String[] str = new String[sheet.getColumns()];
                Cell cell = null;
                for (int j=0;j<sheet.getColumns();j++){
                    //获取第i行，第j列的单元格
                    cell = sheet.getCell(j,i);
                    str[j] = cell.getContents();
                }
                list.add(str);
            }
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String[][] ExcelDataProvider(){
        String[][] data = new String[rows][columns];
        for (int i=0;i<list.size();i++){
            String[] tmp = (String[])list.get(i);
            for (int j=0;j<tmp.length;j++){
                data[i][j] = tmp[j];
            }
        }
        return data;
    }
//    public static void main(String[] args){
//        Util util = new Util();
//        util.readExcel("./file/data.xls","login");
//        String[][] b = util.ExcelDataProvider();
//        System.out.println(b[0][0]);
//        System.out.println(b[0][1]);
//        System.out.println(b[1][0]);
//        System.out.println(b[1][1]);
//        System.out.println(b[2][0]);
//        System.out.println(b[2][1]);
//
//        for (int i=0;i<b.length;i++){
//            String[] tmp = b[i];
//            for (int j=0;j<tmp.length;j++){
//                System.out.print(tmp[j]+"\t");
//            }
//            System.out.println();
//        }
//    }
    //截图
    private static Logger logger = Logger.getLogger(Util.class);
    public static void takeScreenShot(WebDriver driver,String filename){
        //指定日期生成的格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        //获取日期
        String date = dateFormat.format(new Date());
        logger.info("开始截屏");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // 拷贝截图文件到我们项目./Screenshots
            FileUtils.copyFile(screenshotFile,new File("./result/takessceenchot/"+date+filename+".png"));
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
//    public static void main(String[] args){
//        LogConfiguration.initLog("JiePin");
//        String chromePath = "E:\\zidonghua\\chrome&driver\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",chromePath);
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://127.0.0.1");
//        Util.takeScreenShot(driver,"截图");
//    }
}
