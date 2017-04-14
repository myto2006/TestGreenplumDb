package com.gp.dbtest;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

public class GPDBTest {

   public static void main(String[] args) {

       try {

           Class.forName("org.postgresql.Driver");

           Connection db = DriverManager.getConnection("jdbc:postgresql://192.168.0.223:15432/test","gpadmin","gpadmin@.123");

           Statement st = db.createStatement();

           ResultSet rs = st.executeQuery("select * from gp_id limit 1 offset 0");

           while (rs.next()) {

               System.out.println(rs.getString(1));

           }

           rs.close();

           st.close();

       } catch (ClassNotFoundException e) {

           e.printStackTrace();

       } catch (SQLException e) {

           e.printStackTrace();

       }

   }

}