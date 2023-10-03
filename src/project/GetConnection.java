/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;

/**
 *
 * @author Rahul
 */
public class GetConnection {
   
    private Connection conn=null;
	
	public Connection getConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstore","root","Gauravg@9636");
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	finally
	{
            System.out.print("Connection Established\n");
		return conn;
	}
        
    }
}
