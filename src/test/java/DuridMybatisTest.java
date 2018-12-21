import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

public class DuridMybatisTest {

    private Properties props;

    public void setProperties(Properties props)
    {
        this.props = props;
    }

    public DataSource getDataSource()
    {
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName(this.props.getProperty("driver"));
        dds.setUrl(this.props.getProperty("url"));
        dds.setUsername(this.props.getProperty("username"));
        dds.setPassword(this.props.getProperty("password"));
        // 其他配置可以根据MyBatis主配置文件进行配置
        try
        {
            dds.init();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return dds;
    }
}
