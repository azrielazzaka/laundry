/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laudry.in;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USER
 */
public class koneksi {
    private Connection koneksi1;
    public static void main(String[] args){
    Connection conn = new koneksi().Connect();
    }

public Connection Connect() {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("koneksi berhasil");   
    }catch (ClassNotFoundException e){
        System.out.println("koneksi gagal" +e);
    }
    String url = "jdbc:mysql://localhost:3306/laundry_user";
    try {
        koneksi1 = DriverManager.getConnection(url,"root","");
        System.out.println("database berhasil masuk");
    } catch (SQLException e) {
        System.out.println("database gagal masuk");
    }
    
    return koneksi1;
} 

    Connection getConnect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
}
