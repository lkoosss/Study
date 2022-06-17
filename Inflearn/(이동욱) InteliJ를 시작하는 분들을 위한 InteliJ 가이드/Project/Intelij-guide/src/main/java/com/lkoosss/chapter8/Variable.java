package com.lkoosss.chapter8;

import java.util.List;

public class Variable {

    public void extractVariable() {
        String meesage = String.format(("%d + %d = %d", 1, 2, 1 + 2);
        System.out.println(meesage);
        System.out.println(meesage);
    }

    public void extractParameter(int x) {
        System.out.println(x);
        System.out.println(x);
    }

    public void extractMethod(List<Book> boos) {
        for (Book book : boos) {
            loopAuthors(book);
        }
    }

    private void loopAuthors(Book book) {
        for (String s : book.getAuthors()) {
            print(s);
        }
    }

    private void print(String s) {
        if ("jojoldu".equals(s)) {
            System.out.println("담당자가 맞습니다.");
        }
    }

    public static class Book {
        private String title;
        private long price;
        private List<String> authors;

        public String getTitle() {
            return title;
        }

        public long getPrice() {
            return price;
        }

        public List<String> getAuthors() {
            return authors;
        }
    }
}
