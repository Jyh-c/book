package com.jmp.pojo;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/6/19 23:50
 */

public class Book {
    private int book_id;
    private String book_name;
    private String isbn;
    private  String category;

    public Book() {
    }

    public Book(int book_id, String book_name, String isbn, String category) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.isbn = isbn;
        this.category = category;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
