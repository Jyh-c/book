package com.jmp.service;

import com.jmp.dao.BookDao;
import com.jmp.dao.BookDaoImpl;
import com.jmp.pojo.Book;
import lombok.Data;

import java.sql.SQLException;
import java.util.List;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/6/20 1:37
 */
@Data
public class BookServiceImpl implements BookService{

    BookDao bookDao = new BookDaoImpl();

    @Override
    public List<Book> selectAll() throws SQLException {
        return bookDao.selectAll();
    }

    @Override
    public void add(Book book) throws SQLException {
        bookDao.add(book);
    }

    @Override
    public void update(Book book) throws SQLException {
        bookDao.update(book);
    }

    @Override
    public void delete(Book book) throws SQLException {
        bookDao.delete(book);
    }

    @Override
    public List<Book> blurryName(Book book) throws SQLException {
        return bookDao.blurryName(book);
    }

    @Override
    public Book bookInfo(Book book) throws SQLException{
        return bookDao.bookInfo(book);
    }

    @Override
    public List<Book> selectAll(int currentPage, int pageSize) throws SQLException {
        return bookDao.selectAll(currentPage,pageSize);
    }
}
