package com.dragon.app;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        // 原本方法获取一本软件工程书
        Book originBook = new Book();
        originBook.setName("Software Engineering Book");
        originBook.setAuthor("Software Engineering Author");

        // 使用工厂方法获取一本软件工程书
        BookFactory factory = new SoftwareEngineeringBookFactory();
        Book factoryBook = factory.createBook();
    }
}
