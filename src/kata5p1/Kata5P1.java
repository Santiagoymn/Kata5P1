package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Kata5P1 {

    public static void main(String[] args) {
        
        CreateTable createTable = new CreateTable();
        createTable.createNewTable();
    }
    
}
