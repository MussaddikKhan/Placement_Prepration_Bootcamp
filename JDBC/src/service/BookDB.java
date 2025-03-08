package service;
import  model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class BookDB {
//     static HashMap<Integer, Book> bookDB = new HashMap<>();

    public static void save(Book b,  Connection conn){
        try {
            Statement stm = conn.createStatement();
            String query = "INSERT INTO Book VALUES ("
                    + b.id + ", '"
                    + b.getName() + "', '"
                    + b.genre + "', '"
                    + b.authorName + "')";
            int cnt = stm.executeUpdate(query) ;
            if(cnt > 0){
                System.out.println("Insert Succefully");
            }
            else{
                System.out.println("Failed ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public  static  Book get(Integer id,  Connection conn){
        try {
            Statement stm = conn.createStatement();

            String query = "Select * from book where id = " + id ;
            ResultSet rst = stm.executeQuery(query);
            if(rst.next())
            {
                System.out.println("Retrive Successfully");
                Book b = new Book();
                b.id = rst.getInt("id");
                b.name = rst.getString("name");
                b.genre = rst.getString("genre");
                b.authorName = rst.getString("authorName");
                return b;
            }
            else{
                System.out.println("Data is not availble ");
                return null;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
