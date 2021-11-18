package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class Kata5P1 {

    public static void main(String[] args) {
        
        SelectApp app = new SelectApp();
        Connection conn = app.connect();
        
        String fileName = new String("email.txt");
        List<String> lista = MailListReader.read(fileName);
        
        
        String sql = "INSERT INTO EMAIL(Mail) VALUES(?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            
            for (int i = 0; i < lista.size(); i++) {
                pstmt.setString(1, lista.get(i));
                pstmt.executeUpdate();
                
            }
            
        } catch (SQLException e) { 
            System.out.println(e.getMessage());
        }

    }
    
}
