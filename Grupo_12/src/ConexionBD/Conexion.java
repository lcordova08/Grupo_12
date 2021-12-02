/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lea Cordova
 */
public class Conexion {
     private static final String USERNAME = "root";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String PASSWORD = "root";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/db_diccionario";
    
    Connection conn;

    public Conexion() {
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            if(conn != null){
                System.out.println("La conexion a la base de datos ha sido exitosa");
            }
        }
        catch(ClassNotFoundException|SQLException e){
            System.err.println("Error al conectar " + e);
        }
    }
    public Connection getConexion(){
       
        return conn;
    }
    
    public void desconectar(){
        conn= null;
        if (conn == null){
            System.out.println("Conexion terminada");
        }
    }
}
