package com.dragon.app;

public class SoftwareEngineeringBookFactory implements BookFactory {
    @Override
    public Book createBook() {
        Book book = new Book();
        book.setName("Software Engineering Book");
        book.setAuthor("Software Engineering Author");
        return book;
    }
}
