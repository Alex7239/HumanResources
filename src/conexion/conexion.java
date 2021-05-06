/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Juan Carlos Romero
 */
public class conexion {
    
    public static void main(String[] args) {
        //1.Requerimientos 
        String driver = "com.mysql.jdbc.Driver";
        
        
        
        //URL {Cadena de conexion}
        String url= "jdbc:mysql://localhost:3306/hr";
        try{
            Class.forName(driver);
            System.out.println("Conexion exitosa");
    }catch(Exception e){
    System.err.println("Error de conexion" + e.getMessage());
}
        try{
            Connection cn=DriverManager.getConnection(url, "root", "root");
            System.out.println("Conectado a la base de datos");
            System.out.println("-----------------------");
            String sql = "select * from employee";
            Statement st= cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            
            /*Primer CONEXION*/
            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getInt(6));
                System.out.println(rs.getDouble(7));
                System.out.println(rs.getString(8));
                System.out.println("------------------------");
            }
            
        }
        catch (Exception e){
            System.err.println("Sin conexion a la base de datos");
        }
        
    }
}