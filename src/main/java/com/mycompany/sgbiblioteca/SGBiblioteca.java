/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sgbiblioteca;

import com.mycompany.db.Conexion;
import java.sql.Connection;
public class SGBiblioteca {

    public static void main(String[] args) {
        Conexion c = new Conexion();
        Connection cn = c.conectar();
        
        System.out.println("Hello World!");
    }
}
