/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class koneksi {
    private String database_name = "rosa";
    private String username ="root";
    private String password ="";
    public Connection koneksiDB;
    
    public koneksi(){
        
        try {
            String lokasi= "jdbc:mysql://localhost/"+ database_name;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            
            System.out.println("Database Terkoneksi");
            
        } catch (Exception e) {  
             System.out.println(e.getMessage());
        }
    }
    
    public void Simpan(String nik, String nama, String telp){
        try {
            String sql = "INSERT INTO belajar (nik, nama, telp) VALUE (?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.setString(2, nama);
            perintah.setString(3, nik);
        } catch (Exception e) {
        }
    }
    
}
