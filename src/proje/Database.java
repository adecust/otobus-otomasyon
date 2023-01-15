/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje;
import java.sql.*;
/**
 *
 * @author ahmet
 */
public class Database extends Connect {
    void insertUser(Userss u){
        try {
            Connect conn=new Connect();
            Connection connn=conn.connDb();
						
            String que = "insert into users(kullaniciadi, sifre,tur) values (?,?,?)";
     
           
		
            PreparedStatement add=connn.prepareStatement(que);
            
            add.setString(1,u.getUsername());
            add.setString(2,u.getPass());
            add.setString(3,u.getType());
       
            add.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
