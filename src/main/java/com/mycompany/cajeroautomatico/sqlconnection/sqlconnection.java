/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajeroautomatico.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
/**
 *
 * @author Dylan
 */
public class sqlconnection {
    
public sqlconnection() {
    }

public Statement conn(){
        try{  
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        System.out.println("Conectando con la base de datos...");
        Connection connection = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:ORCL", "C##CAJERO", "123456");
        Statement statement = connection.createStatement();
        return statement;
        }catch(Exception e){
        System.out.println("The exception raised is:" + e);
        return null;  
        } 
    }
    public LinkedList<String> query (String from){
            try{
            Statement st = conn();
            ResultSet resultSet = st.executeQuery(from);

            LinkedList<String> result = new LinkedList();
            while(resultSet.next()){
            for(int i=1;i< resultSet.getMetaData().getColumnCount(); i++){
            result.add(resultSet.getString(i));
            }
            }
            return result;
            }catch (Exception e){
            return null;
            }
    }
    }
