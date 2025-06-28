/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection conexion;
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_biblioteca";
    private static final String USER = "root";
    private static final String PASS = "Leopoldox1.2.3.4.5";
    

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conectada a la bd");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return conexion;
    }

    public void cerrar() {
        if (conexion != null) {
            try { conexion.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}