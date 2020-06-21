package com.jmp.view;

import com.jmp.pojo.Book;
import com.jmp.service.BookService;
import com.jmp.service.BookServiceImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/6/20 1:47
 */
public class BookManager {
    
    static Scanner sc = new Scanner(System.in);
    static BookService bookService = new BookServiceImpl();

    public static void main(String[] args) {
        while (true) {
            System.out.println("|----------------图书管理系统-----------------|");
            System.out.println("|1-增加 2-删除 3-修改 4-查找 5-显示所有 0-退出|");
            System.out.println("|--------------------------------------|");
            System.out.println("请选择业务");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    bookLike();
                    break;
                case 5:
                    selectAll();
                    break;
                case 0:
                    System.out.println("程序已退出，欢迎再次使用！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入数据有误，请重新输入！");
                    break;
            }
        }
    }
    
    public static void add(){
        System.out.println("------------增加------------");
        System.out.println("图书名称：");
        String name = sc.next();
        System.out.println("ISBN编号：");
        String isbn = sc.next();
        System.out.println("图书类别：");
        String category = sc.next();
        Book book = new Book(0,name,isbn,category);
        try {
            bookService.add(book);
            System.out.println("增加成功！---------------\n");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public static void delete() {
        System.out.println("------------删除------------");
        System.out.println("请输入要删除的图书编号：");
        int id = sc.nextInt();
        Book book = new Book();
        book.setBook_id(id);
        try {
            book = bookService.bookInfo(book);
            System.out.println(book.toString());
            System.out.println("确认要删除吗？1-是 0-否");
            int cmd = sc.nextInt();
            if(1==cmd) {
                bookService.delete(book);
                System.out.println("删除成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void update() {
        System.out.println("------------修改------------");
        System.out.println("请输入要修改图书的编号：");
        int id = sc.nextInt();
        Book book = new Book();
        book.setBook_id(id);
        try {
            book = bookService.bookInfo(book);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(book.toString());
        System.out.println("请重新输入图书的信息：");
        System.out.println("图书名称：");
        String name = sc.next();
        System.out.println("ISBN编号：");
        String isbn = sc.next();
        System.out.println("图书类别：");
        String category = sc.next();
        book = new Book(id,name,isbn,category);
        try {
            bookService.update(book);
            System.out.println("修改成功！---------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void bookLike() {
        System.out.println("-------------模糊查询------------");
        System.out.println("请输入图书名称关键字：");
        String name = sc.next();
        Book book = new Book();
        book.setBook_name(name);
        try {
            List<Book> list = bookService.blurryName(book);
            for(Book b:list) {
                System.out.println(b.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void selectAll() {
        System.out.println("-------------查询所有------------");
        try {
            List<Book> list = bookService.selectAll();
            for(Book book:list) {
                System.out.println(book.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}