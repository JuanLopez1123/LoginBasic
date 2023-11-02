/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author Juan David Lopez P
 */
public class conexionMysql {
    Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Login_Java_Mysql","root","");
            System.out.print("Conectado");
            
        }catch(Exception e){
            System.out.print("ERROR DE CONEXION BD"+e);
            
        }
        return cn;
    }
}
