package userControler;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import userModel.UserModel;

public class UserControler {
   private Connection connection; 
   public UserModel user; 
   
   public UserControler (UserModel user){
       
   }
   
   public void createUser(UserModel user){
          this.connection = new ConnectionFactory().getConnection();
          
           String sql = ("INSERT INTO data_user (name, login, password) VALUES (?, ?, ?);");
           System.out.println(sql);
       try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getUser());
            stmt.setString(3, user.getPassword());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "RECORD CREATED SUCESSFULLY");
            
        } catch (SQLException u) {
            
          JOptionPane.showMessageDialog(null, "USER NAME NOT AVAILABLE!!!");
            
        }
    }   
      
     
   }

