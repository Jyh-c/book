package com.jmp.service;

import com.jmp.model.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/6/20 1:36
 */
public interface BookService {

    /**
     * 查询所有图书
     * @return
     * @throws SQLException
     */
    List<Book> selectAll() throws SQLException;

    /**
     * 添加图书
     * @param book
     * @throws SQLException
     */
    void add(Book book) throws SQLException;

    /**
     * 更新图书信息
     * @param book
     * @throws SQLException
     */
    void update(Book book) throws SQLException;

    /**
     * 删除图书
     * @param book
     * @throws SQLException
     */
    void delete(Book book) throws SQLException;

    /**
     * 根据书名模糊查询
     * @param book
     * @throws SQLException
     */
    List<Book> blurryName(Book book) throws SQLException;

    /**
     * 获取具体的图书信息
     * @param book
     * @throws SQLException
     * @return
     */
    Book bookInfo(Book book) throws SQLException;

    /**
     * 分页查询图书
     * @param currentPage
     * @param pageSize
     * @return
     * @throws SQLException
     */
    List<Book> selectAll(int currentPage,int pageSize) throws SQLException;

}
