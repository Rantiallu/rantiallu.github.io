import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class config {
private static Connection mysqlconfig;
public static Connection configDB() throws SQLException{ 
try {
String url="jdbc:mysql://localhost:3306/java"; //url database
String user="root"; //user     database
String pass=""; //password     database
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
mysqlconfig= DriverManager.getConnection(url,user,pass);
} catch (Exception e) {
System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan eror pada koneksi
}   
return  mysqlconfig;
}
}