import org.junit.Test;

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
}
