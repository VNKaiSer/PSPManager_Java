/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    //
    private static String DB_URL = "jdbc:mysql://bpfqann0km4e0vu8qdgp-mysql.services.clever-cloud.com:3306/bpfqann0km4e0vu8qdgp?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static String USER_NAME = "u85nm3jd2xdhkbv1";
    private static String PASSWORD = "3z7icVQZJZJ98LEsQQHe";
    private static Connection con = null;
    public static ConnectDB instance = new ConnectDB();

    /**
     * create connection
     *
     * @param dbURL: database's url
     * @param userName: username is used to login
     * @param password: password is used to login
     * @return connection
     */
    public static Connection connect() {

        try {
            con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public static Connection getConnection() {
        return con;
    }

    public static ConnectDB getInstance() {
        return instance;
    }

    public void disConect() throws SQLException {
        if (con != null) {
            con.close();
        }
    }
    
    public static void main(String[] args) {
        getInstance().connect();
        if(con != null){
            System.out.println("Scuss");
        }
    }

}
