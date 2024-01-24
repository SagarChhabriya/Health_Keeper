package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
 public static Connection getCon()   
 {
     try {
         Class.forName("com.mysql.cj.jdbc.Driver"); 
//         to get the connection with the database 
         Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?useSSL=false","root","@123#");
         
         return connection;
     } catch (Exception e) {
         System.out.println(e);
         return null;
     }
 }
}
