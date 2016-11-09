package cn.itcast.emp.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * Created by wyj on 2016/9/29.
 */
public class JdbcUtil {
    /**
     * 去classpath目录下加载c3p0-config.xml配置
     */
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    /**
     * 获取数据源
     */
    public static ComboPooledDataSource getDataSource(){
        return dataSource;
    }
}
