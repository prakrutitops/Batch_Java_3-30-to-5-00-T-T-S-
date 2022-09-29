package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.jws.soap.SOAPBinding.Use;

import com.model.Model;

public class UserDao 
{
	public static Connection getconnect()
	{
		Connection con=null;
		
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud","root","");

				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return con;
	}
	
	public static int savedata(Model m)
	{	
		int status=0;
		
		Connection con= UserDao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("insert into info(Fname,Lname,Email) values (?,?,?)");
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());
			status = ps.executeUpdate();
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	
	
}
