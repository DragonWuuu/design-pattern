package com.dragon.app;

public class Adopter implements Target {
    private final Adoptee adoptee;
    public Adopter(Adoptee adoptee) {
        this.adoptee = adoptee;
    }

    @Override
    public String getBookName(String meta) {
        return adoptee.getBookInfo(meta).getBookName();
    }

    @Override
    public String getBookAuthor(String meta) {
        return adoptee.getBookInfo(meta).getBookAuthor();
    }
}
