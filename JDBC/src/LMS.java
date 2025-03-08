import controller.BookController;
import jdk.dynalink.beans.StaticClass;
import model.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LMS {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");    // Optional
        String url = "jdbc:mysql://localhost:3306/LMS";
        String username = "root";
        String password = "Musa123";
        try {
            Connection conn = DriverManager.getConnection(url,username, password);
            System.out.println("Connection Establish Succefully ! ");
            BookController bC = new BookController();
//            bC.saveBook(conn);
            Book b =  bC.getBook(1,conn);
            System.out.println(b.id);
            System.out.println(b.name);
            System.out.println(b.genre);
            System.out.println(b.authorName);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
