/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DB.ConnectDB;
import Entity.Menu;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author DatPC
 */
public class Menu_DAO {

    public Menu_DAO() throws SQLException {
        DB.ConnectDB.getInstance().connect();
    }
    
    public ArrayList<Menu> getDanhSachMenu() throws SQLException{
        ArrayList<Menu> listMenu = new ArrayList<>();
        String sql = "SELECT * FROM Menu";
	Statement stm = ConnectDB.getConnection().createStatement();
	ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Menu tmp = new Menu(rs.getString(1), rs.getString(2), rs.getFloat(3));
            listMenu.add(tmp);
        }
        return listMenu;
    }
    
    public void addNewMenu(Menu it) throws SQLException{
        String sql = "INSERT INTO Menu VALUES(?,?,?)";
        PreparedStatement ppsm = ConnectDB.getConnection().prepareStatement(sql);
        ppsm.setString(1, it.getMenuID());
        ppsm.setString(2, it.getName());
        ppsm.setFloat(3, it.getPrice());
        ppsm.execute();
    }
    
    public  void deleteMenu(String ma) throws SQLException{
        String sql = "DELETE FROM Menu WHERE MenuID= ?";
        PreparedStatement ppsm = ConnectDB.getConnection().prepareStatement(sql);
        ppsm.setString(1, ma);
        ppsm.execute();
    }  
    
    public  void updatePrice(String id,float price) throws SQLException{
        String sql = "UPDATE Menu\n" +
                     "SET Price = ?" +
                     "WHERE MenuID = ?";
        PreparedStatement ppsm = ConnectDB.getConnection().prepareStatement(sql);
        ppsm.setFloat(1, price);
        ppsm.setString(2, id);
        ppsm.execute();
    }
}
