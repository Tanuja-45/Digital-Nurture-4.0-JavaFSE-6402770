package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bs = (BookService)cnt.getBean("bookService");
        bs.displayBooks();
    }
}
