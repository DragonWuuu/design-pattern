package com.dragon.app;


public class Main {
    public static void main(String[] args) {
        Target target = new Adopter((mate) -> {
            // 通过书本元数据搜索书本的名称和作者，下面不是有效代码
             Book book = new Book();
            book.setBookName("book1");
            book.setBookAuthor("author1");
            return book;

        });
        System.out.println(target.getBookName("book1"));
        System.out.println(target.getBookAuthor("book1"));
    }
}