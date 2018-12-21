import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by liu_zhang on 2018/12/21.
 */
public class ssmTest01 {

    @Test
    public void test1(){
        String s = "aaaaa/";
        System.out.println(s.indexOf("/"));
        System.out.println(s.indexOf("/",1));
    }

    @Test
    public void test2() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ssm", "root", "root");
       String sql = " SELECT * FROM books";
        Statement statement = connection.createStatement();
//        statement.execute(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            System.out.println(resultSet.getString("title"));
        }
    }
}
