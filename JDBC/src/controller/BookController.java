package controller;

import model.Book;
import service.BookDB;

import java.sql.Connection;

public class BookController {

    public static void saveBook(Connection conn){
        Book b = new Book();
        b.setId(1);
        b.setName("Java Programming");
        b.setAuthorName("Yashwant Kanetkar");
        b.setGenre("Education");
        BookDB.save(b,  conn);
    }
    public static Book getBook(Integer id,  Connection conn){
        return BookDB.get(id, conn);
    }
}
