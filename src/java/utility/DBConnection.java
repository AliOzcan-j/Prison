/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACE
 */
public class DBConnection {
        private Connection connection;

    public Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahkum?user=root&password=123");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
