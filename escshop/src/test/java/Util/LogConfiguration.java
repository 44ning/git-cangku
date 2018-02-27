package Util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Administrator on 2018/1/10/010.
 */
public class LogConfiguration {
    public static void initLog(String fileName){
        //指定日期生成的格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        //获取日期
        String date = dateFormat.format(new Date());
        //声明日志文件存储路径以及文件名，格式
        final  String logFilePath = "./result/logs/"+fileName+"/"+fileName+date+".log";
        Properties properties = new Properties();
        //配置日志输出的格式
        properties.setProperty("log4j.rootLogger","info,toConsole,toFile" );
        properties.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        properties.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");

        properties.setProperty("log4j.appender.toFile", "org.apache.log4j.DailyRollingFileAppender");
        properties.setProperty("log4j.appender.toFile.file", logFilePath);
        properties.setProperty("log4j.appender.toFile.layout", "org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toFile.layout.ConversionPattern", "[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        //使配置生效
        PropertyConfigurator.configure(properties);
    }
}
