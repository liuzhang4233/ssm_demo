import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.mapper.Book;
import ssm.service.BookService;

public class Test1 {

    static BookService bookService;

    @Before
    public void before(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring/spring-bean.xml");
        System.out.println(ctx.getBean("dataSource"));
        bookService=ctx.getBean(BookService.class);
    }

    @Test
    public void add(){
        try {
           // bookService.add(new Book(1,"c#",100,new Date()));
            Book b = new Book();
            b.setTitle("Java計算機數據就");
            Book book = bookService.getBook(b);
            System.out.println(book);
//            Book book = new Book(1,"Java编程思想",999,new Date());
//            bookService.update(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
