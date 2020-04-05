/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Mahkum;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utility.DBConnection;

/**
 *
 * @author ACE
 */
public class MahkumDao {
        
    public List<Mahkum> getMahkumlist(){
        List<Mahkum> mlist=new ArrayList<>();
        
        DBConnection db= new DBConnection();
        Connection connection=db.getConnection();
        
        try {
            Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery("select * from mahkum");
            
            while(rs.next()){
                Mahkum temp= new Mahkum();
                temp.setFirstName(rs.getString("firstName"));
                temp.setLastName(rs.getString("lastName"));
                temp.setInFor(rs.getString("inFor"));
                mlist.add(temp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return mlist;
    }

    public void insert(Mahkum mahkum) {
        DBConnection db= new DBConnection();
        Connection connection=db.getConnection();
        try {
            Statement st= connection.createStatement();
            st.executeUpdate("insert into mahkum (firstName) value ('"+mahkum.getFirstName()+"')");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
