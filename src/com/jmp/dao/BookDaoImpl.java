package com.jmp.dao;

import com.jmp.pojo.Book;
import com.jmp.util.DBUtil;
import lombok.Data;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/6/20 0:41
 */
@Data
public class BookDaoImpl implements BookDao{

    //查询运行器
    static QueryRunner qr = null;
    //加载sql文件
    static ResourceBundle rb = ResourceBundle.getBundle("com.jmp.dao.book-sql");

    public BookDaoImpl(){
        //创建BookDaoImpl对象时加载QueryRunner
        qr = new QueryRunner();
    }

    @Override
    public List<Book> selectAll() throws SQLException {
        String sql = rb.getString("book.sql.selectAll");
        List<Book> list = qr.query(DBUtil.getConnection(),sql,new BeanListHandler<Book>(Book.class));
        return list;
    }

    @Override
    public void add(Book book) throws SQLException {
        String sql = rb.getString("book.sql.add");
        qr.update(DBUtil.getConnection(),sql,book.getBook_name(),book.getIsbn(),book.getCategory());
    }

    @Override
    public void update(Book book) throws SQLException {
        String sql = rb.getString("book.sql.update");
        qr.update(DBUtil.getConnection(),sql,book.getBook_name(),book.getIsbn(),book.getCategory(),book.getBook_id());
    }

    @Override
    public void delete(Book book) throws SQLException {
        String sql = rb.getString("book.sql.delete");
        qr.update(DBUtil.getConnection(),sql,book.getBook_id());
    }

    @Override
    public List<Book> blurryName(Book book) throws SQLException {
        String sql = rb.getString("book.sql.blurryName");
        List<Book> list = qr.query(DBUtil.getConnection(),sql,new BeanListHandler<Book>(Book.class),"%"+book.getBook_name()+"%");
        return list;
    }

    @Override
    public Book bookInfo(Book book) throws SQLException{
        String sql = rb.getString("book.sql.deleteBook");
        Book b = qr.query(DBUtil.getConnection(),sql,new BeanHandler<Book>(Book.class),book.getBook_id());
        return b;
    }

    @Override
    public List<Book> selectAll(int currentPage, int pageSize) throws SQLException {
        String sql = rb.getString("book.sql.selectAllPage");
        List<Book> list = qr.query(DBUtil.getConnection(),sql,new BeanListHandler<>(Book.class),((currentPage-1)*pageSize),pageSize);
        return list;
    }

}
