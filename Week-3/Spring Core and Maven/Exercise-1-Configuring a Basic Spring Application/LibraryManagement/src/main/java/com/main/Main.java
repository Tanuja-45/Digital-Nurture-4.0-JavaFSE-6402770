package com.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService; 
import com.library.repository.BookRepository; 

public class Main {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bs= (BookService) context.getBean("bookservice");
        bs.getService();
        BookRepository br=(BookRepository)context.getBean("bookrepository");
        br.getRepository();
	}
}
