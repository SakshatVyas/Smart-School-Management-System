/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smartschoolmanagement;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
/**
 *
 * @author 91826
 */
public class SmartSchoolManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SmartSchoolManagemenrtSystem","root","Sakshat11@");
            System.out.println(con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SmartSchoolManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SmartSchoolManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
