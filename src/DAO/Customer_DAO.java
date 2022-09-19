/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DB.ConnectDB;
import java.util.ArrayList;
import Entity.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author DatPC
 */
public class Customer_DAO {

    public Customer_DAO() {
        DB.ConnectDB.getInstance().connect();
    }
    
    public ArrayList<Customer> getListCustomer() throws SQLException, ParseException{
        ArrayList<Customer> listCustomer = new ArrayList<>();
        String sql = "SELECT * FROM Customer";
        Statement stm = ConnectDB.getConnection().createStatement();
	ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            String date = rs.getString(5);
            Date dateIn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
            Customer tmp = new Customer(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), dateIn);
            listCustomer.add(tmp);
        }
        return listCustomer;
    }
    
}
