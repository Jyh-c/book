package com.jmp.service;

import com.jmp.pojo.Book;

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
     */
    List<Book> selectAll() throws SQLException;

    /**
     * 添加图书
     */
    void add(Book book) throws SQLException;

    /**
     * 更新图书信息
     */
    void update(Book book) throws SQLException;

    /**
     * 删除图书
     */
    void delete(Book book) throws SQLException;

    /**
     * 根据书名模糊查询
     */
    List<Book> blurryName(Book book) throws SQLException;

    /**
     * 获取删除图书的信息
     * @return
     */
    Book bookInfo(Book book) throws SQLException;

    /**
     * 分页查询图书（后期添加 --- 使用default关键字）
     */
    List<Book> selectAll(int currentPage,int pageSize) throws SQLException;
}
