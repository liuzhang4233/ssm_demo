package ssm.service;

import org.springframework.stereotype.Service;
import ssm.mapper.Book;
import ssm.mapper.BookDao;

import javax.annotation.Resource;

@Service
public class BookService {

    @Resource
    BookDao bookDao;

    /*public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public Book getBookById(int id){
        return bookDao.getBookById(id);
    }

    public int add(Book entity) throws Exception {
        if(entity.getTitle()==null||entity.getTitle().equals("")){
            throw new Exception("书名必须不为空");
        }
        return bookDao.add(entity);
    }

    @Transactional
    public int add(Book entity1,Book entityBak){
        int rows=0;
        rows=bookDao.add(entity1);
        rows=bookDao.add(entityBak);
        return rows;
    }

    public int delete(int id) {
        return bookDao.delete(id);
    }

    */

    /**
     * 多删除
     *//*
    public int delete(String[] ids){
        int rows=0;
        for (String idStr : ids) {
            int id=Integer.parseInt(idStr);
            rows+=delete(id);
        }
        return rows;
    }

    public int update(Book entity) {
        return bookDao.update(entity);
    }*/
    public Book getBook(Book book) {
//        System.out.println(bookDao);
        return bookDao.getBookById(book);
    }

    public void update(Book book) {
        bookDao.update(book);
    }
}
